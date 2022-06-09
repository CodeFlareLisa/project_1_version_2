package dao.Impl;

import dao.TransactionDao;
import models.Transaction;
import models.Users;
import servlets.TransactionServlet;
import utilities.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public abstract class TransactionDaoImpl implements TransactionDao {
    Connection connection;

    public TransactionDaoImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void createUser(Users user) throws SQLException {  // do I need a registerDaoImpl?
        String sql = "insert into users(firstname, lastname, email, type) values(?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(2, user.getuserFirstName("userFirstName"));
        preparedStatement.setString(3, user.getuserFirstName("userFirstName"));
        preparedStatement.setString(4, user.getuserEmail("userEmail"));
        preparedStatement.setString(5, user.gettype("Type"));
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("User saved.");
        }
    }

    @Override
    public List<TransactionDao> getAllTransactions() throws SQLException {

        return null;
    }

    @Override
    public Transaction getTransByTransID(int transID) throws SQLException {
        return null;
    }

    // write all my functions, implement tran
    @Override
    public TransactionServlet trans() {
        return null;
    }

    }