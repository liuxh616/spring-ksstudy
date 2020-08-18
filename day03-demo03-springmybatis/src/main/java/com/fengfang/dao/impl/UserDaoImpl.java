package com.fengfang.dao.impl;

import com.fengfang.dao.IUserDao;
import com.fengfang.domain.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/18 10:55
 **/
public class UserDaoImpl implements IUserDao {
    //我们所有操作，原来我们都使用SqlSession来执行，现在使用SqlSessionTemplate
    private SqlSessionTemplate sessionTemplate;

    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    @Override
    public List<User> findAll() {
        IUserDao userDao = sessionTemplate.getMapper(IUserDao.class);
        return userDao.findAll();
    }
}
