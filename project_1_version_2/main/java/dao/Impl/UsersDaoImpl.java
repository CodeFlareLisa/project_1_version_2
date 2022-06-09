package dao.Impl;

import dao.UsersDao;
import models.Users;
import utilities.ConnectionFactory;

import java.sql.*;
import java.util.List;

public abstract class UsersDaoImpl implements UsersDao {
        //Class that implements dao interface & provides the implementation of all methods
        // write the JDBC code here - mysql
    Connection connection;
    private Users users;

    public UsersDaoImpl() {
        this.connection = ConnectionFactory.getConnection();
    }


    @Override
    public void registerUsers(Users users) throws SQLException {
        String sql = "insert into users(userFirstName, userLastName, userEmail, type) VALUES(?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(2, users.getuserFirstName("userFirstName"));
        preparedStatement.setString(3, users.getuserLastName("userLastName"));
        preparedStatement.setString(4, users.getuserEmail("user Email"));
        preparedStatement.setString(5, users.gettype("type"));
        int count = preparedStatement.executeUpdate(sql);
        if (count > 0) {
            System.out.println("New User Saved");
        } else {
            System.out.println("Something went wrong, please try again.");
        }
    }

    @Override
    public void login(String email, String password) {  // change to reflect the login
    }

    @Override
    public Users getUsersByuserID() throws SQLException {
        return getUsersByuserID();

    }
    @Override
    public boolean adduser(Users users) throws SQLException {
        return false;
    }

    @Override
    public List<Users> getAllUsers() throws SQLException {
        List<Users> list = null;
        return list;
    }

    @Override
    public boolean getUsersByuserID(int userID) throws SQLException {
        String sql = "select * Users where empID = " + userID;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        if (resultSet != null) {
            userID = resultSet.getInt(1);
            String userFirstName = resultSet.getString(2);
            String userLastName = resultSet.getString(3);
            String userEmail = resultSet.getString(4);
            String type = resultSet.getString(5);
        }
        return resultSet.next();
    }

    @Override
    public boolean addUsers(Users Users) throws SQLException {
        String sql = "insert into Users(userFirstName, userLastName, userEmail, userDept) values(?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(2, Users.getuserFirstName("userFirstName"));
        preparedStatement.setString(3, Users.getuserLastName(Users.getuserLastName("userLastName")));
        preparedStatement.setString(4, Users.getuserEmail("userEmail"));
        preparedStatement.setString(5, Users.gettype("type"));
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Users saved");
            return true;
        } else {
            System.out.println("error occurred");
            return false;
        }
    }

    @Override
    public boolean updateUsers(Users user) throws SQLException {
        String sql = "update Users set userFirstName = ?, userLastName = ?, userEmail = ?, type = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
    //    preparedStatement.setInt(1, Users.getUserID());
        preparedStatement.setString(2,
                Users.getuserFirstName("user First Name"));
        preparedStatement.setString(3, Users.getuserLastName("user Last Name"));
        preparedStatement.setString(4, Users.getuserEmail("user Email"));
        preparedStatement.setString(5, Users.gettype("type"));
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Users updated");
            return true;
        } else {
            System.out.println("error occurred");
            return false;
        }
    }

    @Override
    public boolean deleteuser(int userID) throws SQLException {
        
        String sql = "delete from Users where userID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, userID);
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("User deleted");
            return true;
        } else {
            System.out.println("error occurred");
            return false;
        }
    }
    public static UsersDao getUsersDao() {
        return null;
    }
}