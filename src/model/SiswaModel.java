/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author sari
 */
public class SiswaModel {
    private String Nama, Kelas, Angkatan,Jurusan,NIS;
    private Database db;

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

    public String getAngkatan() {
        return Angkatan;
    }

    public void setAngkatan(String Angkatan) {
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
    
    
   
    
}
