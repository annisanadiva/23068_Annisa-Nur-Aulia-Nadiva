/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4;

/**
 *
 * @author annis
 */
// Membuat class Balok yang merupakan turunan dari BangunRuang
public class Balok extends BangunRuang {
    
    private double p; // Variabel p untuk panjang
    private double l; // Variabel l untuk lebar
    private double t; // Variabel t untuk tinggi

    // Mendeklarasikan konstructor untuk inisialisasi
    protected Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    // Menggunakan overriding method volume untuk menghitung volume balok
    protected double volume() {
        return p * l * t;
    }
    
    // Menggunakan overriding method luasPermukaan untuk menghitung luas permukaan balok
    protected double luasPermukaan() {
        return 2 * (p * l + p * t + l * t);
    }
    
}