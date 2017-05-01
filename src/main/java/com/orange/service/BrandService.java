package com.orange.service;

import com.orange.bean.product.Brand;

import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description:
 * @date 2017/5/1
 */
public interface BrandService {


    //查询集合
    public List<Brand> getBrandList(Brand brandQuery);
}
