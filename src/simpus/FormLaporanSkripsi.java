package simpus;

import Interfacej.IFSkripsi;
import dao.DaoSkripsi;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import persisten.Skripsi;
import tabelModel.TabelSkripsi;

/**
 *
 * @author Ailsa
 */
public class FormLaporanSkripsi extends javax.swing.JPanel {

    private IFSkripsi servis = new DaoSkripsi();
    private TabelSkripsi tblModel = new TabelSkripsi();

    public FormLaporanSkripsi() {
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
        btCetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuku = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
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

        btCetak.setBackground(new java.awt.Color(255, 102, 102));
        btCetak.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btCetak.setForeground(new java.awt.Color(255, 255, 255));
        btCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/cetak.png"))); // NOI18N
        btCetak.setText("CETAK");
        btCetak.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btCetakMouseMoved(evt);
            }
        });
        btCetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCetakMouseExited(evt);
            }
        });
        btCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCetakActionPerformed(evt);
            }
        });

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/IconSkripsi.png"))); // NOI18N
        jLabel1.setText("Data Skripsi");

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

        cbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "ID Skripsi", "Judul", "Bahasa", "Fakultas", "Program Studi", "Tahun", "Penulis", "Pembimbing", "Jumlah Halaman" }));
        cbCari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 183, 137)));

        javax.swing.GroupLayout dataBukuLayout = new javax.swing.GroupLayout(dataBuku);
        dataBuku.setLayout(dataBukuLayout);
        dataBukuLayout.setHorizontalGroup(
            dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataBukuLayout.createSequentialGroup()
                .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dataBukuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dataBukuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataBukuLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dataBukuLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 701, Short.MAX_VALUE))
                                    .addGroup(dataBukuLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbCari, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        dataBukuLayout.setVerticalGroup(
            dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataBukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCari, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        mainPanel.add(dataBuku, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        String s = (String) jTableBuku.getValueAt(jTableBuku.getSelectedRow(), 1);
        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/hapus.png"));
        if (JOptionPane.showConfirmDialog(null, "Menghapus buku dengan ID " + s, "Apakah anda yakin", 0, 0, icon) == 0) {
            servis.hapusData(s);
        }
        loadData();
    }//GEN-LAST:event_btHapusActionPerformed

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

    private void jTableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBukuMouseClicked

    }//GEN-LAST:event_jTableBukuMouseClicked

    private void btCetakMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCetakMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btCetakMouseMoved

    private void btCetakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCetakMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btCetakMouseExited

    private void btCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCetakActionPerformed

        String reportPath = "src/cetak/Skripsi.jrxml";
        String selection = (String) cbCari.getSelectedItem();
        String searchTerm = tfCari.getText().trim();

        // Building the JPA query dynamically based on the selected criteria
        String queryString = "SELECT s FROM Skripsi s WHERE ";

        switch (cbCari.getSelectedIndex()) {
            case 1:
            queryString += "LOWER(s.idSkripsi) LIKE LOWER(:searchTerm)";
            break;
            case 2:
            queryString += "LOWER(s.judul) LIKE LOWER(:searchTerm)";
            break;
            case 3:
            queryString += "LOWER(s.bahasa) LIKE LOWER(:searchTerm)";
            break;
            case 4:
            queryString += "LOWER(s.fakultas) LIKE LOWER(:searchTerm)";
            break;
            case 5:
            queryString += "LOWER(s.programStudi) LIKE LOWER(:searchTerm)";
            break;
            case 6:
            queryString += "LOWER(s.tahun) LIKE LOWER(:searchTerm)";
            break;
            case 7:
            queryString += "LOWER(s.penulis) LIKE LOWER(:searchTerm)";
            break;
            case 8:
            queryString += "LOWER(s.pembimbing) LIKE LOWER(:searchTerm)";
            break;
            case 9:
            queryString += "LOWER(s.jumlahHalaman) LIKE LOWER(:searchTerm)";
            break;
            default:
            throw new IllegalArgumentException("No search criteria selected.");
        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UASPBOPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Query query = em.createQuery(queryString);
        query.setParameter("searchTerm", "%" + searchTerm + "%");

        List<Skripsi> results = query.getResultList();
        em.getTransaction().commit();
        em.close();
        emf.close();

        // Menyiapkan data untuk laporan
        List<Object[]> data = new ArrayList<>();
        for (Skripsi result : results) {
            Object[] rowData = {
                result.getIdSkripsi(),
                result.getJudul(),
                result.getBahasa(),
                result.getFakultas(),
                result.getProgramStudi(),
                result.getTahun(),
                result.getPenulis(),
                result.getPembimbing(),
                result.getJumlahHalaman()
            };
            data.add(rowData);
        }

        try {
            // Mengonversi List menjadi JRBeanCollectionDataSource
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(data);

            // Menyiapkan parameter untuk laporan
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("querySearch", searchTerm);
            parameters.put("searchBy", selection);

            // Memuat file desain laporan (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
        } catch (JRException e) {
            e.printStackTrace();
        }
        // Handle kesalahan jika terjadi
    }//GEN-LAST:event_btCetakActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCetak;
    private javax.swing.JButton btHapus;
    private javax.swing.JComboBox<String> cbCari;
    private javax.swing.JPanel dataBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBuku;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField tfCari;
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
        List<Skripsi> list = servis.ambilData();
        tblModel.setData(list);
        btHapus.setVisible(true);
        jLabel1.requestFocus();

    }

    private void performSearch() {
        String searchTerm = tfCari.getText();
        int searchByIndex = cbCari.getSelectedIndex();

        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();

        try {
            List<Skripsi> filteredData;

            switch (searchByIndex) {
                case 1:
                    filteredData = servis.getByID(searchTerm);
                    break;
                case 2:
                    filteredData = servis.getByJudul(searchTerm);
                    break;
                case 3:
                    filteredData = servis.getByBahasa(searchTerm);
                    break;
                case 4:
                    filteredData = servis.getByFakultas(searchTerm);
                    break;
                case 5:
                    filteredData = servis.getByProdi(searchTerm);
                    break;
                case 6:
                    filteredData = servis.getByTahun(searchTerm);
                    break;
                case 7:
                    filteredData = servis.getByPenulis(searchTerm);
                    break;
                case 8:
                    filteredData = servis.getByPembimbing(searchTerm);
                    break;
                case 9:
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
