/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.domain;

/**
 *
 * @author Rajail Islam
 */
public class Question {

    private long questionID;
    private String question;
    private int quizLevel;
    private String ansOptionA;
    private String ansOptionB;
    private String ansOptionC;
    private String ansOptionD;
    private String correctAns;
    private String givenAns;

    public Question() {
    }

    public Question(String givenAns) {
        this.givenAns = givenAns;
    }

    public Question(String question, int quizLevel, String ansOptionA, String ansOptionB, String ansOptionC, String ansOptionD, String correctAns) {
        this.question = question;
        this.quizLevel = quizLevel;
        this.ansOptionA = ansOptionA;
        this.ansOptionB = ansOptionB;
        this.ansOptionC = ansOptionC;
        this.ansOptionD = ansOptionD;
        this.correctAns = correctAns;
    }

    public Question(long questionID, String question, int quizLevel, String ansOptionA, String ansOptionB, String ansOptionC, String ansOptionD, String correctAns, String givenAns) {
        this.questionID = questionID;
        this.question = question;
        this.quizLevel = quizLevel;
        this.ansOptionA = ansOptionA;
        this.ansOptionB = ansOptionB;
        this.ansOptionC = ansOptionC;
        this.ansOptionD = ansOptionD;
        this.correctAns = correctAns;
        this.givenAns = givenAns;
    }

    public long getQuestionID() {
        return questionID;
    }

    public void setQuestionID(long questionID) {
        this.questionID = questionID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getQuizLevel() {
        return quizLevel;
    }

    public void setQuizLevel(int quizLevel) {
        this.quizLevel = quizLevel;
    }

    public String getAnsOptionA() {
        return ansOptionA;
    }

    public void setAnsOptionA(String ansOptionA) {
        this.ansOptionA = ansOptionA;
    }

    public String getAnsOptionB() {
        return ansOptionB;
    }

    public void setAnsOptionB(String ansOptionB) {
        this.ansOptionB = ansOptionB;
    }

    public String getAnsOptionC() {
        return ansOptionC;
    }

    public void setAnsOptionC(String ansOptionC) {
        this.ansOptionC = ansOptionC;
    }

    public String getAnsOptionD() {
        return ansOptionD;
    }

    public void setAnsOptionD(String ansOptionD) {
        this.ansOptionD = ansOptionD;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    public String getGivenAns() {
        return givenAns;
    }

    public void setGivenAns(String givenAns) {
        this.givenAns = givenAns;
    }

  
}
