package com.Aditya.nomor1.Tugas2;

public class DemoBinatang {
    public static void main(String[] args) {
        Binatang superclass = new Binatang();
        burung classBurung = new burung();
        ikan classIkan = new ikan();
        kucing classKucing = new kucing();

        System.out.println("Sifat unik Binatang :\n");
        superclass.getNama("Panda");
        System.out.println();
        classBurung.getNama("Burung merpati");
        classBurung.burung();
        System.out.println();
        classIkan.getNama("Ikan Lele");
        classIkan.ikan();
        System.out.println();
        classKucing.getNama("Kucing kampung");
        classKucing.kucing();
    }
}
