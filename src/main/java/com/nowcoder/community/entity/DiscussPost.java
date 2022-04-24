package com.nowcoder.community.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
/**
 *
 */
@Data
@Builder
@ToString
public class DiscussPost {
    private int id;
    private int userId;
    private String title;
    private String content;
    /**
     * 0-正常; 1-精华; 2-拉黑;
     */
    private int type;
    /**
     * 0-正常; 1-精华; 2-拉黑;
     */
    private int status;
    private Date createTime;
    private int commentCount;
    private double score;
}
