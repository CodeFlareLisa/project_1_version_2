package servlets;

import dao.TransactionDao;
import models.Transaction;
import utilities.TransactionDaoFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class TransactionServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServlet response)throws IOException {
    //    response.setContentType("text/html");
    //    PrintWriter out = response.getWriter;

        String transaction = request.getParameter("transaction");  // not sure if this is correct
    //    response.sendRedirect("http://google.com?name=" + transaction);
        out.close();

        // get list of transaction
        List<Transaction> transactionList = new ArrayList<>();
        TransactionDao dao = TransactionDaoFactory.getTransactionDao();

    }
}