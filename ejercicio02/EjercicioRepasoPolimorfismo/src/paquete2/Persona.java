/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(String n, String a, int ed){
        nombre = n;
        apellido = a;
        edad = ed;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCedula(String n){
        apellido = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCedula(){
        return apellido;
    }
    
}
