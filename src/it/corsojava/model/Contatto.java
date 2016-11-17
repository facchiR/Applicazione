/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.corsojava.model;

/**
 *
 * @author utente
 */
public class Contatto {
    private long _id;
    private String nome;
    private String cognome;
    private String telefono;
    
    public Contatto(){}
    
    public Contatto(long _id, String nome, String cognome, String telefono){
        this._id = _id;
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
    }

    
    public long getId() {
        return _id;
    }

    
    public void setId(long _id) {
        this._id = _id;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCognome() {
        return cognome;
    }

    
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    
    public String getTelefono() {
        return telefono;
    }

    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString(){
        return String.format("_id:%d, nome:%s, cognome:%s, telefono:%s",
                _id, nome, cognome, telefono);
    }
}

