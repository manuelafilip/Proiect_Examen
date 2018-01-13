//package Pachete;
//
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import java.sql.*;
//
//
///**
// * Created by Manuela on 30.03.2017.
// */
//@WebServlet("/items")
//public class TblUtilaje extends HttpServlet {
//    final static String URL = "jdbc:postgresql://54.93.65.5:5432/5MANUELA";
//    final static String USERNAME = "fasttrackit_dev";
//    final static String PASSWORD = "fasttrackit_dev";
//
//    public static void readFromTable() throws ClassNotFoundException, SQLException {
//        // 1. load driver
//        Class.forName("org.postgresql.Driver");
//        // 2. make conaction
//        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//
//        // 3. create a query statement
//        PreparedStatement pSt = conn.prepareStatement("SELECT * FROM nomenclatorutilaje");
//
//        // 4. execute query
//        ResultSet result = pSt.executeQuery();
//
//
//        // 6. iterate the result set and print the values
//        while (result.next()) {
//            int idutilaje = result.getInt("idutilaje");
//            int cod = result.getInt("cod");
//            String categorie = result.getString("categorie");
//            String denumire = result.getString("denumire");
//            String tipFormare = result.getString("tipFormare");
//        }
//
//        // 7. close the objects
//
//        result.close();
//        pSt.close();
//        conn.close();
//
//    }
//}
//
