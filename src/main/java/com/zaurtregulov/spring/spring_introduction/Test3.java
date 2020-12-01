package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet",Pet.class);
        //        Pet pet = new Cat();
        Person person = new Person(pet);
        person.callYourPet();

        context.close();
    }
}
