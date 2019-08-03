package com.jmeter.boot.enums;

public enum UserEnum {

    TOM("tom",12,"浙江杭州"),
    JACK("jack",30,"湖南长沙"),
    JASON("jason",24,"湖北襄阳");

    UserEnum(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private String name; //姓名

    private Integer age; //年龄

    private String address; //住址

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
