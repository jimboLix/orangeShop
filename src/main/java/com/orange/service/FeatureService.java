package com.orange.service;

import com.orange.bean.product.Feature;

import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description:
 * @date 2017/5/1
 */
public interface FeatureService {

    /**
     * 集合查询
     * @param featureQuery
     */
    public List<Feature> getFeatureList(Feature featureQuery);
}
