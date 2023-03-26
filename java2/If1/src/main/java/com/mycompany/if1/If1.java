/* NIM      : 13020210226
Nama        : Putri Adelia A
Hari/Tgl    : Sabtu, 25 Maret 2023
Waktu       : 10.59 PM */

package com.mycompany.if1;

import java.util.Scanner;

/**
 *
 * @author Putri
 */
public class If1 {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        Scanner masukan=new Scanner(System.in);
        int a;
        /* Program */

        System.out.print ("Contoh IF satu kasus \n");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if (a >= 0)
        System.out.print ("\nNilai a positif "+ a);
    
    }
    
}
