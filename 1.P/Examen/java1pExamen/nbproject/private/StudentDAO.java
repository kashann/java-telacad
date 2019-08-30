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
import model.Student;

/**
 *
 * @author student
 */
public class StudentDAO {
    private Connection con;
    private PreparedStatement stmt1, stmt2, stmt3;

    public StudentDAO(Connection con) {
        try{
            this.con = con;
            this.stmt1 = con.prepareStatement("SELECT * FROM studenti");
            this.stmt2 = con.prepareStatement("INSERT INTO studenti VALUES (NULL, ?, ?, ?)");
            this.stmt3 = con.prepareStatement("DELETE FROM studenti WHERE id = ?");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void adaugaStudent(Student s) throws SQLException {
        stmt2.setString(1, s.getNume());
        stmt2.setString(2, s.getPrenume());
        stmt2.setString(3, s.getCnp());
        stmt2.executeUpdate();
        
    }
    
    public List<Student> getAllStudents() throws SQLException{
        List<Student> studenti = new ArrayList<>();
        ResultSet rs = stmt1.executeQuery();
        
        while(rs.next()){
            int id = rs.getInt("id");
            String nume = rs.getString("nume");
            String prenume = rs.getString("prenume");
            String cnp = rs.getString("cnp");
            studenti.add(new Student(id, nume, prenume, cnp));
        }
        
        return studenti;
    }
    
    public void stergeStudent(int id) throws SQLException {
        stmt3.setInt(1, id);
        stmt3.executeUpdate();
    }
    
}
