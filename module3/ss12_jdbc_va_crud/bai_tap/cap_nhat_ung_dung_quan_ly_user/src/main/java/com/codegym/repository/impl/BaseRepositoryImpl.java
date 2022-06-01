package com.codegym.repository.impl;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepositoryImpl {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/demo";
    private String username = "root";
    private String password = "Anhhau9295";
    private Connection connection;

    public Connection getConnectionJavaToDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcUrl,username,password);
            return connection;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
