/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.praktikum1;

    import Class.Kamar;
    import Class.KamarSultan;
    import Class.Pemesanan;
    import java.util.Scanner;

public class Hotel implements Pemesanan {
    private Kamar kamar001;
    private Kamar kamar002;
    private KamarSultan suite100;
    private String detailPesanan;

    public Hotel() {
        kamar001 = new Kamar("001", 500000);
        kamar002 = new Kamar("002", 600000);
        suite100 = new KamarSultan("100", 1200000, "Kolam Renang");
        detailPesanan = "";
    }

    public void menuAdmin(Scanner scanner) {
        boolean isAdminRunning = true;
        while (isAdminRunning) {
            System.out.println("\n--- Menu Admin ---");
            System.out.println("1. Cek Ketersediaan Kamar");
            System.out.println("2. Ubah Status Kamar");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int adminMenu = scanner.nextInt();
            scanner.nextLine();

            switch (adminMenu) {
                case 1:
                    cekKetersediaanKamar();
                    break;
                case 2:
                    ubahStatusKamar(scanner);
                    break;
                case 3:
                    isAdminRunning = false;
                    System.out.println("Keluar dari menu admin.");
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan coba lagi.");
            }
        }
    }

    public void ubahStatusKamar(Scanner scanner) {
        System.out.print("Masukkan nomor kamar yang ingin diubah statusnya (001/002/100): ");
        String nomorKamar = scanner.nextLine();

        if (nomorKamar.equals("001")) {
            kamar001.setTersedia(!kamar001.isTersedia());
            System.out.println("Status Kamar 001 berhasil diubah.");
        } else if (nomorKamar.equals("002")) {
            kamar002.setTersedia(!kamar002.isTersedia());
            System.out.println("Status Kamar 002 berhasil diubah.");
        } else if (nomorKamar.equals("100")) {
            suite100.setTersedia(!suite100.isTersedia());
            System.out.println("Status Suite 100 berhasil diubah.");
        } else {
            System.out.println("Nomor kamar tidak valid.");
        }
    }

    public void cekKetersediaanKamar() {
        System.out.println("\n--- Ketersediaan Kamar ---");
        System.out.println("Kamar 001: " + (kamar001.isTersedia() ? "Tersedia" : "Tidak Tersedia") + " - Harga: " + kamar001.getHarga());
        System.out.println("Kamar 002: " + (kamar002.isTersedia() ? "Tersedia" : "Tidak Tersedia") + " - Harga: " + kamar002.getHarga());
        System.out.println("Suite 100: " + (suite100.isTersedia() ? "Tersedia" : "Tidak Tersedia") + " - Harga: " + suite100.getHarga() + " - Fasilitas: " + suite100.getFasilitas());
    }

    public void pesanKamar(Scanner scanner) {
        System.out.print("Masukkan nomor kamar yang ingin dipesan (001/002/100): ");
        String nomorKamar = scanner.nextLine();

        if (nomorKamar.equals("001") && kamar001.isTersedia()) {
            kamar001.setTersedia(false);
            detailPesanan = "Kamar 001, Harga: " + kamar001.getHarga();
            System.out.println("Anda berhasil memesan " + detailPesanan);
        } else if (nomorKamar.equals("002") && kamar002.isTersedia()) {
            kamar002.setTersedia(false);
            detailPesanan = "Kamar 002, Harga: " + kamar002.getHarga();
            System.out.println("Anda berhasil memesan " + detailPesanan);
        } else if (nomorKamar.equals("100") && suite100.isTersedia()) {
            suite100.setTersedia(false);
            detailPesanan = "Suite 100, Harga: " + suite100.getHarga() + ", Fasilitas: " + suite100.getFasilitas();
            System.out.println("Anda berhasil memesan " + detailPesanan);
        } else {
            System.out.println("Kamar tidak tersedia atau sudah dipesan.");
        }
    }

    @Override
    public void lihatDetailPesanan() {
        if (detailPesanan.isEmpty()) {
            System.out.println("Belum ada pesanan.");
        } else {
            System.out.println("Detail Pesanan Anda: " + detailPesanan);
        }
    }

    @Override
    public void pesanKamar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
