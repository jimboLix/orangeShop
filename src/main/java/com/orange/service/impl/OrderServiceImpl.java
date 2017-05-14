package com.orange.service.impl;

import com.orange.bean.order.Order;
import com.orange.dao.OrderDao;
import com.orange.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2017/5/14
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Override
    public Integer addOrder(Order order) {
        if(order != null){
            return orderDao.addOrder(order);
        }
        return null;
    }
}
