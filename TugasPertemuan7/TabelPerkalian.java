/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan7;
import java.util.Scanner; // menerapkan import scanner untuk memasukkan nilai inputan
/**
 *
 * @author annis
 */
public class TabelPerkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek scanner untuk membaca input pengguna
        Scanner ukTabel = new Scanner(System.in);

        // Mencetak teks untuk pengguna memasukkan input
        System.out.print("Masukkan ukuran tabel perkalian (<=10): ");
        // Mendeklarasikan variabel n sebagai inputan pengguna
        int n = ukTabel.nextInt();
        
        // Memberi batasan agar nilai n tidak lebih dari atau sama dengan 10
        if (n <= 10) {
            // Penerapan perulangan pertama untuk setiap baris tabel perkalian
            for (int i = 1; i <= n; i++) {
                // Penerapan perulangan kedua untuk setiap kolom tabel perkalian
                for (int j = 1; j <= n; j++) {
                    // Mencetak perkalian antara kolom dan baris
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        // Jika nilai n lebih besar dari 10
        } else {
            // Maka, pesan peringatan akan ditampilkan
            System.out.print("Ukuran tabel perkalian harus lebih kecil dari atau sama dengan 10");
        }   
    } 
    
}
