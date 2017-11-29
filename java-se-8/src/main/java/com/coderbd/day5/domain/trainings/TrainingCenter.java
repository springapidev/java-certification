package com.coderbd.day5.domain.trainings;
/**
 *
 * @author Instructor
 */
public class TrainingCenter {

    private int id;
    private String name;
    private String address;

    public TrainingCenter() {
    }

    public TrainingCenter(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
