package info.matsumana.domain.service;

import info.matsumana.domain.mapper.EmployeeMapper;
import info.matsumana.domain.model.Employee;

import javax.annotation.Resource;
import javax.inject.Named;


@Named
public class EmployeeService {

    @Resource
    EmployeeMapper mapper;

    public Employee findByIdUsingBatis(Integer employeeId) {
//        return mapper.findById(employeeId);
        return mapper.selectByPrimaryKey(employeeId);
    }
}
