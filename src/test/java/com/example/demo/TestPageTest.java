package com.example.demo;

import com.example.demo.models.CarsDAO;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class TestPageTest {

    @Test
    void init()  {

        CarsDAO carsDAO = new CarsDAO();
        System.out.println( carsDAO.selectAllCars());




    }
    @Test
    void testResultSet() throws SQLException {
        String url = "jdbc:sqlserver://db-mssql;database=s19982;integratedSecurity=true;";
        Connection  conn = DriverManager.getConnection(url);
        Statement statement = conn.createStatement();

    }
}