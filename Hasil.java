/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Hasil {
    public static void main(String[] args) {
        DataDiri dd=new DataDiri();
        dd.Nama= "Handika Pratama";
        dd.jk= "Laki-laki";
        dd.alamat= "Bekasi";
        dd.Keluhan= "Sakit kepala,tenggorokan gatel";
        dd.Hasil= "Positif";
                
        dd.IdentitasDiri();
        dd.Syarat();
        dd.Hasil();
    }
}

