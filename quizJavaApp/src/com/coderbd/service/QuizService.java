/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.service;

import com.coderbd.conn.DbConnection;
import com.coderbd.domain.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Rajaul Islam
 */
public class QuizService {

    private Connection conn = DbConnection.getConnection();

    public List<Question> getQuestions(int level) {
        List<Question> questions = new ArrayList();
        Question question = null;
        try {

            PreparedStatement pstm = conn.prepareStatement("select * from quiz_bank where quiz_level=?");
            pstm.setInt(1, level);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                question = new Question();
                question.setQuestionID(rs.getInt(1));
                question.setQuestion(rs.getString(2));
                question.setQuizLevel(rs.getInt(3));
                question.setAnsOptionA(rs.getString(4));
                question.setAnsOptionB(rs.getString(5));
                question.setAnsOptionC(rs.getString(6));
                question.setAnsOptionD(rs.getString(7));
                question.setCorrectAns(rs.getString(8));
                questions.add(question);
            }

        } catch (Exception e) {
        }
        return questions;
    }

    public static void main(String[] args) {
        List<Question> list = new ArrayList<>();
        QuizService qs = new QuizService();

        list = qs.getQuestions(5);

        qs.saveQuestionsToQuizdetails(list);

        /* for (Question q : list) {
     

            System.out.println("Q ID: " + q.getQuestionID()
                    + " Question: " + q.getQuestion()
                    + " option A: " + q.getAnsOptionA()
                    + " option B: " + q.getAnsOptionB()
                    + " option C: " + q.getAnsOptionC()
                    + " option D: " + q.getAnsOptionD()
                    + " Correct Ans: " + q.getCorrectAns()
                    + " Level: " + q.getQuizLevel()
                    + " Given Ans: " + q.getGivenAns());

            
            
        }
         */
    }

    public static List<Question> checkCorrectAns(List<Question> questions) {
        List<Question> ques = new ArrayList<>();
        Question coorectAns = null;
        for (Question question : questions) {
            coorectAns = new Question();
            if (question.getGivenAns().equals(question.getCorrectAns())) {
                coorectAns.setCorrectAns(question.getCorrectAns());
            } else {
                coorectAns.setCorrectAns("Wrong Ans");
            }
            System.out.println("Correct Ans: " + coorectAns.getCorrectAns());
            ques.add(question);
        }

        return ques;
    }

    public void saveQuestionsToQuizdetails(List<Question> questions) {
        if (questions.size() > 0) {
            questions.forEach((c) -> {
                PreparedStatement stmt;
                try {
                    stmt = conn.prepareStatement("insert into quiz_details(Que_ID,Question,quiz_level,OptionA,OptionB,OptionC, OptionD, RightAns, GivenAns) values(?,?,?,?,?,?,?,?,?)");
                    stmt.setLong(1, c.getQuestionID());
                    stmt.setString(2, c.getQuestion());
                    stmt.setInt(3, c.getQuizLevel());
                    stmt.setString(4, c.getAnsOptionA());
                    stmt.setString(5, c.getAnsOptionB());
                    stmt.setString(6, c.getAnsOptionC());
                    stmt.setString(7, c.getAnsOptionD());
                    stmt.setString(8, c.getCorrectAns());
                    stmt.setString(9, c.getGivenAns());
                    int i = stmt.executeUpdate();

                } catch (SQLException ex) {
                    Logger.getLogger(QuizService.class.getName()).log(Level.SEVERE, null, ex);
                }

            });

        }
        System.out.println(questions.size() + " records inserted");
    }
}
