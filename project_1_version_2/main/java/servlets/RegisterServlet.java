package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    private String userName;
    private String password;
    private String getPassword;


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // request.getRequestDispatcher("navbar.html").include(request, response);
        request.setAttribute(userName, password);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("RegisterServlet");

        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        // when user enters correct detail
        if (userName.equals("admin") && password.equals("12345678")) {
            // success
            requestDispatcher.forward(request, response);
            System.out.println("You have created a new user account.");
            System.out.println("<br>Welcome " + userName);

            Cookie cookie = new Cookie("userName", "");
            response.addCookie(cookie);
        } else {
            // failed
            System.out.println("Sorry!, Invalid Details.");
            requestDispatcher = request.getRequestDispatcher("index.html");
            requestDispatcher.include(request, response);
        }
        out.close();
    }
}