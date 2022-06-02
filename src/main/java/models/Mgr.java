package models;


public class Mgr {
    private int mgrID;
    private String mgrFirstName;
    private String mgrLastName;
    private String mgrEmail;
    private String mgrDept;


     public Mgr(int userID, String userName, String password, String expires, String permissions) {
        this.mgrID = mgrID;
        this.mgrFirstName = mgrFirstName;
        this.mgrLastName = mgrLastName;
        this.mgrEmail = mgrEmail;
        this.mgrDept = mgrDept;
    }

    public int getMgrID() {
        return mgrID;
    }

    public void setMgrID(int mgrID) {
        this.mgrID = mgrID;
    }

    public String getMgrFirstName() {
        return mgrFirstName;
    }

    public void setMgrFirstName(String mgrFirstName) {
        this.mgrFirstName = mgrFirstName;
    }

    public String getMgrLastName() {
        return mgrLastName;
    }

    public void setMgrLastName(String mgrLastName) {
        this.mgrLastName = mgrLastName;
    }

    public String getMgrEmail() {
        return mgrEmail;
    }

    public void setMgrEmail(String mgrEmail) {
        this.mgrEmail = mgrEmail;
    }

    public String getMgrDept() {
        return mgrDept;
    }

    public void setMgrDept(String mgrDept) {
        this.mgrDept = mgrDept;
    }

    @Override
    public String toString() {
        return "Mgr{" +
                "mgrID=" + mgrID +
                ", mgrFirstName='" + mgrFirstName + '\'' +
                ", mgrLastName='" + mgrLastName + '\'' +
                ", mgrEmail='" + mgrEmail + '\'' +
                ", mgrDept='" + mgrDept + '\'' +
                '}';
    }
}

