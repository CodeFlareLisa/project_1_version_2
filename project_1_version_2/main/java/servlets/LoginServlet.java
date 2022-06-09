package servlets;

// connection implement that is able to access the database / user /login

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
                // FIX THE COOKIE
    private javax.servlet.http.Cookie Cookie;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //       request.getRequestDispatcher("navbar.html").include(request, response);

        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        // when user enters correct detail
        if (userName.equals("admin") && password.equals("12345678")) {
            // success
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("Welcome Servlet");
            requestDispatcher.forward(request, response);
            System.out.println("You are successfully logged In");
            System.out.println("<br>Welcome " + userName);

            Cookie cookie = new Cookie("userName", "");
            response.addCookie(cookie);
        } else {
            // failed
            System.out.println("Sorry!, Invalid Details.");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
            requestDispatcher.include(request, response);
        }
        out.close();
    }
}