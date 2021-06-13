package HRF.dto;

public class Student {
    private String id;
    private String fullName;
    private String password;
    private String email;
    private String dateOfBirth;
    private String fatherName;
    private String motherName;
    private String parentMobileNo;
    private String studentMobileNo;
    private String address;

    public Student() {
    }

    public Student(String id, String fullName, String password, String email, String dateOfBirth, String fatherName, String motherName, String parentMobileNo, String studentMobileNo, String address) {
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.parentMobileNo = parentMobileNo;
        this.studentMobileNo = studentMobileNo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getParentMobileNo() {
        return parentMobileNo;
    }

    public void setParentMobileNo(String parentMobileNo) {
        this.parentMobileNo = parentMobileNo;
    }

    public String getStudentMobileNo() {
        return studentMobileNo;
    }

    public void setStudentMobileNo(String studentMobileNo) {
        this.studentMobileNo = studentMobileNo;
    }

    

    
    
    
}
