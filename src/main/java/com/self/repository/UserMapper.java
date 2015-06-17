package com.self.repository;

import com.self.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2015/6/17.
 */
@Repository("userMapper")
public interface UserMapper {
    public User findById(int id);
}
