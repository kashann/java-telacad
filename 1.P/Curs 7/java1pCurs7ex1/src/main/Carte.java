/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
/**
 *
 * @author student
 */
public class Carte implements java.io.Serializable {
    private String titlu;
    private String autor;
    private double pret;

    public Carte() {
    }

    public Carte(String titlu, String autor, double pret) {
        this.titlu = titlu;
        this.autor = autor;
        this.pret = pret;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return titlu + " / " + autor + " / " + pret;
    }

}
