package com.liu.spring.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BookService {
    public void add() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"bookbean11.xml"});
        IBookDao dao1 = ctx.getBean("MSBookDao",IBookDao.class);
        dao1.add();
    }
}
