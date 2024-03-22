package org.example;

import org.example.lib.Inject;

public class User {
    private int age;
    private String name;
    @Inject
    private HairServise numberOfhair;
    @Inject
    private Hair phone;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return " User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", numberOfhair=" + numberOfhair +
                ", phone='" + phone + '\'' +
                '}';
    }
}
