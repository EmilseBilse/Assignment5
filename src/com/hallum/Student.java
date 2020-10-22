package com.hallum;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private List<GradeInfo> gradeReport = new ArrayList<>();
    private String education;


    public Student(int id, String name, String education) {
        super(id, name);
        this.education = education;
    }

    public List<GradeInfo> getGradeReport() {
        return gradeReport;
    }

    public String getEducation() {
        return education;
    }

    public double getAverageGrade(){
        double allGrades = 0;
        int totalSubjects = gradeReport.size();
        for(GradeInfo gradeInfo : gradeReport){
            allGrades += gradeInfo.getGrade();
        }
        return allGrades/totalSubjects;
    }

    public int getGrade(String subject){
        int i = 0;
        for (GradeInfo g : gradeReport){
            if(g.getSubject().equals(subject)){
                break;
            }else {
                i++;
            }
        }
        return  gradeReport.get(i).getGrade();
    }
    public void addGrade(GradeInfo grade){
        gradeReport.add(grade);
    }

    @Override
    public String toString() {
        return String.format("%-5s%-10s%-30s%-10s%-5s", getId(), getName(), getEmail(), getEducation(), getAverageGrade());
    }
}
