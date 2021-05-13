/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petadoption;

/**
 *
 * @author Hyper10n
 */
public class Main {
    public static void main(String[] args) {
        String dbName = "pet.db";
        
        // Read SQL create table from file
        String schemaSQLPath = ".\\src\\main\\java\\com\\mycompany\\petadoption\\schema.txt";
        String schemaSQL = DatabaseUtil.loadSqlFromTxtFile(schemaSQLPath);
        
        // SQL -> If table does not exist create it
        DatabaseUtil.buildTable(dbName, schemaSQL);
        
        // Call console interface function with option to view all pets, view pets of certain species, edit pet, delete pet
    }
}
