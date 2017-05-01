package com.orange.service.impl;

import com.orange.bean.user.Employee;
import com.orange.dao.EmployeeDao;
import com.orange.service.user.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fengyan.li
 * @version V1.0
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date ${Date}
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public Employee getEmployee(Employee employee) {
        return employeeDao.getEmployee(employee);
    }
}
