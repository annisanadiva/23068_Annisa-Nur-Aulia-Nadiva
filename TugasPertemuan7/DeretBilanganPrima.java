/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan7;

/**
 *
 * @author annis
 */
public class DeretBilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mendeklarasikan variabel beserta nilainya
        int a = 0;
        int b = 20; // b adalah batasan angka
        
        // Menerapkan perulangan while dengan kondisi a kurang dari atau sama dengan b
        while (a <= b) {
            // Mendeklarasikan variabel boolean c dengan nilai awal false
            boolean c = false;
            // Menerapkan perulangan for untuk memeriksa faktor pembagi a
            for (int i = 2; i < a; i++) {
                // Jika a dibagi i = 0, berarti a memiliki faktor pembagi selain 1 dan dirinya
                if (a % i == 0) {
                    // Maka, menandakan a bukanlah bilangan prima. Sehingga nilai c berubah menjadi true
                    c = true;
                } 
            }
        
            // Jika nilai c tetap false, berarti a adalah bilangan prima
            if (c == false) {
                // Teks yang dikeluarkan jika a bilangan prima
                System.out.println(a + " adalah Bilangan Prima");
            } else {
                // Teks yang dikeluarkan jika a bukan bilangan prima
                System.out.println(a + " bukan Bilangan Prima");
            }
            // Menambah nilai a sebanyak 1 untuk lanjut ke angka berikutnya
            a++;
        }
    } 
    
}
