package com.orange.service;

import com.orange.bean.product.Color;

import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2017/5/1
 */
public interface ColorService {

    /**
     * 集合查询
     * @param colorQuery
     */
    public List<Color> getColorList(Color colorQuery);
}
