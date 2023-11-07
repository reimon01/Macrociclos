/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import interfaces.IConexionBD;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author x11_r
 */
public class ConexionBD implements IConexionBD {

    private static final String HOST = "localhost";
    private static final int PUERTO = 27017;
    private static final String BASE_DATOS = "macrociclos";
    private static ConexionBD conexionBD;
    MongoDatabase baseDatos;
    
    
    @Override
    public MongoDatabase crearConexion() {

        try {
             CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());  
 
            CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);  
 
            ConnectionString cadenaConexion = new ConnectionString("mongodb://" + HOST + "/" + PUERTO);  

            MongoClientSettings clientsSettings = MongoClientSettings.builder()  
                    .applyConnectionString(cadenaConexion)
                    .codecRegistry(codecRegistry)
                    .build();

            MongoClient clienteMongo = MongoClients.create(clientsSettings);  

            baseDatos = clienteMongo.getDatabase(BASE_DATOS);

            return baseDatos;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }
    
    @Override
    public MongoDatabase obtenerConexion() {
        if(baseDatos != null) return baseDatos;
        return crearConexion();
    }
    
    public static ConexionBD getInstance(){
        if(conexionBD == null) return new ConexionBD();
        return conexionBD;
    }
}
