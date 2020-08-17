package com.fengfang.dao;

import com.fengfang.domain.User;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/17 16:04
 **/
public interface IUserDao {

    public List<User> findAll();
}
