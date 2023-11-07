/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Macrociclo;
import interfaces.IConexionBD;
import interfaces.IMacrociclosDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author x11_r
 */
public class MacrociclosDAO implements IMacrociclosDAO{
    private IConexionBD conexion;
    private MongoDatabase baseDatos;
    
   public MacrociclosDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.obtenerConexion();
    }
    
    private MongoCollection<Macrociclo> getColeccion(){
        return baseDatos.getCollection("macrociclos", Macrociclo.class);
    }
        @Override
    public boolean registrarMacrociclo(Macrociclo macrociclo) {
        this.getColeccion().insertOne(macrociclo);
        return true;
    }

    public MacrociclosDAO() {
    }
    
    
    @Override
    public List<Macrociclo> buscarMacrociclos() {
        List<Macrociclo> macrociclos = baseDatos.getCollection("macrociclos", Macrociclo.class).find().into(new ArrayList());
        
        if (macrociclos.isEmpty()) {
            return null;
        }
        return macrociclos;
    }

}
