package com.orange.service;

import com.orange.bean.product.Type;

import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 商品类型业务处理类
 * @date 2017/5/1
 */
public interface TypeService {

    /**
     * 集合查询
     * @param type
     */
    public List<Type> getTypeList(Type type);
}
