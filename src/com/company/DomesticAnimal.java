package com.company;

public abstract class DomesticAnimal {
    private int weidht;
    private int age;
    private String gender;
    private String name;

    public DomesticAnimal() {
    }

    public DomesticAnimal(int weidht, int age, String gender, String name) {
        this.weidht = weidht;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getWeidht() {
        return weidht;
    }

    public void setWeidht(int weidht) {
        this.weidht = weidht;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DomesticAnimal{" +
                "weidht=" + weidht +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
