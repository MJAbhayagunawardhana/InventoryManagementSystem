/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leemo.inventory;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Miyuru UOK
 */
public class connection {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/section","root", "");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            
        }return con;
    }
    
}
