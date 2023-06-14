/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbofinal.models;

/**
 *
 * @author adria
 */

public class Produk {
    private int id;
    private String nama;
    private int harga;
    private int jumlah;

    public Produk(int id, String nama, int harga, int jumlah ) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}