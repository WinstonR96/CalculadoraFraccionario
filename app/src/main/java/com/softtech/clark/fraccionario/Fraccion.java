package com.softtech.clark.fraccionario;

/**
 * Created by winston on 25/09/2015.
 */
public class Fraccion {
    public int numerador;
    public int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Fraccion{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }

    public boolean esHomogenea(Fraccion f){
        if (this.denominador == f.denominador){
            return true;
        }else{
            return false;
        }
    }

    public boolean esHeterogenea (Fraccion f){
        if (this.denominador != f.denominador){
            return true;

        }else{
            return false;
        }
    }

    public Fraccion suma(Fraccion f){
        Fraccion fracci;
        if (esHomogenea(f)){
            int numerador = this.numerador + f.numerador;
            int denominador = this.denominador;
            fracci = new Fraccion(numerador, denominador);
            return fracci;
        }else{
            int numerador = this.numerador*f.denominador + this.denominador*f.numerador;
            int denominador = this.denominador*f.denominador;
            fracci = new Fraccion(numerador, denominador);
            return fracci;
        }

    }

    public Fraccion resta (Fraccion f){
        Fraccion fracci;
        if (esHomogenea(f)){
            int numerador = this.numerador -f.numerador;
            int denominador = this.denominador;
            fracci = new Fraccion(numerador, denominador);
            return fracci;
        }else{
            int numerador = this.numerador*f.denominador - this.denominador*f.numerador;
            int denominador = this.denominador*f.denominador;
            fracci = new Fraccion(numerador, denominador);
            return fracci;
        }
    }

    public Fraccion multiplicacion (Fraccion f){
        Fraccion fracci;

            int numerador = this.numerador*f.numerador;
            int denominador = this.denominador*f.denominador;
            fracci = new Fraccion(numerador, denominador);
            return fracci;
        }

    public Fraccion dividir (Fraccion f) {
        Fraccion Fracci;
        numerador = this.numerador * f.denominador;
        denominador = this.denominador * f.numerador;
        Fracci = new Fraccion(numerador, denominador);
        return Fracci;
    }

    public int mcd(){
        int u=Math.abs(numerador);
        int v=Math.abs(denominador);
        if(v==0){
            return u;
        }
        int r;
        while(v!=0){
            r=u%v;
            u=v;
            v=r;
        }
        return u;
    }

   public Fraccion simplificar(){
        int dividir=mcd();
        numerador/=dividir;
        denominador/=dividir;
        return this;
    }
}
