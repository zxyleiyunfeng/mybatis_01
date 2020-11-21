package com.sc.spring.test;

import com.sc.spring.entity.Userinfo;
import com.sc.spring.mapper.UserinfoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * 类名：Test1
 * 描述：一段话描述类的信息
 * 作者：雷云风
 * 日期：2020/10/9 11:01
 * 版本：V1.0
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
        //2.创建会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //3.打开会话
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //4.获取mapper
        UserinfoMapper userinfoMapper=sqlSession.getMapper(UserinfoMapper.class);

        Userinfo userinfo=new Userinfo(0,"王五","123456",22,"男");
        userinfoMapper.addUserinfo(userinfo);
        System.out.println("添加成功");

        //5.事务提交
        sqlSession.commit();
        //6.关闭会话
        sqlSession.close();

    }
}
