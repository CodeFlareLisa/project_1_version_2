package servlets;

import dao.TransactionDao;
import models.Transaction;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TransactionServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String transaction = request.getParameter("transaction");  // not sure if this is correct
        //    response.sendRedirect("http://google.com?name=" + transaction);
        out.close();

        // get list of transaction
        List<Transaction> transactionList = new ArrayList<>();
        TransactionDao TransactionDaoFactory = null;
        TransactionDao dao = TransactionDaoFactory;
        out.close();
    }
}