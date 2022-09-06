package com.atguigu.mybatis.pojo.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

        int inserUser();

        List<User> getAllUser();
}
