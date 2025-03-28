public class Dosen18 {

    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    // Konstruktor
    public Dosen18(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    // Method untuk menampilkan informasi dosen
    public void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
        System.out.println("----------------------");
    }
}
