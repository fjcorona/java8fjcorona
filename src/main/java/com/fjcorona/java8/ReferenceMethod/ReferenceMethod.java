package com.fjcorona.java8.ReferenceMethod;

import java.util.Arrays;

public class ReferenceMethod {

    public static void referenceStaticMethod () {
        System.out.println("Referencia a método estático");
    }

    public void perform() {
        Operation opp = ReferenceMethod::referenceStaticMethod;
        opp.salute();
    }

    public void referenceMethodInstanceArbitraryObject() {
        String[] names = {"JavoCrown", "Javo", "Crown"};

        // Con clase anónima

        /*
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        */

        // Con expresión lambda
        // Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));

        // Con referencia a método
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }

    public void referenceMethodInstanceSpecificObject() {
        System.out.println("Referencia a método de una instancia particular.");
    }

    public void referenceConstructor() {

        // Con clase anónima

        /*
        IPersona iper = new IPerson() {
            @Override
            public Person create(int id, String name) {
                return new Person(id, name);
            }
        };
        */

        // Con expresión lambda
        // IPerson iper = (x, y) -> new Person(x, y);

        // Con referencia al método constructor
        IPerson iper = Person::new;

        System.out.println(iper.create(1, "Javo").toString());
    }

    public static void main (String[] args) {
        ReferenceMethod app = new ReferenceMethod();
        app.perform();
        app.referenceMethodInstanceArbitraryObject();

        // Referenciar a metodo de la i9nstancia particular app
        Operation opp = app::referenceMethodInstanceSpecificObject;
        opp.salute();

        app.referenceConstructor();
    }

}
