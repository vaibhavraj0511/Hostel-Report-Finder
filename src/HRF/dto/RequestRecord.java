package HRF.dto;

public class RequestRecord {
    private String uniqueIdd;
    private String studentName;
    private String studentId;
    private String mobileNo;
    private String date;
    private String day;
    private String fromTime;
    private String toTime;
    private String updateDescription;

    public RequestRecord() {
    }

    public RequestRecord(String uniqueIdd, String studentName, String studentId, String mobileNo, String date, String day, String fromTime, String toTime, String updateDescription) {
        this.uniqueIdd = uniqueIdd;
        this.studentName = studentName;
        this.studentId = studentId;
        this.mobileNo = mobileNo;
        this.date = date;
        this.day = day;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.updateDescription = updateDescription;
    }

    public String getUpdateDescription() {
        return updateDescription;
    }

    public void setUpdateDescription(String updateDescription) {
        this.updateDescription = updateDescription;
    }

    public String getUniqueIdd() {
        return uniqueIdd;
    }

    public void setUniqueIdd(String uniqueIdd) {
        this.uniqueIdd = uniqueIdd;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }
    
    
}
