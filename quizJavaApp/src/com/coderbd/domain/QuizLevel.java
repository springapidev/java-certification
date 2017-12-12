/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.domain;

/**
 *
 * @author Rajaul Islam
 */
public class QuizLevel {

    private int id;
    private String level;
    private int categoryId;

    public QuizLevel(int id, String level, int categoryId) {
        this.id = id;
        this.level = level;
        this.categoryId = categoryId;
    }

  

    public QuizLevel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
