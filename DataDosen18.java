public class DataDosen18 {
    
    Dosen18[] dataDosen = new Dosen18[10];
    int idx = 0;

    // Method untuk menambahkan data dosen
    public void tambah(Dosen18 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    // Method untuk menampilkan semua data dosen
    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

     // **Pencarian Sequential berdasarkan Nama**
     public void pencarianDataSequential(String nama) {
        boolean ditemukan = false;
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                ditemukan = true;
                count++;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama yang sama!");
        }
    }

    // **Sorting ASCENDING untuk Binary Search (Usia Muda ke Tua)**
    public void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen18 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    // **Pencarian Binary berdasarkan Usia**
    public void pencarianDataBinary(int usia) {
        SortingASC(); // Pastikan data sudah terurut sebelum melakukan binary search
        int left = 0, right = idx - 1;
        boolean ditemukan = false;
        int count = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosen[mid].usia == usia) {
                ditemukan = true;
                for (int i = mid; i >= 0 && dataDosen[i].usia == usia; i--) {
                    dataDosen[i].tampil();
                    count++;
                }
                for (int i = mid + 1; i < idx && dataDosen[i].usia == usia; i++) {
                    dataDosen[i].tampil();
                    count++;
                }
                break;
            } else if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia yang sama!");
        }
    }
}
