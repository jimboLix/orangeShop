package com.orange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${DESCRIPTION}
 * @date 2017/5/2
 */
@Controller
@RequestMapping("/sku")
public class SkuController {
    @RequestMapping("/list.do")
    public String list(){
        return "sku/list";
    }
}
