//package Pachete;
//
///**
// * Created by Manuela on 01.04.2017.
// */
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebServlet("/logout")
//public class LogoutServlet extends HttpServlet {
//
//
//    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("goool");
//
//
//        HttpSession s = request.getSession(true);
//        s.removeAttribute("username" );
//        s.removeAttribute("userid");
//
//
//        // intoarcere la login
//
//        String back = "/login.html";
//        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(back);
//        dispatcher.forward(request, response);
//    }
//}
