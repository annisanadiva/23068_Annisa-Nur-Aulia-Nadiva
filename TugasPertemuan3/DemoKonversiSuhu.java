/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author annis
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Mendeklarasikan objek kelas KonversiSuhu dan KonversiSuhu2
        KonversiSuhu konversi1 = new KonversiSuhu();
        KonversiSuhu2 konversi2 = new KonversiSuhu2();

        // Nilai suhu yang akan dikonversi
        double suhuCelcius = 100;
        double suhuFahrenheit = 212;

        // Memanggil method dari class KonversiSuhu
        System.out.println("Celcius to Fahrenheit: " + konversi1.celciusToFahrenheit(suhuCelcius));
        System.out.println("Celcius to Reamur: " + konversi1.celciusToReamur(suhuCelcius));

        // Memanggil method dari class KonversiSuhu2
        System.out.println("Fahrenheit to Reamur: " + konversi2.fahrenheitToReamur(suhuFahrenheit));
    }
    
}