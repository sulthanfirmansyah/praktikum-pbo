/**
* File		: LambdaHashmap.java 04/06/2023
* Penulis	: Sulthan Firmansyah - 24060121140108
* Deskripsi	: Implementasi lambda pada hash map
* Lab		: B1
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121130091", "Faiq");
        mahasiswaMap.put("24060121130083", "Fizi");
        mahasiswaMap.put( "24020222140079", "Ganar" );

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " +nim+ ", Nama: " +nama));
    }
}