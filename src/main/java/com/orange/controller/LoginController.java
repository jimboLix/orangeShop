package com.orange.controller;

import com.orange.bean.user.Employee;
import com.orange.service.user.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    /**
     * 登录页面
     * @return
     */
    @RequestMapping(value = "/doLogin.do",method = RequestMethod.POST)
    public String doLogin(String username,String password){
        //封装查询条件
        Employee employee = new Employee();
        employee.setPassword(password);
        employee.setUsername(username);
        //用上面封装的条件去查询
        Employee result = employeeService.getEmployee(employee);
        //如果没查到说明用户名或密码错误，则返回登录页面
        if(null == employee){
            return "login";
        }
        return "main";
    }

    /**
     * 去登录页面
     * @return
     */
    @RequestMapping("/toLogin.do")
    public String toLogin(){
        return "login";
    }

    /**
     * 欢迎页面
     * @return
     */
    @RequestMapping("/welcome.do")
    public String welcome(){
        return "welcome";
    }
}
