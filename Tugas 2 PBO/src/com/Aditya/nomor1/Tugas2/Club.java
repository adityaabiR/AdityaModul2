package com.Aditya.nomor1.Tugas2;

public class Club {
    public String nama, stadion, deskripsi;
    public int tahunBerdiri, juaraUcl;


    public Club() {
    }


    public Club(String nama) {
        this.nama = nama;
    }


    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }


    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }


    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getTeam(){
        if (nama == null){
            nama = "Fulham";
        }
        if (stadion == null){
            stadion = "None";
        }
        if (deskripsi == null){
            deskripsi = "None";
        }
        if (tahunBerdiri == 0){
            tahunBerdiri = 0;
        }
        if (juaraUcl == 0){
            juaraUcl = 0;
        }
        System.out.println("Nama          : " + nama);
        System.out.println("Juara         : " + juaraUcl);
        System.out.println("Deskripsi     : " + deskripsi);
        System.out.println("Tahun Berdiri : " + tahunBerdiri);
        System.out.println("Stadion       : " + stadion);
        System.out.println();
    }
}
