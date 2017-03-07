package info.matsumana.domain.model;

import org.seasar.doma.Id;
import org.seasar.doma.Version;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by xlliu on 06/03/2017.
 */
public class EmployeePJ implements Serializable {

    private static final long serialVersionUID = 1L;

    public Integer employeeId;
    public String employeeName;
    public Date hiredate;
    public BigDecimal salary;
    public Integer versionNo;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Integer getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }
}
