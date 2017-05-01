package com.orange.dao;

import com.orange.bean.product.Type;
import com.orange.dao.product.TypeDao;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2017/5/1
 */
public class TypeDaoTest extends SpringTestCase{
    @Resource
    private TypeDao typeDao;

    @Test
    public void getTypeListTest(){
        List<Type> types = typeDao.getTypeList(new Type());
        System.out.println(types.size());
    }
}
