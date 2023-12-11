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
    private final String[] columnNames = {"No", "ID Pengguna", "Nama", "Level"};

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
        return list.stream().filter(p -> "Anggota".equals(p.getLevel())).skip(index).findFirst().orElse(null);
    }

    @Override
    public int getRowCount() {
        return (int) list.stream().filter(p -> "Anggota".equals(p.getLevel())).count();
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
                    return list.get(rowIndex).getNama();
              case 2:
                return list.get(rowIndex).getLevel();
            
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
