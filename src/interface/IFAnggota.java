/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacej;

import java.util.List;
import persisten.Anggota;

/**
 *
 * @author Ailsa
 */
public interface IFAnggota {
    void tambahData(Anggota mod);
    void ubahData(Anggota mod);
    void hapusData(String id);
    
    Anggota getById(String id);
    List<Anggota> getByID(String id);
    List<Anggota> getByNama(String nama);
    List<Anggota> getByNim(String nim);
    List<Anggota> getByFakultas(String fakultas);
    List<Anggota> getByProdi(String prodi);
    List<Anggota> getByAngkatan(String angkatan);
    List<Anggota> getByAlamat(String alamat);
    List<Anggota> getByTelephone(String telp);
    List<Anggota> getByEmail(String email);
    List<Anggota> getByJenis(String jenis);
    List<Anggota> ambilData();
    String nomer();
}
