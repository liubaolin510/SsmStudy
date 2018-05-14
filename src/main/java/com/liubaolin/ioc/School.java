package com.liubaolin.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans02.xml");
        //从容器中获取对象
        Person tom=ctx.getBean("tom",Person.class);

        Address zhuhai = ctx.getBean("zhuhai",Address.class);
        System.out.println(zhuhai);

        System.out.println(tom);
    }
}
