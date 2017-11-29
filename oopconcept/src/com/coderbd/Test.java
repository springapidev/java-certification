package com.coderbd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Rajail Islam
 */
public class Test {

    public static void main(String[] args) {
        Set<Exam> examsDetailsOfReza = new HashSet<>();
        examsDetailsOfReza.add(new Exam(1, ExamName.SSC, "Dhaka"));
        examsDetailsOfReza.add(new Exam(2, ExamName.HSC, "Rajshahi"));
        examsDetailsOfReza.add(new Exam(3, ExamName.BSC, "NU"));
        examsDetailsOfReza.add(new Exam(4, ExamName.MSC, "NU"));

        Set<Exam> examsDetailsOfSami = new HashSet<>();
        examsDetailsOfSami.add(new Exam(1, ExamName.SSC, "Dhaka"));
        examsDetailsOfSami.add(new Exam(2, ExamName.HSC, "Rajshahi"));

        Set<Exam> examsDetailsOfSejuti = new HashSet<>();
        examsDetailsOfSejuti.add(new Exam(1, ExamName.SSC, "Dhaka"));
        examsDetailsOfSejuti.add(new Exam(2, ExamName.HSC, "Dhaka"));
        examsDetailsOfSejuti.add(new Exam(3, ExamName.BSC, "Dhaka"));
        examsDetailsOfSejuti.add(new Exam(4, ExamName.MSC, "Dhaka"));

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100, "Reza", examsDetailsOfReza));
        list.add(new Employee(101, "Sami", examsDetailsOfSami));
        list.add(new Employee(102, "Sami", examsDetailsOfSejuti));

        Set<Exam> exams = new HashSet<>();
        
        System.out.println("Employee List: ");
        for (Employee e : list) {
         //   if (e.getId() == 102) {
                System.out.println("Em ID: " + e.getId() + " em Name: " + e.getName());
                exams = e.getExam();
                for (Exam ex : exams) {
                    System.out.println("      ID: " + ex.getExampID() + " exam Name: " + ex.getExamName() + " Board: " + ex.getBoardName());
                }
                System.out.println("=============================");
         //  }
        }
    }
}
