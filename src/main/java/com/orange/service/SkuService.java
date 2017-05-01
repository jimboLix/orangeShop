package com.orange.service;

import com.orange.bean.product.Sku;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 最小销售单元
 * @date 2017/5/1
 */
public interface SkuService {
    /**
     * 添加
     * @param sku
     */
    public Integer addSku(Sku sku);
}
