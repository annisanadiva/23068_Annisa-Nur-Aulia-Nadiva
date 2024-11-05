/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan8;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author annis
 */
public class TokoSerbaAda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // judul program
        System.out.println("TOKO SERBA ADA");
        System.out.println("*********************");
        
        // daftar barang yang tersedia di toko (kode barang, nama barang, harga)
        String[][] barang = {
            {"a001", "Buku", "3000"},
            {"a002", "Pensil", "4000"},
            {"a003", "Pulpen", "5000"},
        };
        
        // inputan jumlah item yang ingin dibeli
        System.out.print("Masukkan item barang: ");
        int jumlahItem = scanner.nextInt();
        scanner.nextLine();  // mengkonsumsi newline

        // membuat arrayList untuk menyimpan data barang yang dibeli
        ArrayList<Barang> keranjang = new ArrayList<>();

        // loop untuk meminta data barang sebanyak jumlah item yang diinput
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("\nData ke-" + (i + 1));

            // inputan kode barang
            System.out.print("Masukkan kode: ");
            String kodeBarang = scanner.nextLine();

            // untuk mengecek apakah kode barang valid dan ambil nama serta harga barang
            String namaBarang = "";
            int hargaBarang = 0;
            boolean found = false;
            for (String[] b : barang) {
                if (b[0].equals(kodeBarang)) {
                    namaBarang = b[1];
                    hargaBarang = Integer.parseInt(b[2]);
                    found = true;
                    break;
                }
            }

            // menampilkan pesan kesalahan jika kode barang tidak ada
            if (!found) {
                System.out.println("Kode barang tidak valid! Silakan coba lagi.");
                i--; // Ulang input barang
                continue;
            }

            // inputan jumlah yang dibeli
            System.out.print("Masukkan jumlah beli: ");
            int jumlahBeli = scanner.nextInt();
            scanner.nextLine(); // Mengkonsumsi newline

            // menambahkan barang yang dibeli ke keranjang untuk selanjutnya discan oleh program
            keranjang.add(new Barang(kodeBarang, namaBarang, hargaBarang, jumlahBeli));
        }

        // program scan harga dimulai
        System.out.println("\n\nTOKO SERBA ADA");
        System.out.println("*********************");
        int totalKeseluruhan = 0;

        // menambahkan header dengan no, kode, nama, harga, jumlah beli, dan jumlah bayar
        System.out.printf("%-4s %-12s %-12s %-6s %-12s %-12s%n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("================================================================");

        // menggunakan loop dengan indeks untuk menampilkan nomor urut barang
        for (int i = 0; i < keranjang.size(); i++) {
            Barang b = keranjang.get(i);
            int totalBayar = b.getTotalBayar();
            totalKeseluruhan += totalBayar;

            // menampilkan detail setiap barang dengan no, kode, nama, harga, jumlah beli, dan jumlah bayar
            System.out.printf("%-4d %-12s %-12s %-11d %-12d %-12d%n", 
                (i + 1), b.kode, b.nama, b.harga, b.jumlahBeli, totalBayar);
        }

        // output total keseluruhan belanja
        System.out.println("================================================================");
        System.out.printf("%-50s %-15d%n", "Total Belanja:", totalKeseluruhan);
        System.out.println("================================================================");
    }
}