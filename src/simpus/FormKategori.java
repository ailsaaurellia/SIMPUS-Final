package simpus;

import Interfacej.IFKategori;
import dao.DaoKategori;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import persisten.Kategori;
import tabelModel.TabelKategori;

/**
 *
 * @author Ailsa
 */
public class FormKategori extends javax.swing.JPanel {

    private Kategori mod = new Kategori();
    private IFKategori servis = new DaoKategori();
    private TabelKategori tblModel = new TabelKategori();

    public FormKategori() {
        initComponents();
        jTableBuku.setModel(tblModel);
        loadData();
        setColWidht();
    }

    public FormKategori(java.awt.Frame parent, boolean modal) {
        super();
        initComponents();
        jLabel1.requestFocus();
        tf_id.setText(servis.nomer());
    }

    public FormKategori(java.awt.Frame parent, boolean modal, String id) {
        super();
        initComponents();
        jLabel1.requestFocus();
        mod = servis.getById(id);

    }

    private void kosongkan_form() {
        tf_id.setText("");
        tf_kategori.setText("");
        btTambah.setText("TAMBAH");
        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/tambah.png"));
        btTambah.setIcon(icon);
        btHapus.setVisible(false);
        btBatal.setVisible(false);
        jLabel1.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        dataKategori = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuku = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btBatal = new javax.swing.JButton();
        btTambah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tf_id = new javax.swing.JTextField();
        tf_kategori = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(983, 638));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(983, 638));
        mainPanel.setLayout(new java.awt.CardLayout());

        dataKategori.setBackground(new java.awt.Color(255, 255, 255));
        dataKategori.setPreferredSize(new java.awt.Dimension(983, 638));

        jTableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBuku);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/IconKategori.png"))); // NOI18N
        jLabel1.setText("Data Kategori");

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 2, 2, 2, new java.awt.Color(122, 182, 218)));

        tf_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        tf_kategori.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_kategori.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));
        tf_kategori.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_kategoriKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(202, 50, 0));
        jLabel2.setText("ID Kategori");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(202, 50, 0));
        jLabel4.setText("Nama Kategori");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(tf_id, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(tf_kategori))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(tf_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dataKategoriLayout = new javax.swing.GroupLayout(dataKategori);
        dataKategori.setLayout(dataKategoriLayout);
        dataKategoriLayout.setHorizontalGroup(
            dataKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataKategoriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dataKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(dataKategoriLayout.createSequentialGroup()
                        .addGroup(dataKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dataKategoriLayout.createSequentialGroup()
                                .addComponent(btBatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btTambah)))
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        dataKategoriLayout.setVerticalGroup(
            dataKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataKategoriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(dataKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataKategoriLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(dataKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dataKategoriLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );

        mainPanel.add(dataKategori, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        mod.setIdKategori(tf_id.getText());
        mod.setKategori(tf_kategori.getText());

        if (jLabel1.getText().equalsIgnoreCase("Tambah Data Buku")) {
            servis.tambahData(mod);
        } else {
            servis.ubahData(mod);
        }
        kosongkan_form();
        loadData();

    }//GEN-LAST:event_btTambahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        String s = (String) jTableBuku.getValueAt(jTableBuku.getSelectedRow(), 1);
        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/hapus.png"));
        if (JOptionPane.showConfirmDialog(null, "Menghapus buku dengan ID " + s, "Apakah anda yakin", 0, 0, icon) == 0) {
            servis.hapusData(s);
        }
        kosongkan_form();
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
        int baris = jTableBuku.rowAtPoint(evt.getPoint());

        String id = jTableBuku.getValueAt(baris, 1).toString();
        tf_id.setText(id);

        String nama = jTableBuku.getValueAt(baris, 2).toString();
        tf_kategori.setText(nama);

        if (btTambah.getText().equalsIgnoreCase("TAMBAH")) {
            btTambah.setText("UBAH");
            ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/edit.png"));
            btTambah.setIcon(icon);
        }
        btHapus.setVisible(true);
        btBatal.setVisible(true);
    }//GEN-LAST:event_jTableBukuMouseClicked

    private void btBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatalActionPerformed
        kosongkan_form();
        loadData();
    }//GEN-LAST:event_btBatalActionPerformed

    private void tf_kategoriKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_kategoriKeyTyped
        if (tf_kategori.getText().length() >= 13) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_kategoriKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btTambah;
    private javax.swing.JPanel dataKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBuku;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_kategori;
    // End of variables declaration//GEN-END:variables

    private void setColWidht() {
        int[] noCol = {0};
        int[] noColW = {60};

        TableColumnModel tblModel = jTableBuku.getColumnModel();
        for (int i = 0; i < noCol.length; i++) {
            tblModel.getColumn(noCol[i]).setPreferredWidth(noColW[i]);
            tblModel.getColumn(noCol[i]).setMaxWidth(noColW[i]);
            tblModel.getColumn(noCol[i]).setMinWidth(noColW[i]);
        }
    }

    private void loadData() {
        List<Kategori> list = servis.ambilData();
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

}
