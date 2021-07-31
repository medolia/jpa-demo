package com.que.demo.domain;

import lombok.Data;

import java.util.Date;

@Data
public class PartyInfo {

    /**
     * 活动 id
     */
    private Long id;

    /**
     * 活动类型
     * 1 吃喝 2 玩乐 3 运动
     */
    private Integer type;

    /**
     * 活动名
     */
    private String name;

    /**
     * 发起时间
     */
    private Date startTime;

    /**
     * 约定时间
     */
    private Date appointedTime;

    /**
     * 约定地点
     */
    private String placeInfo;

    /**
     * 活动描述
     */
    private String description;

    /**
     * 活动已参加人数
     */
    private Integer memberCount;

    /**
     * 活动人数限制
     */
    private Integer memberLimit;

    /**
     * 活动状态
     * 0 未发起 1 已发起待拼团 2 拼团完成待集合(队伍已锁定) 3 已完成 4 已取消
     */
    private Integer status;

    /**
     * 图片 url
     */
    private String imgUrl;

    /**
     * 交接暗号
     */
    private String secretCode;
}
