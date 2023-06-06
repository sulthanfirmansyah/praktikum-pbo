/**
 * File      : DiskonLambda.java	04/06/2023
 * Penulis	  : Sulthan Firmansyah - 24060121140108
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk mengitung diskon.
 *
 */

 interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        //dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        //dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "+diskonBiasa.hitungDiskon(45000));
    }
}