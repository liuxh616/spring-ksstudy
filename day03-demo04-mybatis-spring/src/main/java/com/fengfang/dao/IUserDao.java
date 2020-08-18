package com.fengfang.dao;

import com.fengfang.domain.User;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/18 15:10
 **/
public interface IUserDao {

    public List<User> findall();

    public int addUser(User user);

    public int deleteUser(int id);
}
