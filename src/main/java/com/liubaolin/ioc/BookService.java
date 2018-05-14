package com.liubaolin.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BookService {
    IBookDAO bookDAO;

    public void storeBook(String bookname){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans02.xml");
        bookDAO = (IBookDAO)ctx.getBean("bookdaoObj");
        System.out.println("图书送货上门");
        String result = bookDAO.addBook(bookname);
        System.out.println(result);
    }
}
