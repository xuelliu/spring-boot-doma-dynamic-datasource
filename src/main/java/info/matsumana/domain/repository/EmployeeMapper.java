package info.matsumana.domain.repository;

import info.matsumana.domain.model.Employee;
import info.matsumana.domain.model.EmployeePJ;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by xlliu on 06/03/2017.
 */
@Mapper
public interface EmployeeMapper {

    @Select("select * from EMPLOYEE where EMPLOYEE_ID = #{employeeId}")
    EmployeePJ findById(@Param("employeeId") Integer employeeId);
}
