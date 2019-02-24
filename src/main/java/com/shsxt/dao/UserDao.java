package com.shsxt.dao;

import com.shsxt.po.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    private final String USERNAME="zhuwen";
    private final String PASSWORD="zhuwen88";

    public void add(String name,Integer password){
        System.out.println("帐号密码"+name +password);
    }

    public User queryByName(String userName,String passWord){
        User user = null;
        if(userName.equals(USERNAME)){
            user =new User();
            user.setUserName(USERNAME);
            user.setPassWord(PASSWORD);

        }
        return user;
    }
}
