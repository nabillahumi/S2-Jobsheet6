import java.util.Scanner;

public class DosenDemo18 {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        DataDosen18 data = new DataDosen18();

        // **Tambahkan Data Dosen secara manual**
        System.out.print("Masukkan jumlah dosen yang ingin ditambahkan: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data dosen ke-" + (i + 1));
            System.out.print("Masukkan kode: ");
            String kode = sc.nextLine();
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jk = sc.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Masukkan usia: ");
            int usia = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            Dosen18 dsn = new Dosen18(kode, nama, jenisKelamin, usia);
            data.tambah(dsn);
        }

        // **Tampilkan Data Dosen**
        System.out.println("\nData Dosen Sebelum Sorting:");
        data.tampil();

        // **Pencarian Data Sequential berdasarkan Nama**
        System.out.print("\nMasukkan nama dosen yang ingin dicari: ");
        String namaCari = sc.nextLine();
        data.pencarianDataSequential(namaCari);

        // **Pencarian Data Binary berdasarkan Usia**
        System.out.print("\nMasukkan usia dosen yang ingin dicari: ");
        int usiaCari = sc.nextInt();
        data.pencarianDataBinary(usiaCari);
    }
}
