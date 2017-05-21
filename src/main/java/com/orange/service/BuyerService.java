package com.orange.service;

import com.orange.bean.user.Buyer;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description:
 * @date 2017/5/21
 */
public interface BuyerService {
    Buyer getBuyerByUserNameAndPassword(String userName, String password);

    /**
     * 添加
     *
     * @param buyer
     */
    void addBuyer(Buyer buyer);
}
