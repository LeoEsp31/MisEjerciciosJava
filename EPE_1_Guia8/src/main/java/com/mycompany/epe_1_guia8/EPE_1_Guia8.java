package com.mycompany.epe_1_guia8;

import Entidad.Raices;
import Servicio.RaicesServicio;

public class EPE_1_Guia8 {

    public static void main(String[] args) {
        Raices ecuacion = new Raices(2, -14, 24);
        RaicesServicio servicio = new RaicesServicio();

        System.out.println("Discriminante: " + servicio.getDiscriminante(ecuacion));

        if (servicio.tieneRaices(ecuacion)) {
            System.out.println("La ecuación tiene dos raíces");
        }

        if (servicio.tieneRaiz(ecuacion)) {
            System.out.println("La ecuación tiene una única raíz");
        }

        servicio.calcular(ecuacion);
    }
}
