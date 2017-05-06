package com.orange.service.impl;

import com.orange.bean.product.Color;
import com.orange.dao.product.ColorDao;
import com.orange.service.ColorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date 2017/5/1
 */
@Service
public class ColorServiceImpl implements ColorService {
    @Resource
    private ColorDao colorDao;

    public List<Color> getColorList(Color colorQuery) {
        return colorDao.getColorList(colorQuery);
    }

    @Override
    public Color getColorByKey(Integer id) {
        if (id != null){
            return colorDao.getColorByKey(id);
        }
        return null;
    }
}
