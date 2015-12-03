/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;

/**
 *
 * @author sari
 */
public class DspModel {
   private String noPembayaran,NIS,Tagihan, total_pembayatan;
   Date tgl_pembayaran;
   private Database db;

    public DspModel(Database db) {
        this.db = db;
    }

    public String getNoPembayaran() {
        return noPembayaran;
    }

    public void setNoPembayaran(String noPembayaran) {
        this.noPembayaran = noPembayaran;
    }

    public String getNIS() {
        return NIS;
    }

    public void setNIS(String NIS) {
        this.NIS = NIS;
    }

    public String getTagihan() {
        return Tagihan;
    }

    public void setTagihan(String Tagihan) {
        this.Tagihan = Tagihan;
    }

    public String getTotal_pembayatan() {
        return total_pembayatan;
    }

    public void setTotal_pembayatan(String total_pembayatan) {
        this.total_pembayatan = total_pembayatan;
    }

    public Date getTgl_pembayaran() {
        return tgl_pembayaran;
    }

    public void setTgl_pembayaran(Date tgl_pembayaran) {
        this.tgl_pembayaran = tgl_pembayaran;
    }

    
    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }
    public void saveData(){
    }
    public void loadData(){
    }
    public void updateData(){
    }
    public void deleteData(){
    }
    
   
}
