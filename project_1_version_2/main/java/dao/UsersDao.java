package dao;

import models.Users;

import java.sql.SQLException;
import java.util.List;

public interface UsersDao {

    void registerUsers(Users users) throws SQLException;
    void login(String email, String password);              // String userName
    boolean adduser(Users users) throws SQLException;
    List<Users> getAllUsers() throws SQLException;
    void logout();
    Users getUsersByuserID() throws SQLException;
    boolean deleteuser(int userID) throws SQLException;
    boolean addUsers(Users Users) throws SQLException;

    // was waiting to get help before I finished coding the entire project
    // not sure how to fix the UserDao extra file as well
    // when I delete lines 22-25, then I have errors in UserDaoImpl - I choose to keep all my errors here
    boolean getUsersByuserID(int userID) throws SQLException;
    boolean getUsersByuserID(int userID) throws SQLException;
    boolean updateUsers(Users users) throws SQLException;
    boolean updateUsers(Users user) throws SQLException;

    }