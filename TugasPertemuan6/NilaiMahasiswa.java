/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan6;
// Mengimpor class Scanner untuk menerima input dari pengguna
import java.util.Scanner;

/**
 *
 * @author annis
 */
public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Membuat objek baru Scaanner untuk menerima input pengguna
        Scanner input = new Scanner(System.in);

        // Inputan data mahasiswa
        System.out.print("NPM: ");
        String npm = input.nextLine();
        
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();

        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // Menghitung nilai akhir berdasarkan presentasi dari tugas, dll
        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);

        // Mendeklarasi variabel grade dan keterangan
        String grade;
        String keterangan;

        // Menentukan kriteria grade dan keterangannya
        if (nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "Kurang Sekali";
        } else if (nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "Kurang";
        } else if (nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "Cukup";
        } else if (nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "Baik";
        } else {
            grade = "A";
            keterangan = "Istimewa";
        }

        // Hasil output data mahasiswa dan hasil nilai akhir
        System.out.println("\nNPM Mahasiswa: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    
    }
}
