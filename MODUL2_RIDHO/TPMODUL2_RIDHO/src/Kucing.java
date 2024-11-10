public class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    public void suara() {
        System.out.println(Nama + " Miawww");
    }

    public void infoHewan() {
        System.out.println("Nama :" + Nama + ", Umur :" + Umur + " Tahun");
        System.out.println("Ras : " + ras);
    }
}
