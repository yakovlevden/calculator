package ru.learnup.march;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        Calculator calculator = context.getBean(Calculator.class);

        Long arg1 = 345L;
        Long arg2 = 5L;
        System.out.println(arg1 + " + " + arg2 + " = " + calculator.sum(arg1, arg2));
        System.out.println(arg1 + " - " + arg2 + " = " + calculator.substract(arg1, arg2));
        System.out.println(arg1 + " / " + arg2 + " = " + calculator.divide(arg1, arg2));
        System.out.println(arg1 + " * " + arg2 + " = " + calculator.multiply(arg1, arg2));
    }
}
