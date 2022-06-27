/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {

    protected String propietario;
    protected String placa;
    protected double vCancelar;

    public void establecerPropietario(String n) {
        propietario = n;
    }

    public String obtenerPropietario() {
        return propietario;
    }

    public void establecerPlaca(String n) {
        placa = n;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public abstract void calcularValorCancelar();

    public double obtenerCancelar() {
        return vCancelar;
    }

}
