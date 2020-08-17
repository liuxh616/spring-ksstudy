package com.fengfang.dao.impl;

import com.fengfang.dao.IUserDao;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/14 16:29
 **/
public class UserDaoImplAOP implements IUserDao {
    @Override
    public int add() {
        System.out.println("这是用户新增的方法");
        return 1;
    }

    @Override
    public void delete() {
        System.out.println("这是用户删除的方法");
    }

    @Override
    public void update() {
        System.out.println("这是用户更新的方法");
    }

    @Override
    public void query() {
        System.out.println("这是用户查询的方法");
    }
}
