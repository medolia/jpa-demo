package com.que.demo.domain;

import lombok.Data;

/**
 * 活动-成员 关联表
 * 每次参与记录对应一条表记录
 */
@Data
public class PartyRecord {
    /**
     * 活动详情记录 id
     */
    private Long id;

    /**
     * 对应 partyInfo 表 id
     */
    private Long partyId;

    /**
     * 发起人 uid
     */
    private Long hostId;

    /**
     * 活动成员id
     */
    private String memberId;

    /**
     * 参与状态
     * 0 无效记录 1 准备参加 2 已取消参加
     */
    private Integer status;

    /**
     * 默认为空，如果取消这里存放取消原因
     */
    private String description;
}
