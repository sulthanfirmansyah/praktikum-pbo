/**
 * File      : MPoligon2.java		08/03/23
 * Penulis   : Sulthan Firmansyah
 * Deskripsi : Driver class untuk poligon dan persegi panjang
 * 
 */

package org.main;

import org.bangundatar.*;

public class MPoligon2{
    public static void main(String[] args){
        Segitiga segitiga = new Segitiga(15, 20, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
        
    }
}