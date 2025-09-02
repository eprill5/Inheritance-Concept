// Tabung.java
public class Tabung extends Lingkaran { // Baris 1
    private double tinggi; // Baris 2: Pastikan tidak ada karakter aneh di sini

    public Tabung(double jariJari, double tinggi) { // Baris 5 (kemungkinan error menunjuk kesini)
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungLuasLingkaranDasar() {
        return super.hitungLuas();
    }

    public double hitungVolume() {
        return hitungLuasLingkaranDasar() * tinggi;
    }

    @Override
    public void info() {
        System.out.println("\nTabung");
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Luas Lingkaran Dasar: " + hitungLuasLingkaranDasar());
        System.out.println("Volume : " + hitungVolume());
    }
}