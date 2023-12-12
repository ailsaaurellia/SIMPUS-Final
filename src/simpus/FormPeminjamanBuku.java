package simpus;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import persisten.Buku;
import persisten.PeminjamanBuku;
import persisten.PeminjamanBukuPK;
import persisten.Pengguna;

/**
 *
 * @author Ailsa
 */
public class FormPeminjamanBuku extends javax.swing.JPanel {

    ArrayList<Pengguna> Pengguna;

    public FormPeminjamanBuku() {
        try {
            Pengguna = new ArrayList<>();
            initComponents();
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Simpus", "postgres", "Chanhee98");
            setTabelModel();
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(FormPeminjamanBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectedDate1 = new com.raven.datechooser.SelectedDate();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        mainPanel = new javax.swing.JPanel();
        dataPeminjaman = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePinjam = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btBatal = new javax.swing.JButton();
        btTambah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        tfCari = new javax.swing.JTextField();
        cbCari = new javax.swing.JComboBox<>();
        tambahData = new javax.swing.JPanel();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_no = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_tPinjam = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_tKembali = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_idAng = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb_status = new javax.swing.JComboBox<>();
        bt_ang = new javax.swing.JButton();
        tf_nama = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cb_ang = new javax.swing.JComboBox<>();
        tf_judul = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_idBuku = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_buku = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        dateChooser1.setTextRefernce(tf_tPinjam);

        dateChooser2.setTextRefernce(tf_tKembali);

        setPreferredSize(new java.awt.Dimension(983, 638));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(983, 638));
        mainPanel.setLayout(new java.awt.CardLayout());

        dataPeminjaman.setBackground(new java.awt.Color(255, 255, 255));
        dataPeminjaman.setPreferredSize(new java.awt.Dimension(983, 638));

        jTablePinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePinjamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePinjam);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/IconPeminjaman.png"))); // NOI18N
        jLabel1.setText("Peminjaman Buku Perpustakaan");

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

        cbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "ID Pengguna", "NIM", "Nama", "Jurusan", "Username", "Telephone", "Level", "Alamat" }));
        cbCari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 183, 137)));

        javax.swing.GroupLayout dataPeminjamanLayout = new javax.swing.GroupLayout(dataPeminjaman);
        dataPeminjaman.setLayout(dataPeminjamanLayout);
        dataPeminjamanLayout.setHorizontalGroup(
            dataPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPeminjamanLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(dataPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataPeminjamanLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(dataPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataPeminjamanLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 888, Short.MAX_VALUE))
                            .addGroup(dataPeminjamanLayout.createSequentialGroup()
                                .addComponent(btTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbCari, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1468, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        dataPeminjamanLayout.setVerticalGroup(
            dataPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPeminjamanLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dataPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(btHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dataPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfCari, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        mainPanel.add(dataPeminjaman, "card2");

        tambahData.setBackground(new java.awt.Color(255, 255, 255));
        tambahData.setPreferredSize(new java.awt.Dimension(983, 638));

        btn_simpan.setBackground(new java.awt.Color(122, 182, 218));
        btn_simpan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/simpan.png"))); // NOI18N
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(239, 117, 117));
        btn_batal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kembali.png"))); // NOI18N
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/IconBuku.png"))); // NOI18N
        jLabel6.setText("Tambah Data Peminjaman Buku");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 1, 1, 1, new java.awt.Color(239, 117, 117)));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(202, 50, 0));
        jLabel2.setText("NO Peminjaman");

        tf_no.setEditable(false);
        tf_no.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_no.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(202, 50, 0));
        jLabel10.setText("Tanggal Pinjam");

        tf_tPinjam.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_tPinjam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_tPinjam.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(202, 50, 0));
        jLabel11.setText("Tanggal Kembali");

        tf_tKembali.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_tKembali.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_tKembali.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tf_no, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addComponent(tf_tPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addComponent(tf_tKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_tKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_no, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(202, 50, 0));
        jLabel3.setText("Anggota");

        tf_idAng.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_idAng.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_idAng.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(202, 50, 0));
        jLabel4.setText("Nama");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(202, 50, 0));
        jLabel7.setText("Status Peminjaman");

        cb_status.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dipinjam", "Kembali" }));

        bt_ang.setBackground(new java.awt.Color(122, 182, 218));
        bt_ang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/cari.png"))); // NOI18N
        bt_ang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_angActionPerformed(evt);
            }
        });

        tf_nama.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_nama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_nama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(202, 50, 0));
        jLabel9.setText("Angkatan");

        cb_ang.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cb_ang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016" }));

        tf_judul.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_judul.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_judul.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(202, 50, 0));
        jLabel5.setText("Buku");

        tf_idBuku.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_idBuku.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_idBuku.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(202, 50, 0));
        jLabel13.setText("Judul");

        tbl_buku.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tbl_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ISBN", "Judul", "Pengarang", "Tahun"
            }
        ));
        jScrollPane2.setViewportView(tbl_buku);

        jButton1.setBackground(new java.awt.Color(122, 182, 218));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/cari.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(239, 117, 117));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/x.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nama)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf_idAng, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_ang))
                            .addComponent(cb_ang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tf_idBuku)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1))
                                    .addComponent(tf_judul))
                                .addGap(338, 338, 338)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_idAng, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_ang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_idBuku)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(tf_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jButton2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_ang, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout tambahDataLayout = new javax.swing.GroupLayout(tambahData);
        tambahData.setLayout(tambahDataLayout);
        tambahDataLayout.setHorizontalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addGap(0, 703, Short.MAX_VALUE))
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addContainerGap(1112, Short.MAX_VALUE)
                        .addComponent(btn_simpan)
                        .addGap(18, 18, 18)
                        .addComponent(btn_batal)))
                .addGap(20, 20, 20))
            .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahDataLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(21, 21, 21)))
        );
        tambahDataLayout.setVerticalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahDataLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 598, Short.MAX_VALUE)
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tambahDataLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(88, 88, 88)))
        );

        mainPanel.add(tambahData, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        mainPanel.removeAll();
        mainPanel.add(tambahData);
        mainPanel.repaint();
        mainPanel.revalidate();

        tf_no.setText(setNoPeminjaman());
        if (btTambah.getText().equals("UBAH")) {
            dataTabel();
            btn_simpan.setText("UBAH");
        }
    }//GEN-LAST:event_btTambahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        String s = (String) jTablePinjam.getValueAt(jTablePinjam.getSelectedRow(), 1);
        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/hapus.png"));
        hapusData();
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

    private void jTablePinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePinjamMouseClicked
        if (btTambah.getText().equals("TAMBAH")) {
            btTambah.setText("UBAH");
            ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/edit.png"));
            btTambah.setIcon(icon);
            btHapus.setVisible(true);
            btBatal.setVisible(true);
        }
    }//GEN-LAST:event_jTablePinjamMouseClicked

    private void btBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatalActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btBatalActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        if (btn_simpan.getText().equals("TAMBAH")) {
            btn_simpan.setText("SIMPAN");
        } else if (btn_simpan.getText().equals("SIMPAN")) {
            insertData();
        } else if (btn_simpan.getText().equals("UBAH")) {
            updateData();
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void bt_angActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_angActionPerformed
        PilihAnggota pilihAnggota = new PilihAnggota(null, true);
        pilihAnggota.setVisible(true);

        Pengguna penggunaTerpilih = pilihAnggota.getPenggunaTerpilih();

        if (penggunaTerpilih != null) {
            tf_idAng.setText(penggunaTerpilih.getIdPengguna());
            tf_nama.setText(penggunaTerpilih.getNama());
        }

    }//GEN-LAST:event_bt_angActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) tbl_buku.getModel();
        PilihBuku pb = new PilihBuku(null, true);
        pb.setVisible(true);

        String id = pb.mod.getIdBuku();
        String isbn = pb.mod.getIsbn();
        String judul = pb.mod.getJudul();
        String pengarang = pb.mod.getPengarang();
        String tahun = pb.mod.getTahun();
        tbl.addRow(new Object[]{id, isbn, judul, pengarang, tahun});

        Buku bukuTerpilih = pb.getBukuTerpilih();
        if (bukuTerpilih != null) {
            tf_idBuku.setText(bukuTerpilih.getIdBuku());
            tf_judul.setText(bukuTerpilih.getJudul());

            jLabel1.requestFocus();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) tbl_buku.getModel();
        int index = tbl_buku.getSelectedRow();
        try {
            tbl.removeRow(index);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus");
        }
        tbl_buku.setModel(tbl);
        jLabel1.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btTambah;
    private javax.swing.JButton bt_ang;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cbCari;
    private javax.swing.JComboBox<String> cb_ang;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JPanel dataPeminjaman;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePinjam;
    private javax.swing.JPanel mainPanel;
    private com.raven.datechooser.SelectedDate selectedDate1;
    private javax.swing.JPanel tambahData;
    private javax.swing.JTable tbl_buku;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField tf_idAng;
    private javax.swing.JTextField tf_idBuku;
    private javax.swing.JTextField tf_judul;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_no;
    private javax.swing.JTextField tf_tKembali;
    private javax.swing.JTextField tf_tPinjam;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) jTablePinjam.getModel());
        if (btTambah.getText().equalsIgnoreCase("UBAH")) {
            btTambah.setText("TAMBAH");
            ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/tambah.png"));
            btTambah.setIcon(icon);
        }
        btHapus.setVisible(false);
        btBatal.setVisible(false);
        jLabel1.requestFocus();
    }

    private void showPanel() {
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(dataPeminjaman);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void kosongkanForm() {
        tf_no.setText("");
        tf_tPinjam.setText("");
        tf_tKembali.setText("");
        tf_idAng.setText("");
        tf_nama.setText("");
        cb_status.setSelectedIndex(0);
        cb_ang.setSelectedIndex(0);
        tf_idBuku.setText("");
        tf_judul.setText("");
    }

    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) jTablePinjam.getModel();
        model.addColumn("NO Peminjaman");
        model.addColumn("ID Anggota");
        model.addColumn("Nama");
        model.addColumn("Angkatan");
        model.addColumn("ID Buku");
        model.addColumn("Judul Buku");
        model.addColumn("Status Peminjaman");
        model.addColumn("Tanggal Pinjam");
        model.addColumn("Tanggal Kembali");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("UASPBOPU");
            em = emf.createEntityManager();
            em.getTransaction().begin();

            TypedQuery<PeminjamanBuku> querySelectAll = em.createNamedQuery("PeminjamanBuku.findAll", PeminjamanBuku.class);
            List<PeminjamanBuku> results = querySelectAll.getResultList();

            for (PeminjamanBuku pinjamBuku : results) {
                PeminjamanBukuPK pk = pinjamBuku.getPeminjamanBukuPK();
                model.addRow(new Object[]{
                    pk.getNoPeminjaman(),
                    pk.getIdPengguna(),
                    pinjamBuku.getNama(),
                    pinjamBuku.getAngkatan(),
                    pk.getIdBuku(),
                    pinjamBuku.getJudulBuku(),
                    pinjamBuku.getStatusPeminjaman(),
                    pinjamBuku.getTanggalPinjam(),
                    pinjamBuku.getTanggalKembali()
                });
            }
            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }

    private void insertData() {
        String noPeminjaman = tf_no.getText().trim();
        String tanggalPinjam = tf_tPinjam.getText();
        String tanggalKembali = tf_tKembali.getText();
        String idPengguna = tf_idAng.getText();
        String namaPengguna = tf_nama.getText();
        String statusPeminjaman = (String) cb_status.getSelectedItem();
        String angkatan = (String) cb_ang.getSelectedItem();
        String idBuku = tf_idBuku.getText();
        String judulBuku = tf_judul.getText();

        if (noPeminjaman.isEmpty() || tanggalPinjam.isEmpty() || tanggalKembali.isEmpty() || idPengguna.isEmpty() || namaPengguna.isEmpty() || statusPeminjaman.isEmpty() || angkatan.isEmpty() || idBuku.isEmpty() || judulBuku.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();

        try {
            em.getTransaction().begin();

            // Periksa apakah Pengguna dengan ID tertentu sudah ada, jika tidak, Anda mungkin perlu membuatnya terlebih dahulu
            Pengguna pengguna = em.find(Pengguna.class, idPengguna);
            if (pengguna == null) {
                // Jika tidak ditemukan, Anda mungkin perlu membuat Pengguna baru terlebih dahulu
                // Sesuaikan dengan atribut Pengguna yang sebenarnya
                pengguna = new Pengguna();
                pengguna.setIdPengguna(idPengguna);
                pengguna.setNama(namaPengguna);
                em.persist(pengguna);
            }

            // Buat objek PeminjamanBuku
            PeminjamanBuku peminjamanBuku = new PeminjamanBuku();

            // Buat objek PeminjamanBukuPK
            PeminjamanBukuPK peminjamanPK = new PeminjamanBukuPK(noPeminjaman, idPengguna, idBuku);
            peminjamanBuku.setPeminjamanBukuPK(peminjamanPK);

            peminjamanBuku.setNama(namaPengguna);
            peminjamanBuku.setAngkatan(angkatan);
            peminjamanBuku.setJudulBuku(judulBuku);
            peminjamanBuku.setStatusPeminjaman(statusPeminjaman);
            peminjamanBuku.setTanggalPinjam(tanggalPinjam);
            peminjamanBuku.setTanggalKembali(tanggalKembali);

            // Persistensi PeminjamanBuku
            em.persist(peminjamanBuku);

            em.getTransaction().commit();

            JOptionPane.showMessageDialog(this, "Data Peminjaman Buku Berhasil Disimpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(this, "Data Gagal Disimpan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            em.close();
        }

        kosongkanForm();
        loadData();
        showPanel();
    }

    private void dataTabel() {
        mainPanel.setVisible(false);
        tambahData.setVisible(true);

        int row = jTablePinjam.getSelectedRow();
        jLabel6.setText("Perbarui Data Pengguna");
        tf_no.setEnabled(false);
        tf_no.setText(jTablePinjam.getValueAt(row, 0).toString());
        tf_idAng.setText(jTablePinjam.getValueAt(row, 1).toString());
        tf_nama.setText(jTablePinjam.getValueAt(row, 2).toString());
        String angkatan = jTablePinjam.getValueAt(row, 3).toString();
        cb_ang.setSelectedItem(angkatan);
        tf_idBuku.setText(jTablePinjam.getValueAt(row, 4).toString());
        tf_judul.setText(jTablePinjam.getValueAt(row, 5).toString());
        String status = jTablePinjam.getValueAt(row, 6).toString();
        cb_status.setSelectedItem(status);
        tf_tPinjam.setText(jTablePinjam.getValueAt(row, 7).toString());
        tf_tKembali.setText(jTablePinjam.getValueAt(row, 8).toString());
        DefaultTableModel tblBukuModel = (DefaultTableModel) tbl_buku.getModel();
        tblBukuModel.setRowCount(0);
    }

    private void updateData() {
        String noPeminjaman = tf_no.getText().trim();
        String tanggalPinjam = tf_tPinjam.getText();
        String tanggalKembali = tf_tKembali.getText();
        String idPengguna = tf_idAng.getText();
        String namaPengguna = tf_nama.getText();
        String statusPeminjaman = (String) cb_status.getSelectedItem();
        String angkatan = (String) cb_ang.getSelectedItem();
        String idBuku = tf_idBuku.getText();
        String judulBuku = tf_judul.getText();

        if (noPeminjaman.isEmpty() || tanggalPinjam.isEmpty() || tanggalKembali.isEmpty() || idPengguna.isEmpty() || namaPengguna.isEmpty() || statusPeminjaman.isEmpty() || angkatan.isEmpty() || idBuku.isEmpty() || judulBuku.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();

        try {
            em.getTransaction().begin();

            // Periksa apakah PeminjamanBuku dengan nomor peminjaman tertentu sudah ada
            PeminjamanBuku peminjamanBuku = em.find(PeminjamanBuku.class, noPeminjaman);

            if (peminjamanBuku != null) {
                // Update data yang diperlukan
                peminjamanBuku.setTanggalPinjam(tanggalPinjam);
                peminjamanBuku.setTanggalKembali(tanggalKembali);
                peminjamanBuku.setStatusPeminjaman(statusPeminjaman);
                peminjamanBuku.setAngkatan(angkatan);

                // Periksa apakah Pengguna dengan ID tertentu sudah ada, jika tidak, Anda mungkin perlu membuatnya terlebih dahulu
                Pengguna pengguna = em.find(Pengguna.class, idPengguna);
                if (pengguna == null) {
                    // Jika tidak ditemukan, Anda mungkin perlu membuat Pengguna baru terlebih dahulu
                    // Sesuaikan dengan atribut Pengguna yang sebenarnya
                    pengguna = new Pengguna();
                    pengguna.setIdPengguna(idPengguna);
                    pengguna.setNama(namaPengguna);
                    em.persist(pengguna);
                }

                // Update data Pengguna
                peminjamanBuku.setNama(namaPengguna);

                // Set objek PeminjamanBukuPK
                PeminjamanBukuPK peminjamanPK = peminjamanBuku.getPeminjamanBukuPK();
                peminjamanPK.setIdBuku(idBuku); // Tambahkan ini untuk mengatur idBuku

                em.getTransaction().commit();

                JOptionPane.showMessageDialog(this, "Data Peminjaman Buku Berhasil Diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data Peminjaman Buku dengan Nomor Peminjaman " + noPeminjaman + " tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(this, "Data Gagal Diupdate: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            em.close();
        }

        kosongkanForm();
        loadData();
        showPanel();
    }

    private String setNoPeminjaman() {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        String jpql = "SELECT MAX(SUBSTRING(p.peminjamanBukuPK.noPeminjaman, 4)) AS maxNumber "
                + "FROM PeminjamanBuku p WHERE p.peminjamanBukuPK.noPeminjaman LIKE 'PJB%'";
        TypedQuery<String> query = em.createQuery(jpql, String.class);

        String urutan = "";
        try {
            String maxNumberString = query.getSingleResult();
            if (maxNumberString != null) {
                int nextNumber = Integer.parseInt(maxNumberString) + 1;
                urutan = "PJB" + String.format("%03d", nextNumber);
            } else {
                urutan = "PJB001";
            }

        } catch (Exception e) {
            // Tangani kesalahan dengan lebih baik
            e.printStackTrace();
        } finally {
            em.close();
        }

        return urutan;
    }

    private void hapusData() {
        int selectedRow = jTablePinjam.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data?",
                "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String no = tf_no.getText().trim();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("UASPBOPU");
            EntityManager em = emf.createEntityManager();
            try {
                em.getTransaction().begin();
                PeminjamanBukuPK peminjamanPK = new PeminjamanBukuPK();
                peminjamanPK.setNoPeminjaman(no);
                em.remove(peminjamanPK);
                em.getTransaction().commit();

                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
            } catch (Exception e) {
                em.getTransaction().rollback();
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
            } finally {
                em.close();
            }
            kosongkanForm();
            loadData();
            showPanel();
        }
    }

}
