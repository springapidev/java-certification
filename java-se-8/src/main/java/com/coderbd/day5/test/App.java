package com.coderbd.day5.test;

import com.coderbd.day5.domain.Employee;
import com.coderbd.day5.domain.edu.Degree;
import com.coderbd.day5.domain.edu.EducationQualifications;
import com.coderbd.day5.domain.edu.Grade;
import com.coderbd.day5.domain.edu.Institute;
import com.coderbd.day5.domain.edu.Year;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();// public EducationQualifications(int id, Degree degree, Grade grade, Year passingYear, Institute institute) 

        List<EducationQualifications> educationQualificationsesofA = new ArrayList<>();
        educationQualificationsesofA.add(new EducationQualifications(1, new Degree(1, "SSC"), new Grade(1, 5.0), new Year(1, 2010), new Institute(1, "ABC Govt. School")));
        educationQualificationsesofA.add(new EducationQualifications(2, new Degree(2, "HSC"), new Grade(1, 5.0), new Year(2, 2012), new Institute(2, "KFC Govt. College")));
        educationQualificationsesofA.add(new EducationQualifications(3, new Degree(3, "BSC"), new Grade(2, 4.0), new Year(3, 2016), new Institute(3, "Dhaka University")));
        educationQualificationsesofA.add(new EducationQualifications(4, new Degree(4, "MSC"), new Grade(2, 4.0), new Year(4, 2017), new Institute(4, "Dhaka University")));

        List<EducationQualifications> educationQualificationsesofB = new ArrayList<>();
        educationQualificationsesofB.add(new EducationQualifications(1, new Degree(1, "SSC"), new Grade(1, 5.0), new Year(1, 2010), new Institute(1, "ABC Govt. School")));
        educationQualificationsesofB.add(new EducationQualifications(2, new Degree(2, "HSC"), new Grade(1, 5.0), new Year(2, 2012), new Institute(2, "KFC Govt. College")));
        educationQualificationsesofB.add(new EducationQualifications(3, new Degree(3, "BSC"), new Grade(2, 4.0), new Year(3, 2016), new Institute(3, "Dhaka University")));

        //add employee to employee list
        employees.add(new Employee(101, "Mr. A", "01686239146", educationQualificationsesofA));
        employees.add(new Employee(102, "Mr. B", "01686239147", educationQualificationsesofB));

        // let's print 
        System.out.println("=====Employee Details====");

        List<EducationQualifications> eqList = new ArrayList<>();
        for (Employee e : employees) {
            System.out.println("ID: " + e.getId() + " Name: " + e.getName() + " Mobile: " + e.getMobile());
            System.out.println("=====Employee Qualifications====");
            eqList = e.getEducationQualifications();

            for (EducationQualifications ed : eqList) {
                System.out.println("      ID: " + ed.getId()
                        + " Degree: " + ed.getDegree().getName()
                        + " Grade: " + ed.getGrade().getCgpa()
                        + " Passing Year: " + ed.getPassingYear().getYear()
                        + " Institute Name: " + ed.getInstitute().getName()
                );
               // System.out.println("    :::: Degree Details:::::");
               // System.out.println("         Id:"+ed.getDegree().getId()+ " Name: "+ed.getDegree().getName());
            }
            System.out.print("=========================================="+"\n");
            System.out.println("ok");
        }

    }

}
