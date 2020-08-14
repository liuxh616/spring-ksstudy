package com.fengfang.proxydemo2.impl;

import com.fengfang.proxydemo2.IUserDao;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/14 9:50
 **/
public class UserDaoProxy implements IUserDao {

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    private UserDaoImpl userDao;

    @Override
    public void add() {
        extendMethod("add");
        this.userDao.add();
    }

    @Override
    public void delete() {
        extendMethod("delete");
        this.userDao.delete();
    }

    @Override
    public void update() {
        extendMethod("update");
        this.userDao.update();

    }

    @Override
    public void query() {
        extendMethod("query");
        this.userDao.query();
    }

    /**
     * 扩展方法
     * @param msg
     */
    public void extendMethod(String msg){
        System.out.println("在方法中"+msg+"增加一个扩展方法");
    }
}
