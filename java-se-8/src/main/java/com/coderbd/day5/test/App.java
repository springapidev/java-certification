package com.coderbd.day5.test;

import com.coderbd.day5.domain.Department;
import com.coderbd.day5.domain.Employee;
import com.coderbd.day5.domain.address.Address;
import com.coderbd.day5.domain.address.AddressType;
import com.coderbd.day5.domain.bank.Bank;
import com.coderbd.day5.domain.bank.BankDetails;
import com.coderbd.day5.domain.edu.Degree;
import com.coderbd.day5.domain.edu.EducationQualifications;
import com.coderbd.day5.domain.edu.Grade;
import com.coderbd.day5.domain.edu.Institute;
import com.coderbd.day5.domain.edu.Year;
import com.coderbd.day5.domain.employeedetails.BloodGroup;
import com.coderbd.day5.domain.employeedetails.EmployeeDetails;
import com.coderbd.day5.domain.employeedetails.Nationality;
import com.coderbd.day5.domain.employeedetails.Religion;
import com.coderbd.day5.domain.jobhistory.JobHistory;
import com.coderbd.day5.domain.jobhistory.JobType;
import com.coderbd.day5.domain.projects.Framework;
import com.coderbd.day5.domain.projects.Language;
import com.coderbd.day5.domain.projects.Projects;
import com.coderbd.day5.domain.projects.Status;
import com.coderbd.day5.domain.projects.Type;
import com.coderbd.day5.domain.trainings.ProfessionalTrainings;
import com.coderbd.day5.domain.trainings.TrainingCenter;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<EducationQualifications> educationQualificationsesofA = new ArrayList<>();
        educationQualificationsesofA.add(new EducationQualifications(1, new Degree(1, "S.S.C"), new Grade(1, 5.00), new Year(1, 2012), new Institute(1, "Bogra Zilla School")));
        educationQualificationsesofA.add(new EducationQualifications(2, new Degree(2, "H.S.C"), new Grade(2, 4.88), new Year(2, 2014), new Institute(2, "Azizul Haque collage")));
        educationQualificationsesofA.add(new EducationQualifications(3, new Degree(3, "B.S.C"), new Grade(3, 3.88), new Year(3, 2018), new Institute(3, "ABCD UNIVERSITY")));

        List<JobHistory> jobHistorysofA = new ArrayList<>();
        jobHistorysofA.add(new JobHistory(1, "menagar", "1 Year", "Draw Tech Bd", new JobType(1, "Parmanent")));
        jobHistorysofA.add(new JobHistory(2, "Project Leader", "2 Year", "Draw Tech Bd", new JobType(2, "Parmanent")));
        jobHistorysofA.add(new JobHistory(3, "Assistant manager", "1 months", "Aladin Company", new JobType(3, "Parttime")));

        List<ProfessionalTrainings> professionalTrainingsesofA = new ArrayList<>();
        professionalTrainingsesofA.add(new ProfessionalTrainings(1, "Java course", "5 Months", new TrainingCenter(1, "IBCS PRAIMAX", "10/A Dhanmondi")));
        professionalTrainingsesofA.add(new ProfessionalTrainings(2, "Professional Java course", "5 Months", new TrainingCenter(2, "BASIC", "kowranBazar")));
        professionalTrainingsesofA.add(new ProfessionalTrainings(3, "Java course With Web Development", "4 Months", new TrainingCenter(3, "IBCS PRAIMAX", "10/A Dhanmondi")));

        //(int id, String title, Type type, Status status, Language language, Framework framework)
        List<Projects> projectsesofA = new ArrayList<>();
        projectsesofA.add(new Projects(1, "School Menagement System", new Type(1, "Menagement"), new Status(1, "Done"), new Language(1, "Bangla"), new Framework(1, "Eclipse Project")));
        projectsesofA.add(new Projects(2, "Hotel Menagement System", new Type(1, "Menagement"), new Status(1, "on Going"), new Language(1, "English"), new Framework(1, "Eclipse Project")));

        List<BankDetails> bankDetailsesofA = new ArrayList<>();
        bankDetailsesofA.add(new BankDetails(1, "MR. Habib", 15464364646l, new Bank(1, "JOnota Bank", "Motijhil, Dhaka")));
        bankDetailsesofA.add(new BankDetails(2, "MR. Habib", 56466116646l, new Bank(2, "Rupali Bank", "kolabagan, Dhaka")));

        List<EducationQualifications> educationQualificationsesofb = new ArrayList<>();
        educationQualificationsesofb.add(new EducationQualifications(1, new Degree(1, "S.S.C"), new Grade(1, 3.00), new Year(1, 2013), new Institute(1, "BCD School")));
        educationQualificationsesofb.add(new EducationQualifications(2, new Degree(2, "H.S.C"), new Grade(2, 5.88), new Year(2, 201), new Institute(2, "EDF collage")));
        educationQualificationsesofb.add(new EducationQualifications(3, new Degree(3, "B.S.C"), new Grade(3, 4.88), new Year(3, 2019), new Institute(3, "JDK UNIVERSITY")));

        List<JobHistory> jobHistorysofb = new ArrayList<>();
        jobHistorysofb.add(new JobHistory(1, "JAVA dEPELOPER", "4 Year", "www Tech Bd", new JobType(1, "Parmanent")));
        jobHistorysofb.add(new JobHistory(2, "Project Manager", "3 Year", "dhahd Tech Bd", new JobType(2, "Parttime")));
        jobHistorysofb.add(new JobHistory(3, "Assistant manager", "6 months", "MIna Company", new JobType(3, "Regular")));

        List<ProfessionalTrainings> professionalTrainingsesofb = new ArrayList<>();
        professionalTrainingsesofb.add(new ProfessionalTrainings(1, "Php course", "5 Months", new TrainingCenter(1, "IBCS PRAIMAX", "10/A Dhanmondi")));
        professionalTrainingsesofb.add(new ProfessionalTrainings(2, "Professional PHP course", "6 Months", new TrainingCenter(2, "BASIC", "kowranBazar")));
        professionalTrainingsesofb.add(new ProfessionalTrainings(3, "PHP course With Web Development", "3 Months", new TrainingCenter(3, "IBCS PRAIMAX", "10/A Dhanmondi")));

        //(int id, String title, Type type, Status status, Language language, Framework framework)
        List<Projects> projectsesofb = new ArrayList<>();
        projectsesofb.add(new Projects(1, "Hoapital Menagement System", new Type(1, "Menagement"), new Status(1, "Done"), new Language(1, "Bangla"), new Framework(1, "IDE Project")));
        projectsesofb.add(new Projects(2, "COllage Menagement System", new Type(2, "Menagement"), new Status(2, "on Going"), new Language(1, "English"), new Framework(1, "no Project")));

        List<BankDetails> bankDetailsesofb = new ArrayList<>();
        bankDetailsesofb.add(new BankDetails(1, "MR. Rana", 26484611111l, new Bank(1, "BGH Bank", "Motijhil, Dhaka")));
        bankDetailsesofb.add(new BankDetails(2, "MR. Rana", 96656255555l, new Bank(2, "KIJI Bank", "kolabagan, Dhaka")));

        List<Employee> employees = new ArrayList<>();
        //(int id, String name, String mobile, List<EducationQualifications> educationQualifications, Department department, Address address, List<JobHistory> jobHistory, List<ProfessionalTrainings> professionalTrainings, List<Projects> projects, List<BankDetails> bankDetails, EmployeeDetails employeeDetails)
        employees.add(new Employee(1, "MR. Habib", "01780512813", educationQualificationsesofA, new Department(1, "Softwear"), new Address(1, "6/2", "B", "3 no road", "Mohammadpur", "Dhaka", new AddressType(1, "HOme")), jobHistorysofA, professionalTrainingsesofA, projectsesofA, bankDetailsesofA, new EmployeeDetails(1, "Poem Writing", new BloodGroup(1, "O+"), new Nationality(1, "Bangladeshi"), new Religion(1, "Muslim"))));
        //(int id, String name, String mobile, List<EducationQualifications> educationQualifications, Department department, Address address, List<JobHistory> jobHistory, List<ProfessionalTrainings> professionalTrainings, List<Projects> projects, List<BankDetails> bankDetails, EmployeeDetails employeeDetails)
        employees.add(new Employee(1, "MR. Rana", "01752151144", educationQualificationsesofb, new Department(2, "Menagement"), new Address(2, "c/D", "h", "4 no road", "Dhanmondi", "Dhaka", new AddressType(1, "WOrk")), jobHistorysofb, professionalTrainingsesofb, projectsesofb, bankDetailsesofb, new EmployeeDetails(2, "playing", new BloodGroup(1, "A+"), new Nationality(1, "Bangladeshi"), new Religion(1, "Muslim"))));

        List<EducationQualifications> eqList = new ArrayList<>();
        List<JobHistory> jbList = new ArrayList<>();
        List<ProfessionalTrainings> ptList = new ArrayList<>();
        List<Projects> pjList = new ArrayList<>();
        List<BankDetails> bkList = new ArrayList<>();

        //Print
        System.out.println(":::::Employee Details:::::::");
        for (Employee e : employees) {
            System.out.println("ID: " + e.getId()
                    + " \\ Name: " + e.getName()
                    + " \\ Mobile NO: " + e.getMobile());

            System.out.println(":::::EducationQualifications:::::::");

            eqList = e.getEducationQualifications();
            for (EducationQualifications ed : eqList) {
                System.out.println("" + ed.getId()
                        + ": Degree: " + ed.getDegree().getName()
                        + " \\ Grade: " + ed.getGrade().getCgpa()
                        + " \\ Year: " + ed.getPassingYear().getYear()
                        + " \\ Institute: " + ed.getInstitute().getName());
            }
                System.out.println(":::::JobHistory:::::::");
                jbList = e.getJobHistory();
                for (JobHistory jb : jbList) {
                    //(int id, String designation, String duration, String companyName, JobType jobType)
                    System.out.println("" + jb.getId()
                            + ": designation: " + jb.getDesignation()
                            + " \\ duration: " + jb.getDuration()
                            + " \\ companyName: " + jb.getCompanyName()
                            + " \\ JobType: " + jb.getJobType().getName());
                }
                    System.out.println(":::::ProfessionalTrainings:::::::");
                    ptList = e.getProfessionalTrainings();
                    for (ProfessionalTrainings pt : ptList) {
                        //(int id, String title, String duration, TrainingCenter tranCenter)
                        System.out.println("" + pt.getId()
                                + ": Title: " + pt.getTitle()
                                + " \\ duration: " + pt.getDuration()
                                + " \\ TrainingCenter Name: " + pt.getTranCenter().getName()
                                + " \\ TrainingCenter Address: " + pt.getTranCenter().getAddress());
                    }
                        System.out.println(":::::Projects:::::::");
                        pjList = e.getProjects();
                        for (Projects pj : pjList) {
                            //(int id, String title, Type type, Status status, Language language, Framework framework)
                            System.out.println("" + pj.getId()
                                    + ": title: " + pj.getTitle()
                                    + " \\ Type:" + pj.getType().getName()
                                    + " \\ Status: " + pj.getStatus().getName()
                                    + " \\ Language: " + pj.getLanguage().getName()
                                    + " \\ Framework: " + pj.getFramework().getName());
                        }
                            System.out.println(":::::BankDetails:::::::");
                            bkList = e.getBankDetails();
                            for (BankDetails bk : bkList) {
                                //(int id, String accounHolder, long accountNo, Bank bankName
                                System.out.println("" + bk.getId()
                                        + ": accounHolder: " + bk.getAccounHolder()
                                        + " \\ accountNo: " + bk.getAccountNo()
                                        + " \\ Bank Name: " + bk.getBankName().getName()
                                        + " \\ Bank Address: " + bk.getBankName().getAddress());
                            }
        
            System.out.println("============================================");
        }
    }
}
