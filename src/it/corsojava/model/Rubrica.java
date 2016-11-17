/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.corsojava.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utente
 */
public class Rubrica {
    private List <Contatto> contatti = new ArrayList <Contatto>();

    
    public List <Contatto> getContatti() {
        return contatti;
    }

    
    public void setContatti(List <Contatto> contatti) {
        this.contatti = contatti;
    }
} 
    
