package servlets;

import dao.EmployeeDao;
import models.Employee;
import utilities.EmployeeDaoFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainServlet extends HttpServlet {
    // methods
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        response.sendRedirect("http://www.google.com?name=" + name);
        out.close();

        //get the list of employees
        List<Employee> employeeList = new ArrayList<>();
        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        try {
            employeeList = dao.getAllEmployees();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Employee employee : employeeList) {
            out.println("<tr>");
            out.println("<td>" + employee.getEmpID() + "</td>");
            out.println("<td>" + employee.getEmpFirstName() + "</td>");
            out.println("<td>" + employee.getEmpLastName() + "</td>");
            out.println("<td>" + employee.getEmpEmail() + "</td>");
            out.println("<td>" + employee.getEmpDept() + "</td>");
            out.println("</tr>");
        }
        out.close();
    }
}