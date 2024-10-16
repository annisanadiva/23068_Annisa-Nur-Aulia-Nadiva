/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan7;
import java.util.Scanner;
/**
 *
 * @author annis
 */
public class LaguAnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Mendeklarasikan variabel d sebagai jumlah anak ayam dengan nilai 10 
       int d = 10;
        
       // Menerapkan perulangan while selama nilai d lebih besar dari 1
        while(d > 1){
            // Mencetak teks jumlah anak ayam sesuai nilai d
            System.out.print("Tek kotek kotek kotek anak ayam turun " + d);
            // Mengurangi nilai d sebanyak 1 sebagi tanda anak ayam mati
            d--;
            // Mencetak teks jumlah anak ayam setelah nilai d dikurangi (setelah anak ayam mati 1)
            System.out.println(", tek kotek kotek kotek mati satu tinggal " + d);
        }
            // Teks yang dikeluarkan setelah nilai d mencapai 1
            System.out.print("Tek kotek kotek kotek nak ayam turun " + d);
            System.out.println(", tek kotek kotek kotek mati satu tinggal induknya");
    }
    
}
