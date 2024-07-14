package Model;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Janu
 */
public class Person {
    
    private String fname;
    private String lname;
    private String address;
    private String gender;
    private String dob;
    private String email;
    private String pwd;
    
    
    //Getters and setters
    
    public String getFname(){
        return fname;
    }
    
    public void setFname(String fname){
        this.fname =fname;
    }
    
       public String getLname(){
        return lname;
    }
    
    public void setLname(String lname){
        this.lname =lname;
    }
    public String getAddresse(){
        return address;
    }
    
    public void setAdrdress(String address){
        this.address =address;
    }
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender =gender;
    }
    public String getDob(){
        return dob;
    }
    
    public void setDob(String dob){
        this.dob =dob;
    }
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email =email;
    }   
    public String getPwd(){
        return pwd;
    }
    
    public void setPwd(String pwd){
        this.pwd =pwd;
    }
    
}
