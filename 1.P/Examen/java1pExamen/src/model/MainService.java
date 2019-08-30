/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.StudentDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import model.Student;

/**
 *
 * @author student
 */
public class MainService {
    private String user = "root";
    private String pass = "";
    private String url = "jdbc:mysql://localhost/java1pexamen";
    private Connection con;
    
    private MainService(){
        try{
            con = DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private static final class SingletonHolder{
        private static final MainService INSTANCE = new MainService();
    }
    
    public static MainService getInstance(){
        return SingletonHolder.INSTANCE;
    }
    
    public void adaugaStudent(Student s){
        StudentDAO studDao = new StudentDAO(con);
        try{
            studDao.adaugaStudent(s);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public List<Student> getAllStudents(){
        StudentDAO studDao = new StudentDAO(con);
        try{
            return studDao.getAllStudents();
        }catch(SQLException e){
            e.printStackTrace();
        }
                
        return Collections.emptyList();
    }
    
    public void stergeStudent(int id){
        StudentDAO studDao = new StudentDAO(con);
        try{
            studDao.stergeStudent(id);
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
