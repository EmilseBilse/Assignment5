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
        System.out.println("ID     Name            Email");
        for (Person p: people) {
            System.out.println(p.toString());
        }

        Teacher bentHPedersen = new Teacher(202, "Bent H. Pedersen", "bhp" );
        bentHPedersen.setEmail("bhp@easv.dk");
        bentHPedersen.addSubject("Programming");
        System.out.println(bentHPedersen.toString());

        Student student1 = new Student(104,"Emil", "CS");
        student1.addGrade(new GradeInfo("sco",20));
        student1.addGrade(new GradeInfo("ITO", 15));
        student1.getGrade("sco");
        student1.setEmail("emil875b@easv365.dk");
        student1.getAverageGrade();
        System.out.println(student1.toString());

    }
}
