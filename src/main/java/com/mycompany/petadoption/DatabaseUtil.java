/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petadoption;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;

/**
 *
 * @author Hyper10n
 */
public class DatabaseUtil {
    public static Connection connect(String dbName) {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:" + dbName;
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to " + dbName  + " has been established");
            return conn;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return conn;
    }
    
    public static void buildTable(String dbName, String schemaSQL) {
        
        try (
                Connection conn = connect(dbName);
                Statement createSchema = conn.createStatement();
            ) 
        {
            createSchema.executeUpdate(schemaSQL);
            System.out.println("Table created successfully with SQL below:" + System.lineSeparator() + schemaSQL);        
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public static String loadSqlFromTxtFile(String path) {
        String text = null;
        StringBuilder sb = new StringBuilder();
        File sqlFile = new File(path);
        
        try (BufferedReader br = new BufferedReader(new FileReader(sqlFile))){
            while((text = br.readLine()) != null) {
                sb.append(text);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return sb.toString();
    }
}
