/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacej;

import java.util.List;
import persisten.Pengguna;

/**
 *
 * @author Ailsa
 */
public interface IFPengguna {
    void tambahData(Pengguna mod);
    void ubahData(Pengguna mod);
    void hapusData(String id);
    
    Pengguna getById(String id);
    List<Pengguna> getByID(String id);
    List<Pengguna> getByNim(String nim);
    List<Pengguna> getByNama(String nama);
    List<Pengguna> getByJurusan(String jurusan);
    List<Pengguna> getByTempatlahir(String tempatLahir);
    List<Pengguna> getByTanggallahir(String tanggalLahir);
    List<Pengguna> getByUsername(String username);
    List<Pengguna> getByPassword(String password);
    List<Pengguna> getByAlamat(String alamat);
    List<Pengguna> getByLevel(String level);
    List<Pengguna> getByJeniskelamin(String jenisKelamin);
    List<Pengguna> getByTelephone(String telephone);
    List<Pengguna> getByEmail(String email);
    List<Pengguna> ambilData();
    String nomer();
}
