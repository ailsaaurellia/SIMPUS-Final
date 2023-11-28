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
import persisten.Kategori;

/**
 *
 * @author Ailsa
 */
public class TabelKategori extends AbstractTableModel {

    private List<Kategori> list = new ArrayList<>();
    private final String[] columnNames = {"No", "ID Kategori", "Kategori"};

    public void tambahData(Kategori mod) {
        list.add(mod);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }

    public void perbaruiData(int row, Kategori mod) {
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

    public void setData(List<Kategori> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }

    public void setData(int index, Kategori mod) {
        list.set(index, mod);
        fireTableRowsUpdated(index, index);
    }

    public Kategori getData(int index) {
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
                    return list.get(rowIndex).getIdkategori();
                case 1:
                    return list.get(rowIndex).getKategori();
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
