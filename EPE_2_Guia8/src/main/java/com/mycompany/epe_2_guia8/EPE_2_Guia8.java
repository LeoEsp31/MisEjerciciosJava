package com.mycompany.epe_2_guia8;

import Entidad.NIF;
import Servicios.NifServicio;

public class EPE_2_Guia8 {

    /**
     * Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
     * letra que le corresponderá. Una vez calculado, le asigna la letra que le
     * corresponde según
     *
     * @param args
     */
    public static void main(String[] args) {
        NIF n1 = new NIF();
        NifServicio ns = new NifServicio();
        ns.crearNif(n1);
        ns.mostrar(n1);
        
    }
}
