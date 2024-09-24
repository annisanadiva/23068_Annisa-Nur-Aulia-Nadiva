/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan4;

/**
 *
 * @author annis
 */
// Membuat class Kubus yang merupakan turunan dari BangunRuang
public class Kubus extends BangunRuang {
    
    private double s; // Variabel s untuk sisi

    // Mendeklarasikan konstructor untuk inisialisasi
    protected Kubus(double s) {
        this.s = s;
    }

    // Menggunakan overriding method volume untuk menghitung volume kubus
    protected double volume() {
        return s * s * s;
    }

    // Menggunakan overriding method luasPermukaan untuk menghitung luas permukaan kubus
    protected double luasPermukaan() {
        return 6 * (s * s);
    }
    
}