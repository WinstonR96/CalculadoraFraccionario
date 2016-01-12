package com.softtech.clark.fraccionario;
import com.softtech.clark.fraccionario.Fraccion;

/**
 * Created by winston on 25/09/2015.
 */
public class Prueba {

    public static void main(String[] args) {
        Fraccion f = new Fraccion(4,2);
        Fraccion g = new Fraccion(1,3);
        System.out.println(f.esHeterogenea(g));
        System.out.println(f.esHomogenea(g));
        System.out.println(f.suma(g));
        System.out.println(f.resta(g));
        System.out.println(f.multiplicacion(g));
        System.out.println(f.dividir(g));

    }
}
