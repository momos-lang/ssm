package com.atguigu.mybatis.test;

import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.pojo.mapper.UserMapper;
import com.atguigu.mybatis.pojo.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void testInsert() throws IOException {
//        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
//
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();

        UserMapper Mapper = sqlSession.getMapper(UserMapper.class);

        int result = Mapper.inserUser();

        System.out.println("结果："+ result);

        sqlSession.close();
    }

    @Test
    public void testgetAllUser() throws IOException {
//
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();

        UserMapper Mapper = sqlSession.getMapper(UserMapper.class);

        List<User> list = Mapper.getAllUser();

        list.forEach(System.out::println);
        sqlSession.close();
    }
}
