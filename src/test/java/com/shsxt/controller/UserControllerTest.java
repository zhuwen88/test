package com.shsxt.controller;

import com.shsxt.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserControllerTest {

    @Test
    public void userAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserController controller = (UserController) context.getBean("userController");
        controller.userAdd();
    }

    @Test
    public void login() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserController controller = (UserController) context.getBean("userController");
        controller.login("zhuwen","zhuwen88");
    }
}