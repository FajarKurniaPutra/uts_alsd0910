public class matakuliah0910 {
    String kodeMK;
    String namaMK;
    int sks;

    public matakuliah0910 (String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampilMatakuliah() {
        System.out.println("Kode MK: " + kodeMK + " | Nama: " + namaMK + " | SKS: " + sks);
    }
}
