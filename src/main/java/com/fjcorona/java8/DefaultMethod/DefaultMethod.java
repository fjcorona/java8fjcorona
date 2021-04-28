package com.fjcorona.java8.DefaultMethod;

public class DefaultMethod implements PersonA, PersonB {

    @Override
    public void camina() {
        System.out.println("Soy la PersonaA y estoy caminando.");
    }

    @Override
    public void duerme() {
        System.out.println("PersonaB se encuentra dormida.");
    }

    @Override
    public void habla() {
        /*
         * Al tener dos interfaces implementadas con metodos default
         * Que se llaman exactamente igual
         * Es necesario hacer la implementación en la clase
         * E indicar la interfaz de la cual iumplemntaremos dicho método.
         * Si no queremos usar ningún método podemos directamente sobreescribir
         * Su lógica.
         */
        PersonA.super.habla();
        // PersonaB.super.habla();
    }

    public static void main (String[] args) {
        DefaultMethod app = new DefaultMethod();

        app.camina();
        app.habla();
        app.come();
        app.canta();
        app.duerme();
    }
}
