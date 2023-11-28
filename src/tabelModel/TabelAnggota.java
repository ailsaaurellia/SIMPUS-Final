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
import persisten.Anggota;



/**
 *
 * @author Ailsa
 */
public class TabelAnggota extends AbstractTableModel {

    private List<Anggota> listAnggota = new ArrayList<>();
    private final String[] columnNames = {"No", "ID Anggota", "Nama", "NIM", "Fakultas", "Program Studi", 
        "Angkatan", "Alamat", "Telepon", "Email", "Jenis Kelamin"};

    public void tambahData(Anggota mod) {
        listAnggota.add(mod);
        fireTableRowsInserted(listAnggota.size() - 1, listAnggota.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }

    public void perbaruiData(int row, Anggota mod) {
        listAnggota.add(row, mod);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
    }

    public void hapusData(int index) {
        listAnggota.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    public void clear() {
        listAnggota.clear();
        fireTableDataChanged();
    }

    public void setData(List<Anggota> list) {
        clear();
        this.listAnggota.addAll(list);
        fireTableDataChanged();
    }

    public void setData(int index, Anggota mod) {
       listAnggota.set(index, mod);
        fireTableRowsUpdated(index, index);
    }

    public Anggota getData(int index) {
        return listAnggota.get(index);
    }

    @Override
    public int getRowCount() {
        return listAnggota.size();
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
                    return listAnggota.get(rowIndex).getIdAnggota();
                case 1:
                    return listAnggota.get(rowIndex).getNama();
                case 2:
                    return listAnggota.get(rowIndex).getNim();
                case 3:
                    return listAnggota.get(rowIndex).getFakultas();
                case 4:
                    return listAnggota.get(rowIndex).getProgramStudi();
                case 5:
                    return listAnggota.get(rowIndex).getAngkatan();
                case 6:
                    return listAnggota.get(rowIndex).getAlamat();
                case 7:
                    return listAnggota.get(rowIndex).getTelephone();
                case 8:
                    return listAnggota.get(rowIndex).getEmail();
                case 9:
                    return listAnggota.get(rowIndex).getJenisKelamin();
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
