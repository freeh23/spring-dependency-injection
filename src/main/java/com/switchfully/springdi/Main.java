package com.switchfully.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        TaxCalculator taxCalculator = applicationContext.getBean(com.switchfully.springdi.TaxCalculator.class);

        System.out.println(taxCalculator.calculateTaxes(23000));
    }
}
