package com.orange.service;

import com.orange.bean.product.Img;
import com.orange.bean.product.Product;

import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 商品图片业务类
 * @date 2017/5/1
 */
public interface ImgService {

    /**
     * 添加
     *
     * @param img
     */
    Integer addImg(Img img);

    /**
     * 分页查询
     * @param imgQuery
     */
    List<Img> getImgListWithPage(Img imgQuery);

    /**
     * 根据商品id查询
     *
     */
    List<Img> getImgByProductId(Integer productId);


}
