package com.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Conexion {
    //Variables de conexion
    Connection conectar = null;
    String user = "root";
    String password = "Admin";
    String db =  "Java";
    String host = "localhost";
    String port = "3306";

    String datos = "jdbc:mysql://" + host + ":" + port + "/" + db;

    public Connection dbConnection(){
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(datos, user, password);
            System.out.println("La conexion ha sido exitosa");
            return DriverManager.getConnection(datos, user, password);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido acceder a la base de datos por el motivo de: ", e.getMessage(), 0);
            return null;
        }

        
    }
}
