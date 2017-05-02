package com.orange.controller;

import com.alibaba.fastjson.JSON;
import com.orange.bean.product.ClassiFy;
import com.orange.bean.product.Product;
import com.orange.service.ClassiFyService;
import com.orange.util.ResponseUtil;
import com.orange.util.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${DESCRIPTION}
 * @date 2017/5/2
 */
@Controller
@RequestMapping("/class")
public class ClassiFyController {
    @Autowired
    private ClassiFyService classiFyService;

    @RequestMapping("/list.do")
    public String toList(){
        return "class/list";
    }
    @RequestMapping("/page.do")
    public void page(HttpServletResponse response,Integer rows, Integer page){
        ClassiFy classiFy = new ClassiFy();
        classiFy.setPageNo(page);
        classiFy.setPageSize(rows);
        int count = classiFyService.getCount(classiFy);
        List<ClassiFy> pageList = classiFyService.getClassByPage(classiFy);
        ResultInfo<ClassiFy> resultInfo = new ResultInfo<>();
        resultInfo.setRows(pageList);
        resultInfo.setTotal(count);
        String json = JSON.toJSONString(resultInfo);
        ResponseUtil.renderJson(response, json);
    }
}
