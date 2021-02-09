package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat myCat = context.getBean("cat",Cat.class);
        myCat.say();
        context.close();
    }
}
