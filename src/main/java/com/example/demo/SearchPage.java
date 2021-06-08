package com.example.demo;

import com.example.demo.models.CarsDAO;
import lombok.var;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "searchPage", value = "/search-page")
public class SearchPage extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        var val = req.getParameter("category");
        req.setAttribute("val",val);
        TestPage testPage=new TestPage();
        testPage.setCategory(val);
        testPage.doGet(req, resp);
    }

    @Override
    public void init() throws ServletException {

    }
}
