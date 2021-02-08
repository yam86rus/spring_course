package com.zaurtregulov.spring.spring_introduction;

public class Dog implements Pet{
    public String name;
    public Dog() {
        System.out.println("Dog bean is creating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Гав-Гав");
    }
}
