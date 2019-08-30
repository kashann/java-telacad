/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author student
 */
public class Student {
    private int id;
    private String nume;
    private String prenume;
    private String cnp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public Student(String nume, String prenume, String cnp) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
    }

    public Student(int id, String nume, String prenume, String cnp) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return nume + " " + prenume + ", CNP:" + cnp;
    }
    
}
