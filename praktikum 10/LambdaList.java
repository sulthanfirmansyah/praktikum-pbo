/**
 * File      : Lambdalist.java	04/06/2023
 * Penulis	 : Sulthan Firmansyah - 24060121140108
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai parameter pada method.
 *
 */

 import java.util.ArrayList;

 public class LambdaList {
     public static void main(String[] args) {
         ArrayList<String> mahasiswaList = new ArrayList<>();
         mahasiswaList.add("Faiq");
         mahasiswaList.add("Fizi");
         mahasiswaList.add("Ganar");
 
         //lambda digunakan sebagai parameter pada method
         mahasiswaList.forEach((nama) -> System.out.println(nama));
     }
 }