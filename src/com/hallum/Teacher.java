package com.hallum;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private String initials;
    private double salary;
    private List<String> subjects = new ArrayList<>();

    public Teacher(int id, String name, String initials){
        super(id, name);
        this.initials = initials;
    }

    public List<String> getSubjects(){
        return subjects;
    }

    public String getInitials() {
        return initials;
    }

    public double getSalary() {
        return salary;
    }

    public void addSubject(String subject){
        subjects.add(subject);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return getId() + "    " + getName() + "    " + getEmail() + "    " + getInitials() + "    " + getSubjects();
    }
}
