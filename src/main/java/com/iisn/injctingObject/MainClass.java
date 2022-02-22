package com.iisn.injctingObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("XmlFile.xml");
        StudentName pc=(StudentName) ac.getBean("college");
        pc.printData();
    }
}
