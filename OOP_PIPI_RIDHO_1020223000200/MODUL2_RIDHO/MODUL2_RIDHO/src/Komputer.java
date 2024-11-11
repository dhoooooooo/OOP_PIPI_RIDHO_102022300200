public class Komputer {
       // To do: Buatlah 3 variable sesuai ketentuan
       protected int JumlahKomputer;
       protected String namaWarnet;
       protected float HargaPerJam;
    
    // To do: Buatlah constructor pada class Komputer
    public Komputer(int JumlahKomputer, String namaWarnet, float HargaPerJam) {
        this.JumlahKomputer = JumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.HargaPerJam = HargaPerJam;
    }

    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    public void Informasi() {
        System.out.println("jumlah komputer : " + JumlahKomputer + "nama warnet : " + namaWarnet + "harga per jam : " + HargaPerJam);
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
}
