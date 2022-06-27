/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {

    private double nGalones;
    private double costoG;
    private double iva;

    public AutomovilGasolina() {
        iva = 0.10;
    }

    public void establecerNumeroGalones(int numero) {
        nGalones = numero;
    }

    public void establecerCostoGalon(double valor) {
        costoG = valor;
    }

    @Override
    public void calcularValorCancelar() {
        vCancelar = (costoG * nGalones);
        vCancelar = vCancelar + (iva * vCancelar);
    }

    public double obtenerNumeroGalones() {
        return nGalones;
    }

    public double obtenerCostoGalones() {
        return costoG;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Automovil\n"
                + "Propietario: %s\n"
                + "Placa: %s\n"
                + "Numero Galones: %.2f\n"
                + "Costo Galon: %.2f\n"
                + "IVA: %.2f\n"
                + "Valor a Cancelar: %.2f\n",
                obtenerPropietario(),
                obtenerPlaca(),
                obtenerNumeroGalones(),
                obtenerCostoGalones(),
                iva, vCancelar);
        return cadena;
    }

}
