package com.orange.service;

import com.orange.bean.order.Detail;
import com.orange.dao.SpringTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 订单详情测试
 * @date 2017/5/21
 */
public class OrderDetailServiceTest extends SpringTestCase{
    @Autowired
    private DetailService detailService;

    @Test
    public void getDetailListTest(){
        Detail detail = new Detail();
        detail.setOrderId(20);
        List<Detail> detailList = detailService.getDetailList(detail);
        detailList.size();
    }
}
