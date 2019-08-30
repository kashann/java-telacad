/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import model.Telefon;

/**
 *
 * @author student
 */
public class TelefonDao {
    private Connection con;
    
    public TelefonDao(Connection con){
        this.con = con;
    }
    
    public void adaugaTelefon(Telefon t){
        try(Statement stmt = con.createStatement()) {
            String sql = "insert into telefon values (null, '"
                    + t.getMarca() + "', "+ t.getPret() + ")";
            stmt.execute(sql);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
