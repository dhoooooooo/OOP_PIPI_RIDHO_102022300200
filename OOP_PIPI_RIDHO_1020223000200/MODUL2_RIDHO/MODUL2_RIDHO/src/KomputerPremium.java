public class KomputerPremium extends Komputer {
     // To do: Buatlah 1 variable sesuai ketentuan
     protected boolean RuangPrivat;
     
    
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int JumlahKomputer, String namaWarnet, float HargaPerJam, boolean RuangPrivat) {
        super(JumlahKomputer, namaWarnet, HargaPerJam);
        this.RuangPrivat = RuangPrivat;
      }

    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    public void Informasi() {
        super.Informasi();
        if (RuangPrivat) {
            System.out.println("Fasilitas ruangan premium : ");
            System.out.println(" - ruangan ber ac pribadi");
            System.out.println(" - sofa gaming ekslusif");
            System.out.println(" - komputer spesifikasi tinggi");
            System.out.println(" - koneksi internet dedicated 100Mbps");
        }
        else 
            System.out.println("Fasilitas ruangan standar : ");
            System.out.println(" - ruangan gerah");
            System.out.println(" - sofa majapahit");
            System.out.println(" - komputer spesifikasi rendah");
            System.out.println(" - koneksi internet dedicated 1Mbps");
      }
      

    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorkomputer) {
        System.out.println(" memesan komputer nomor : " + nomorkomputer);
      }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan) {
        System.out.println(" menambah layanan makanan : " + makanan);
    }

    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman) {
        System.out.println(" menambah layanan makanan : " + makanan + minuman);
    }
}
