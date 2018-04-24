package com.sail.common.bo.impl;

import com.sail.common.bo.UserBo;
import com.sail.dal.mapper.UserMapper;
import com.sail.dal.model.User;

import javax.annotation.Resource;

public class UserBoImpl implements UserBo {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
