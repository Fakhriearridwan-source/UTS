/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author ASUS
 */
public class DenahKursiKelas {
     // Fungsi untuk menampilkan denah kursi ke layar
    public static void tampilkanDenah(int[][] denah) {
        for (int i = 0; i < denah.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < denah[i].length; j++) {
                System.out.print(denah[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    // Fungsi untuk menghitung dan menampilkan jumlah kursi kosong & terisi
    public static void hitungKursi(int[][] denah) {
        int kosong = 0;
        int terisi = 0;

        for (int i = 0; i < denah.length; i++) {
            for (int j = 0; j < denah[i].length; j++) {
                if (denah[i][j] == 0) {
                    kosong++;
                } else if (denah[i][j] == 1) {
                    terisi++;
                }
            }
        }
        System.out.println("Jumlah kursi KOSONG (0): " + kosong);
        System.out.println("Jumlah kursi TERISI (1): " + terisi);
    }

    public static void main(String[] args) {
        // Membuat array 2 dimensi ukuran 5x5 (default isinya semua 0)
        int[][] kursi = new int[5][5];

        System.out.println("=== DENAH KURSI AWAL ===");
        tampilkanDenah(kursi);
        hitungKursi(kursi);
        System.out.println("---------------------------------");

        // Simulasi mengisi beberapa kursi sesuai ketentuan soal (b)
        // Ingat indeks array di Java dimulai dari 0 sampai 4
        kursi[0][2] = 1; // Baris 1, Kolom 3
        kursi[1][4] = 1; // Baris 2, Kolom 5
        kursi[3][1] = 1; // Baris 4, Kolom 2
        kursi[4][4] = 1; // Baris 5, Kolom 5

        System.out.println("\n=== DENAH KURSI SESUDAH DIISI ===");
        tampilkanDenah(kursi);
        hitungKursi(kursi);
        System.out.println("---------------------------------");
    }
}
