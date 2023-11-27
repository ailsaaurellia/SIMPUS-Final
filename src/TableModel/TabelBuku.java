/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import persisten.Buku;

/**
 *
 * @author Ailsa
 */
public class TabelBuku extends AbstractTableModel {

    private List<Buku> list = new ArrayList<>();

    public void tambahData(Buku mod) {
        list.add(mod);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }

    public void perbaruiData(int row, Buku mod) {
        list.add(row, mod);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
    }

    public void hapusData(int index) {
        list.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }

    public void clear() {
        list.clear();
        fireTableDataChanged();
    }

    public void setData(List<Buku> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();    
    }

    public void setData(int index, Buku mod) {
        list.set(index, mod);
        fireTableRowsUpdated(index, index);
    }

    public Buku getData(int index) {
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int coloumnIndex) {

        switch (coloumnIndex) {
            case 0:
                return list.get(rowIndex).getIdbuku();
            case 1:
                return list.get(rowIndex).getIsbn();
            case 2:
                return list.get(rowIndex).getJudul();
            case 3:
                return list.get(rowIndex).getKategori();
            case 4:
                return list.get(rowIndex).getPengarang();
            case 5:
                return list.get(rowIndex).getPenerbit();
            case 6:
                return list.get(rowIndex).getTahun();
            case 7:
                return list.get(rowIndex).getHalaman();

            default:
                return null;

        }
    }

    public String getColoumnName(int coloumn) {
        switch (coloumn) {
            case 0:
                return "ID Buku";
            case 1:
                return "ISBN";
            case 2:
                return "Judul";
            case 3:
                return "Kategori";
            case 4:
                return "Pengarang";
            case 5:
                return "Penerbit";
            case 6:
                return "Tahun";
            case 7:
                return "Jumlah Halaman";
            default:
                return null;
        }
    }

}
