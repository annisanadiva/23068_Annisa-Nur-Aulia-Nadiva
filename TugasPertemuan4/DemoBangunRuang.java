/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan4;

/**
 *
 * @author annis
 */
public class DemoBangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Membuat objek balok dan kubus beserta nilai dari panjang, lebar, tinggi, dan sisinya
        Balok balok = new Balok(6, 5, 4);
        Kubus kubus = new Kubus(5.5);
        
        // Mencetak volume dan luas permukaan balok
        System.out.println("Hasil Volume Balok Adalah: " + balok.volume());
        System.out.println("Hasil Luas Permukaan Balok Adalah: " + balok.luasPermukaan());

        //Mencetak volume dan luas permukaan kubus
        System.out.println("Hasil Volume Kubus Adalah: " + kubus.volume());
        System.out.println("Hasil Luas Permukaan Kubus Adalah: " + kubus.luasPermukaan());

    } 
    
}
