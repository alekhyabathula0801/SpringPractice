package main;

import configuration.ApplicationConfiguration;
import country.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Country countryObj = context.getBean(Country.class);
        countryObj.setCountryName("India");
        System.out.println("Country Name = "+ countryObj.getCountryName());
    }

}
