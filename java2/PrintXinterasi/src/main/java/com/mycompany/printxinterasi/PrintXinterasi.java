/* NIM      : 13020210226
Nama        : Putri Adelia A
Hari/Tgl    : Minggu, 26 Maret 2023
Waktu       : 10.15 AM */

package com.mycompany.printxinterasi;

import java.util.Scanner;

/**
 *
 * @author Putri
 */
public class PrintXinterasi {
    
    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int Sum=0;
        int x;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt(); /* First Elmt */
        if (x == 999){
            System.out.print ("Kasus kosong \n");
        }else{          /* MInimal ada satu data yang dijumlahkan*/
            Sum = x;    /* Inisialisasi; invariant !! */
            for (;;){
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */
                if(x==999)
                    break;
                else{
                    Sum = Sum + x; /* Proses */
                }
            }
        }

        System.out.println("Hasil penjumlahan = "+ Sum);
        /* Terminasi */

    }
}
