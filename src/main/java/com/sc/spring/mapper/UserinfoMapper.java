package com.sc.spring.mapper;

import com.sc.spring.entity.Userinfo;

import java.util.List;

/**
 * 类名：UserinfoMapper
 * 描述：一段话描述类的信息
 * 作者：雷云风
 * 日期：2020/10/9 10:53
 * 版本：V1.0
 */
public interface UserinfoMapper {
    public void addUserinfo(Userinfo userinfo);

    public void updateUserinfo(Userinfo userinfo);

    public void deleteUserinfo(Integer userId);

    public List<Userinfo> selectUserinfo();

    public List<Userinfo> selectUserinfo1();


}
