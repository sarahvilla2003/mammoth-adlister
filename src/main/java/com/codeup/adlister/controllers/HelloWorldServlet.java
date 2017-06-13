package com.codeup.adlister.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.HelloWorldServlet", urlPatterns = "/")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");

        if(name.isEmpty()){
            name = "world";
        }

        request.setAttribute("name", name);
        request.setAttribute("lastName", "Mendoza");
        request.getRequestDispatcher("/hello.jsp").forward(request, response);
//        response.getWriter().println("<h1>Hello, World!</h1>");

    }
}
