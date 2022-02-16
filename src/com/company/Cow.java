package com.company;

import java.util.Arrays;

public class Cow extends Farm{
    private int weight;
    private int age;
    private String gender;
    private String nickName;

    public Cow() {
    }

    public Cow(int weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                "} " + super.toString();
    }
}

