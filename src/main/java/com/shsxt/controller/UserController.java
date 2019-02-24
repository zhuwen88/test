package com.shsxt.controller;

import com.shsxt.service.HelloService;
import com.shsxt.vo.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.sound.sampled.Line;

@Controller
public class UserController {
    @Autowired
    private HelloService helloService;

    public void userAdd(){
        System.out.println("controller......");
        System.out.println("11");
        helloService.hello("zhu");
    }

    public void login(String userName,String passWord) {

        ResultInfo info = helloService.login(userName, passWord);
        System.out.println(info);

    }
}
