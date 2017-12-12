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
public class QuizCategory {

    private int id;
    private String categoryName;
    private String note;
    private String status;

    public QuizCategory(String categoryName, String note, String status) {
        this.categoryName = categoryName;
        this.note = note;
        this.status = status;
    }

    public QuizCategory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
