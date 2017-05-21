package com.orange.controller;

import com.orange.bean.user.Buyer;
import com.orange.bean.user.Employee;
import com.orange.service.BuyerService;
import com.orange.service.user.EmployeeService;
import com.orange.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: 用户登录等的控制器
 * @date ${date}
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private BuyerService buyerService;

    /**
     * 登录页面
     *
     * @return
     */
    @RequestMapping(value = "/doLogin.do", method = {RequestMethod.POST, RequestMethod.GET})
    public String doLogin(String username, String password, ModelMap modelMap, HttpServletRequest request) {
        //封装查询条件
        Employee employee = new Employee();
        //判断用户输入的用户名密码是否为空
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            modelMap.put("error", "登录信息有误");
            return "login";
        }
        employee.setPassword(password);
        employee.setUsername(username);
        //用上面封装的条件去查询
        Employee result = employeeService.getEmployee(employee);
        //如果没查到说明用户名或密码错误，则返回登录页面
        if (null == result) {
            modelMap.put("error", "登录信息有误");
            return "login";
        }
        //登录成功后将用户信息放入session中
        request.getSession().setAttribute(Constants.EMPLOYEE_SESSION, result);
        return "main";
    }

    /**
     * 去登录页面
     *
     * @return
     */
    @RequestMapping("/toLogin.do")
    public String toLogin() {
        return "login";
    }

    /**
     * 欢迎页面
     *
     * @return
     */
    @RequestMapping("/welcome.do")
    public String welcome() {
        return "welcome";
    }

    /**
     * 购买者登录
     *
     * @param request
     * @param username
     * @param password
     */
    @RequestMapping("/doLogin.shtml")
    public String buyerLogin(HttpServletRequest request, String username, String password, String targetUrl) {
        Buyer buyer = buyerService.getBuyerByUserNameAndPassword(username, password);
        if (null == buyer) {
            return "buyerLogin";
        }
        if (!StringUtils.isEmpty(targetUrl)) {
            String contextPath = request.getContextPath();
            targetUrl = targetUrl.replaceAll(contextPath,"");
        }
        request.getSession().setAttribute(Constants.BUYER_SESSION, buyer);
        return "redirect:" + targetUrl;
    }

    /**
     * 购买者跳转登录页面
     *
     * @return
     */
    @RequestMapping("/toLogin.shtml")
    public String buyerToLogin(String url, ModelMap modelMap) {
        modelMap.put("url", url);
        return "login";
    }
}
