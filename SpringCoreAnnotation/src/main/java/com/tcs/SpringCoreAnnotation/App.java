package com.tcs.SpringCoreAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext container=new AnnotationConfigApplicationContext(Person.class);
        
        Person person = container.getBean(Person.class);
        Address address = container.getBean(Address.class);
        
        System.out.println(person);
        System.out.println(address);
        
        AnnotationConfigApplicationContext.class.cast(container).close();
    }
}
