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
    
    public DaoLaporan(IFBuku servisB) {
        this.servisB = servisB;
    }
   
    @Override
    public JasperPrint cetakBuku() {
        String reportPath = "src/report/Book.jrxml";
        List<Buku> result = servisB.ambilData();
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(result);
        JasperPrint print = null;
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            print = JasperFillManager.fillReport(jasperReport, null, dataSource);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
        return print;
    }
}
