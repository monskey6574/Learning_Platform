/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lms.itresourses.Model;

/**
 *
 * @author Janu
 */
public class userdata {
    
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
