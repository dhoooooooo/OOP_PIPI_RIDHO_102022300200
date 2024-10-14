import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    static ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    static ArrayList<String> pesananTiket = new ArrayList<>();
    public static void main(String[] args) {
    
        daftarPenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000f));
        daftarPenerbangan.add(new Penerbangan("QZ202", "SUB, Surabaya", "CGK, Jakarta", "10:00", "11:00", 1350000f));
        
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("==== EAD Ticket Booking System ====");
            System.out.println("1. Tampilkan Daftar Pemesanan");
            System.out.println("2. Beli Ticket");
            System.out.println("3. Tampilkan Pesanan Ticket");
            System.out.println("4. Exit");
            System.out.print("Silahkan Pilih Menu : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanDaftarPenerbangan();
                    break;
                case 2:
                    beliTicket(scanner);
                    break;
                case 3:
                    tampilkanPesananTicket();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih angka 1-4.");
            }
        }

        System.out.println("Terima kasih!!!");
    }

    public static void tampilkanDaftarPenerbangan() {
        System.out.println("======= Daftar Penerbangan =======");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println((i + 1) + ". ");
            daftarPenerbangan.get(i).tampilkanpenerbangan();
        }
    }

    public static void beliTicket(Scanner scanner) {
        tampilkanDaftarPenerbangan();
        System.out.print("Masukkan nomor penerbangan yang ingin dipesan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); 

        if (pilihan > 0 && pilihan <= daftarPenerbangan.size()) {
            Penerbangan penerbanganDipilih = daftarPenerbangan.get(pilihan - 1);

            System.out.print("Masukkan NIK : ");
            String NIK = scanner.nextLine();
            System.out.print("Masukkan nama depan : ");
            String namaDepan = scanner.nextLine();
            System.out.print("Masukkan nama belakang : ");
            String namaBelakang = scanner.nextLine();

            Penumpang penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

            pesananTiket.add("Tiket untuk penerbangan : " + penerbanganDipilih.nomorpenerbangan + " - " + penerbanganDipilih.bandaratujuan +
                             " atas nama " + penumpang.namadepan + " " + penumpang.namabelakang + " dengan NIK " + penumpang.NIK);
            System.out.println("TERIMA KASIH TELAH MENGISI DATA PELANGGAN!!");
        } else {
            System.out.println("Nomor penerbangan tidak valid.");
        }
    }

    public static void tampilkanPesananTicket() {
        if (pesananTiket.isEmpty()) {
            System.out.println("Pembelian tiket tidak ada.");
        } else {
            System.out.println("======= DETAIL TIKET PENERBANGAN =======");
            for (String pesanan : pesananTiket) {
                System.out.println(pesanan);
            }
        }
    }
}