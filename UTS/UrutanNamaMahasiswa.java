/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class UrutanNamaMahasiswa {
        // 1. Algoritma Bubble Sort
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        // Perulangan untuk mengontrol jumlah iterasi
        for (int i = 0; i < n - 1; i++) {
            // Perulangan untuk membandingkan elemen yang bersebelahan
            for (int j = 0; j < n - i - 1; j++) {
                // Jika nama di kiri lebih besar secara alfabet dibanding kanan
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                    // Proses Tukar Posisi (Swap)
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 2. Algoritma Selection Sort
    public static void selectionSort(String[] arr) {
        int n = arr.length;
        // Perulangan untuk menentukan batas elemen terkecil yang dicari
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i; // Mengasumsikan elemen saat ini adalah yang terkecil
            
            // Mencari elemen terkecil di sisa array
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareToIgnoreCase(arr[minIdx]) < 0) {
                    minIdx = j; // Update indeks jika ditemukan nama yang lebih awal alfabetnya
                }
            }
            // Tukar posisi elemen terkecil yang ditemukan dengan elemen di batas i
            String temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // 3. Algoritma Insertion Sort
    public static void insertionSort(String[] arr) {
        int n = arr.length;
        // Perulangan dimulai dari elemen kedua (indeks 1) hingga akhir
        for (int i = 1; i < n; i++) {
            String kunci = arr[i]; // Elemen yang akan disisipkan
            int j = i - 1;

            // Menggeser elemen-elemen yang lebih besar dari "kunci" ke kanan
            while (j >= 0 && arr[j].compareToIgnoreCase(kunci) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Menyisipkan elemen "kunci" ke posisi yang tepat
            arr[j + 1] = kunci;
        }
    }

    public static void main(String[] args) {
        // Data awal nama mahasiswa acak sesuai permintaan soal
        String[] mahasiswaAwal = {"Zulfa", "Ahmad", "Fakhrie", "Ankatsa", "Shinta"};

        System.out.println("=== ANALISIS ALGORITMA SORTING MAHASISWA ===");
        System.out.println("Data Awal Master : " + Arrays.toString(mahasiswaAwal));
        System.out.println("--------------------------------------------------\n");

        // Kloning array agar setiap algoritma menguji data acak yang sama adilnya
        String[] dataBubble = mahasiswaAwal.clone();
        String[] dataSelection = mahasiswaAwal.clone();
        String[] dataInsertion = mahasiswaAwal.clone();

        // Eksekusi dan Tampilkan Hasil Bubble Sort
        bubbleSort(dataBubble);
        System.out.println("[a] Hasil Bubble Sort    : " + Arrays.toString(dataBubble));

        // Eksekusi dan Tampilkan Hasil Selection Sort
        selectionSort(dataSelection);
        System.out.println("[b] Hasil Selection Sort : " + Arrays.toString(dataSelection));

        // Eksekusi dan Tampilkan Hasil Insertion Sort
        insertionSort(dataInsertion);
        System.out.println("[c] Hasil Insertion Sort : " + Arrays.toString(dataInsertion));
    }
}
