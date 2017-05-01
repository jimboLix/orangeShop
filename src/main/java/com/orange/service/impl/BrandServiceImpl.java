package com.orange.service.impl;

import com.orange.bean.product.Brand;
import com.orange.dao.product.BrandDao;
import com.orange.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2017/5/1
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandDao brandDao;
    @Override
    public List<Brand> getBrandList(Brand brandQuery) {
        return brandDao.getBrandList(brandQuery);
    }
}
