package com.fengfang.dao.impl;

import com.fengfang.dao.IUserDao;
import com.fengfang.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/18 15:11
 **/
public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao {



    @Override
    public List<User> findall() {
        User user = new User("刘和平", "123456");
        IUserDao userDao = getSqlSession().getMapper(IUserDao.class);
        userDao.addUser(user);
        userDao.deleteUser(1);
        return userDao.findall();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(IUserDao.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(IUserDao.class).deleteUser(id);
    }
}
