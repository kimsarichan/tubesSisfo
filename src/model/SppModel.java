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
public class SppModel {
    private String no_bayar, NIS, bulan, Total, Iuran;
    private Date tgl_pembayaran;
    private Database db;

    public SppModel(Database db) {
        this.db = db;
    }
    
    public String getNo_bayar() {
        return no_bayar;
    }

    public void setNo_bayar(String no_bayar) {
        this.no_bayar = no_bayar;
    }

    public String getNIS() {
        return NIS;
    }

    public void setNIS(String NIS) {
        this.NIS = NIS;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getIuran() {
        return Iuran;
    }

    public void setIuran(String Iuran) {
        this.Iuran = Iuran;
    }

    public Date getTgl_pembayaran() {
        return tgl_pembayaran;
    }

    public void setTgl_pembayaran(Date tgl_pembayaran) {
        this.tgl_pembayaran = tgl_pembayaran;
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
