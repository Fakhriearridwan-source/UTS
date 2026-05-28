/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author FUCKRI
 */
public class AntrianResto {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> antreanRestoran = new LinkedList<>();

        System.out.println("=== SIMULASI ANTREAN RESTORAN DINAMIS ===");
        
        // Input jumlah orang yang mengantre
        System.out.print("Masukkan jumlah pelanggan yang ingin mengantre: ");
        int jumlahAntrean = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        // a. Proses Input Data Pelanggan dan Pesanan (Enqueue)
        System.out.println("\n--- (a) Memasukkan Pelanggan ke Antrean (Enqueue) ---");
        for (int i = 0; i < jumlahAntrean; i++) {
            System.out.println("\nPelanggan ke-" + (i + 1));
            System.out.print("  Nama pelanggan : ");
            String nama = input.nextLine();
            System.out.print("  Detail pesanan : ");
            String pesanan = input.nextLine();
            
            // Menggabungkan data menjadi satu string dan dimasukkan ke queue
            antreanRestoran.add("Pelanggan: " + nama + " (" + pesanan + ")");
            System.out.println("-> [BERHASIL] " + nama + " masuk ke antrean.");
        }

        // b. Menampilkan daftar antrean saat ini
        System.out.println("\n--- (b) Daftar Seluruh Antrean Saat Ini ---");
        if (antreanRestoran.isEmpty()) {
            System.out.println("Antrean kosong.");
        } else {
            // Kita gunakan perulangan untuk mencetak antrean ke bawah agar rapi
            int nomor = 1;
            for (String antrean : antreanRestoran) {
                System.out.println(nomor + ". " + antrean);
                nomor++;
            }
        }

        // c. Memproses pesanan pertama (Dequeue)
        System.out.println("\n--- (c) Memproses Pesanan Terdepan (Dequeue) ---");
        if (!antreanRestoran.isEmpty()) {
            String diproses = antreanRestoran.poll(); // Mengambil & menghapus elemen terdepan
            System.out.println("[DISELESAIKAN] Sedang memproses -> " + diproses);
        } else {
            System.out.println("Antrean kosong, tidak ada pesanan untuk diproses.");
        }

        // d. Menampilkan antrean setelah proses pelayanan
        System.out.println("\n--- (d) Daftar Antrean Tersisa Setelah Pelayanan ---");
        if (antreanRestoran.isEmpty()) {
            System.out.println("Semua antrean sudah selesai diproses (Kosong).");
        } else {
            int nomor = 1;
            for (String antrean : antreanRestoran) {
                System.out.println(nomor + ". " + antrean);
                nomor++;
            }
        }

        input.close();
    }
  
}
