package com.zyj.sagittarius.entity;

import lombok.Data;

import java.util.Date;

/**
 * 文章
 */
@Data
public class Blog {

    private int id;           // 主键
    private String title;     // 标题
    private String content;   // 内容
    private int likeCount;    // 喜欢的总数
    private String likeUser;  // 喜欢的用户
    private Date createTime;  // 创建时间

}
