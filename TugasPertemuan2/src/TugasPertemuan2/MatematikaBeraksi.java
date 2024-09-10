/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author annis
 */
public class MatematikaBeraksi {

    // mendefinisikan fungsi main
    public static void main(String[] args) {
        // Mendeklarasikan objek Matematika bernama mtk
        Matematika mtk = new Matematika();

        // Mengeksekusi method dan menampilkan hasil pertambahan
        int hasilTambah = mtk.tambah(20, 10);
        System.out.println("Pertambahan : 20 + 10 = " + hasilTambah);

        // Mengeksekusi method dan menampilkan hasil pengurangan
        int hasilKurang = mtk.kurang(10, 5);
        System.out.println("Pengurangan : 10 - 5 = " + hasilKurang);

        // Mengeksekusi method dan menampilkan hasil perkalian
        int hasilKali = mtk.kali(10, 3);
        System.out.println("Perkalian : 10 * 3 = " + hasilKali);

        // Mengeksekusi method dan menampilkan hasil pembagian
        int hasilBagi = mtk.bagi(21, 2);
        System.out.println("Pembagian : 21 / 2 = " + hasilBagi);
    }
    
}