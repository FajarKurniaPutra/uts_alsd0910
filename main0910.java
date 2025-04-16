import java.util.Scanner;

public class main0910 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        mahasiswa0910[] mhs = {
            new mahasiswa0910 ("22001", "Ali Rahman", "Informatika"),
            new mahasiswa0910 ("22002", "Budi Santoso", "Informatika"),
            new mahasiswa0910 ("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };

        matakuliah0910[] mk = {
            new matakuliah0910 ("MK001", "Struktur Data", 3),
            new matakuliah0910 ("MK002", "Basis Data", 3),
            new matakuliah0910 ("MK003", "Desain Web", 3)
        };

        penilaian0910[] nilai = {
            new penilaian0910 (mhs[0], mk[0], 80, 85, 90),
            new penilaian0910 (mhs[0], mk[1], 60, 75, 70),
            new penilaian0910 (mhs[1], mk[0], 75, 70, 80),
            new penilaian0910 (mhs[2], mk[1], 85, 90, 95),
            new penilaian0910 (mhs[2], mk[2], 80, 90, 65)
        };

        int pilih;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine(); 

            switch(pilih) {
                case 1 -> {
                    System.out.println("\nDaftar Mahasiswa:");
                    for (mahasiswa0910 m : mhs) m.tampilMahasiswa();
                }
                case 2 -> {
                    System.out.println("\nDaftar Mata Kuliah:");
                    for (matakuliah0910 mkul : mk) mkul.tampilMatakuliah();
                }
                case 3 -> {
                    System.out.println("\nData Penilaian:");
                    for (penilaian0910 n : nilai) n.tampilkanData();
                }
                    case 4 -> {
                        System.out.println("\nData Penilaian (Urut Nilai Akhir):");
                        penilaian0910[] sorted = pengelolaaan0910.urutkanPenilaianByNilaiAkhir(nilai);
                        for (penilaian0910 n : sorted) n.tampilkanData();
                }
                
                case 5 -> {
                    System.out.print("\nMasukkan NIM yang dicari: ");
                    String nimCari = input.nextLine();
                    mahasiswa0910 hasilCari = pengelolaaan0910.cariMahasiswaByNIM(mhs, nimCari);
                    if (hasilCari != null) {
                        System.out.print("Mahasiswa Ditemukan: ");
                        hasilCari.tampilMahasiswa();
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan!");
                    }
                }
                case 0 -> {
                    System.out.println("\nSekian demo dari kami. Terima kasih semua.");
                    System.out.println("Kami pamit. Have a nice day!");
                }
                default -> System.out.println("Pilihanmu tidak valid. Mohon input ulang!");
            }
        } while (pilih != 0);
    }
}
