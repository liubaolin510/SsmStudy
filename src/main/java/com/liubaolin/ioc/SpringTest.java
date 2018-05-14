package com.liubaolin.ioc;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testStoreBook(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans02.xml");
        BookService bookService = ctx.getBean(BookService.class);
        bookService.storeBook("Spring MVC");
    }
}
