package com.fengfang.dao;

import com.fengfang.domain.User;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/11 14:32
 **/
public interface IUserDao {
    public List<User> findAll();
}
