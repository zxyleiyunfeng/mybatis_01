package com.sc.spring.entity;

/**
 * 类名：Userinfo
 * 描述：一段话描述类的信息
 * 作者：雷云风
 * 日期：2020/10/9 10:49
 * 版本：V1.0
 */
public class Userinfo {
    private Integer userId;
    private String userName;
    private String userPassword;
    private Integer userAge;
    private String userSex;

    public Userinfo() {
    }

    public Userinfo(Integer userId, String userName, String userPassword, Integer userAge, String userSex) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userAge = userAge;
        this.userSex = userSex;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userAge=" + userAge +
                ", userSex='" + userSex + '\'' +
                '}';
    }
}
