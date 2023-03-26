/* NIM      : 13020210226
Nama        : Putri Adelia A
Hari/Tgl    : Minggu, 26 Maret 2023
Waktu       : 10.02 AM */

package com.mycompany.printwhile;

import java.util.Scanner;

/**
 *
 * @author Putri
 */
public class PrintWhile {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        /* Program */

        System.out.print ("Nilai N > 0 = "); /* Inisialisasi */
        N = masukan.nextInt();
        i = 1;  /* First Elmt */

        System.out.print ("Print i dengan WHILE: \n");
        while (i <= N)   /* Kondisi pengulangan */ {
            System.out.println (i);     /* Proses */
            i++;    /* Next Elmt */
        };          /* (i > N) */
        
    }
    
}
