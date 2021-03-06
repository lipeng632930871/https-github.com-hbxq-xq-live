package com.xq.live.service;

import com.xq.live.common.Pager;
import com.xq.live.model.Topic;
import com.xq.live.vo.in.TopicInVo;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author zhangpeng32
 * @date 2018-02-08 13:58
 * @copyright:hbxq
 **/
public interface TopicService {
    /**
     * 查一条记录
     * @param id
     * @return
     */
    public Topic selectOne(Long id);

    /**
     * 新增
     * @param zhibo
     * @return
     */
    public Long add(Topic zhibo);

    /**
     * 更新
     * @param zhibo
     * @return
     */
    public int update(Topic zhibo);

    /**
     * 删除一条记录
     * @param id
     * @return
     */
    public int delete(Long id);

    /**
     * 分页查询列表
     * @param inVo
     * @return
     */
    Pager<Topic> list(TopicInVo inVo);

    /**
     * 查询最热
     * @param inVo
     * @return
     */
    List<Topic> top(TopicInVo inVo);
}
