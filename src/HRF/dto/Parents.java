package HRF.dto;

public class Parents {
    private String id;
    private String studentFatherName;
    private String studentMotherName;
    private String password;
    private String email;
    private String fatherMobileNo;
    private String motherMobileNo;
    private String address;

    public Parents() {
    }

    public Parents(String id, String studentFatherName, String studentMotherName, String password, String email, String fatherMobileNo, String motherMobileNo, String address) {
        this.id = id;
        this.studentFatherName = studentFatherName;
        this.studentMotherName = studentMotherName;
        this.password = password;
        this.email = email;
        this.fatherMobileNo = fatherMobileNo;
        this.motherMobileNo = motherMobileNo;
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

    public String getStudentFatherName() {
        return studentFatherName;
    }

    public void setStudentFatherName(String studentFatherName) {
        this.studentFatherName = studentFatherName;
    }

    public String getStudentMotherName() {
        return studentMotherName;
    }

    public void setStudentMotherName(String studentMotherName) {
        this.studentMotherName = studentMotherName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFatherMobileNo() {
        return fatherMobileNo;
    }

    public void setFatherMobileNo(String fatherMobileNo) {
        this.fatherMobileNo = fatherMobileNo;
    }

    public String getMotherMobileNo() {
        return motherMobileNo;
    }

    public void setMotherMobileNo(String motherMobileNo) {
        this.motherMobileNo = motherMobileNo;
    }
    
    
}
