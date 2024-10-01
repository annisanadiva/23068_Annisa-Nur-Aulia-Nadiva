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
public class IndeksMassaTubuh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Membuat objek baru Scaanner untuk menerima input pengguna
        Scanner input = new Scanner(System.in);

        // Inputan berat dan tinggi badan
        System.out.print("Berat Badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Tinggi Badan (m): ");
        double tinggiBadan = input.nextDouble();

        // Menghitung IMT dengan rumus
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        // Menentukan kriteria berdasarkan IMT
        String kriteria;
        if (imt <= 18.4) {
            kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        // Hasil output IMT dan kriteria
        System.out.println("\nIndeks Massa Tubuh (IMT): " + imt);
        System.out.println("Kriteria: " + kriteria);

    }
    
}
