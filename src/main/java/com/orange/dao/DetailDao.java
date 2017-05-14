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
     * 根据主键批量查找
     * @param idList
     */
    public List<Detail> getDetailsByKeys(List<Integer> idList);

    /**
     * 根据主键删除
     * @param id
     */
    public Integer deleteByKey(Integer id);

    /**
     * 根据主键批量删除
     * @param idList
     */
    public Integer deleteByKeys(List<Integer> idList);

    /**
     * 根据主键更新
     * @param detail
     */
    public Integer updateDetailByKey(Detail detail);

    /**
     * 分页查询
     * @param detailQuery
     */
    public List<Detail> getDetailListWithPage(Detail detailQuery);

    /**
     * 集合查询
     * @param detailQuery
     */
    public List<Detail> getDetailList(Detail detailQuery);

    /**
     * 总条数
     * @param detailQuery
     */
    public int getDetailListCount(Detail detailQuery);
}
