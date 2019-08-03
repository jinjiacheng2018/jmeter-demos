package com.jmeter.boot.model;

public class User {

    private Integer userId; //用户id

    private String userName; //用户姓名

    private Integer userAge; //用户年龄

    private String userEmail; //用户邮箱

    public User() {
    }

    public User(Integer userId, String userName, Integer userAge, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.userEmail = userEmail;
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

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
