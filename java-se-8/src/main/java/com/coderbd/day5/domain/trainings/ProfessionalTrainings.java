/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day5.domain.trainings;

/**
 *
 * @author Instructor
 */
public class ProfessionalTrainings {
    private int id;
    private String title;
    private String duration;
    private TrainingCenter tranCenter;

    public ProfessionalTrainings() {
    }

    public ProfessionalTrainings(int id, String title, String duration, TrainingCenter tranCenter) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.tranCenter = tranCenter;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public TrainingCenter getTranCenter() {
        return tranCenter;
    }

}
