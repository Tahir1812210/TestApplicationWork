package com.example.testapplicationwork;

public class TestModel {
    String Name;
    String Age;
    String Email;

    public TestModel(String name, String age, String email) {
        Name = name;
        Age = age;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public String getAge() {
        return Age;
    }

    public String getEmail() {
        return Email;
    }
}
