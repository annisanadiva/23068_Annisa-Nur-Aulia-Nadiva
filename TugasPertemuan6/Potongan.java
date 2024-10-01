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
public class Potongan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Membuat objek baru Scaanner untuk menerima input pengguna
        Scanner input = new Scanner(System.in);

        // Inputan nominal total pembelian
        System.out.print("Total pembelian Rp.: ");
        double totalPembelian = input.nextDouble();

        // Mendeklarasikan variabel untuk menyimpan besarnya potongan
        double potongan;

        // Menentukan besarnya potongan harga
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05; // 5% potongan
        } else {
            potongan = totalPembelian * 0.20; // 20% potongan
        }

        // Menghitung jumlah yang harus dibayarkan
        double totalBayar = totalPembelian - potongan;

        // Hasil output yang menampilkan total asli, besaran potongan, dan total setelah dikurangi potongan
        System.out.println("\nTotal pembelian Rp.: " + totalPembelian);
        System.out.println("Besarnya potongan Rp.: " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp.: " + totalBayar);

    }
    
}
