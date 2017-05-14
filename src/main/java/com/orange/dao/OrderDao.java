package com.orange.dao;

import com.orange.bean.order.Order;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 订单持久化层
 * @date 2017/5/14
 */
public interface OrderDao {

    /**
     * 添加
     * @param order
     */
    public Integer addOrder(Order order);
}
