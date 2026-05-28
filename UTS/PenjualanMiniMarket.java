/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PenjualanMiniMarket {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input jumlah produk
        System.out.print("Masukkan jumlah jenis produk: ");
        int jumlahProduk = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        // Array 1D untuk menyimpan nama produk
        String[] namaProduk = new String[jumlahProduk];
        
        // Array 2D: baris = produk, kolom = penjualan selama 7 hari
        int[][] dataPenjualan = new int[jumlahProduk][7];

        // 1. Proses Input Data (Nama Produk dan Penjualan 7 Hari)
        for (int i = 0; i < jumlahProduk; i++) {
            System.out.print("\nMasukkan nama produk ke-" + (i + 1) + ": ");
            namaProduk[i] = input.nextLine();

            System.out.println("Masukkan penjualan " + namaProduk[i] + " untuk 7 hari:");
            for (int j = 0; j < 7; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = input.nextInt();
            }
            input.nextLine(); // Membersihkan buffer setelah input angka
        }

        // 2. Proses Menampilkan Tabel dan Menghitung Total
        System.out.println("\n============================================================================= ");
        System.out.printf("%-15s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-6s\n", 
                "Nama Produk", "H1", "H2", "H3", "H4", "H5", "H6", "H7", "Total");
        System.out.println("============================================================================= ");

        int produkTertinggiIdx = 0;
        int penjualanTertinggi = -1;

        for (int i = 0; i < jumlahProduk; i++) {
            System.out.printf("%-15s | ", namaProduk[i]);
            
            int totalPenjualanProduk = 0;
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-3d | ", dataPenjualan[i][j]);
                totalPenjualanProduk += dataPenjualan[i][j];
            }
            
            // Cetak total penjualan di ujung baris tabel
            System.out.printf("%-6d\n", totalPenjualanProduk);

            // 3. Logika Mencari Penjualan Tertinggi
            if (totalPenjualanProduk > penjualanTertinggi) {
                penjualanTertinggi = totalPenjualanProduk;
                produkTertinggiIdx = i;
            }
        }
        System.out.println("============================================================================= ");

        // 4. Menampilkan Produk dengan Penjualan Tertinggi
        System.out.println("\n[KESIMPULAN DATA]");
        System.out.println("Produk dengan penjualan tertinggi adalah: " + namaProduk[produkTertinggiIdx]);
        System.out.println("Dengan total penjualan sebanyak: " + penjualanTertinggi + " item.");
        
        input.close();
    }
}
