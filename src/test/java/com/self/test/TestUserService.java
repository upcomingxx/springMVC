package com.self.test;

import com.self.entity.User;
import com.self.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2015/6/17.
 */
public class TestUserService {

    private UserService userService = null;
    @Before
    public void init() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:conf/applicationContext.xml");
         userService = (UserService) context.getBean("userService");
    }

    @Test
    public void findByIdTest() {
        User user = userService.findById(1);
        assertEquals(1, user.getId(), 0);
    }
}
