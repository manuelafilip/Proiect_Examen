package proiect;

import java.sql.*;

public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBConnect() {
        try {
            Class.forName("org.mysql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo", "root", "");
       Statement st =con.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getData(){
        try{
            String query = "SELECT * FROM employees";
            rs=st.executeQuery(query);
            System.out.println("records" + rs);
            while(rs.next()){
                String firstname= rs.getString("firstname");
                String lastname=rs.getString("lastname");
                System.out.println("firstname"+firstname+"lastmane"+lastname);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void addData(){
        try{
            String query = "INSERT INTO employees (lastname, firstname,email) VALUES ('A','B','CEVA@gmail.com')";
            st.executeUpdate(query);
                System.out.println("insert complete." + query);
            }catch(Exception e){
            System.out.println(e);
        }
    }
}
