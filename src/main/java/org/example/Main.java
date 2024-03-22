package org.example;

import org.example.lib.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInjector();

        Hair hair = (Hair) injector.getInstance(Hair.class);
        hair.dnishche();
        hair.setNom(45);
        User user = (User) injector.getInstance(User.class);
        user.setName("guf");
        user.setAge(22);
        System.out.println(hair);
        System.out.println(user);
    }
}