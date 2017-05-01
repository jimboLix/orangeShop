package com.orange.service.impl;

import com.orange.bean.product.Img;
import com.orange.bean.product.Product;
import com.orange.dao.product.ImgDao;
import com.orange.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description:
 * @date 2017/5/1
 */
@Service
public class ImgServiceImpl implements ImgService {
    @Autowired
    private ImgDao imgDao;
    @Override
    @Transactional
    public Integer addImg(Img img) {
        return imgDao.addImg(img);
    }
}
