package com.orange.service;

import com.orange.bean.order.Detail;

import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description:
 * @date 2017/5/14
 */
public interface DetailService {

    /**
     * 基本插入
     *
     * @return
     */
    public Integer addDetail(Detail detail);

    /**
     * 根据主键查询
     */
    public Detail getDetailByKey(Integer id);

    /**
     * 根据主键批量查询
     */
    public List<Detail> getDetailsByKeys(List<Integer> idList);

    /**
     * 根据主键删除
     *
     * @return
     */
    public Integer deleteByKey(Integer id);

    /**
     * 根据主键批量删除
     *
     * @return
     */
    public Integer deleteByKeys(List<Integer> idList);

    /**
     * 根据主键更新
     *
     * @return
     */
    public Integer updateDetailByKey(Detail detail);


    /**
     * 根据条件查询
     *
     * @param detailQuery
     *            查询条件
     * @return
     */
    public List<Detail> getDetailList(Detail detailQuery);
}

