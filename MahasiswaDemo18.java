import java.util.Scanner;

public class MahasiswaDemo18 {
    
    public static void main(String[] args) {
        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18();
        Scanner sc = new Scanner(System.in);

        // Meminta input jumlah mahasiswa
        int jumlahMahasiswa = 5;
        sc.nextLine(); // Membersihkan buffer

        //MahasiswaBerprestasi list = new MahasiswaBerprestasi(jumlahMahasiswa);

        // Memasukkan data mahasiswa secara dinamis
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Membersihkan buffer setelah nextDouble()

            Mahasiswa18 mhs = new Mahasiswa18(nim, nama, kelas, ipk);
            list.tambah(mhs); // Menambahkan objek mahasiswa ke dalam list

        }
        list.tampil();

            //Melakukan pencarian data sequental
            System.out.println("-----------------------------------------");
            System.out.println("Pencarian data");
            System.out.println("-----------------------------------------");
            System.out.println("Masukkan ipk mahasiswa yang dicari : ");
            System.out.print("IPK : ");
            double cari = sc.nextDouble();

            System.out.println("Menggunakan sequental searching");
            double posisi = list.sequentialSearching(cari);
            int pss = (int)posisi;
            list.tampilPosisi(cari, pss);
            list.tampilDataSearch(cari, pss);
    }
}

