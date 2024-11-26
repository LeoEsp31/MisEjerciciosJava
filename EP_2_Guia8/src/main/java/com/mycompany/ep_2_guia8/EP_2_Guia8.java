package com.mycompany.ep_2_guia8;

import Entidad.Cafetera;
import Servicios.CafeteraServicio;

public class EP_2_Guia8 {
    
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        CafeteraServicio cs = new CafeteraServicio();
        cs.llenarCafetera(cafetera);
        cs.servirTaza(cafetera);
        cs.vaciarCafetera(cafetera);
        cs.agregarCafe(cafetera);
        
    }
}
