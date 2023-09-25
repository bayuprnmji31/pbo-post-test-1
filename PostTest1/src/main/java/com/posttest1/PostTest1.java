
package com.posttest1;

import java.util.ArrayList;


public class PostTest1 {

    public static void main(String[] args) {
        
        
        ArrayList<TokoSembako> tokosembako = new ArrayList<>();
        TokoSembako sembako1 = new TokoSembako("Minyak Goreng", 100, 20000);
        TokoSembako sembako2 = new TokoSembako("Beras mawar 25 Kg", 500, 120000);
        TokoSembako sembako3 = new TokoSembako("Beras Lele 25 Kg", 120, 200000);
        TokoSembako sembako4 = new TokoSembako("Gula Pasir 2 Kg", 80, 15000);
        TokoSembako sembako5 = new TokoSembako("Mie Goreng Sedaapi", 100, 60000);
        TokoSembako sembako6 = new TokoSembako(" 1 Piring Telur", 120, 75000);
        TokoSembako sembako7 = new TokoSembako("Kecap bengong 1 dus", 110, 100000);
        TokoSembako sembako8 = new TokoSembako("Kecap ABC ASIN 1 dus", 120, 90000);
        TokoSembako sembako9 = new TokoSembako("Tepung Terigu 2 Kg", 130, 40000);   
        TokoSembako sembako10 = new TokoSembako("Sarden kaleng ", 90, 30000);
        
        tokosembako.add(sembako1);
        tokosembako.add(sembako2);
        tokosembako.add(sembako3);
        tokosembako.add(sembako4);
        tokosembako.add(sembako5);
        tokosembako.add(sembako6);
        tokosembako.add(sembako7);
        tokosembako.add(sembako8);
        tokosembako.add(sembako9);
        tokosembako.add(sembako10);
        
        
        for (TokoSembako tokoSembako : tokosembako) {
            String NamaBarang = "Nama Barang: " + tokoSembako.namabarang;
            int jumlahBarang = tokoSembako.jumlahbarang;
            int hargaBarang = tokoSembako.hargabarang;
            System.out.println(NamaBarang);
            System.out.println("Barang tersedia: " + jumlahBarang + " " +"Stok");
            System.out.println("Harga barang tersebut sebesar: Rp" + hargaBarang + ",-");
            System.out.println();}  
        
    }
}
