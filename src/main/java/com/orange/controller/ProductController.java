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
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

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
    public String toList(){
        return "product/list";
    }
    /**
     * 分页显示商品
     * @param rows 每页显示多少条
     * @param page 当前页
     * @return
     */
    @RequestMapping("/page.do")
    public  void getProductPage(Integer rows, Integer page, HttpServletResponse response){
        //封装查询条件
        ProductVo productVo = new ProductVo();
        productVo.setPageNo(page);
        productVo.setPageSize(rows);
        productVo.setIsShow(1);
        //根据封装的查询条件查询
        List<Product> productList = productService.getProductListWithPage(productVo);
        //总条数
        int count = productService.getProductListCount(productVo);

        ResultInfo<Product> resultInfo = new ResultInfo<>();
        resultInfo.setRows(productList);
        resultInfo.setTotal(count);
        String json = JSON.toJSONString(resultInfo);
        ResponseUtil.renderJson(response,json);
    }

    @RequestMapping("/toAdd.do")
    public String toAdd(Model model){
        Type type = new Type();
        List<Type> types = typeService.getTypeList(type);
        Brand brand = new Brand();
        List<Brand> brands = brandService.getBrandList(brand);
        List<Color> colors = colorService.getColorList(new Color());
        List<Feature> features = featureService.getFeatureList(new Feature());
        //將上面查詢到的數據放入model中傳到jsp
        model.addAttribute("types",types);
        model.addAttribute("brands",brands);
        model.addAttribute("colors",colors);
        model.addAttribute("features",features);

        return "product/add";
    }

    @RequestMapping("/add.do")
    public String add(Product product,Img img,Model model){
        try {
            product.setImg(img);
            productService.addProduct(product);
            model.addAttribute("result", "添加成功");
        }catch (Exception e){
            e.printStackTrace();
        }
        return "main";
    }

}
