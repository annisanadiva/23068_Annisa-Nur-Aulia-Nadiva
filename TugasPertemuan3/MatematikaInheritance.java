/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author annis
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Mendeklarasikan objek dari kelas Matematika2
        Matematika2 mtk = new Matematika2();

        // Contoh nilai a dan b
        int a = 10;
        int b = 3;

        // Memanggil semua method dari kelas Matematika dan Matematika2
        System.out.println("Pertambahan: " + mtk.tambah(a, b));
        System.out.println("Pengurangan: " + mtk.kurang(a, b));
        System.out.println("Perkalian: " + mtk.kali(a, b));
        System.out.println("Pembagian: " + mtk.bagi(a, b));
        System.out.println("Modulus: " + mtk.modulus(a, b));
    }
    
}
