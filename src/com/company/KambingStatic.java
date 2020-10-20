package com.company;

/**
 *
 * @author
 * NAMA         : Raihan Giffari
 * KELAS        : PBO12
 * NIM          : 10119008
 * Deskripsi Program    : Program ini berisi penambahan variabel string
 *
 */

public class KambingStatic{
    public  static final String Nama_Kambing = " MIDUN ";

    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(Nama_Kambing + " memiliki kambing sebanyak "
                + Mamalia.jumlahKambing);
    }
}
