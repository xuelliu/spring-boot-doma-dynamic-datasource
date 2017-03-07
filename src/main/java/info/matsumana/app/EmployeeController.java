package info.matsumana.app;

import info.matsumana.domain.model.Employee;
import info.matsumana.domain.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
    @Inject
    EmployeeService employeeService;

    @RequestMapping(path = "/batis", method = RequestMethod.GET)
    public Employee indexMethod() {
        return employeeService.findByIdUsingBatis(1);
    }
}
