public class Burung extends Hewan {
    private String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    public void suara() {
        System.out.println(Nama + " berkicau");
    }

    public void infoHewan() {
        System.out.println("Nama :" + Nama + ", Umur :" + Umur + " Tahun");
        System.out.println("Warna Bulu : " + warnaBulu);
    }
}
