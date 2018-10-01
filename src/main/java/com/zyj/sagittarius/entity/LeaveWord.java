package com.zyj.sagittarius.entity;

import lombok.Data;

import java.util.Date;

/**
 * 留言
 */
@Data
public class LeaveWord {

    private int id;            // 主键
    private String comment;    // 内容
    private String writeBack;  // 回复
    private int type;          // 留言类型(1-文章评论;2-留言板留言)
    private int number;        // 留言类型对应的编号
    private int parentId;      // 楼中楼
    private int likeCount;     // 喜欢的总数
    private String likeUser;   // 喜欢的用户
    private Date createTime;   // 创建时间

}
