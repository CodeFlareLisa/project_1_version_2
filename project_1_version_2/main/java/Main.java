import dao.Impl.UsersDaoImpl;
import dao.UsersDao;

import java.sql.SQLException;
import java.util.Scanner;


public class Main {

    public Main(String[] args) throws SQLException{
        // UsersDao
        UsersDao dao = UsersDaoImpl.getUsersDao();
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        boolean UsersDao;
 /*       if(
            System.out.println("You are able to continue with all functions for Managers");
        }else{
            //fail
            if(UsersDao != mgrUserID)*/
            //send userDao to "users" to the Employee Portal

        while(flag){
            System.out.println("********************************");
            System.out.println("You are entering the Manager Portal. Please selection from the options below.");
            System.out.println("********************************");
            System.out.println("Press 1: To Login into the Manager Portal.");
            System.out.println("Press 2: To View the Manager Home Page");
            System.out.println("Press 3: To Approve or Deny pending reimbursement requests.");
            System.out.println("Press 4: To view all pending requests of all employees.");
            System.out.println("Press 5: To view all resolved requests of all employees.");
            System.out.println("Press 6: To view requests of a specific employee.");
            System.out.println("Press 7: View all employees.");
            System.out.println("PRESS 8: Create a new user.");
            System.out.println("Press 9: To update or delete a user.");
            System.out.println("Press 10: To Return to the Home Page.");
            System.out.println("Press 11: to Exit and Logout. ");
            System.out.println("********************************");



        }







        // regular employee


            System.out.println("PRESS 3: To pull history of all users or Individual user by ID.");
            System.out.println("Press 4: To view all pending, approved, expense reports.");
            System.out.println("Press 5: To view all resolved requests of all users.");
            System.out.println("Press ");
            System.out.println("Press ");
            System.out.println("PRESS 4: Get All Employee");
            System.out.println("PRESS 5: Get Employee By ID");
            System.out.println("PRESS 6: Exit and logout.");
            System.out.println("PRESS 7: To Return to the Home Page");
            System.out.println("********************************");
        }
    }

        // something here
