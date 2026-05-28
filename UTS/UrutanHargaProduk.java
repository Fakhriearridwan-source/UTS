/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Scanner;

/**
 *
 * @author FUCKRI
 */
public class UrutanHargaProduk {
            // Fungsi untuk mengurutkan harga secara Ascending menggunakan Selection Sort
    public static void selectionSortAscending(int[] harga, String[] nama) {
        int n = harga.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i; // Mengasumsikan harga saat ini adalah yang TERMURAH

            // Mencari harga yang lebih kecil di sisa array
            for (int j = i + 1; j < n; j++) {
                // Perubahan di sini: Tanda '<' membuat pengurutan menjadi Ascending (Kecil ke Besar)
                if (harga[j] < harga[minIdx]) {
                    minIdx = j; // Update indeks jika ditemukan harga yang lebih murah
                }
            }

            // 1. Tukar posisi data harga
            int tempHarga = harga[minIdx];
            harga[minIdx] = harga[i];
            harga[i] = tempHarga;

            // 2. Tukar posisi data nama produk agar tetap sinkron/berpasangan
            String tempNama = nama[minIdx];
            nama[minIdx] = nama[i];
            nama[i] = tempNama;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PENGURUTAN HARGA TOKO ONLINE ===");
        System.out.print("Masukkan jumlah produk yang akan diinput: ");
        int jumlahProduk = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        String[] namaProduk = new String[jumlahProduk];
        int[] hargaProduk = new int[jumlahProduk];

        // Proses Input Data Produk
        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println("\nProduk ke-" + (i + 1));
            System.out.print("  Nama Produk : ");
            namaProduk[i] = input.nextLine();
            System.out.print("  Harga (Rp)  : ");
            hargaProduk[i] = input.nextInt();
            input.nextLine(); // Membersihkan buffer
        }

        // Tampilkan data sebelum diurutkan
        System.out.println("\n--- Data Produk Sebelum Diurutkan ---");
        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println("- " + namaProduk[i] + " : Rp " + hargaProduk[i]);
        }

        // Eksekusi pengurutan Ascending
        selectionSortAscending(hargaProduk, namaProduk);

        // Tampilkan data setelah diurutkan
        System.out.println("\n--- Hasil Pengurutan Harga Termurah ke Termahal (Ascending) ---");
        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println((i + 1) + ". " + namaProduk[i] + " (Rp " + hargaProduk[i] + ")");
        }

        input.close();
    }
}