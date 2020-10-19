package com.hallum;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Person hansNielsen = new Person(100,"Hans Nielsen");
        hansNielsen.setEmail("hni@easv.dk");

        Person nielsHansen = new Person(101,"Niels Hansen");
        nielsHansen.setEmail("nha@easv.dk");

        Person ibBoesen = new Person(102, "Ib Boesen");
        ibBoesen.setEmail("ibo@easv.dk");

        people.add(hansNielsen);
        people.add(nielsHansen);
        people.add(ibBoesen);

        for (Person p: people) {
            System.out.println(p.toString());
        }

    }
}
