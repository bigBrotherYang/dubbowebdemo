package com.xtkj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"appliactionContext.xml"});
        context.start();
        System.out.println("===启动成功===");
        System.in.read();
    }
}
