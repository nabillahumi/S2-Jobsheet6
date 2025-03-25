public class MahasiswaBerprestasi18 {
    
    Mahasiswa18 [] listMhs = new Mahasiswa18[5];
    int idx;

    // Konstruktor untuk menentukan jumlah mahasiswa secara dinamis
    MahasiswaBerprestasi18() {
        listMhs = new Mahasiswa18[5];
        idx = 0;
    }

    void tambah (Mahasiswa18 m) {
        if (idx < listMhs.length) {
            listMhs [idx] = m;
            idx++;
        } else{
            System.out.println("data sudah penuh");
        }
    }

    void  tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInfromasi();
            System.out.println("-------------------");
        }
    }

    // Method Sequential Searching
    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(double cari, int left, int righft) {
        int mid;
        if (righft >= left) {
            mid = (left + righft) /2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            }
            else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid-1);
            }
            else {
                return findBinarySearch(cari, mid + 1, righft);
            }
        }
        return -1;
    }

    // Method tampilPosisi untuk menampilkan hasil pencarian
    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    // Method tampilDataSearch untuk menampilkan detail data mahasiswa jika ditemukan
    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}

