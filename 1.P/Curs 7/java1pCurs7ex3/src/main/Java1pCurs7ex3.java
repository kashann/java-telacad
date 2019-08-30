/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.Telefon;
import service.TelefonService;

/**
 *
 * @author student
 */
public class Java1pCurs7ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Telefon t = new Telefon();
        t.setMarca("IPhone");
        t.setPret(3000);
        new TelefonService().adaugaTelefon(t);
    }
    
}
