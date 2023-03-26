/* NIM      : 13020210226
Nama        : Putri Adelia A
Hari/Tgl    : Sabtu, 25 Maret 2023
Waktu       : 11.38 PM */

package com.mycompany.konstant;

import java.util.Scanner;

/**
 *
 * @author Putri
 */
public class Konstant {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
            final float PHI = 3.1415f;
            float r;
            Scanner masukan=new Scanner(System.in);
        /* program */ /* baca data */
            System.out.print ("Jari-jari lingkaran =");
            r = masukan.nextFloat();
        /* Hitung dan tulis hasil */
            System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n");
            System.out.print ("Akhir program \n");
            
    }
    
}
