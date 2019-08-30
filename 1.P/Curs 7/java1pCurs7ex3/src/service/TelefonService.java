/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.TelefonDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import model.Telefon;

/**
 *
 * @author student
 */
public class TelefonService {
    Connection con;
    
    public TelefonService(){
        String url = "jdbc:mysql://localhost/java1pCurs7bd1";
        String user = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void adaugaTelefon(Telefon t){
        TelefonDao telefonDao = new TelefonDao(con);
        telefonDao.adaugaTelefon(t);
    }
}
