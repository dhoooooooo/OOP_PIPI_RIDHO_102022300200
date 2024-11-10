public class Main {
    public static void main(String[] args) {
        System.out.println("Detail Hewan");

        Kucing kucing = new Kucing ("momo", 2,"persia" );
        System.out.println("ini adalah momo");
        kucing.suara();
        kucing.makan();
        kucing.makanan(" ikan");
        System.out.println();

        Burung burung = new Burung("Nazmi", 1, "Hijau");
        System.out.println("ini adalah nazmi");
        burung.suara();
        burung.makan();
        burung.makanan( " biji-bijian");
        System.out.println();

        kucing.infoHewan();
        burung.infoHewan();
    }
}
