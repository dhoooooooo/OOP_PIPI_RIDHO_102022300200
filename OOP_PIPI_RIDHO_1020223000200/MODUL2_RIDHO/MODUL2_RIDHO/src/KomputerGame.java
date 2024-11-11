public class KomputerGame extends Komputer {
      // To do: Buatlah 1 variable sesuai ketentuan
      protected boolean VIPCard;
    
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerGame(int JumlahKomputer, String namaWarnet, float HargaPerJam, boolean VIPCard) {
      super(JumlahKomputer, namaWarnet, HargaPerJam);
      this.VIPCard = VIPCard;
    }
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    public void Informasi() {
      super.Informasi();
      if (VIPCard) {
        System.out.println("Benefit member VIP : jgn ngarep benefit yahaha");
        System.out.println(" - Diskon 10% untuk bermain 3 jam");
        System.out.println(" - gratis minuman setiap 4 jam");
        System.out.println(" - prioritas booking komputer gaming");
    }
    else 
        System.out.println("Fasilitas ruangan standar : jangan ngarep benefit yahaha");
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String username) {
      System.out.println("LOGIN dengan username : " + username);
    }

    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int jam) {
      System.out.println(" Bermain selama 2 jam" + jam);
    }
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Bermain(int jam, int menittambahan) {
      System.out.println(" Nambah billing selama 2 jam 3 menit" + jam + menittambahan);
    }
}
