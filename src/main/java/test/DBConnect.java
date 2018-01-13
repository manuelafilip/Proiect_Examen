//package test;
//import com.dao.PersonDao;
//import com.entities.ItemAngajati;
//import com.entities.ItemUtilaje;
//import com.sun.mail.imap.protocol.Item;
//import com.util.ConnectionConfiguration;
//
//
//import java.sql.*;
//import java.util.List;
//
///**
// * Created by Manuela on 04.04.2017.
// */
//public class DBConnect implements PersonDao {
//    private Connection connection;
//    private Statement statement;
//    private ResultSet resultSet;
//    private ItemAngajati person;
//
//    public DBConnect() {
//        Connection connection = null;
//        Statement statement = null;
//        try {
//            Class.forName("org.postgresql.Driver");
//            connection = DriverManager.getConnection("jdbc:postgresql://54.93.65.5:5432/5MANUELA", "fasttrackit_dev", "fasttrackit_dev");
//            statement = connection.createStatement();
//        } catch (Exception ex) {
//            System.out.println("error: " + ex);
//        }
//    }
//
//    @Override
//    public void createAngajatiTable() {
//        try {
//            connection = ConnectionConfiguration.getConnection();
//            statement = connection.createStatement();
//            statement.execute("CREATE TABLE IF NOT EXISTS nomenclatorangajatii(idangajati INTEGER PRIMARY KEY ,marca VARCHAR(55) DEFAULT NULL,nume VARCHAR(55) DEFAULT NULL,prenume VARCHAR(55) DEFAULT NULL,schimb VARCHAR(55) DEFAULT NULL,functie VARCHAR(55) DEFAULT NULL,departament VARCHAR(55) DEFAULT NULL,dataangajare VARCHAR(55) DEFAULT NULL,dataincetare VARCHAR(55) DEFAULT NULL)");
////            statement.execute("CREATE TABLE IF NOT EXISTS nomenclatorutilajee(idutilaje INTEGER PRIMARY KEY ,cod VARCHAR(55) DEFAULT NULL,categorie VARCHAR(55) DEFAULT NULL,denumire VARCHAR(55) DEFAULT NULL,tipformare VARCHAR(55) DEFAULT NULL");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
////    @Override
////    public void createUtilajeTable() {
////        try {
////            connection = ConnectionConfiguration.getConnection();
////            statement = connection.createStatement();
//////            statement.execute("CREATE TABLE IF NOT EXISTS nomenclatorangajatiii(idangajati INTEGER PRIMARY KEY ,marca VARCHAR(55) DEFAULT NULL,nume VARCHAR(55) DEFAULT NULL,prenume VARCHAR(55) DEFAULT NULL,schimb VARCHAR(55) DEFAULT NULL,functie VARCHAR(55) DEFAULT NULL,departament VARCHAR(55) DEFAULT NULL,dataangajare VARCHAR(55) DEFAULT NULL,dataincetare VARCHAR(55) DEFAULT NULL)");
////            statement.execute("CREATE TABLE IF NOT EXISTS nomenclatorutilaje(idutilaje INTEGER PRIMARY KEY ,cod VARCHAR(55) DEFAULT NULL,categorie VARCHAR(55),denumire VARCHAR(55),tipformare VARCHAR(55)");
////        } catch (Exception e) {
////            e.printStackTrace();
////        } finally {
////            if (statement != null) {
////                try {
////                    statement.close();
////                } catch (SQLException e) {
////                    e.printStackTrace();
////                }
////            }
////            if (connection != null) {
////                try {
////                    connection.close();
////                } catch (SQLException e) {
////                    e.printStackTrace();
////                }
////            }
////        }
////    }
//
//    @Override
//    public void insert(ItemAngajati person){
//
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        try {
//            connection = ConnectionConfiguration.getConnection();
//            preparedStatement = connection.prepareStatement("INSERT INTO nomenclatorangajatii (marca, nume, prenume, schimb, functie, departament, dataangajare, dataincetare) VALUES (?,?,?,?,?,?,?,?) ");
//            preparedStatement.setString(1, .getMarca());
//            preparedStatement.setString(2, person.getNume());
//            preparedStatement.setString(3, person.getPrenume());
//            preparedStatement.setString(4, person.getSchimb());
//            preparedStatement.setString(5, person.getFunctie());
//            preparedStatement.setString(6, person.getDepartament());
//            preparedStatement.setString(7, person.getDataangajare());
//            preparedStatement.setString(8, person.getDataincetare());
//            preparedStatement.executeUpdate("INSERT INTO nomenclatorangajati (marca, nume, prenume, schimb, functie, departament, dataangajare, dataincetare) VALUES (?,?,?,?,?,?,?,?) ");
//            System.out.println();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (preparedStatement != null) {
//                try {
//                    preparedStatement.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//
//
//
//    @Override
//    public ItemAngajati selectById(int id) {
//        return null;
//    }
//
//    @Override
//    public List<ItemAngajati> selectAll() {
//        return null;
//    }
//
//    @Override
//    public void delete(int id) {
//
//    }
//
//    @Override
//    public void update(ItemAngajati angajati, int id) {
//
//    }
//
//}
//
//
////    public void getNomenclatorAngajati(){
////        try{
////            String query = "SELECT * FROM nomenclatorangajati";
////            rs = st.executeQuery(query);
////            System.out.println("Records from DB");
////            while(rs.next()){
////                String idangajati = rs.getString("idangajati");
////                String marca = rs.getString("marca");
////                String nume = rs.getString("nume");
////                String prenume = rs.getString("prenume");
////                String schimb = rs.getString("schimb");
////                String functie = rs.getString("functie");
////                String departament = rs.getString("departament");
////                String dataangajare = rs.getString("dataangajare");
////                String dataincetare = rs.getString("dataincetare");
////                System.out.println(idangajati + marca + nume + prenume + schimb + functie +
////                                    departament + dataangajare + dataincetare);
////
////                rs.close();
////                st.close();
////                con.close();
////            }
////        }catch (Exception ex){
////            System.out.println(ex);
////        }
////    }
////    public void getNomenclatorUtilaje(){
////        try{
////            String query = "SELECT * FROM nomenclatorutilaje";
////            rs = st.executeQuery(query);
////            System.out.println("Records from DB");
////            while(rs.next()){
////                int idutilaje = rs.getInt("idutilaje");
////                int cod = rs.getInt("cod");
////                String categorie = rs.getString("categorie");
////                String denumire = rs.getString("denumire");
////                String tipFormare = rs.getString("tipFormare");
////                System.out.println(idutilaje + cod + categorie + denumire + tipFormare);
////            }
////        }catch (Exception ex){
////            System.out.println(ex);
////        }
////    }
////
////    public void addNomenclatorAngajati(String marca, String nume, String prenume, String schimb, String functie, String departament, String dataangajare, String dataincetare) throws ClassNotFoundException, SQLException {
////        try{
////            PreparedStatement pSt = con.prepareStatement("INSERT INTO nomenclatorangajati(marca,nume,prenume,schimb,functie,departament,dataangajare,dataincetare) VALUES (?,?,?,?,?,?,?,?)");
////            System.out.println("Records from DB");
////            pSt.setString(1, marca);
////            pSt.setString(2, nume);
////            pSt.setString(3, prenume);
////            pSt.setString(4, schimb);
////            pSt.setString(5, functie);
////            pSt.setString(6, departament);
////            pSt.setString(7, dataangajare);
////            pSt.setString(8, dataincetare);
////            pSt.executeUpdate();
////
////            System.out.println("IT WORKS");
////
////            pSt.close();
////            con.close();
////
////
////    }catch (SQLException e) {
////            e.printStackTrace();
////        }
////    }
////    public void addNomenclatorUtilaje(String cod, String categorie, String denumire, String functie) throws ClassNotFoundException, SQLException {
////
////        try{
////            PreparedStatement pSt = con.prepareStatement("INSERT INTO nomenclatorutilaje " +
////                    "(cod,categorie,denumire,functie) " +
////                    "VALUES (?,?,?,?)");
////
////            System.out.println("Records from DB");
////
////            pSt.setString(1, cod);
////            pSt.setString(2, categorie);
////            pSt.setString(3, denumire);
////            pSt.setString(4, functie);
////
////            pSt.executeUpdate();
////            System.out.println("IT WORKS");
////
////            pSt.close();
////            con.close();
////
////        }catch (SQLException e) {
////            e.printStackTrace();
////        }
////    }
//
//
//
