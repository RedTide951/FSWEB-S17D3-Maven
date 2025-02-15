package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Kangaroo {
    private int id;
    private String name;
    private Double height;
    private Double weight;
    private Double sleepHour;
    private String gender;
    private Boolean isAggressive;

    public Kangaroo(int id, String name, Double height, Double weight, Double sleepHour, String gender, Boolean isAggressive) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.sleepHour = sleepHour;
        this.gender = gender;
        this.isAggressive = isAggressive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getSleepHour() {
        return sleepHour;
    }

    public void setSleepHour(Double sleepHour) {
        this.sleepHour = sleepHour;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getAggressive() {
        return isAggressive;
    }

    public void setAggressive(Boolean aggressive) {
        isAggressive = aggressive;
    }
}
