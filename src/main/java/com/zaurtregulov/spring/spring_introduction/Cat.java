package com.zaurtregulov.spring.spring_introduction;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }
}
