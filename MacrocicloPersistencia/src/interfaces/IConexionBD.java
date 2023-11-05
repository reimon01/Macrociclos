/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author x11_r
 */
public interface IConexionBD {
     public MongoDatabase crearConexion();
    public MongoDatabase obtenerConexion();
}
