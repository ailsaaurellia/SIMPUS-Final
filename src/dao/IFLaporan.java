/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Ailsa
 */
public interface IFLaporan {
    JasperPrint cetakBuku(JPanel jp);
    JasperPrint cetakSkripsi(JPanel jp);
    JasperPrint cetakAnggota(JPanel jp);
    JasperPrint laporanPeminjamanTerbanyak(JPanel jp);
    JasperPrint laporanPeminjaman(String no);
    JasperPrint cetakBukuCari(JPanel jp,String s, String k);
    JasperPrint cetakSkripsiCari(JPanel jp,String s, String k);
    JasperPrint cetakAnggotaCari(JPanel jp,String s, String k);
    
}
