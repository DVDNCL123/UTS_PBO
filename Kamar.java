/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.praktikum1;

public class Kamar {
    private String nomorKamar;
    private double harga;
    private boolean tersedia;

    public Kamar(String nomorKamar, double harga) {
        this.nomorKamar = nomorKamar;
        this.harga = harga;
        this.tersedia = true;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}