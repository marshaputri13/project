/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class DataDiri extends DataDiriSwab {
    public String Nama, jk, alamat;
    public String Keluhan;
    public int NoKK;
    public String Hasil;
    //overridding
    @Override
    public void IdentitasDiri() {
        System.out.println("Nama: "+Nama);
        System.out.println("Jenis kelamin "+jk);
        System.out.println("Alamat "+alamat);
        System.out.println("Keluhan "+Keluhan);
    }
    @Override
    public void Syarat() {
        System.out.println("Semua Persyaratan " + super.Syarat);
    }
    //overloading
    public int NoKK (int NomorKK) {
        this.NoKK(NomorKK);
        return NoKK;
    }
    public void Hasil () {
        
        System.out.println("Hasil "+ Hasil);
    }
}

