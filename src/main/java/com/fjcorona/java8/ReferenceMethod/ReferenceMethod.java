package com.fjcorona.java8.ReferenceMethod;

import java.util.Arrays;

public class ReferenceMethod {

    public static void referenciarMetodoStatic () {
        System.out.println("Referencia a método estático");
    }

    public void operar() {
        Operation opp = ReferenceMethod::referenciarMetodoStatic;
        opp.saludar();
    }

    public void referenciarMetodooInstanciaObjetoArbitarrio() {
        String[] nombres = {"JavoCrown", "Javo", "Crown"};

        // Con clase anónima

        /*
        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        */

        // Con expresión lambda
        // Arrays.sort(nombres, (o1, o2) -> o1.compareToIgnoreCase(o2));

        // Con referencia a método
        Arrays.sort(nombres, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(nombres));
    }

    public void referenciarMetodooInstanciaObjetoParticular() {
        System.out.println("Referencia a método de una instancia particular.");
    }

    public void referenciarConstructor() {

        // Con clase anónima

        /*
        IPersona iper = new IPersona() {
            @Override
            public Persona crear(int id, String nombre) {
                return new Persona(id, nombre);
            }
        };
        */

        // Con expresión lambda
        // IPersona iper = (x, y) -> new Persona(x, y);

        // Con referencia al método constructor
        IPerson iper = Person::new;

        System.out.println(iper.crear(1, "Javo").toString());
    }

    public static void main (String[] args) {
        ReferenceMethod app = new ReferenceMethod();
        app.operar();
        app.referenciarMetodooInstanciaObjetoArbitarrio();

        // Referenciar a metodo de la i9nstancia particular app
        Operation opp = app::referenciarMetodooInstanciaObjetoParticular;
        opp.saludar();

        app.referenciarConstructor();
    }

}
