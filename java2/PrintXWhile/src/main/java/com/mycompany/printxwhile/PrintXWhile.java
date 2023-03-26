/* NIM      : 13020210226
Nama        : Putri Adelia A
Hari/Tgl    : Minggu, 26 Maret 2023
Waktu       : 10.42 AM */

package com.mycompany.printxwhile;

import java.util.Scanner;

/**
 *
 * @author Putri
 */
public class PrintXWhile {
    
    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        Sum = 0;    /* Inisialisasi */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();      /* First Elmt*/
        while (x != 999)    /* Kondisi berhenti */ {
            Sum = Sum + x; /* Proses */
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
            x = masukan.nextInt();  /* First Elmt*/
        }
        System.out.println("Hasil penjumlahan = "+ Sum);    /*Terminasi */
        
    }
}
