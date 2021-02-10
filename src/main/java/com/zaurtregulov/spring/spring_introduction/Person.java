package com.zaurtregulov.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    private Pet pet;
    //    @Value("${person.surname}")
    private String surname;
    //    @Value("${person.age}")
    private int age;
    private String hobbie;

    public Person(Pet pet) {
    }

//    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is creating");
//        this.pet = pet;
//    }

    //    public Person() {
//        System.out.println("Person bean is creating");
//    }
//    @Autowired
//    public void setPet(@Qualifier("catBean") Pet pet) {
//        System.out.println("Class Person set pet");
//        this.pet = pet;
//    }

    public void setPet(Pet pet) {
        System.out.println("Class Person set pet");
        this.pet = pet;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getHobbie() {
        return hobbie;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person: set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
