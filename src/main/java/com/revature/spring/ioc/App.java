package com.revature.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        // Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Retrieve the bean from the Spring container
        MessageService myMsg = context.getBean("messageService", MessageService.class);
        // Use the bean
        myMsg.printMessage();

        MessageService myMsg1 = context.getBean("messageService1", MessageService.class);
        myMsg1.printMessage();


    }
}
