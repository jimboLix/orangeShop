package com.orange.service;

import com.orange.bean.product.Sku;

import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 最小销售单元
 * @date 2017/5/1
 */
public interface SkuService {
    /**
     * 添加
     *
     * @param sku
     */
    public Integer addSku(Sku sku);

    /**
     * 总条数
     *
     * @param skuQuery
     */
    public int getSkuListCount(Sku skuQuery);

    /**
     * 分页查询
     *
     * @param skuQuery
     */
    public List<Sku> getSkuListWithPage(Sku skuQuery);

    /**
     * 根据主键更新
     *
     * @param sku
     */
    public Integer updateSkuByKey(Sku sku);

    /**
     * 库存大于>0
     */
    List<Sku> getStock(Integer productId);

    Sku getSkuByKey(Integer id);
}
