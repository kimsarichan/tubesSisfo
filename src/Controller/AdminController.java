/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;
import model.AdminModel;
import model.Database;
/**
 *
 * @author sari
 */
public class AdminController {
    AdminModel admin;
    Database db;

    public AdminController(AdminModel admin) {
        this.admin = admin;
    }

    public AdminModel getAdmin() {
        return admin;
    }

    public void setAdmin(AdminModel admin) {
        this.admin = admin;
    }
    
    public boolean login(String username, String pass){
           admin.loadData();
           if(admin.getUsername()==username&admin.getPassword()==pass){
               return true;
           }
           else{
               return false;
           }
    }
}
