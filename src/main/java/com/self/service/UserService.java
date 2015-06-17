package com.self.service;

import com.self.entity.User;
import com.self.repository.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/6/17.
 */
@Service("userService")
public class UserService {

    @Resource(name="userMapper")
    private UserMapper userMapper;

    public User findById(int id) {
        return userMapper.findById(id);
    }
}
