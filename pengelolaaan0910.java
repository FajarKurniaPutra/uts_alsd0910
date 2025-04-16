public class pengelolaaan0910 {
    public static mahasiswa0910 cariMahasiswaByNIM(mahasiswa0910[] daftarMahasiswa, String nim) {
        for (mahasiswa0910 m : daftarMahasiswa) {
            if (m.nim.equalsIgnoreCase(nim)) {
                return m;
            }
        }
        return null;
    }

    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static penilaian0910[] urutkanPenilaianByNilaiAkhir(penilaian0910[] daftarNilai) {
        penilaian0910[] hasil = new penilaian0910[daftarNilai.length];
    
        for (int i = 0; i < daftarNilai.length; i++) {
            hasil[i] = daftarNilai[i];
        }
    
        for (int i = 0; i < hasil.length - 1; i++) {
            for (int j = i + 1; j < hasil.length; j++) {
                if (hasil[i].hitungNilaiAkhir() < hasil[j].hitungNilaiAkhir()) {
                    penilaian0910 temp = hasil[i];
                    hasil[i] = hasil[j];
                    hasil[j] = temp;
                }
            }
        }
    
        return hasil;
    }    
}
