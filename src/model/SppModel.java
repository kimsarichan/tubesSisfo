/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sari
 */
public class SppModel {
    private String no_bayar, NIS, bulan ;
    private int Iuran;
    private Date tgl_pembayaran;
    private Database db;
    private ResultSet rs;
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


    public int getIuran() {
        return Iuran;
    }

    public void setIuran(int  Iuran) {
        this.Iuran = Iuran;
    }

    public Date getTgl_pembayaran() {
        return tgl_pembayaran;
    }

    public void setTgl_pembayaran(Date tgl_pembayaran) {
        this.tgl_pembayaran = tgl_pembayaran;
    }
    
    public void saveData(){
        String query;
        ResultSet rs = null;
        try {

            query = "insert into SPP"
                    + "(NIS, tgl_pembayaran, iuran)"
                    + "values ('" + this.NIS + "'," + "'" + (java.sql.Date) this.tgl_pembayaran + ",'" + this.Iuran +"')";

            db.query(query);
            rs.close();
        } catch (Exception e) {

        }
    }
    public void loadData_bayaranSiswa(int nomor){
         try {
            String query = "select * from SPP where No_pembayaran =" + nomor;
            rs = db.getData(query);
            while (rs.next()) {
               this.bulan=rs.getString("Bulan");
               this.tgl_pembayaran=rs.getDate("Tgl_pembayaran");
               this.Iuran=rs.getInt(Iuran);
            }

            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SiswaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteData(int nomor){
      String query;
        query = "delete from spp where No_pembayaran =" + nomor;
        db.query(query);
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(KelasModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
}
