package com.example.kuis1keluargaku1718101;

import android.graphics.drawable.Drawable;

public class Keluarga {
    private String nama, status;
    private Drawable gambar;

    public Keluarga(String nama, String status, Drawable gambar) {
        this.nama = nama;
        this.status = status;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }
    public String getStatus() {
        return status;
    }
    public Drawable getGambar() {
        return gambar;
    }
}