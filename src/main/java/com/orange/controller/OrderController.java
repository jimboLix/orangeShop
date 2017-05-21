package com.orange.controller;

import com.alibaba.fastjson.JSON;
import com.orange.bean.order.Detail;
import com.orange.bean.order.Order;
import com.orange.bean.product.Product;
import com.orange.bean.user.Buyer;
import com.orange.bean.vo.ProductVo;
import com.orange.service.DetailService;
import com.orange.service.OrderService;
import com.orange.service.ProductService;
import com.orange.util.Constants;
import com.orange.util.ResponseUtil;
import com.orange.util.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 订单管理
 * @date 2017/5/18
 */
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private DetailService detailService;
    @Autowired
    private ProductService productService;

    @RequestMapping("/order/toList.do")
    public String toList() {
        return "order/list";
    }

    //订单列表
    //支付状态
    //订单状态
    @RequestMapping(value = "/order/list.do")
    public void list(Integer rows, Integer page, Integer isPaiy, Integer state, String oid, HttpServletResponse response, ModelMap modelMap) {

        Order orderQuery = new Order();
        if (page != null) {
            orderQuery.setPageNo(page);
        }
        if (rows != null) {
            orderQuery.setPageSize(rows);
        }
        //支付状态
        if (null != isPaiy) {
            orderQuery.setIsPaiy(isPaiy);
        }
        //订单状态
        if (null != state) {
            orderQuery.setState(state);
            modelMap.put("state", state);
        }
        //订单号
        if (null != oid) {
            orderQuery.setOid(oid);
            modelMap.put("oid", oid);
        }

        List<Order> orders = orderService.getOrderListWithPage(orderQuery);
        //总条数
        int count = orderService.getOrderListCount(orderQuery);

        ResultInfo<Order> resultInfo = new ResultInfo<>();
        resultInfo.setRows(orders);
        resultInfo.setTotal(count);
        String json = JSON.toJSONString(resultInfo);
        ResponseUtil.renderJson(response, json);
    }

    @RequestMapping("/order/toEdit.do")
    public String toEdit(Integer id, ModelMap modelMap) {
        Order order = new Order();
        order.setId(id);
        List<Order> orderList = orderService.getOrderList(order);
        if (null != orderList && orderList.size() > 0) {
            order = orderList.get(0);
            modelMap.put("order", order);
        }
        return "order/edit";
    }

    @RequestMapping("/order/update.do")
    public void update(Order order, HttpServletResponse response) {
        orderService.updateOrderByKey(order);
        Map<String, String> map = new HashMap<>();
        map.put("update", "true");
        ResponseUtil.renderJson(response, JSON.toJSONString(map));
    }

    /**
     * 我的订单
     *
     * @return
     */
    @RequestMapping("/order/myOrder.shtml")
    public String myOrder(HttpServletRequest request, ModelMap modelMap) {
        Buyer buyer = (Buyer) request.getSession().getAttribute(Constants.BUYER_SESSION);
        if (buyer != null) {
            String buyerId = buyer.getUsername();
            Order orderQuery = new Order();
            orderQuery.setBuyerId(buyerId);
            List<Order> orderList = orderService.getOrderList(orderQuery);

            //填充order，订单详情及关联商品信息
            for (Order order : orderList) {
                List<Detail> details = new ArrayList<>();
                Detail detailQuery = new Detail();
                detailQuery.setOrderId(order.getId());
                List<Detail> detailList = detailService.getDetailList(detailQuery);
                //关联商品信息
                for (Detail detail : detailList) {
                    ProductVo productQuery = new ProductVo();
                    productQuery.setNo(detail.getProductNo());
                    List<Product> products = productService.getProductListWithPage(productQuery);
                    if (null != products && products.size() > 0) {
                        Product product = products.get(0);
                        detail.setProduct(product);
                    }
                    details.add(detail);
                }
                order.setDetails(details);
            }

            modelMap.put("orders", orderList);
            return "order";
        }
        return "redirect:/login/doLogin.shtml";
    }
}
