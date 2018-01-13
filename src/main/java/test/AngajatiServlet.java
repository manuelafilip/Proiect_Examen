//package test;
//
//import test.ItemAngajati.*;
//import com.sun.mail.imap.protocol.Item;
//import com.sun.org.apache.xpath.internal.operations.String;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Manuela on 05.04.2017.
// */
//@WebServlet("/tblAngajati")
//public class AngajatiServlet extends HttpServlet{
//    private int counter;
//    private static final java.lang.String LIST_ACTION = "list";
//
//    List<Item> items = new ArrayList<Item>();
//
//    @Override
//    public void service(HttpServletRequest request, HttpServletResponse response) {
//        String action = request.getParameter("action" );
//        counter++;
//
//
//        if (action != null && action.equals(LIST_ACTION)) {
//            listAction(request, response);
//        } else if (action != null && action.equals("add" )) {
//            addAction(request, response);
//        }
//
//    System.out.println("I was used " + counter + " times!");
//
//    }
//
//    //metoda addAction:.................//
//    private void addAction(HttpServletRequest request, HttpServletResponse response){
//
//        String marca = request.getParameter("marca");
//        String nume = request.getParameter("nume");
//        String prenume = request.getParameter("prenume");
//        String schimb = request.getParameter("schimb");
//        String functie = request.getParameter("functie");
//        String departament = request.getParameter("departament");
//        String dataangajare = request.getParameter("dataangajare");
//        String dataincetare = request.getParameter("dataincetare");
//
//
//        Item itemulNou = new Item(marca,nume,prenume,schimb,functie,departament,dataangajare,dataincetare);
//
//        try {
//            DBConnect.writetblAngajati(itemulNou);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        items.add(itemulNou);
//        try{
//            response.sendRedirect("/angajai.html");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//
//
//    //metoda listAction:................//
//    private void listAction(HttpServletRequest request, HttpServletResponse response){
//        String jsonResponse ="[";
//        List<Item> items = new ArrayList<>();
//        try{
//            items = DBConnect.readtblAngajati();
//        } catch (ClassNotFoundException e) {
//            items.add(new Item("Eroare de clasa:" + e.getMessage(), -789452));
//        } catch (SQLException e) {
//            items.add(new Item("Erorare de sql:" + e.getMessage(), -5632));
//        }
//        for(int i=0; i<items.size(); i++){
//            String marca = items.get(i).getMarca();
//            String nume = items.get(i).getNume();
//            String prenume = items.get(i).getPrenume();
//            String schimb = items.get(i).getSchimb();
//            String functie = items.get(i).getFunctie();
//            String departament = items.get(i).getDepartament();
//            String dataangajare = items.get(i).getDataangajare();
//            String dataincetare = items.get(i).getDataincetare();
//
//            String element = "{\"marca\": \"" + marca + "\", \"nume\": " + nume + "\", \"prenume\": " + prenume+ "\", \"schimb\": " + schimb+ "\", \"functie\": " + functie+ "\", \"departament\": " + departament+ "\", \"dataangajare\": " + dataangajare + "\", \"dataincetare\": " + dataincetare + "}";
//            jsonResponse +=element;
//            if(i<items.size() -1){
//
//            jsonResponse += ",";
//
//        }
//    }
//    jsonResponse += "]";
//
//    returnJsonResponse(response, jsonResponse);
//
//
//
////    @Override
////    public void init() throws ServletException {
////        super.init();
////        System.out.println("init() called. Counter is: " + counter);
////    }
////
////    @Override
////    public void destroy(){
////        System.out.println("Destroying Servlet! Counter is:" + counter);
////        super.destroy();
////    }
////    private void returnJsonResponse(HttpServletResponse response, String jsonResponse) {
////        response.setContentType("application/json");
////        PrintWriter pr = null;
////        try {
////            pr = response.getWriter();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        assert pr != null;
////        pr.write(jsonResponse);
////        pr.close();
// }
//}
