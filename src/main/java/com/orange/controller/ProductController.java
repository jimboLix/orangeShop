package com.orange.controller;

import com.alibaba.fastjson.JSON;
import com.orange.bean.product.*;
import com.orange.bean.vo.ProductVo;
import com.orange.service.*;
import com.orange.util.ResponseUtil;
import com.orange.util.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 商品的控制器
 * @date 2017/4/30
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private BrandService brandService;
    @Autowired
    private ColorService colorService;
    @Autowired
    private TypeService typeService;
    @Autowired
    private FeatureService featureService;

    @RequestMapping("/list.do")
    public String toList() {
        return "product/list";
    }

    /**
     * 分页显示商品
     * modelMap和model都是向页面传递数据的，类似于Request.setAttribute
     *
     * @param rows 每页显示多少条
     * @param page 当前页
     * @return
     */
    @RequestMapping("/page.do")
    public void getProductPage(Integer rows, Integer page, HttpServletResponse response, ModelMap modelMap, ProductVo productVo) {
        //封装查询条件
        if (productVo == null) {
            productVo = new ProductVo();
        }
        if (page != null) {
            productVo.setPageNo(page);
        }
        if (rows != null) {
            productVo.setPageSize(rows);
        }
//        modelMap.addAttribute("name", productVo.getName());
//        modelMap.addAttribute("no", productVo.getNo());
//        modelMap.addAttribute("isShow", productVo.getIsShow());
        //根据封装的查询条件查询
        List<Product> productList = productService.getProductListWithPage(productVo);
        //总条数
        int count = productService.getProductListCount(productVo);

        ResultInfo<Product> resultInfo = new ResultInfo<>();
        resultInfo.setRows(productList);
        resultInfo.setTotal(count);
        String json = JSON.toJSONString(resultInfo);
        ResponseUtil.renderJson(response, json);
    }

    @RequestMapping("/toAdd.do")
    public String toAdd(Model model) {
        Type type = new Type();
        List<Type> types = typeService.getTypeList(type);
        Brand brand = new Brand();
        List<Brand> brands = brandService.getBrandList(brand);
        List<Color> colors = colorService.getColorList(new Color());
        List<Feature> features = featureService.getFeatureList(new Feature());
        //將上面查詢到的數據放入model中傳到jsp
        model.addAttribute("types", types);
        model.addAttribute("brands", brands);
        model.addAttribute("colors", colors);
        model.addAttribute("features", features);

        return "product/add";
    }

    /**
     * 商品添加
     *
     * @param product
     * @param img
     * @param model
     * @return
     */
    @RequestMapping("/add.do")
    public String add(Product product, Img img, Model model) {
        try {
            product.setImg(img);
            productService.addProduct(product);
            model.addAttribute("result", "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "main";
    }

    /**
     * 跳转到修改页面
     *
     * @param id    所要修改的商品id
     * @param model 传递值
     * @return
     */
    @RequestMapping("/toEdit.do")
    public String toEdit(Integer id, ModelMap model) {
        ProductVo productVo = new ProductVo();
        productVo.setId(id);
        List<Product> page = productService.getProductListWithPage(productVo);
        if (null != page && page.size() > 0) {
            model.addAttribute("product", page.get(0));
        }
        return "product/edit";
    }

    @RequestMapping("/update.do")
    public void update(Product product, HttpServletResponse response) {
        productService.update(product);
        Map<String, String> map = new HashMap<>();
        map.put("update", "true");
        ResponseUtil.renderJson(response, JSON.toJSONString(map));
    }

}
