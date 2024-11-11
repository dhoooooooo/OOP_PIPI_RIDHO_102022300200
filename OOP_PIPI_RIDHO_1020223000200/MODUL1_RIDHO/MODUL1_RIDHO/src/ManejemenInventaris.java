<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class ManejemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<String> daftarMakananKering = new ArrayList<>();
    ArrayList<String> daftarMakananBasah = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void tambahMakananKering() {
        
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("masukkan nama makanan : ");
        String nama = scanner.nextLine();

        System.out.print("masukkan jumlah makanan : ");
        int jumlah = scanner.nextInt();

        System.out.print("masukkan harga makanan : ");
        double harga = scanner.nextDouble();

        System.out.print("masukkan brand makanan : ");
        String brand = scanner.nextLine();

        // Todo : Create a new object for MakananKering

        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.print("masukkan nama makanan : ");
        String nama = scanner.nextLine();

        // Todo : Create a new object for MakananBasah
        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
        } else {
            // Todo : Create print notification for Makanan Kering  
            for 
            }
            // Todo : Create print notification for  Makanan Basah
            for 
            }
        }
    

=======
import java.util.ArrayList;
import java.util.Scanner;

public class ManejemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<String> daftarMakananKering = new ArrayList<>();
    ArrayList<String> daftarMakananBasah = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void tambahMakananKering() {
        
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("masukkan nama makanan : ");
        String nama = scanner.nextLine();

        System.out.print("masukkan jumlah makanan : ");
        int jumlah = scanner.nextInt();

        System.out.print("masukkan harga makanan : ");
        double harga = scanner.nextDouble();

        System.out.print("masukkan brand makanan : ");
        String brand = scanner.nextLine();

        // Todo : Create a new object for MakananKering

        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.print("masukkan nama makanan : ");
        String nama = scanner.nextLine();

        // Todo : Create a new object for MakananBasah
        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
        } else {
            // Todo : Create print notification for Makanan Kering  
            for 
            }
            // Todo : Create print notification for  Makanan Basah
            for 
            }
        }
    

>>>>>>> b2308f85364b36625a033fad3c54c7ec2303dec8
