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
public class KelasModel {
    private String kelas,jumlahsiswa, walikelas;
    private Date tgl_pembayaran;

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
    public void saveData(){
    }
    public void loadData(){
    }
    public void updateData(){
    }
    public void deleteData(){
    }
    
}
