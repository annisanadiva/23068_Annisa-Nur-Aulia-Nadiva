/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan3;

/**
 *
 * @author annis
 */
public class KonversiSuhu2 extends KonversiSuhu {
    
    // Membuat method untuk mengkonversi fahrenheit ke reamur
    public double fahrenheitToReamur(double fahrenheit) {
        // Pertama konversi fahrenheit ke celcius, kemudian celcius ke reamur
        double celcius = (fahrenheit - 32) * 5 / 9;
        return celciusToReamur(celcius);
    }
    
}
