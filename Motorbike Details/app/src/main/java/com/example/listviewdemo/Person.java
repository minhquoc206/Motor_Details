package com.example.listviewdemo;

public class Person {

    private String name;

    private int avatar;

    private String gender;

    public Person() {

    }

    public Person(String name, int avatar, String gender) {
        this.name = name;
        this.avatar = avatar;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
