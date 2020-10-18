package com.Aditya.nomor1.Tugas2;

public class DemoClub {
    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club("Real Madrid Cf");
        Club club3 = new Club("Real Madrid Cf", "Sebuah club yang berdiri di tahun 1903");
        Club club4 = new Club("Real Madrid Cf", 1903, "Santiago bernabeu");
        Club club5 = new Club("Real Madrid Cf", 1903, "Santiago bernabeu", 13, "Sebuah club yang berdiri di tahun 1903");

        club1.getTeam();
        club2.getTeam();
        club3.getTeam();
        club4.getTeam();
        club5.getTeam();
    }
}
