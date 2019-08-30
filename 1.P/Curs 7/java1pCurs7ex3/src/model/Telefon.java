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
public class Telefon {
    private int id;
    private String marca;
    private double pret;

    public Telefon() {
    }

    public Telefon(int id, String marca, double pret) {
        this.id = id;
        this.marca = marca;
        this.pret = pret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
    
    
}
