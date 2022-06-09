package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LogoutServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
// change file name on line 18?
        request.getRequestDispatcher("navbar.html").include(request, response);

        Cookie cookie = new Cookie("userName", "");
        response.addCookie(cookie);

        out.println("You are logged out successfully");

        out.close();
    }

}

