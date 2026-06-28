package com.Abhay;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {


   public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("in signup servlet");

String name=req.getParameter("name");
String email=req.getParameter("email");
String password=req.getParameter("password");
String cnf_password=req.getParameter("cnf_password");

if(!password.equals(cnf_password)){
resp.getWriter().println("Password do not match");
return;
}
User user=new User();
user.setName(name);
user.setEmail(email);
user.setPassword(password);

UserDAO dao=new UserDAO();
int result=dao.register(user);

if(result>0){
    System.out.println("Successfully registered");
    resp.sendRedirect("login.jsp");
}else{
    resp.getWriter().println("Registration failed");
}
    }
}
