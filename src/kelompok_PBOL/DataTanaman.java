/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_PBOL;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class DataTanaman {

    ArrayList<Tanaman> listTanaman = new ArrayList();

    public DataTanaman() {
        listTanaman.add(new TanamanPakis("Tanaman Pakis ", 45000, 200));
        listTanaman.add(new TanamanBonsai("Tanaman Bonsai", 1000000, 10));
        listTanaman.add(new TanamanLidahBuaya("Tanaman Lidah Buaya", 20000, 100));
        listTanaman.add(new TanamanLidahMertua("Tanaman Lidah Mertua", 12500, 100));
        listTanaman.add(new TanamanWijayaKusuma("Tanaman Wijaya Kusuma", 54000, 100));
        listTanaman.add(new TanamanJahe("Tanaman Jahe", 5000, 100));
        listTanaman.add(new TanamanKeladi("Tanaman Keladi", 20000, 120));
        listTanaman.add(new TanamanCemara("Tanaman Cemara", 80000, 100));
        listTanaman.add(new TanamanKaktus("Tanaman Kaktus", 34500, 100));
        listTanaman.add(new TanamanAglaonema("Tanaman Aglaonema", 67000, 100));
    }

    public ArrayList<Tanaman> getListTanaman() {
        return listTanaman;
    }

    public void setListTanaman(ArrayList<Tanaman> listTanaman) {
        this.listTanaman = listTanaman;
    }
}
