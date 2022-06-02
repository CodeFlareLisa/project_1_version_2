package dao;


import models.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees() throws SQLException;
    Employee getEmployeeByEmpID(int empID) throws SQLException;
    boolean addEmployee(Employee employee) throws SQLException;
    boolean updateEmployee(Employee employee) throws SQLException;
    boolean deleteEmployee(int empiID) throws SQLException;

}