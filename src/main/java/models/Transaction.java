package models;

public class Transaction {
    private int transID;
    private int empIDReq;
    private String transType;
    private String transTimestamp;
    private float transAmount;
    private int mgrID;
    private String status;

    public Transaction(int transID, int empIDReq, String transType, String transTimestamp, float transAmount, int mgrID, String status) {
        this.transID = transID;
        this.empIDReq = empIDReq;
        this.transType = transType;
        this.transTimestamp = transTimestamp;
        this.transAmount = transAmount;
        this.mgrID = mgrID;
        this.status = status;
    }

    public int getTransID() {
        return transID;
    }

    public void setTransID(int transID) {
        this.transID = transID;
    }

    public int getEmpIDReq() {
        return empIDReq;
    }

    public void setEmpIDReq(int empIDReq) {
        this.empIDReq = empIDReq;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getTransTimestamp() {
        return transTimestamp;
    }

    public void setTransTimestamp(String transTimestamp) {
        this.transTimestamp = transTimestamp;
    }

    public float getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(float transAmount) {
        this.transAmount = transAmount;
    }

    public int getMgrID() {
        return mgrID;
    }

    public void setMgrID(int mgrID) {
        this.mgrID = mgrID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transID=" + transID +
                ", empIDReq=" + empIDReq +
                ", transType='" + transType + '\'' +
                ", transTimestamp='" + transTimestamp + '\'' +
                ", transAmount=" + transAmount +
                ", mgrID=" + mgrID +
                ", status='" + status + '\'' +
                '}';
    }
}
