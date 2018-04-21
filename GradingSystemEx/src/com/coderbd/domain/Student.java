package com.coderbd.domain;

/**
 *
 * @author user
 */
public class Student {

    private final long id;
    private final String name;
    private final double subBengali;
    private final double subEnglish;
    private final double subMath;
    private final String grade;

    public Student(long id, String name, double subBengali, double subEnglish, double subMath, String grade) {
        this.id = id;
        this.name = name;
        this.subBengali = subBengali;
        this.subEnglish = subEnglish;
        this.subMath = subMath;
        this.grade = grade;
    }

  

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSubBengali() {
        return subBengali;
    }

    public double getSubEnglish() {
        return subEnglish;
    }

    public double getSubMath() {
        return subMath;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", subBengali=" + subBengali + ", subEnglish=" + subEnglish + ", subMath=" + subMath + ", grade=" + grade + '}';
    }

}
