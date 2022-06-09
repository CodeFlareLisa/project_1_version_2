package dao;

import models.Transaction;
import servlets.TransactionServlet;

import java.sql.SQLException;
import java.util.List;

// use to execute the queries of the ResultSet
public interface TransactionDao {
    List<TransactionDao> getAllTransactions() throws SQLException;
    Transaction getTransByTransID(int transID)throws SQLException;
    Transaction getuserRequest(int userID)throws SQLException;
    Transaction getstatus(String status)throws SQLException;
    Transaction getviewPend(String viewPend)throws SQLException;
    Transaction getusertype(String username, String type)throws SQLException;

    // write all my functions, implement tran
    String userRequest();
    String status();
    String viewPend();

    // write all my functions, implement tran
    TransactionServlet trans();

   // Map<String, Connector.Argument> defaultArguments();
}

