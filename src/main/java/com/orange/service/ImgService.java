package com.orange.service;

import com.orange.bean.product.Img;
import com.orange.bean.product.Product;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 商品图片业务类
 * @date 2017/5/1
 */
public interface ImgService {

    /**
     * 添加
     * @param img
     */
    public Integer addImg(Img img);
}
