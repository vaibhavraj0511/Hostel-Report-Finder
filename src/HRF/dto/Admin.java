package HRF.dto;

public class Admin {
    private String id;
    private String password;

    public Admin() {
    }

    public Admin(String id, String password) {
        this.id = id;
        this.password = password;
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
