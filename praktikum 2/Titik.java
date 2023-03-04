/**
 * File      : Titik.java				04/03/23
 * Penulis   : Sulthan Firmansyah
 * Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat (setelah ditambahkan enkapsulasi)
 * 
 */

public class Titik {
	private double absis;
	private double ordinat;
	private static int counterTitik; //menghitung objek titik
	
	public Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	
	public Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	
	public void setAbsis(double a){
		absis = a;
	}
	
	public void setOrdinat(double o){
		ordinat = o;
	}
	
	public double getAbsis(){
		return absis;
	}
	
	public double getOrdinat(){
		return ordinat;
	}
	
	public static int getCounterTitik(){
		return counterTitik;
	}
}