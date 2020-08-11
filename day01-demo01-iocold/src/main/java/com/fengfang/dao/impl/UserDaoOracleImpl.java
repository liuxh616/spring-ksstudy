package com.fengfang.dao.impl;

import com.fengfang.dao.IUserDao;
import com.fengfang.domain.User;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/11 14:40
 **/
public class UserDaoOracleImpl implements IUserDao {
    @Override
    public List<User> findAll() {
        System.out.println("数据访问层Oracle：获取所有用户");
        return null;
    }
}
