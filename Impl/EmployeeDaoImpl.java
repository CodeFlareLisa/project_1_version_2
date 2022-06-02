package dao.Impl;

import dao.EmployeeDao;
import models.Employee;
import utilities.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    Connection connection;

    public EmployeeDaoImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        String sql = "select * from employee";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int empID = resultSet.getInt(1);
            String empFirstName = resultSet.getString(2);
            String empLastName = resultSet.getString(3);
            String empEmail = resultSet.getString(4);
            String empDept = resultSet.getString(5);
            Employee employee = new Employee(empID, empFirstName, empLastName, empEmail, empDept);
            employee.add(employee);
        }
        return employees;
    }

    @Override
    public Employee getEmployeeByEmpID(int empID) throws SQLException {
        Employee employee = new Employee();
        String sql = "select * employee where empID = " + empID;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        if (resultSet != null) {
            int empID2 = resultSet.getInt(1);
            String empFirstName = resultSet.getString(2);
            String empLastName = resultSet.getString(3);
            String empEmail = resultSet.getString(4);
            String empDept = resultSet.getString(5);
            employee = new Employee(empID, empFirstName, empLastName, empEmail, empDept);
        }
        return employee;
    }

    @Override
    public boolean addEmployee(Employee employee) throws SQLException {
        String sql = "insert into employee(empFirstName, empLastName, empEmail, empDept) values(?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(2, employee.getEmpFirstName());
        preparedStatement.setString(3, employee.getEmpLastName());
        preparedStatement.setString(4, employee.getEmpEmail());
        preparedStatement.setString(5, employee.getEmpDept());
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Employee saved");
            return true;
        } else {
            System.out.println("error occurred");
            return false;
        }
    }

    @Override
    public boolean updateEmployee(Employee employee) throws SQLException {
        String sql = "update employee set empFirstName = ?, empLastName = ?, empEmail = ?, empDept = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(2, employee.getEmpFirstName());
        preparedStatement.setString(3, employee.getEmpLastName());
        preparedStatement.setString(4, employee.getEmpEmail());
        preparedStatement.setString(5, employee.getEmpDept());
        preparedStatement.setInt(1, employee.getEmpID());
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Employee updated");
            return true;
        } else {
            System.out.println("error occurred");
            return false;
        }
    }

    @Override
    public boolean deleteEmployee(int empID) throws SQLException {
        String sql = "delete from employee where empID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, empID);
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Employee deleted");
            return true;
        } else {
            System.out.println("error occurred");
            return false;
        }
    }
}
