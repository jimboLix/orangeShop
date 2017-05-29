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
    private Integer amount = 1;

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + amount;
        result = prime * result + ((sku == null) ? 0 : sku.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BuyItem other = (BuyItem) obj;
        if (sku == null) {
            if (other.sku != null)
                return false;
        } else if (!sku.getId().equals(other.sku.getId()))
            return false;
        return true;
    }
}
