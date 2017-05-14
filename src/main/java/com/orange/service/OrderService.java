package com.orange.service;

import com.orange.bean.order.Order;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 订单业务层
 * @date 2017/5/14
 */
public interface OrderService {
    /**
     * 添加
     * @param order
     */
    public Integer addOrder(Order order);
}
