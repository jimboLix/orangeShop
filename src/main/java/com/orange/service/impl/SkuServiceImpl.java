package com.orange.service.impl;

import com.orange.bean.product.Sku;
import com.orange.dao.product.SkuDao;
import com.orange.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description:
 * @date 2017/5/1
 */
@Service
public class SkuServiceImpl implements SkuService {
    @Resource
    private SkuDao skuDao;
    @Override
    @Transactional
    public Integer addSku(Sku sku) {
        return skuDao.addSku(sku);
    }
}
