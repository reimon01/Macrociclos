/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Macrociclo;
import entidades.MedioFisico;
import interfaces.IConexionBD;
import interfaces.IMacrociclosDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.bson.Document;

/**
 *
 * @author x11_r
 */
public class MacrociclosDAO implements IMacrociclosDAO {

    private IConexionBD conexion;
    private MongoDatabase baseDatos;

    public MacrociclosDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.obtenerConexion();
    }

    private MongoCollection<Macrociclo> getColeccion() {
        return baseDatos.getCollection("macrociclos", Macrociclo.class);
    }

    public List<MedioFisico> obtenerMediosFisicosDeMacrociclo(Macrociclo macrociclo) {
        List<MedioFisico> mediosFisicos = macrociclo.getMediosFisicos();
        return mediosFisicos;
    }

    @Override
    public boolean registrarMacrociclo(Macrociclo macrociclo) {
        this.getColeccion().insertOne(macrociclo);
        return true;
    }

    @Override
    public List<Macrociclo> buscarMacrociclos() {
        List<Macrociclo> macrociclos = baseDatos.getCollection("macrociclos", Macrociclo.class).find().into(new ArrayList());
        
        return macrociclos;
    }

    @Override
    public boolean actualizarMacrociclo(Macrociclo macrociclo) {
        String nombre = macrociclo.getNombre(); // Suponiendo que tu entidad Macrociclo tiene un campo id de tipo UUID

        Document filtro = new Document("nombre", nombre); // Usar el UUID como filtro

        Document cambios = new Document()
                .append("fechaInicio", macrociclo.getFechaInicio())
                .append("fechafin", macrociclo.getFechafin())
                .append("semanasTotalesMacrociclo", macrociclo.getSemanasTotalesMacrociclo())
                .append("semanasPeriodoPreparatorio", macrociclo.getSemanasPeriodoPreparatorio())
                .append("semanasPeriodoCompetitivo", macrociclo.getSemanasPeriodoCompetitivo())
                .append("semanasPeriodoPrepEtapaGeneral", macrociclo.getSemanasPeriodoPrepEtapaGeneral())
                .append("semanasPeriodoPrepEtapaEspecial", macrociclo.getSemanasPeriodoPrepEtapaEspecial())
                .append("semanasPeriodoCompPrecompetitivo", macrociclo.getSemanasPeriodoCompPrecompetitivo())
                .append("semanasPeriodoCompCompetitivo", macrociclo.getSemanasPeriodoCompCompetitivo())
                .append("mediosFisicos", macrociclo.getMediosFisicos())
                .append("mesociclos", macrociclo.getMesociclos());


        this.getColeccion().updateOne(filtro, new Document("$set", cambios));

        return true;

    }

    @Override
    public boolean actualizarMedioFisico(MedioFisico medioFisico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     }


