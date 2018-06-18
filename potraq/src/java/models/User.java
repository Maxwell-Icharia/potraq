package models;

import database.DBConnect;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@ManagedBean(name = "User")
@RequestScoped

public class User {
    
    private int id_number;
    private String first_name;
    private String surname;
    private String email;
    private char phone_number;
    private String dob;
    private String gender;
    private String password;
    private String confirm_password;
    private String heading;
    private String body;    
    
    public int getId_number() {
        return id_number;
    }

    public void setId_number(int id_number) {
        this.id_number = id_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(char phone_number) {
        this.phone_number = phone_number;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }
    
    public static final Pattern VALID_EMAIL_REGEX = 
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    
    public static boolean validateEmail(String mail){
        
       Matcher matcher = VALID_EMAIL_REGEX.matcher(mail);
       return matcher.find();
        
    }
    
    public void checkData(){
        
        
        if(validateEmail(this.getEmail()) == false){
            heading = "Email Invalid Format";
            body = "Email Missing '@' Symbol";
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_WARN, heading, body);
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        }
//        if(){
//            
//        }
//        if(){
//            
//        }
//        if(){
//            
//        }
//        if(){
//            
//        }
//        if(){
//            
//        }
//        if(){
//            
//        }
//        if(){
//            
//        }
//        if(){
//            
//        }
//        if(){
//            
//        }

        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, heading, body);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        
    }
    
    public void checkLogin(){
        
        
        
    }
    
    public void saveUser() throws SQLException{
     
        Statement save;
        
        DBConnect con = new DBConnect();
        
        Connection conn = con.connect();
        
        save = conn.createStatement();
        
        String sql = "";
        
        save.execute(sql);
        
    }
    
    public void logUser(){
        
        
        
    }
    
}
