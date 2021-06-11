package com.example.demo;

import com.example.demo.models.Cars;
import com.example.demo.models.CarsDAO;
import lombok.Getter;
import lombok.Setter;
import lombok.var;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;

@WebServlet(name = "prepareData", value = "/prepare-data")
public class PrepareData extends HttpServlet {

    private List<Cars> set = new ArrayList<>();
    @Getter
    @Setter
    private String category;



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        var val = req.getParameter("category");
        req.setAttribute("val", val);

        var getIt = (String)req.getAttribute("val");
        CarsDAO carsDAO = new CarsDAO();
        set =  carsDAO.SelectByValue(getIt);
        req.setAttribute("set",set);
        ShowData showData = new ShowData();
        showData.doGet(req, resp);




    }

    @Override
    public void destroy() {

    }

    @Override
    public void init() throws ServletException {


    }

}
