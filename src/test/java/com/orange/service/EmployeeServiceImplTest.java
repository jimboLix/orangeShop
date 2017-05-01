package com.orange.service;

import com.orange.bean.user.Employee;
import com.orange.dao.SpringTestCase;
import com.orange.service.user.EmployeeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date ${Date}
 */
public class EmployeeServiceImplTest extends SpringTestCase {
    @Autowired
    private EmployeeService employeeService;
    @Test
    public void getEmployeeTest(){
        Employee employee = new Employee();
        employee.setUsername("admin");
        employee.setPassword("123456");
        Employee employee1 = employeeService.getEmployee(employee);
        System.out.println(employee1.toString());
    }
}
