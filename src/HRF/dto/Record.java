package HRF.dto;

public class Record {
    private String uniqueId;
    private String studentName;
    private String date;
    private String day;
    private String fromTime;
    private String toTime;
    private String description;

    public Record() {
    }

    public Record(String uniqueId, String studentName, String date, String day, String fromTime, String toTime, String description) {
        this.uniqueId = uniqueId;
        this.studentName = studentName;
        this.date = date;
        this.day = day;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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
