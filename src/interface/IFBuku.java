/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacej;

import java.util.List;
import persisten.Buku;

/**
 *
 * @author Ailsa
 */
public interface IFBuku {
    void tambahData(Buku mod);
    void ubahData(Buku mod);
    void hapusData(String id);
    
    Buku getById(String id);
    Buku getByIsbn(String isbn);
    List<Buku> getByID(String id);
    List<Buku> getByISBN(String isbn);
    List<Buku> getByJudul(String judul);
    List<Buku> getByKategori(String kategori);
    List<Buku> getByPengarang(String pengarang);
    List<Buku> getByPenerbit(String penerbit);
    List<Buku> getByTahun(String tahun);
    List<Buku> getByHalaman(String halaman);
    List<Buku> ambilData();
    String nomer();
}
