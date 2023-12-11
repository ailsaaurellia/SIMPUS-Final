/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelModel;

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
    private final String[] columnNames = {"No", "ID Buku", "ISBN", "Judul", "Kategori",
        "Pengarang", "Penerbit", "Tahun", "Halaman"};

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
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return "   " + (rowIndex + 1);
        } else {
            switch (columnIndex - 1) {
                case 0:
                    return list.get(rowIndex).getIdBuku();
                case 1:
                    return list.get(rowIndex).getIsbn();
                case 2:
                    return list.get(rowIndex).getJudul();
                case 3:
                    return list.get(rowIndex).getAllKategori();
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
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "    " + columnNames[column];
        } else {
            return columnNames[column];
        }

    }

}
