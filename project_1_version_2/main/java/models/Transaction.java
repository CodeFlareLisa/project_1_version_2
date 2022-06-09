package models;

public class Transaction {
    private int transID;
    private String transTimestamp;
    private String userRequest;
    private String status;
    private String viewPend;

    public Transaction(int transID, String transTimestamp, String userRequest, String status, String viewPend) {
        this.transID = transID;
        this.transTimestamp = transTimestamp;
        this.userRequest = userRequest;
        this.status = status;
        this.viewPend = viewPend;
    }

    public int getTransID() {
        return transID;
    }

    public void setTransID(int transID) {
        this.transID = transID;
    }

    public String getTransTimestamp() {
        return transTimestamp;
    }

    public void setTransTimestamp(String transTimestamp) {
        this.transTimestamp = transTimestamp;
    }

    public String getUserRequest() {
        return userRequest;
    }

    public void setUserRequest(String userRequest) {
        this.userRequest = userRequest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getviewPend() {
        return viewPend;
    }

    public void setviewPend(String viewPend) {
        this.viewPend = viewPend;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transID=" + transID +
                ", transTimestamp='" + transTimestamp + '\'' +
                ", userRequest='" + userRequest + '\'' +
                ", status='" + status + '\'' +
                ", viewPend='" + viewPend + '\'' +
                '}';
    }
}
