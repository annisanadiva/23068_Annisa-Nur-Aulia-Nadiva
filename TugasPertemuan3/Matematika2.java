/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author annis
 */
// Menggunakan import agar bisa mengakses method dan menginherit dari kelas sebelumnya yang berada di package lain
import TugasPertemuan2.*;

// Menginherit kelas utama Matematika dengan keyword extends
public class Matematika2 extends Matematika{
    
    // Method untuk menghitung modulus
    public int modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Pembagi tidak boleh 0.");
            return 0;
        }
        return a % b;
    }
    
}
