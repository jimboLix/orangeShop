package com.orange.service.impl;

import com.orange.bean.product.ClassiFy;
import com.orange.dao.product.ClassiFyDao;
import com.orange.service.ClassiFyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${DESCRIPTION}
 * @date 2017/5/2
 */
@Service
public class ClassiFyServiceImpl implements ClassiFyService {
    @Resource
    private ClassiFyDao classiFyDao;
    @Override
    public void save(ClassiFy classiFy) {
        if(classiFy  != null){
            if(classiFy.getParentId() == null){
                classiFy.setParentId(0);
            }
            classiFyDao.save(classiFy);
        }
    }

    @Override
    @Transactional
    public List<ClassiFy> getClassByPage(ClassiFy classiFy) {
        return classiFyDao.getClassByPage(classiFy);
    }

    @Override
    public int getCount(ClassiFy classiFy) {
        return classiFyDao.getCount(classiFy);
    }
}
