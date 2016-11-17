/*
 * Handle exceptions?
 */
package it.corsojava;

/**
 *
 * @author utente
 */
public class ClasseSbagliata {
    public double sbaglia() throws ExceptionCorso {
        try{
            Double num = null;
            return 5/num;
        }catch(Exception ex){
            throw new ExceptionCorso("Sbaglia ha sbagliato", ex);
        }
    }
}
