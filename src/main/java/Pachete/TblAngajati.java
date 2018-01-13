//package Pachete;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Manuela on 30.03.2017.
// */
//@WebServlet("/Angajati")
//public class TblAngajati extends HttpServlet {
//
//    final static String URL = "jdbc:postgresql://54.93.65.5:5432/5MANUELA";
//    final static String USERNAME = "fasttrackit_dev";
//    final static String PASSWORD = "fasttrackit_dev";
//
//
//    // CITIREA DIN TABEL ...............................................................................................//
//
//    public static void readFromTable() throws ClassNotFoundException, SQLException {
//        // 1. load driver
//        Class.forName("org.postgresql.Driver");
//        // 2. make conaction
//        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//        // 3. create a query statement
//        PreparedStatement pSt = conn.prepareStatement("SELECT * FROM nomenclatorangajati");
//        // 4. execute query
//        ResultSet result = pSt.executeQuery();
//        // 5. iterate the result set and print the values
//        while (result.next()) {
//            System.out.print(result.getString("nume").trim());
//            System.out.print("---");
//            int idangajati = result.getInt("idangajati");
//            int marca = result.getInt("marca");
//            String nume = result.getString("nume");
//            String prenume = result.getString("prenume");
//            int schimb = result.getInt("schimb");
//            String functie = result.getString("functie");
//            String departament = result.getString("departament");
//            String dataangajare = result.getString("dataangajare");
//            String dataincetare = result.getString("dataincetare");
//        }
//        // 6. close the objects
//        result.close();
//        pSt.close();
//        conn.close();
//    }
//
////     INSERAREA IN TABEL ...............................................................................................//
//    public void insertInTabel(String xxx) throws ClassNotFoundException, SQLException {
//        // 1. load driver
//        Class.forName("org.postgresql.Driver");
//        // 2. make conaction
//        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//        try {
//            // 3. create a query statement
//            PreparedStatement pSt = conn.prepareStatement("INSERT INTO nomenclatorangajati (marca,nume,prenume,schimb,functie,departament,dataangajare,dataincetare) VALUES (?,?,?,?,?,?,?,?)");
//
//
//            pSt.setString(1, "");
//            pSt.setString(2, "");
//
//
//
//            // 5. execute a prepared statement
//            int rowsInserted = pSt.executeUpdate();
//
//            // 6. close the objects
//            pSt.close();
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
