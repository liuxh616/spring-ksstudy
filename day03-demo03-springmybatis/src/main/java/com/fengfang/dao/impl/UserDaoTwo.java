package com.fengfang.dao.impl;

import com.fengfang.dao.IUserDao;
import com.fengfang.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/18 14:50
 **/
public class UserDaoTwo extends SqlSessionDaoSupport implements IUserDao {
    @Override
    public List<User> findAll() {
        return getSqlSession().getMapper(IUserDao.class).findAll();
    }
}
