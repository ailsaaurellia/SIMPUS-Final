/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacej;

import java.util.List;
import persisten.Skripsi;

/**
 *
 * @author Ailsa
 */
public interface IFSkripsi {
    void tambahData(Skripsi mod);
    void ubahData(Skripsi mod);
    void hapusData(String id);
    
    Skripsi getById(String id);
    List<Skripsi> getByID(String id);
    List<Skripsi> getByJudul(String judul);
    List<Skripsi> getByBahasa(String bahasa);
    List<Skripsi> getByFakultas(String fakultas);
    List<Skripsi> getByProdi(String prodi);
    List<Skripsi> getByTahun(String tahun);
    List<Skripsi> getByPenulis(String penulis);
    List<Skripsi> getByPembimbing(String pembimbing);
    List<Skripsi> getByHalaman(String halaman);
    List<Skripsi> ambilData();
    String nomer();
}
