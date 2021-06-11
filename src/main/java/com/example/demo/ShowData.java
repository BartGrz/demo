package com.example.demo;

import lombok.var;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Set;

@WebServlet(name = "showData", value = "/show-data")
public class ShowData extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List set = (List) req.getAttribute("set");
        req.setAttribute("set",set);

        if(!set.isEmpty()) {
            RequestDispatcher rd = req.getRequestDispatcher("showResults.jsp");
            rd.forward(req,resp);
        }

        RequestDispatcher rd = req.getRequestDispatcher("empty.jsp");
        rd.forward(req,resp);

    }

    @Override
    public void init() throws ServletException {

    }
}
