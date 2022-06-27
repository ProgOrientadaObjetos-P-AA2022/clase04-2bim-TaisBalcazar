/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {

    private double nLitros;
    private double costoL;
    private double descuento;

    public void establecerNumeroLitros(double numero) {
        nLitros = numero;
    }

    public void establecerCostoLitro(double valor) {
        costoL = valor;
    }

    public void establecerDescuento(double d) {
        descuento = d;
    }

    @Override
    public void calcularValorCancelar() {

        vCancelar = (costoL * (nLitros - (descuento * nLitros)));
    }

    public double obtenerNumeroLitros() {
        return nLitros;
    }

    public double obtenerCostoLitros() {
        return costoL;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Automovil\n"
                + "Propietario: %s\n"
                + "Placa: %s\n"
                + "Numero Litros: %.2f\n"
                + "Costo Litro: %.2f\n"
                + "Descuento: %.2f\n"
                + "Valor a Cancelar: %.2f\n",
                obtenerPropietario(),
                obtenerPlaca(),
                obtenerNumeroLitros(),
                obtenerCostoLitros(),
                descuento, vCancelar);
        return cadena;
    }
}
