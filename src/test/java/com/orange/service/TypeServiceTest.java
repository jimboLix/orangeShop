package com.orange.service;

import com.orange.bean.product.Type;
import com.orange.dao.SpringTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2017/5/1
 */
public class TypeServiceTest extends SpringTestCase {
    @Autowired
    private TypeService typeService;

    @Test
    public void getTypeListTest(){
        List<Type> typeList = typeService.getTypeList(new Type());
        System.out.println(typeList.size());
    }
}
