/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class Conector {

    String url = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Tienda\\src\\Tienda.sqlite";

//    private String uri = "Proyecto1.sqlite";
    private Connection connect;

    public Conector() {
    }

    public Connection getConnection() {
        return connect;
    }

    public void connect() {
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (connect != null) {
                System.out.println("Conectado!");
            }
        } catch (SQLException e) {
            System.err.println("Error en la conexión");
            System.out.println(e.getMessage().toString());
        }
    }

    public void close() {
        try {
            connect.close();
        } catch (SQLException e) {
        }
    }
}
