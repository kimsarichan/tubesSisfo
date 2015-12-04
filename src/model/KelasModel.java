/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sari
 */
public class KelasModel {

    private String kelas, jumlahsiswa, walikelas, jurusan;
    private int angkatan;
    private Date tgl_pembayaran;
    private Database db;
    private ResultSet rs;

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJumlahsiswa() {
        return jumlahsiswa;
    }

    public void setJumlahsiswa(String jumlahsiswa) {
        this.jumlahsiswa = jumlahsiswa;
    }

    public String getWalikelas() {
        return walikelas;
    }

    public void setWalikelas(String walikelas) {
        this.walikelas = walikelas;
    }

    public Date getTgl_pembayaran() {
        return tgl_pembayaran;
    }

    public void setTgl_pembayaran(Date tgl_pembayaran) {
        this.tgl_pembayaran = tgl_pembayaran;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public void saveData(String kelas, String jumlahsiswa, String walikelas, String jurusan, int angkatan) {
        String query;
        ResultSet rs = null;
        try {

            query = "insert into kelas"
                    + "(Kelas, JumlahSiswa, WaliKelas,Jurusan,Angkatan)"
                    + "values ('" + kelas + "'," + "'" + jumlahsiswa + "'," + "'" + walikelas + "'" + jurusan + "'" + angkatan + "')";

            db.query(query);
            rs.close();
        } catch (Exception e) {

        }
    }

    public void loadData(String kelas) {
        try {
            String query = "select * from kelas where kelas =" + kelas;
            rs = db.getData(query);
            while (rs.next()) {
                this.kelas = rs.getString("Kelas");
                this.jumlahsiswa = rs.getString("JumlahSiswa");
                this.walikelas = rs.getString("WaliKelas");
                this.jurusan = rs.getString("Jurusan");
                this.angkatan = rs.getInt("Angkatan");
            }

            rs.close();
        } catch (Exception e) {
        }

    }

    public void updateData(String kelas, String jumlahsiswa, String walikelas, String jurusan, String angkatan) {
        String query;
        query = "update kelas set Kelas=" + kelas + ", set JumlahSiswa =" + jumlahsiswa + ", set WaliKelas= " + walikelas + ", set Jurusan=" + jurusan + ", set angkatan=" + angkatan + " ";
        db.query(query);
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(KelasModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteData(String NIS) {
        String query;
        query = "delete from kelas where NIS =" + NIS;
        db.query(query);
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(KelasModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

class semuaKelas {

    ArrayList<KelasModel> k;
    Database db;
    ResultSet rs;

    public semuaKelas() {
        db= new Database();
    }
    
    public ArrayList<KelasModel> loadData() {
        ArrayList<KelasModel> k = new ArrayList();
        try {

            String query = "select * from kelas";
            rs = db.getData(query);
            int i = 0;
            while (rs.next()) {
                KelasModel kelas = new KelasModel();
                kelas.setKelas(rs.getString("Kelas"));
                kelas.setJumlahsiswa(rs.getString("JumlahSiswa"));
                kelas.setWalikelas(rs.getString("WaliKelas"));
                kelas.setJurusan(rs.getString("Jurusan"));
                kelas.setAngkatan(rs.getInt("Angkatan"));
                k.set(i, kelas);
                i++;
                k.set(i, kelas);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(semuaKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

    public ArrayList<KelasModel> loadDataJurusan(String jurusan) {
        ArrayList<KelasModel> k = new ArrayList();
        try {
            String query = "select * from kelas where jurusan=" + jurusan;
            rs= db.getData(query);
            int i = 0;
            while (rs.next()) {
                KelasModel kelas = new KelasModel();
                kelas.setKelas(rs.getString("Kelas"));
                kelas.setJumlahsiswa(rs.getString("JumlahSiswa"));
                kelas.setWalikelas(rs.getString("WaliKelas"));
                kelas.setJurusan(rs.getString("Jurusan"));
                kelas.setAngkatan(rs.getInt("Angkatan"));
                k.set(i, kelas);
                i++;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(semuaKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

    public ArrayList<KelasModel> loadDataAngkatan(int angkatan) {
        ArrayList<KelasModel> k = new ArrayList();
        try {
            String query = "select * from kelas where angkatan =" + angkatan;
            int i = 0;
            rs= db.getData(query);
            while (rs.next()) {
                KelasModel kelas = new KelasModel();
                kelas.setKelas(rs.getString("Kelas"));
                kelas.setJumlahsiswa(rs.getString("JumlahSiswa"));
                kelas.setWalikelas(rs.getString("WaliKelas"));
                kelas.setJurusan(rs.getString("Jurusan"));
                kelas.setAngkatan(rs.getInt("Angkatan"));
                k.set(i, kelas);
                i++;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(semuaKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

}
