package models;

public class Users {
    private int userID;
    private String userFirstName;
    private String userLastName;
    private String userName;
    private String password;
    private String userEmail;
    private String type;

    public Users(int userID, String userFirstName, String userLastName, String userName, String password, String userEmail, String type) {
        this.userID = userID;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userName = userName;
        this.password = password;
        this.userEmail = userEmail;
        this.type = type;
    }

    public static String getuserFirstName(String userFirstName) {
        return userFirstName;
    }

    public void setuserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public static String getuserLastName(String userLastName) {
        return userLastName;
    }

    public void setuserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getuserName(String userName) {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getPassword(String Password) {
        return Password;
    }

    public void setPassword(String Password) {
        this.password = password;
    }

    public static String getuserEmail(String userEmail) {
        userEmail = userEmail;
        return userEmail;
    }

    public void setuserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public static String gettype(String type) {
        type = type;
        return type;
    }

    public void settype(String type) {
        type = type;
    }


    @Override
    public String toString() {
        return "Users{" +
                "userID=" + userID +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}