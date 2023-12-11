package simpus;

import dao.DaoBuku;
import Interfacej.IFBuku;
import java.awt.Color;
import java.awt.Component;
import tabelModel.TabelBuku;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import persisten.Buku;

/**
 *
 * @author Ailsa
 */
public class FormBuku extends javax.swing.JPanel {

    private IFBuku servis = new DaoBuku();
    private TabelBuku tblModel = new TabelBuku();

    public FormBuku() {
        initComponents();
        jTableBuku.setModel(tblModel);
        loadData();
        setColWidht();

        tfCari.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                performSearch();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                performSearch();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Plain text components do not fire these events
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        dataBuku = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuku = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btBatal = new javax.swing.JButton();
        btTambah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        tfCari = new javax.swing.JTextField();
        cbCari = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(983, 638));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(983, 638));
        mainPanel.setLayout(new java.awt.CardLayout());

        dataBuku.setBackground(new java.awt.Color(255, 255, 255));
        dataBuku.setPreferredSize(new java.awt.Dimension(983, 638));

        jTableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBuku);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/IconBuku.png"))); // NOI18N
        jLabel1.setText("Data Buku");

        btBatal.setBackground(new java.awt.Color(239, 117, 117));
        btBatal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btBatal.setForeground(new java.awt.Color(255, 255, 255));
        btBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kembali.png"))); // NOI18N
        btBatal.setText("BATAL");
        btBatal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btBatalMouseMoved(evt);
            }
        });
        btBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btBatalMouseExited(evt);
            }
        });
        btBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBatalActionPerformed(evt);
            }
        });

        btTambah.setBackground(new java.awt.Color(122, 182, 218));
        btTambah.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btTambah.setForeground(new java.awt.Color(255, 255, 255));
        btTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tambah.png"))); // NOI18N
        btTambah.setText("TAMBAH");
        btTambah.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btTambahMouseMoved(evt);
            }
        });
        btTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btTambahMouseExited(evt);
            }
        });
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btHapus.setBackground(new java.awt.Color(227, 202, 11));
        btHapus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btHapus.setForeground(new java.awt.Color(255, 255, 255));
        btHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/hapus.png"))); // NOI18N
        btHapus.setText("HAPUS");
        btHapus.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btHapusMouseMoved(evt);
            }
        });
        btHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btHapusMouseExited(evt);
            }
        });
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        cbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "ID Buku", "ISBN", "Judul", "Kategori", "Pengarang", "Penerbit", "Tahun", "Jumlah Halaman" }));
        cbCari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 183, 137)));

        javax.swing.GroupLayout dataBukuLayout = new javax.swing.GroupLayout(dataBuku);
        dataBuku.setLayout(dataBukuLayout);
        dataBukuLayout.setHorizontalGroup(
            dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBukuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataBukuLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(dataBukuLayout.createSequentialGroup()
                                .addComponent(btTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbCari, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        dataBukuLayout.setVerticalGroup(
            dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataBukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(btHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(cbCari, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        mainPanel.add(dataBuku, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        if (btTambah.getText().equalsIgnoreCase("UBAH")) {
            new Databuku(null, true, (String) jTableBuku.getValueAt(jTableBuku.getSelectedRow(), 1)).setVisible(true);
        } else {
            new Databuku(null, true).setVisible(true);
        }
        loadData();
    }//GEN-LAST:event_btTambahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        String s = (String) jTableBuku.getValueAt(jTableBuku.getSelectedRow(), 1);
        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/hapus.png"));
        if (JOptionPane.showConfirmDialog(null, "Menghapus buku dengan ID " + s, "Apakah anda yakin", 0, 0, icon) == 0) {
            servis.hapusData(s);
        }
        loadData();
    }//GEN-LAST:event_btHapusActionPerformed

    private void btTambahMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTambahMouseMoved
        btTambah.setForeground(Color.white);
        ImageIcon icon;
        if (btTambah.getText().equalsIgnoreCase("UBAH")) {
            icon = new ImageIcon(getClass().getResource("/gambar/edit.png"));
        } else {
            icon = new ImageIcon(getClass().getResource("/gambar/tambah.png"));
        }
        btTambah.setIcon(icon);
    }//GEN-LAST:event_btTambahMouseMoved

    private void btTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTambahMouseExited
        btTambah.setForeground(Color.white);
        ImageIcon icon;
        if (btTambah.getText().equalsIgnoreCase("UBAH")) {
            icon = new ImageIcon(getClass().getResource("/gambar/edit.png"));
        } else {
            icon = new ImageIcon(getClass().getResource("/gambar/tambah.png"));
        }
        btTambah.setIcon(icon);
        jLabel1.requestFocus();
    }//GEN-LAST:event_btTambahMouseExited

    private void btHapusMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHapusMouseMoved
        btHapus.setForeground(Color.white);
        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/hapus.png"));
        btHapus.setIcon(icon);
    }//GEN-LAST:event_btHapusMouseMoved

    private void btHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHapusMouseExited
        btHapus.setForeground(Color.white);
        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/hapus.png"));
        btHapus.setIcon(icon);
    }//GEN-LAST:event_btHapusMouseExited

    private void btBatalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBatalMouseMoved
        btBatal.setForeground(Color.white);
        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/kembali.png"));
        btBatal.setIcon(icon);
    }//GEN-LAST:event_btBatalMouseMoved

    private void btBatalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBatalMouseExited
        btBatal.setForeground(Color.white);
        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/kembali.png"));
        btBatal.setIcon(icon);
    }//GEN-LAST:event_btBatalMouseExited

    private void jTableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBukuMouseClicked
        if (btTambah.getText().equalsIgnoreCase("TAMBAH")) {
            btTambah.setText("UBAH");
            ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/edit.png"));
            btTambah.setIcon(icon);
        }
        btHapus.setVisible(true);
        btBatal.setVisible(true);
    }//GEN-LAST:event_jTableBukuMouseClicked

    private void btBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatalActionPerformed
        loadData();
    }//GEN-LAST:event_btBatalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btTambah;
    private javax.swing.JComboBox<String> cbCari;
    private javax.swing.JPanel dataBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBuku;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField tfCari;
    // End of variables declaration//GEN-END:variables

    private void setColWidht() {
        int[] noCol = {0, 1, 2, 7, 8};
        int[] noColW = {40, 80, 150, 80, 80};

        TableColumnModel tblModel = jTableBuku.getColumnModel();
        for (int i = 0; i < noCol.length; i++) {
            tblModel.getColumn(noCol[i]).setPreferredWidth(noColW[i]);
            tblModel.getColumn(noCol[i]).setMaxWidth(noColW[i]);
            tblModel.getColumn(noCol[i]).setMinWidth(noColW[i]);
        }
    }

    private void loadData() {
        List<Buku> list = servis.ambilData();
        tblModel.setData(list);
        if (btTambah.getText().equalsIgnoreCase("UBAH")) {
            btTambah.setText("TAMBAH");
            ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/tambah.png"));
            btTambah.setIcon(icon);
        }
        btHapus.setVisible(false);
        btBatal.setVisible(false);
        jLabel1.requestFocus();

    }

    private void performSearch() {
        String searchTerm = tfCari.getText();
        int searchByIndex = cbCari.getSelectedIndex();

        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();

        try {
            List<Buku> filteredData;

            // Modifikasi logika pencarian untuk menggunakan JPA
            switch (searchByIndex) {
                case 1: // ID Buku
                    filteredData = servis.getByID(searchTerm);
                    break;
                case 2: // ISBN
                    filteredData = servis.getByISBN(searchTerm);
                    break;
                case 3: // Judul
                    filteredData = servis.getByJudul(searchTerm);
                    break;
                case 4: // Kategori
                    filteredData = servis.getByKategori(searchTerm);
                    break;
                case 5: // Pengarang
                    filteredData = servis.getByPengarang(searchTerm);
                    break;
                case 6: // Penerbit
                    filteredData = servis.getByPenerbit(searchTerm);
                    break;
                case 7: // Tahun
                    filteredData = servis.getByTahun(searchTerm);
                    break;
                case 8: // Halaman
                    filteredData = servis.getByHalaman(searchTerm);
                    break;
                default:
                    // Handle default case or throw an exception
                    filteredData = new ArrayList<>();
                    break;
            }

            tblModel.setData(filteredData);
        } finally {
            em.getTransaction().commit();
            em.close();
        }
    }

}
