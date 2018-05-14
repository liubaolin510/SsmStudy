package com.liu.spring.test1;

import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements IBookDao {
    public void add() {
        System.out.println("新增图书成功");
    }
}
