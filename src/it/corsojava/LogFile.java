/*
 * Logger made with a Singleton
 */
package it.corsojava;

/**
 *
 * @author utente
 */
public class LogFile {
     private static LogFile logFile = new LogFile();
    public static LogFile getInstance(){
        return logFile; 
    }
    public void info(String msg){
        System.out.println("INFO: " + msg);
    }
    public void error(String msg){
        System.out.println("ERROR: " + msg);
    }
}
