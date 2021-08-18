/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class conexionBD {
    public static  Connection conexion;
    
    private conexionBD() {
         try {
            String driverBD = "com.mysql.jdbc.Driver";
            String urlBD = "jdbc:mysql://localhost:3306/db-control";
            String usuarioBD = "root";
            String claveBD = "";
            Class.forName(driverBD);
            conexion = DriverManager.getConnection(urlBD, usuarioBD, claveBD);
             System.out.println("Conectado Correctamente");
        } catch (ClassNotFoundException ex) {
            System.err.println("No encuentro el driver:"+ex.getMessage());
        } catch (SQLException ex){
            System.err.println("Error al conectarme"+ex.getMessage());
        }
    }
    public static  void desconectar(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.err.println("Error al desconectarme:"+ex.getMessage());
        }
    }
    
    public static conexionBD getInstance() {
        return conexionBDHolder.INSTANCE;
    }
    
    private static class conexionBDHolder {

        private static final conexionBD INSTANCE = new conexionBD();
    }
}
