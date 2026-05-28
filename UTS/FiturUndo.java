/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Stack;

/**
 *
 * @author FUCKRI
 */
public class FiturUndo {
    public static void main(String[] args) {
        // Inisialisasi struktur data Stack untuk menampung riwayat aksi (String)
        Stack<String> riwayatAksi = new Stack<>();

        System.out.println("=== SIMULASI FITUR UNDO DENGAN STACK ===");

        // a. Menggunakan proses PUSH (Menyimpan minimal 5 aksi pengguna)
        System.out.println("\n--- Pengguna melakukan beberapa aksi ---");
        
        System.out.println("-> Push: Mengetik teks 'Halo'");
        riwayatAksi.push("Mengetik teks 'Halo'");
        
        System.out.println("-> Push: Menghapus teks satu kata");
        riwayatAksi.push("Menghapus teks satu kata");
        
        System.out.println("-> Push: Mengganti warna font menjadi Merah");
        riwayatAksi.push("Mengganti warna font menjadi Merah");
        
        System.out.println("-> Push: Menambahkan objek Gambar");
        riwayatAksi.push("Menambahkan objek Gambar");
        
        System.out.println("-> Push: Mengubah ukuran kertas ke A4");
        riwayatAksi.push("Mengubah ukuran kertas ke A4");

        // Menampilkan kondisi stack saat ini
        System.out.println("\nIsi Stack Riwayat Aksi saat ini (Bawah ke Atas):");
        System.out.println(riwayatAksi);

        // b. Menggunakan proses POP (Simulasi Undo aksi terakhir)
        System.out.println("\n--- Pengguna menekan tombol UNDO (Ctrl + Z) ---");
        if (!riwayatAksi.isEmpty()) {
            String aksiDibatalkan = riwayatAksi.pop(); // Mengambil dan menghapus elemen teratas
            System.out.println("[UNDO BERHASIL] Aksi yang dibatalkan: " + aksiDibatalkan);
        }

        System.out.println("\n--- Pengguna menekan tombol UNDO lagi ---");
        if (!riwayatAksi.isEmpty()) {
            String aksiDibatalkan = riwayatAksi.pop();
            System.out.println("[UNDO BERHASIL] Aksi yang dibatalkan: " + aksiDibatalkan);
        }

        // Menampilkan kondisi akhir stack setelah dilakukan undo
        System.out.println("\nIsi Stack Riwayat Aksi Terakhir:");
        System.out.println(riwayatAksi);
    }
}
