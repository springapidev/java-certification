/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

/**
 *
 * @author Rajail Islam
 */
public class Exam {

    private int exampID;
    private ExamName examName;
    private String boardName;

    public Exam() {
    }

    public Exam(int exampID, ExamName examName, String boardName) {
        this.exampID = exampID;
        this.examName = examName;
        this.boardName = boardName;
    }

    public int getExampID() {
        return exampID;
    }

    public ExamName getExamName() {
        return examName;
    }

    public String getBoardName() {
        return boardName;
    }

}
