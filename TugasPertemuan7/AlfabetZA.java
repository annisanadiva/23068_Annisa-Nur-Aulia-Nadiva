/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan7;

/**
 *
 * @author annis
 */
public class AlfabetZA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mendeklarasikan variabel alfabet dengan nilai awal alfabet z
        char alfabet = 'z';
        // Menerapkan perulangan do while
        do {
            //Mencetak nilai dari alfabet
            System.out.print(" " + alfabet);
            // Mengurangi nilai alfabet sebanyak 1 huruf sebelumnya dalam urutan alfabet
            alfabet--;
        // Mengulai perulangan terus menerus selama nilai alfabet lebih besar atau sama dengan alfabet a
        } while (alfabet >= 'a');
    }
    
}
