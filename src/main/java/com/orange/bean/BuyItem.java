package com.orange.bean;

import com.orange.bean.product.Sku;

import java.io.Serializable;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 购买项
 * @date 2017/5/13
 */
public class BuyItem implements Serializable {
    private static final long serialVersionUID = -4402387818338427248L;
    private Sku sku;
    //购买数量
    private Integer ammount = 1;

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }
}
