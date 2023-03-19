/**
 * File      : MKubus.java		15/03/23
 * Penulis   : Sulthan Firmansyah / 24060121140108
 * Deskripsi : driver class untuk poligon dan kubus
 */

 package org.main;

 import org.bangundatar.BujurSangkar;
 import org.bangunruang.Kubus;
 
 public class MKubus {
    public static void main(String[] args){
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);

        System.out.println("Luas permukaan Kubus dengan panjang sisi 4 satuan : "+bujurSangkar.hitungLuas());
        System.out.println("Volume Kubus dengan panjang sisi 4 satuan: "+kubus.hitungVolume());
    }
     
 }
 