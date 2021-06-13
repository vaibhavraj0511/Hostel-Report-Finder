package HRF.dto;

public class Warden {
    private String id;
    private String fullName;
    private String password;
    private String mobileNo;
    private String address;

    public Warden() {
    }

    public Warden(String id, String fullName, String password, String mobileNo, String address) {
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    
    
}
