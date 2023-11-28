/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;
import persisten.Kategori;

/**
 *
 * @author Ailsa
 */
public interface IFKategori {
    void tambahData(Kategori mod);
    void ubahData(Kategori mod);
    void hapusData(String id);
    
    Kategori getById(String id);
    List<Kategori> getByID(String id);
    List<Kategori> getByKategori(String kategori);
    List<Kategori> ambilData();
    String nomer();
}
