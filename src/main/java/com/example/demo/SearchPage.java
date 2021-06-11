package com.example.demo;

import lombok.var;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "searchPage", value = "/search-page")
public class SearchPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        RequestDispatcher rd =
                req.getRequestDispatcher("search.jsp");
        rd.forward(req,resp);
    }

    @Override
    public void init() throws ServletException {



    }
}
