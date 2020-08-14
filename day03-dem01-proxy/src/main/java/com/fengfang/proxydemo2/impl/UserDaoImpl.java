package com.fengfang.proxydemo2.impl;

import com.fengfang.proxydemo2.IUserDao;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/14 9:47
 **/
public class UserDaoImpl implements IUserDao {
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");
    }
}
