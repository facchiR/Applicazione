package it.corsojava;

import it.corsojava.model.Contatto;
import it.corsojava.model.Rubrica;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogFile.getInstance().info("Ciao");
        LogFile.getInstance().info("Ciao tua sorella");
        try{    
            ClasseSbagliata cs = new ClasseSbagliata();
            cs.sbaglia();
        }catch(Exception ex){
            LogFile.getInstance().error(ex.getMessage());
        }finally{
            LogFile.getInstance().info("Questo è finally!");
        }
        List <Double> oggetti = new ArrayList<Double>();
        oggetti.add(new Double(2.5));
        oggetti.add(new Double(5.0));
                
        Double somma = 0d;
        for(int i=0; i<oggetti.size(); i++){
            somma += oggetti.get(i);
        }
        LogFile.getInstance().info("Somma:" + somma);
        
        Map <String, String> rubricaSemplice = new TreeMap<>();
        rubricaSemplice.put("Aldo", "345 8888888");
        rubricaSemplice.put("Giovanni", "365 9386453");
        rubricaSemplice.put("Giacomo", "324 74625552");
        
        for(String k: rubricaSemplice.keySet()){
            String v = rubricaSemplice.get(k);
            LogFile.getInstance().info(String.format("%s: %s", k, v));
        }
        Rubrica NuovaRubrica = new Rubrica();
        NuovaRubrica.getContatti().add(new Contatto(7676,"Aldo","Aldo","343217787"));
        NuovaRubrica.getContatti().add(new Contatto(7677,"Giovanni","Giovanni","376527603" ));
        NuovaRubrica.getContatti().add(new Contatto(7678,"Giacomo","Giacomo","345662522"));
            
        int length = NuovaRubrica.getContatti().size();
        for(int i=0; i<length; i++){
            Contatto c = NuovaRubrica.getContatti().get(i);
            String str = c.toString();
            LogFile.getInstance().info(str);
        }
        
        Map<String, Contatto> mappaRicerca = new HashMap<>();
        for(int i=0; i<length; i++){
            Contatto c = NuovaRubrica.getContatti().get(i);
            String nome = c.getNome();
            mappaRicerca.put(nome, c);
            LogFile.getInstance().info(nome + " " + c.toString());
        }        
    }   
}
