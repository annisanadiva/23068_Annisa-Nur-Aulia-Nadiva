/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan7;

/**
 *
 * @author annis
 */
public class DeretBilanganGanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mendeklarasikan variabel-variabel serta nilainya
        int x = 0;
        int n = 20;
        int y; // Variabel y untuk menyimpan hasil modulus
        
        // Menerapkan perulangan for yang berjalan dari x hingga n
        for (x = 0; x <=n ; x++){
            // Menghitung modulus dari x dibagi dua untuk menentukan apakah x bilangan ganjil atau genap
            y = x % 2;
            // Jika hasil modulus x dibagi 2 adalah 1, maka x adalah bilangan ganjil
            if(y == 1){
                // Teks yang dikeluarkan jika x bilangan ganjil
                System.out.println(x + " adalah Bilangan Ganjil");
            // Jika hasil modulus x dibagi 2 bukan 1 (0), maka x adalah bilangan genap
            } else {
                // Teks yang dikeluarkan jika x bilangan genap
                System.out.println(x + " adalah Bilangan Genap");
            }
        }
    } 
    
}
