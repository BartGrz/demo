package com.example.demo;

import lombok.var;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "showData", value = "/show-data")
public class ShowData extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var set = req.getAttribute("set");
        req.setAttribute("set",set);
        RequestDispatcher rd = req.getRequestDispatcher("test.jsp");
        rd.forward(req,resp);
    }

    @Override
    public void init() throws ServletException {

    }
}
