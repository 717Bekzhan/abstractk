package com.company;

import java.util.Arrays;

public class Sheep extends Farm{
    private int weight;
    private int age;
    private String gender;
    private String nickName;

    public Sheep() {
    }

    public Sheep(int weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                "} " + super.toString();
    }
}
