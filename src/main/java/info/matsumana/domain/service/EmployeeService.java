package info.matsumana.domain.service;

import info.matsumana.domain.config.DataSourceSwitcher;
import info.matsumana.domain.model.Employee;
import info.matsumana.domain.model.EmployeePJ;
import info.matsumana.domain.repository.EmployeeMapper;
import info.matsumana.domain.repository.EmployeeRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class EmployeeService {

    @Inject
    EmployeeRepository employeeRepository;

    @Inject
    EmployeeMapper mapper;

    public Employee findById(Integer employeeId) {
        DataSourceSwitcher.setCurrentContext("dataSource2");
        return employeeRepository.findById(employeeId);
    }

    public EmployeePJ findByIdUsingBatis(Integer employeeId) {
        return mapper.findById(employeeId);
    }
}
