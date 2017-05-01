package com.orange.dao;

import com.orange.bean.vo.ProductVo;
import com.orange.dao.product.ProductDao;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2017/4/30
 */
public class ProductDaoTest extends SpringTestCase {
    @Resource
    private ProductDao productDao;

    @Test
    public void getProductListCountTest(){
        ProductVo productVo = new ProductVo();
        productVo.setIsShow(1);
        int count = productDao.getProductListCount(productVo);
        System.out.println("-----count= "+count);

    }
}
