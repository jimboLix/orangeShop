package com.orange.dao;

import com.orange.bean.product.ClassiFy;
import com.orange.dao.product.ClassiFyDao;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${DESCRIPTION}
 * @date 2017/5/2
 */
public class ClassiFyDaoTest extends SpringTestCase {
    @Resource
    private ClassiFyDao classiFyDao;

    @Test
    public void getClassByPageTest(){
        ClassiFy classiFy = new ClassiFy();
        classiFy.setName("测试");
        classiFy.setParentId(0);
        classiFyDao.save(classiFy);
        List<ClassiFy> classByPage = classiFyDao.getClassByPage(new ClassiFy());
        System.out.println(classByPage.size());
    }
}
