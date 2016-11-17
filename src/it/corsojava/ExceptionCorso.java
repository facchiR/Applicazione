/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.corsojava;

/**
 *
 * @author utente
 */
public class ExceptionCorso extends Exception {
    public ExceptionCorso(String msg, Exception e){
        super(msg, e);
    }
}
