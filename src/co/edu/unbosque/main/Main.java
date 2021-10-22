package co.edu.unbosque.main;

import java.util.*;
import java.sql.*;

import co.edu.unbosque.datos.Owner;
import co.edu.unbosque.datos.UserApp;
import co.edu.unbosque.services.OwnersService;
import co.edu.unbosque.services.PetsService;
import co.edu.unbosque.services.UsersService;

public class Main {

    // JDBC driver name and databas URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost/fourpaws";

    // Database credentials
    static final String USER = "Crisvac";
    static final String PASS = "contra";

    public static void main(String[] args) {

        // Objects for handling connection
        Connection conn = null;

        try {

            // Registering the JDBC driver
            Class.forName(JDBC_DRIVER);

            // Opening database connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            UsersService usersService = new UsersService(conn);
            usersService.listUsers();

            PetsService petsService = new PetsService(conn);
            petsService.countBySpecies("dog");

            OwnersService ownersService = new OwnersService(conn);
            ownersService.updateOwner(new Owner("Crisvac", "1234", "Pepito Perez", "carrera 1", " Marly"));

            // Closing database connection
            conn.close();

        } catch(SQLException se) {
            se.printStackTrace(); // Handling errors from database
        } catch(ClassNotFoundException e) {
            e.printStackTrace(); // Handling errors from JDBC driver
        } finally {
            // Cleaning-up environment
            try {
                if(conn != null) conn.close();
            } catch(SQLException se) {
                se.printStackTrace();
            }
        }

    }
}