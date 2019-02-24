package com.shsxt.service;

import com.shsxt.dao.UserDao;
import com.shsxt.po.User;
import com.shsxt.vo.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//@Service
@Component
public class HelloService {

    @Autowired
    private UserDao userDao;

    public void hello(String text){
        System.out.println("service......."+text);
        userDao.add("zhuwen",123456);

    }

    /**
     * 1 接受参数并效验
     * 2 查询对象是否存在
     * 3 判断密码是否正确
     * @param userName
     * @param passWord
     * @return
     */
    public ResultInfo login(String userName,String passWord){

        ResultInfo info = new ResultInfo();
        if (null==userName||"".equals(userName)){
            info.setCode(300);
            info.setMsg("用户名为空");
            return info;
        }
        if (null==passWord||"".equals(passWord)){
            info.setCode(300);
            info.setMsg("密码为空");
            return info;
        }

        User user = userDao.queryByName(userName,passWord);
        if (null==user){
            info.setCode(300);
            info.setMsg("用户不存在");
            return info;
        }


        if (passWord.equals(user.getPassWord())){
            info.setCode(200);
            info.setMsg("登录成功");
            return info;
        }else{
            info.setCode(300);
            info.setMsg("密码错误");
            return info;
        }



    }
}
