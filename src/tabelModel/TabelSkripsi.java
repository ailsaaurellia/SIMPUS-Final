/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import persisten.Skripsi;

/**
 *
 * @author Ailsa
 */
public class TabelSkripsi extends AbstractTableModel {

    private List<Skripsi> listSkripsi = new ArrayList<>();
    private final String[] columnName = {"NO", "ID Skripsi", "Judul", "Bahasa", "Fakultas",
        "Program Studi", "Tahun", "Penulis", "Pembimbing", "Jumlah Halaman", "Kategori"};

    public void clear() {
        listSkripsi.clear();
        fireTableDataChanged();
    }

    public void setData(List<Skripsi> list) {
        clear();
        this.listSkripsi.addAll(list);
        fireTableDataChanged();
    }

    public void setData(int index, Skripsi mod) {
        listSkripsi.set(index, mod);
        fireTableRowsUpdated(index, index);
    }

    @Override
    public int getRowCount() {
        return listSkripsi.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return "   " + (rowIndex + 1);
        } else {
            switch (columnIndex - 1) {
                case 0:
                    return listSkripsi.get(rowIndex).getIdSkripsi();
                case 1:
                    return listSkripsi.get(rowIndex).getJudul();
                case 2:
                    return listSkripsi.get(rowIndex).getBahasa();
                case 3:
                    return listSkripsi.get(rowIndex).getFakultas();
                case 4:
                    return listSkripsi.get(rowIndex).getProgramStudi();
                case 5:
                    return listSkripsi.get(rowIndex).getTahun();
                case 6:
                    return listSkripsi.get(rowIndex).getPenulis();
                case 7:
                    return listSkripsi.get(rowIndex).getPembimbing();
                case 8:
                    return listSkripsi.get(rowIndex).getJumlahHalaman();
                case 9:
                    return listSkripsi.get(rowIndex).getAllKategori();
                default:
                    return null;
            }

        }


    }

    @Override
    public String getColumnName(int column){
        if (column == 0){
            return "   "+columnName[column];
        } else {
            return columnName[column];
        }
    }
    

}
