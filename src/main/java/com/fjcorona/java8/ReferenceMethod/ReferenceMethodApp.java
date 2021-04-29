package com.fjcorona.java8.ReferenceMethod;

import java.util.Arrays;

public class ReferenceMethodApp {

    public static void referenceStaticMethod () {
        System.out.println("Reference to static method");
    }

    public void perform() {
        Operation opp = ReferenceMethodApp::referenceStaticMethod;
        opp.salute();
    }

    public void referenceMethodInstanceArbitraryObject() {
        String[] names = {"JavoCrown", "Javo", "Crown"};

        // With anonymous class

        /*
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        */

        // With lambda expression
        // Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));

        // With reference to method
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }

    public void referenceMethodInstanceSpecificObject() {
        System.out.println("Reference to a method from a particular instance.");
    }

    public void referenceConstructor() {

        // With anonymous class

        /*
        IPersona iper = new IPerson() {
            @Override
            public Person create(int id, String name) {
                return new Person(id, name);
            }
        };
        */

        // With lambda expression
        // IPerson iper = (x, y) -> new Person(x, y);

        // With reference to a constructor method
        IPerson iper = Person::new;

        System.out.println(iper.create(1, "Javo").toString());
    }

    public static void main (String[] args) {
        ReferenceMethodApp app = new ReferenceMethodApp();
        app.perform();
        app.referenceMethodInstanceArbitraryObject();

        // Reference the method from the particular "app" instance
        Operation opp = app::referenceMethodInstanceSpecificObject;
        opp.salute();

        app.referenceConstructor();
    }

}
