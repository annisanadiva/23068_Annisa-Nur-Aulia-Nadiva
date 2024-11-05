/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan8;

/**
 *
 * @author annis
 */
// membuat kelas untuk menyimpan informasi barang yang dibeli
public class Barang { 
    String kode;
    String nama;
    int harga;
    int jumlahBeli;
    
    // membuat konstruktor untuk menginisialisasi objek barang
    Barang(String kode, String nama, int harga, int jumlahBeli) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }
    
    // method untuk menghitung jumlah beli per barang
    int getTotalBayar() {
        return harga * jumlahBeli;
    }
}
