package com.orange.dao;

import com.orange.bean.order.Detail;

import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 订单详情
 * @date 2017/5/14
 */
public interface DetailDao {

    /**
     * 添加
     * @param detail
     */
    public Integer addDetail(Detail detail);

    /**
     * 根据主键查找
     * @param id
     */
    public Detail getDetailByKey(Integer id);

    /**
     * 根据主键更新
     * @param detail
     */
    public Integer updateDetailByKey(Detail detail);

    /**
     * 集合查询
     * @param detailQuery
     */
    public List<Detail> getDetailList(Detail detailQuery);
}
