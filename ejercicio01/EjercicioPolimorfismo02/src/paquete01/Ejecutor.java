/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombresPr;
        String placa;
        int galmax;
        double costoGalon;
        double litmax;
        double costoLitro;
        double descuento;
        int tipoAutomovil;
        boolean bandera = true;
        ArrayList<Automovil> automoviles = new ArrayList<>();

        while (bandera) {
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Automovil Gasolina\n"
                    + "Ingrese (2) para Automovil Diesel");
            tipoAutomovil = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Ingrese los nombres del propietario");
            nombresPr = entrada.nextLine();
            System.out.println("Ingrese la placa del vehiculo");
            placa = entrada.nextLine();

            if (tipoAutomovil == 1) {

                AutomovilGasolina automovilG = new AutomovilGasolina();

                System.out.println("Ingresela capacidad maxima del tanque");
                galmax = entrada.nextInt();
                System.out.println("Ingrese el costo de cada galon");
                costoGalon = entrada.nextDouble();
                automovilG.establecerPropietario(nombresPr);
                automovilG.establecerPlaca(placa);
                automovilG.establecerNumeroGalones(galmax);
                automovilG.establecerCostoGalon(costoGalon);

                automoviles.add(automovilG);

            } else {

                AutomovilDiesel automovilD = new AutomovilDiesel();

                System.out.println("Ingresela capacidad maxima del tanque");
                litmax = entrada.nextInt();
                System.out.println("Ingrese el costo de cada litro");
                costoLitro = entrada.nextDouble();
                System.out.println("Ingrese el descuento de cada litro");
                descuento = entrada.nextDouble();
                automovilD.establecerPropietario(nombresPr);
                automovilD.establecerPlaca(placa);
                automovilD.establecerNumeroLitros(litmax);
                automovilD.establecerCostoLitro(costoLitro);
                automovilD.establecerDescuento(descuento);

                automoviles.add(automovilD);

            }
            entrada.nextLine();
            System.out.println("Desea ingresar mas datos?");
            String op = entrada.nextLine();
            if (op.equals("no")) {
                bandera = false;
            }
        }

        for (int i = 0; i < automoviles.size(); i++) {
            automoviles.get(i).calcularValorCancelar();

            System.out.printf("%s\n",automoviles.get(i));
        }
    }
}
