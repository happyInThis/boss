package com.sail.services.impl;

import com.sail.common.bo.UserBo;
import com.sail.dal.mapper.UserMapper;
import com.sail.dal.model.User;
import com.sail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Resource
    private UserBo userBo;

    public List<String> getPermissions(Long id) {
        User user = new User();
        user.setGmtCreate(new Date());
        user.setGmtModify(new Date());
        user.setCreator("sys");
        user.setModifier("sys");
        user.setUserName("zhao");
        user.setPassword("123456");
        user.setPhone("12343343433443");
        userBo.insert(user);
        userBo.getUserById(0L);
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
