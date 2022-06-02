package dao;

import models.Mgr;
import models.Transaction;

import java.sql.SQLException;
import java.util.List;

public interface TransactionDao {
    List<TransactionDao> getAllTransactions() throws SQLException;
    Transaction getTransByTransID(int transID)throws SQLException;



}

