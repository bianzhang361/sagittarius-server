package com.zyj.sagittarius.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户
 */
@Data
public class User {

    private int id;           // 主键
    private String email;     // 邮箱
    private String userName;  // 昵称
    private String password;  // 密码
    private int gender;       // 性别
    private Date birthday;    // 出生日期
    private Date createTime;  // 创建时间

}
