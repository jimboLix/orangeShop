package com.orange.service;

import com.orange.bean.BuyCart;
import com.orange.bean.order.Order;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 订单业务层
 * @date 2017/5/14
 */
public interface OrderService {
    /**
     * 基本插入
     *
     * @return
     */
    Order addOrder(Order order,BuyCart buyCart);
}
