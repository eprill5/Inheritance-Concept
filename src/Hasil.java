public class Hasil {
    public static void main(String[] args) {
        // Buat objek Lingkaran
        Lingkaran lingkaran1 = new Lingkaran(5.0);
        lingkaran1.info();

        System.out.println(); // Untuk baris kosong di output

        // Buat objek Tabung
        Tabung tabung1 = new Tabung(3.0, 4.0);
        tabung1.info();
    }
}