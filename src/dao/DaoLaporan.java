/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Interfacej.IFBuku;
import Interfacej.IFKategori;
import Interfacej.IFSkripsi;
import java.awt.BorderLayout;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;
import persisten.Buku;

/**
 *
 * @author Ailsa
 */
public class DaoLaporan  implements IFLaporan{
   
    private IFBuku servisB = new DaoBuku();
    private IFSkripsi servisS = new DaoSkripsi();
    private IFKategori servisK = new DaoKategori();


    @Override
    public JasperPrint cetakBuku(JPanel jp) {
        String reportPath = "src/report/LaporanBuku.jrxml";
        List<Buku> result = servisB.ambilData();
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(result);
        JasperPrint print = null;
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            print = JasperFillManager.fillReport(jasperReport, null, dataSource);
            jp.removeAll();
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (JRException ex) {
            Logger.getLogger(DaoLaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return print;
    }

    @Override
    public JasperPrint cetakSkripsi(JPanel jp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JasperPrint cetakAnggota(JPanel jp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JasperPrint laporanPeminjamanTerbanyak(JPanel jp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JasperPrint laporanPeminjaman(String no) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JasperPrint cetakBukuCari(JPanel jp, String s, String k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JasperPrint cetakSkripsiCari(JPanel jp, String s, String k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JasperPrint cetakAnggotaCari(JPanel jp, String s, String k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
