package com.orange.service.impl;

import com.orange.bean.product.Type;
import com.orange.dao.product.TypeDao;
import com.orange.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description:
 * @date 2017/5/1
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeDao typeDao;
    @Override
    public List<Type> getTypeList(Type type) {
        return typeDao.getTypeList(type);
    }
}
