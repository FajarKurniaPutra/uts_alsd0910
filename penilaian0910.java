public class penilaian0910 {
    mahasiswa0910 Mahasiswa;
    matakuliah0910 MataKuliah;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    public penilaian0910 (mahasiswa0910 mahasiswa, matakuliah0910 mataKuliah, double tugas, double uts, double uas) {
        this.Mahasiswa = mahasiswa;
        this.MataKuliah = mataKuliah;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }

    public double hitungNilaiAkhir() {
        nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        return nilaiAkhir;
    }

    public void tampilkanData() {
        System.out.println(Mahasiswa.nama + " | " + MataKuliah.namaMK + " | Nilai Akhir: " + hitungNilaiAkhir());
    }
}
