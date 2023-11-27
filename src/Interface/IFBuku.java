/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;
import persisten.Buku;

/**
 *
 * @author Ailsa
 */
public interface IFBuku {
    void tambahData (Buku mod);
    void perbaruiData (Buku mod);
    void hapusData (Buku mod);
    
    Buku getByid (String id);
    
    List<Buku> ambilData();
    String nomor();
    
    
}
