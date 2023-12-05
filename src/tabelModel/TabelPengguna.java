/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import persisten.Pengguna;

/**
 *
 * @author Ailsa
 */
public class TabelPengguna extends AbstractTableModel {

    private List<Pengguna> list = new ArrayList<>();
    private final String[] columnNames = {"No", "ID Pengguna", "NIM", "Nama", "Jurusan",
        "Username", "Telephone", "Level", "Alamat"};

    public void clear() {
        list.clear();
        fireTableDataChanged();
    }

    public void setData(List<Pengguna> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }

    public void setData(int index, Pengguna mod) {
        list.set(index, mod);
        fireTableRowsUpdated(index, index);
    }

    public Pengguna getData(int index) {
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
                    return list.get(rowIndex).getIdPengguna();   
              case 1:
                    return list.get(rowIndex).getNim();   
              case 2:
                    return list.get(rowIndex).getNama();   
              case 3:
                    return list.get(rowIndex).getJurusan();   
              case 4:
                    return list.get(rowIndex).getUsername();   
              case 5:
                    return list.get(rowIndex).getTelephone();   
              case 6:
                    return list.get(rowIndex).getLevel();   
              case 7:
                    return list.get(rowIndex).getAlamat();   
            
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
