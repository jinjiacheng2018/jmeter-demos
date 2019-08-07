package com.dream.boot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: 用户信息实体类
 *
 *@author JinJiacheng
 *@date 2019/8/7 22:14
 */
public class SysUser implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private Integer id;  //主键
    
    private String username;  //账户名称
    
    private String password;  //账户密码
    
    private String chineseName;  //中文名称
    
    private String email;  //电子邮箱
    
    private String phoneNo;  //电话号码
    
    private String address;  //现住地址
    
    private Date whenCreated;  //创建时间
    
    private Date whenModifide;  //修改时间
    
    private String whoCreated;  //创建人
    
    private String whoModifide;  //修改人
    
    private Integer deleted;  //是否删除 0否 1是
    
    public SysUser()
    {
    }
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(Integer id)
    {
        this.id = id;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getChineseName()
    {
        return chineseName;
    }
    
    public void setChineseName(String chineseName)
    {
        this.chineseName = chineseName;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getPhoneNo()
    {
        return phoneNo;
    }
    
    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public Date getWhenCreated()
    {
        return whenCreated;
    }
    
    public void setWhenCreated(Date whenCreated)
    {
        this.whenCreated = whenCreated;
    }
    
    public Date getWhenModifide()
    {
        return whenModifide;
    }
    
    public void setWhenModifide(Date whenModifide)
    {
        this.whenModifide = whenModifide;
    }
    
    public String getWhoCreated()
    {
        return whoCreated;
    }
    
    public void setWhoCreated(String whoCreated)
    {
        this.whoCreated = whoCreated;
    }
    
    public String getWhoModifide()
    {
        return whoModifide;
    }
    
    public void setWhoModifide(String whoModifide)
    {
        this.whoModifide = whoModifide;
    }
    
    public Integer getDeleted()
    {
        return deleted;
    }
    
    public void setDeleted(Integer deleted)
    {
        this.deleted = deleted;
    }
    
    @Override
    public String toString()
    {
        return "SysUser{" + "id=" + id + ", username='" + username + '\'' + ", password='" + password + '\''
                + ", chineseName='" + chineseName + '\'' + ", email='" + email + '\'' + ", phoneNo='" + phoneNo + '\''
                + ", address='" + address + '\'' + ", whenCreated=" + whenCreated + ", whenModifide=" + whenModifide
                + ", whoCreated='" + whoCreated + '\'' + ", whoModifide='" + whoModifide + '\'' + ", deleted=" + deleted
                + '}';
    }
}
