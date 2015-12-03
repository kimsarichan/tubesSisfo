/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.ResultSet;

/**
 *
 * @author sari
 */
public class AdminModel {
       private Database db;
       private ResultSet rs;
       private String nama , username , password;

    public AdminModel(Database db) {
        this.db = db;
    }
    
    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     public void saveData(){
            String query;
            try{
            query = "insert into admindb" 
                +"(Username, Password, Nama)"
                + "values ('"+username+"',"+ "'"+password+"',"+ "'"+nama+"')";
            
                db.query(query);
                rs.close();
            }catch(Exception e){
                
            }
        }
            
        public void loadData(){
            try{
                String query = "select * from admin";
                ResultSet rs= db.getData(query);
                while(rs.next()) {
                    this.username = rs.getString("Username");
                    this.password = rs.getString("Password");
                    this.nama = rs.getString("Nama");
                }
                
                rs.close();
            }catch(Exception e){}
        }
}
