package com.mycompany.ep_1_guia8;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

public class EP_1_Guia8 {

    public static void main(String[] args) {
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria cb1 = cbs.crearCuenta();
        cbs.ingresar(cb1);
        cbs.consultarSaldo(cb1);
        cbs.retirar(cb1);
        cbs.consultarSaldo(cb1);
        cbs.extraccionRapida(cb1);
        cbs.consultarSaldo(cb1);
        cbs.consultarDatos(cb1);

    }
}
