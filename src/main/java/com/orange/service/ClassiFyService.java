package com.orange.service;

import com.orange.bean.product.ClassiFy;

import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${DESCRIPTION}
 * @date 2017/5/2
 */
public interface ClassiFyService {
    void save(ClassiFy classiFy);

    List<ClassiFy> getClassByPage(ClassiFy classiFy);

    int getCount(ClassiFy classiFy);
}



