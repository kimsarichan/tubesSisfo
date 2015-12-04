/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sari
 */
public class SiswaModel {
    private String Nama, Kelas,Jurusan,NIS,WaliKelas;
    private int Angkatan;
    private Database db;
    private ResultSet rs;

    public SiswaModel(Database db) {
        this.db = db;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public int getAngkatan() {
        return Angkatan;
    }

    public void setAngkatan(int Angkatan) {
        this.Angkatan = Angkatan;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public String getNIS() {
        return NIS;
    }

    public void setNIS(String NIS) {
        this.NIS = NIS;
    }

    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }
     public void saveData(String nama, String waliKelas, String jurusan, String kelas,int angkatan,String nis ){
        String query;
        ResultSet rs = null;
        try {

            query = "insert into kelas"
                    + "(NIS, Nama, WaliKelas,Jurusan,Angkatan,Kelas)"
                    + "values ('" + nis + "'," + "'" + nama + "'," + "'" + waliKelas + ",'" + jurusan + ",'" + angkatan + ",'"+kelas+"')";

            db.query(query);
            rs.close();
        } catch (Exception e) {

        }
    }
    public void loadData(String NIS){
        try {
            String query = "select * from siswa where NIS =" + NIS;
            rs = db.getData(query);
            while (rs.next()) {
                this.NIS= rs.getString("NIS");
                this.Nama = rs.getString("Nama");
                this.WaliKelas = rs.getString("WaliKelas");
                this.Jurusan= rs.getString("Jurusan");
                this.Angkatan = rs.getInt("Angkatan");
                this.Kelas = rs.getString("Kelas");
            }

            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SiswaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void updateData(){
        
    }
    public void deleteData(){
    }
    
   
    
}
class semuaSiswa{
    
}
