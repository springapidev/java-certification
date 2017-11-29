package com.coderbd.day5.domain.edu;

/**
 *
 * @author Instructor
 */
public class EducationQualifications {
 //id, degreeName, grade, passingYear, instituteName
    private int id;
    private Degree degree;
    private Grade grade;
    private Year passingYear;
    private Institute institute;

    public EducationQualifications() {
    }

    public EducationQualifications(int id, Degree degree, Grade grade, Year passingYear, Institute institute) {
        this.id = id;
        this.degree = degree;
        this.grade = grade;
        this.passingYear = passingYear;
        this.institute = institute;
    }

    public int getId() {
        return id;
    }

    public Degree getDegree() {
        return degree;
    }

    public Grade getGrade() {
        return grade;
    }

    public Year getPassingYear() {
        return passingYear;
    }

    public Institute getInstitute() {
        return institute;
    }
    
    
}
