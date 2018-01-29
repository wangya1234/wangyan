package com.example.springboot01.controller;

import com.example.springboot01.domain.User;
import com.example.springboot01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

//@RestController，构造型注解
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
   //增加一条记录
   //提供路径信息
    @RequestMapping("/insUser")
    public void insUser(){
        User user = new User();
        user.setUname("李四");
        user.setPassward("123123");
        userRepository.save(user);
    }
    //删除
    @RequestMapping("/deleteUser")
    public void deleteUser(){
        userRepository.delete(2);
    }
    //修改
    @RequestMapping("/updateUser")
    public void update(){
        User user = new User();
        user.setUid(1);
        user.setPassward("1111111");
        user.setUname("张三");
        userRepository.save(user);
    }
    //查询
    @RequestMapping("/selectUser")
    public User selUser(){
        User user =  userRepository.findOne(3);
        return user;
    }
}


