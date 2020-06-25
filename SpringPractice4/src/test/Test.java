package test;

import autowire.Human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/applicationContext.xml");
        Human human = (Human) context.getBean("human");
        human.startPumping();
    }
}
