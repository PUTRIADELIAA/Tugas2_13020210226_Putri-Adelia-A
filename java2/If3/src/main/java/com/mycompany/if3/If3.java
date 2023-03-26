/* NIM      : 13020210226
Nama        : Putri Adelia A
Hari/Tgl    : Sabtu, 25 Maret 2023
Waktu       : 11.21 PM */

package com.mycompany.if3;

import java.util.Scanner;

/**
 *
 * @author Putri
 */
public class If3 {
    
    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan=new Scanner(System.in);
        /* Program */

        System.out.print ("Contoh IF tiga kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :");
        a=masukan.nextInt();
        if (a > 0){
            System.out.println ("Nilai a positif "+ a);
        }else if (a == 0){
            System.out.println ("Nilai Nol "+ a);
        }else /* a > 0 */ {
            System.out.println ("Nilai a negatif "+ a);
        }

    }
}
