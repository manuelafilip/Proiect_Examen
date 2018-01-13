//package Pachete;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//
///**
// * Created by Manuela on 01.04.2017.
// */
//@WebServlet("/login")
//public class LoginServlet extends HttpServlet{
//    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//
//        // read user and password introduced by the user in the UI
//        String user = request.getParameter("u");
//        String passwd = request.getParameter("p");
//
//        UserAccessList userAccess= new UserAccessList();
//
//        int iduser=-1;
//        iduser=userAccess.checkUserCredentials(user, passwd);
//
//        if(iduser!=-1) {
//            System.out.println(user + "0000");
//            // userul exista in db, deci il autentific
//            HttpSession session = request.getSession(true);
//            session.setAttribute("username",user);
//            session.setAttribute("userid",iduser);
//
//
//            String success = "/date.html";
//            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(success);
//            dispatcher.forward(request, response);
//        }else {
//            System.out.println("nu exista acest user in db, deci nu fac nimic ");
//            String back = "/login.html";
//            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(back);
//            dispatcher.forward(request, response);
//        }
//
//        System.out.println("login service called...");
//
//
//    }
//}
