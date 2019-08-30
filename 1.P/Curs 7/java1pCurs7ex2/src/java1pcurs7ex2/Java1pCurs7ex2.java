/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1pcurs7ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Java1pCurs7ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/java1pCurs7bd1";
        String user = "root";
        String password = "";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            String sql = "insert into telefon values (null, 'Samsung', 1500) ";
            stmt.execute(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
