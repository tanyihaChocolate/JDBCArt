package com.gmail.vladgural.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/serv")
public class Serv extends HttpServlet {

    @Override
    public void init() throws ServletException {
    }

    @Override
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws IOException {
        // TODO auth
        HttpSession session = req.getSession();
        session.setAttribute("mail", "mail@my.com");

        String name1 = req.getParameter("name1");
        String name2 = req.getParameter("name2");

        resp.getWriter().println("<html> <h1>name1 = " + name1
                + ", name2 = " + name2 + "</h1></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
