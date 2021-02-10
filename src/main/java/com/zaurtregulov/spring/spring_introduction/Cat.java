package com.zaurtregulov.spring.spring_introduction;

import org.springframework.stereotype.Component;

//@Component ("catBean")
public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }

    public Cat() {
        System.out.println("Cat bean is creating");
    }

}
