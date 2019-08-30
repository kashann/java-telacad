/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Produs;

/**
 *
 * @author student
 */
public class ProdusDao {
    private Connection con;
    private PreparedStatement stmt1, stmt2, stmt3;
    
    public ProdusDao(Connection con){
        try{
            this.con = con;
            this.stmt1 = con.prepareStatement("INSERT INTO produse VALUES (NULL, ?, ?)");
            this.stmt2 = con.prepareStatement("SELECT * FROM produse");
            this.stmt3 = con.prepareStatement("DELETE FROM produse WHERE id = ?");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void adaugaProdus(Produs p) throws SQLException {
        stmt1.setString(1, p.getNume());
        stmt1.setDouble(2, p.getPret());
        stmt1.executeUpdate();
    }
    
    public List<Produs> getAllProducts() throws SQLException{
        List<Produs> produse = new ArrayList<>();
        ResultSet rs = stmt2.executeQuery();
        
        while(rs.next()){
            int id = rs.getInt("id");
            String nume = rs.getString("nume");
            double pret = rs.getDouble("pret");
            produse.add(new Produs(id, nume, pret));
        }
        
        return produse;
    }
    
    public void stergeProdus(int id) throws SQLException {
        stmt3.setInt(1, id);
        stmt3.executeUpdate();
    }
}
