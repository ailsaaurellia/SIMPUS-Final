/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Date;
import java.util.List;
import persisten.Peminjaman;

/**
 *
 * @author Ailsa
 */
public interface IFPeminjaman {
    void tambahData(Peminjaman mod);
    void ubahData(Peminjaman mod);
    void hapusData(String id);
    
    
    Peminjaman getByNo(String no);
    List<Peminjaman> getByTglPinjam(Date tgl);
    List<Peminjaman> getByTglKembali(Date tgl);
    List<Peminjaman> getByPeminjam(String nama);
    List<Peminjaman> getBystatus(String status);
    List<Peminjaman> getByBuku(String buku);
    List<Peminjaman> getBySkripsi(String skripsi);
    List<Peminjaman> getByNO(String no);
    List<Peminjaman> ambilData();
    String nomer();
}
