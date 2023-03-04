/**
 * File      : OperasiTitik.java		04/03/23
 * Penulis   : Sulthan Firmansyah
 * Deskripsi : Kelas OperasiTitik yang berisi operasi-operasi pada suatu objek Titik
 * 
 */

public class OperasiTitik {
    private void refleksiSumbuX(Titik titik) {
        titik.setOrdinat(-titik.getOrdinat());
    }

    private void refleksiSumbuY(Titik titik) {
        titik.setAbsis(-titik.getAbsis());
    }

    public Titik refleksiX(Titik t) {
        Titik titikRefleksi = new Titik(t.getAbsis(), t.getOrdinat());
        refleksiSumbuX(titikRefleksi);
        return titikRefleksi;
    }

    public Titik refleksiY(Titik t) {
        Titik titikRefleksi = new Titik(t.getAbsis(), t.getOrdinat());
        refleksiSumbuY(titikRefleksi);
        return titikRefleksi;
    }
}
