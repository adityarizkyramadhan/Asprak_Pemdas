package com.programku;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //semua kode ditaruh sini kalau mau di run
	    //Materi input & output

        //input
        Scanner scanner = new Scanner(System.in);
//        String namaku = scanner.nextLine();


        //angka
        int angkaBulat = scanner.nextInt(); // ini 70
        int angkaBulatDua = scanner.nextInt(); // ini 90
        int jumlah = angkaBulat+angkaBulatDua; // 70 + 90
        System.out.println("Angka penjumlahan : " + jumlah);

        //output
//        System.out.println("Nama Saya : " + namaku);
    }
}