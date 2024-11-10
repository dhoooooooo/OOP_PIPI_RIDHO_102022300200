public class Hewan {
    protected String Nama;
    protected int Umur;

    public Hewan (String Nama, int Umur) {
        this.Nama = Nama;
        this.Umur = Umur;
    }

    public void suara() {
        System.out.println(Nama + " Miawww");
    }

    public void makan() {
        System.out.println(Nama + " sedang makan");
    }

    public void makanan(String makanan) {
        System.out.println(Nama + " sedang makan" + makanan);
    }

    public void infoHewan() {
        System.out.println(Nama + Umur + "Tahun");
    }
}

