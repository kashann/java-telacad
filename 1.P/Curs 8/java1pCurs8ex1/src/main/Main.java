/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost/java1pCurs8";
            String user = "root";
            String parola = "";
            
            Connection con = DriverManager.getConnection(url, user, parola);
            
            String sql = "SELECT * FROM users";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){ //muta iteratorul din tabela pe urmatorul rand
                int id = rs.getInt("id");
                String u = rs.getString("username");
                String p = rs.getString("parola");
                System.out.println(id + " " + u + " " + p);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
