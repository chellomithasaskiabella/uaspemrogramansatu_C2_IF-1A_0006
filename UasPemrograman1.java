import java.util.Scanner;

public class UasPemrograman1 {

    Scanner ns = new Scanner(System.in);
    String [] namaPenyewa = new String[2];
    String [] jenisKendaraan = new String[2];
    double motor, mobil, miniBus;
    double [] jumlahSewa = new double[2];
    boolean dataDisimpan = false;

    String kategori;
    if (total <= 750.000) {
        kategori = "Premium";
    } else if (total <= 300.000 && total >= 750.000) {
        kategori = "Standar";
    } else if (total >= 300.000) {
        kategori = "Ekonomis";
    } else {

    } 
    if (kategori.equals("Premium") && kategori.equals("Standar")) {
        System.out.println("=======Program Menu Sewa Kendaraan=======");
        System.out.println("1. Input Data Penyewa Kendaraan");
        System.out.println("2. Menampilkan Seluruh Data Penyewa");
        System.out.println("3. Menampilkan Ringkasan Rental");
        System.out.println("4. Keluar Program");
        System.out.println("Pilih Menu 1-4 : ");

    }

    public int inputPilihan() {
        try {
            int pilihan = ns.nextInt();
            ns.nextLine();
            return pilihan;
        } catch (Exception e) {
            ns.nextLine();
            return -1;
        }

    }

    public void inputDataPenyewaKendaraan () {
        System.out.println("=======Input Data Penyewa Kendaraan=======");
        for (int i = 0; i < 2; i++) {
            System.out.println("Masukkan Nama Penyewa Ke-" + (i + 1) + ":");
            namaPenyewa [i] = ns.nextLine();

            System.out.println("Sewa Motor/Mobil/Mini Bus");
            jenisKendaraan [i] = ns.nextLine();

            System.out.println("Masukkan Jumlah Hari Sewa");
            try {
                jumlahSewa [i] = ns.nextDouble();
                ns.nextLine();
            } catch (Exception e) {
                System.out.println("Inputan Data Tidak Valid. Masukkan Angka.");
                ns.nextLine();
                i--;
            }

            System.out.println("Total Biaya Sewa");
           
            System.out.println("Kategoro Penyewa");
        }
        dataDisimpan = true;
        System.out.println("Data Penyewa Kendaraan Berhasil Disimpan");
    }


}