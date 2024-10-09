/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.praktikum1;

public class KamarSultan extends Kamar {
    private String fasilitas;

    public KamarSultan(String nomorKamar, double harga, String fasilitas) {
        super(nomorKamar, harga);
        this.fasilitas = fasilitas;
    }

    public String getFasilitas() {
        return fasilitas;
    }
}