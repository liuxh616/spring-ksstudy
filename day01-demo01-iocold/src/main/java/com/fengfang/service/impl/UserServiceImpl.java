package com.fengfang.service.impl;

import com.fengfang.dao.IUserDao;
import com.fengfang.dao.impl.UserDaoImpl;
import com.fengfang.domain.User;
import com.fengfang.service.IUserService;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/11 14:33
 **/
public class UserServiceImpl implements IUserService {

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    private IUserDao userDao;


    @Override
    public List<User> findAll() {
        System.out.println("业务实现层：获取所有用户");
        return userDao.findAll();
    }
}
