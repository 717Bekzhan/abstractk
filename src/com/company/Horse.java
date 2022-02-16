package com.company;

import java.util.Arrays;

public class Horse extends Farm{
    private int weight;
    private int age;
    private String gender;
    private String nickName;

    public Horse() {
    }

    public Horse(int weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                "} " + super.toString();
    }
}

