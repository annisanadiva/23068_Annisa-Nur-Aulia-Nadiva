/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author annis
 */
public class Bingo {
    private String[] hurufBingo;

    // Mendeklarasikan konstruktor untuk menginisialisasi huruf B-I-N-G-O
    public Bingo() {
        hurufBingo = new String[] { "B", "I", "N", "G", "O" };
    }

    // Mengeksekusi method untuk menampilkan lirik lengkap
    public void lirik() {
        // Bagian pertama dengan tidak ada clap
        verse(0);
        System.out.println();
        
        // Bagian berikutnya dengan clap bertambah
        for (int i = 1; i <= hurufBingo.length; i++) {
            verse(i);
            System.out.println();
        }
    }

    // Meengeksekusi method untuk menampilkan setiap bagian dengan sejumlah tepukan
    private void verse(int clap) {
        // Menampilkan bagian pertama dari lirik
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");

        // Menampilkan baris B-I-N-G-O dengan clap
        lirikBingo(clap);
        lirikBingo(clap);
        lirikBingo(clap);

        // Menampilkan bagian penutup
        System.out.println("And Bingo was his name-o.");
    }

    // Mengeksekusi method untuk menampilkan baris dengan huruf dan clap
    private void lirikBingo(int clap) {
        // Mendeklarasikan objek StringBuilder bernama line untuk menyimpan string secara efisien
        StringBuilder line = new StringBuilder();
        
        for (int i = 0; i < hurufBingo.length; i++) {
            if (i < clap) {
                line.append("(clap)-");
            } else {
                line.append(hurufBingo[i]).append("-");
            }
            // Penggunaan append di atas adalah untuk mrnambahkan clap atau huruf B-I-N-G-O ke dalam objek line
        }

        // Menghapus tanda hubung (-) terakhir
        System.out.println(line.substring(0, line.length() - 1));
    }

}
