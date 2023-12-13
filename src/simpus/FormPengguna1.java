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
import persisten.Pengguna;

/**
 *
 * @author Ailsa
 */
public class FormPengguna1 extends javax.swing.JPanel {

    ArrayList<Pengguna> Pengguna;

    public FormPengguna1() {
        try {
            Pengguna = new ArrayList<>();
            initComponents();
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Simpus", "postgres", "Chanhee98");
            setTabelModel();
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(FormPengguna1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectedDate1 = new com.raven.datechooser.SelectedDate();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        bgJenis = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        dataPengguna = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePengguna = new javax.swing.JTable();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_nama = new javax.swing.JTextField();
        tf_nim = new javax.swing.JTextField();
        tf_tanggal = new javax.swing.JTextField();
        tf_tempat = new javax.swing.JTextField();
        tf_jurusan = new javax.swing.JTextField();
        tf_alamat = new javax.swing.JTextField();
        cbLevel = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_telp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        tf_pass = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();

        dateChooser1.setTextRefernce(tf_tanggal);

        setPreferredSize(new java.awt.Dimension(983, 638));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(983, 638));
        mainPanel.setLayout(new java.awt.CardLayout());

        dataPengguna.setBackground(new java.awt.Color(255, 255, 255));
        dataPengguna.setPreferredSize(new java.awt.Dimension(983, 638));

        jTablePengguna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePenggunaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePengguna);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/IconPengguna.png"))); // NOI18N
        jLabel1.setText("Data Pengguna");

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

        tfCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCariKeyTyped(evt);
            }
        });

        cbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "ID Pengguna", "NIM", "Nama", "Jurusan", "Username", "Telephone", "Level", "Alamat" }));
        cbCari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 183, 137)));

        javax.swing.GroupLayout dataPenggunaLayout = new javax.swing.GroupLayout(dataPengguna);
        dataPengguna.setLayout(dataPenggunaLayout);
        dataPenggunaLayout.setHorizontalGroup(
            dataPenggunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPenggunaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(dataPenggunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataPenggunaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(dataPenggunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataPenggunaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 650, Short.MAX_VALUE))
                            .addGroup(dataPenggunaLayout.createSequentialGroup()
                                .addComponent(btTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbCari, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        dataPenggunaLayout.setVerticalGroup(
            dataPenggunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPenggunaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataPenggunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dataPenggunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(btHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dataPenggunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfCari, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        mainPanel.add(dataPengguna, "card2");

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
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/IconPengguna.png"))); // NOI18N
        jLabel6.setText("Tambah Data Pengguna");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 1, 1, 1, new java.awt.Color(239, 117, 117)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(202, 50, 0));
        jLabel2.setText("ID Pengguna");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(202, 50, 0));
        jLabel3.setText("Nama Lengkap");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(202, 50, 0));
        jLabel4.setText("NIM");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(202, 50, 0));
        jLabel7.setText("Alamat");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(202, 50, 0));
        jLabel8.setText("Tempat Lahir");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(202, 50, 0));
        jLabel12.setText("Jurusan");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(202, 50, 0));
        jLabel5.setText("Level");

        tf_id.setEditable(false);
        tf_id.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        tf_nama.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_nama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        tf_nim.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_nim.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));
        tf_nim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nimKeyTyped(evt);
            }
        });

        tf_tanggal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_tanggal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_tanggal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));
        tf_tanggal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_tanggalKeyTyped(evt);
            }
        });

        tf_tempat.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_tempat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        tf_jurusan.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_jurusan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        tf_alamat.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_alamat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        cbLevel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anggota", "Petugas" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(202, 50, 0));
        jLabel10.setText("Jenis Kelamin");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(202, 50, 0));
        jLabel11.setText("Telephone");

        tf_telp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_telp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(202, 50, 0));
        jLabel13.setText("Email");

        tf_email.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(202, 50, 0));
        jLabel14.setText("Username");

        tf_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_user.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        tf_pass.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tf_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(202, 50, 0));
        jLabel15.setText("Password");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(202, 50, 0));
        jLabel9.setText("Tanggal Lahir");

        rbLaki.setBackground(new java.awt.Color(255, 255, 255));
        bgJenis.add(rbLaki);
        rbLaki.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rbLaki.setText("Laki - laki");

        rbPerempuan.setBackground(new java.awt.Color(255, 255, 255));
        bgJenis.add(rbPerempuan);
        rbPerempuan.setText("Perempuan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(tf_nim, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)))
                            .addComponent(tf_alamat)
                            .addComponent(tf_tempat)
                            .addComponent(tf_jurusan)
                            .addComponent(tf_nama)
                            .addComponent(tf_tanggal)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbLevel, javax.swing.GroupLayout.Alignment.LEADING, 0, 296, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_telp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(tf_user)
                                    .addComponent(tf_pass))
                                .addGap(3, 3, 3))
                            .addComponent(tf_email, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbLaki)
                                .addGap(18, 18, 18)
                                .addComponent(rbPerempuan)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nim, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(cbLevel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbLaki)
                    .addComponent(rbPerempuan))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_jurusan, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(tf_telp))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tempat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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
                        .addGap(0, 504, Short.MAX_VALUE))
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 525, Short.MAX_VALUE)
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

        tf_id.setText(setIDPengguna());
        if (btTambah.getText().equals("UBAH")) {
            dataTabel();
            btn_simpan.setText("UBAH");
        }
    }//GEN-LAST:event_btTambahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        String s = (String) jTablePengguna.getValueAt(jTablePengguna.getSelectedRow(), 0);
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

    private void jTablePenggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePenggunaMouseClicked
        if (btTambah.getText().equals("TAMBAH")) {
            btTambah.setText("UBAH");
            ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/edit.png"));
            btTambah.setIcon(icon);
            btHapus.setVisible(true);
            btBatal.setVisible(true);
        }
    }//GEN-LAST:event_jTablePenggunaMouseClicked

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

    private void tf_nimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nimKeyTyped
        if (tf_nim.getText().length() >= 13) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_nimKeyTyped

    private void tf_tanggalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_tanggalKeyTyped
        char a = evt.getKeyChar();
        if (!Character.isDigit(a) || tf_tanggal.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_tanggalKeyTyped

    private void tfCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCariKeyTyped
        searchData();
    }//GEN-LAST:event_tfCariKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgJenis;
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btTambah;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cbCari;
    private javax.swing.JComboBox<String> cbLevel;
    private javax.swing.JPanel dataPengguna;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePengguna;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private com.raven.datechooser.SelectedDate selectedDate1;
    private javax.swing.JPanel tambahData;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField tf_alamat;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_jurusan;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_nim;
    private javax.swing.JTextField tf_pass;
    private javax.swing.JTextField tf_tanggal;
    private javax.swing.JTextField tf_telp;
    private javax.swing.JTextField tf_tempat;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) jTablePengguna.getModel());
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
        mainPanel.add(dataPengguna);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void kosongkanForm() {
        tf_id.setText("");
        tf_nim.setText("");
        tf_nama.setText("");
        tf_jurusan.setText("");
        tf_tempat.setText("");
        tf_tanggal.setText("");
        tf_user.setText("");
        tf_pass.setText("");
        tf_alamat.setText("");
        cbLevel.setSelectedItem(this);
        bgJenis.clearSelection();
        tf_telp.setText("");
        tf_email.setText("");
    }

    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) jTablePengguna.getModel();
        model.addColumn("ID Pengguna");
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Jurusan");
        model.addColumn("Tempat Lahir");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("Alamat");
        model.addColumn("Level");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Telephone");
        model.addColumn("Email");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("UASPBOPU");
            em = emf.createEntityManager();
            em.getTransaction().begin();

            TypedQuery<Pengguna> querySelectAll = em.createNamedQuery("Pengguna.findAll", Pengguna.class);
            List<Pengguna> results = querySelectAll.getResultList();

            for (Pengguna pengguna : results) {
                model.addRow(new Object[]{
                    pengguna.getIdPengguna(),
                    pengguna.getNim(),
                    pengguna.getNama(),
                    pengguna.getJurusan(),
                    pengguna.getTempatLahir(),
                    pengguna.getTanggalLahir(),
                    pengguna.getUsername(),
                    pengguna.getPassword(),
                    pengguna.getAlamat(),
                    pengguna.getLevel(),
                    pengguna.getJenisKelamin(),
                    pengguna.getTelephone(),
                    pengguna.getEmail(),});
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

    private String setIDPengguna() {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        String jpql = "SELECT SUBSTRING(p.idPengguna, LENGTH(p.idPengguna) - 2) AS nomor "
                + "FROM Pengguna p WHERE p.idPengguna LIKE 'PG%' ORDER BY p.idPengguna DESC";
        TypedQuery<String> query = em.createQuery(jpql, String.class);
        query.setMaxResults(1);

        String urutan = "";
        try {
            String lastNumber = query.getSingleResult().replaceAll("[^\\d]", "");
            int nextNumber = Integer.parseInt(lastNumber) + 1;
            urutan = "PG" + String.format("%02d", nextNumber);

        } catch (Exception e) {
            // Tangani kesalahan dengan lebih baik
            e.printStackTrace();
        } finally {
            em.close();
        }

        return urutan;
    }

    private void insertData() {
        String id = tf_id.getText().trim();
        String nim = tf_nim.getText();
        String nama = tf_nama.getText();
        String jurusan = tf_jurusan.getText();
        String tempat = tf_tempat.getText();
        String tanggal = tf_tanggal.getText();
        String user = tf_user.getText();
        String pass = tf_pass.getText();
        String alamat = tf_alamat.getText();
        String level = (String) cbLevel.getSelectedItem();
        String jenis;
        if (rbLaki.isSelected()) {
            jenis = rbLaki.getText();
        } else if (rbPerempuan.isSelected()) {
            jenis = rbPerempuan.getText();
        } else {
            jenis = "";
        }
        String telp = tf_telp.getText();
        String email = tf_email.getText();

        if (id.isEmpty() || nim.isEmpty() || nama.isEmpty() || user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();

        try {
            em.getTransaction().begin();

            Pengguna p = new Pengguna();
            p.setIdPengguna(id);
            p.setNim(nim);
            p.setNama(nama);
            p.setJurusan(jurusan);
            p.setTempatLahir(tempat);
            p.setTanggalLahir(tanggal);
            p.setUsername(user);
            p.setPassword(pass);
            p.setAlamat(alamat);
            p.setLevel(level);
            p.setJenisKelamin(jenis);
            p.setTelephone(telp);
            p.setEmail(email);
            em.persist(p);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(this, "Data Gagal Disimpan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            em.close();
        }

        kosongkanForm();
        loadData();
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(dataPengguna);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void dataTabel() {
        mainPanel.setVisible(false);
        tambahData.setVisible(true);

        int row = jTablePengguna.getSelectedRow();
        jLabel6.setText("Perbarui Data Pengguna");
        tf_id.setEnabled(false);

        tf_id.setText(jTablePengguna.getValueAt(row, 0).toString());
        tf_nim.setText(jTablePengguna.getValueAt(row, 1).toString());
        tf_nama.setText(jTablePengguna.getValueAt(row, 2).toString());
        tf_jurusan.setText(jTablePengguna.getValueAt(row, 3).toString());
        tf_tempat.setText(jTablePengguna.getValueAt(row, 4).toString());
        tf_tanggal.setText(jTablePengguna.getValueAt(row, 5).toString());
        tf_user.setText(jTablePengguna.getValueAt(row, 6).toString());
        tf_pass.setText(jTablePengguna.getValueAt(row, 7).toString());
        tf_alamat.setText(jTablePengguna.getValueAt(row, 8).toString());
        String level = jTablePengguna.getValueAt(row, 9).toString();
        cbLevel.setSelectedItem(level);
        String jenis = jTablePengguna.getValueAt(row, 10).toString();
        if (jenis.equals("Laki - laki")) {
            rbLaki.setSelected(true);
        } else if (jenis.equals("Perempuan")) {
            rbPerempuan.setSelected(true);
        }
        tf_telp.setText(jTablePengguna.getValueAt(row, 11).toString());
        tf_email.setText(jTablePengguna.getValueAt(row, 12).toString());
    }

    private void updateData() {
        String id = tf_id.getText().trim();
        String nim = tf_nim.getText();
        String nama = tf_nama.getText();
        String jurusan = tf_jurusan.getText();
        String tempat = tf_tempat.getText();
        String tanggal = tf_tanggal.getText();
        String user = tf_user.getText();
        String pass = tf_pass.getText();
        String alamat = tf_alamat.getText();
        String level = (String) cbLevel.getSelectedItem();
        String jenis;
        if (rbLaki.isSelected()) {
            jenis = rbLaki.getText();
        } else if (rbPerempuan.isSelected()) {
            jenis = rbPerempuan.getText();
        } else {
            jenis = "";
        }
        String telp = tf_telp.getText();
        String email = tf_email.getText();

        if (id.isEmpty() || nim.isEmpty() || nama.isEmpty() || user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UASPBOPU");
        EntityManager em = emf.createEntityManager();

        try {
            Pengguna p = new Pengguna();
            p.setIdPengguna(id);
            p.setNim(nim);
            p.setNama(nama);
            p.setJurusan(jurusan);
            p.setTempatLahir(tempat);
            p.setTanggalLahir(tanggal);
            p.setUsername(user);
            p.setPassword(pass);
            p.setAlamat(alamat);
            p.setLevel(level);
            p.setJenisKelamin(jenis);
            p.setTelephone(telp);
            p.setEmail(email);
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui", "Sukses", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(this, "Data Gagal Diperbarui: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
            kosongkanForm();
            loadData();
            showPanel();

        }
    }

   private void hapusData() {
    int selectedRow = jTablePengguna.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data?",
            "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        String id = (String) jTablePengguna.getValueAt(selectedRow, 0);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UASPBOPU");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Pengguna p = em.find(Pengguna.class, id);

            if (p != null) {
                em.remove(p);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
            } else {
                JOptionPane.showMessageDialog(this, "Data dengan ID " + id + " tidak ditemukan", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }

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


    private void searchData() {
        try {
            String selection = (String) cbCari.getSelectedItem();
            String searchTerm = tfCari.getText();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT p FROM Pengguna p WHERE ";

            switch (selection.toLowerCase()) {
                case "ID Pengguna":
                    queryString += "LOWER(p.idPengguna) LIKE LOWER(:searchTerm)";
                    break;
                case "NIM":
                    queryString += "LOWER(p.nim) LIKE LOWER(:searchTerm)";
                    break;
                case "Nama":
                    queryString += "LOWER(p.nama) LIKE LOWER(:searchTerm)";
                    break;
                case "Jurusan":
                    queryString += "LOWER(p.jurusan) LIKE LOWER(:searchTerm)";
                    break;
                case "Username":
                    queryString += "LOWER(p.username) LIKE LOWER(:searchTerm)";
                    break;
                case "Telephone":
                    queryString += "LOWER(p.telephone) LIKE LOWER(:searchTerm)";
                    break;
                case "Level":
                    queryString += "LOWER(p.level) LIKE LOWER(:searchTerm)";
                    break;
                case "Alamat":
                    queryString += "LOWER(p.alamat) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    queryString += "LOWER(p.idPengguna) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(p.nim) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(p.nama) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(p.jurusan) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(p.username) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(p.telephone) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(p.level) LIKE LOWER(:searchTerm)"
                            + " OR LOWER(p.alamat) LIKE LOWER(:searchTerm)";
                    break;
            }
            DefaultTableModel model = (DefaultTableModel) jTablePengguna.getModel();
            model.setRowCount(0);

            EntityManager em = null;
            try {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("UASPBOPU");
                em = emf.createEntityManager();

                TypedQuery<Pengguna> query = em.createQuery(queryString, Pengguna.class);
                query.setParameter("searchTerm", "%" + searchTerm + "%");

                List<Pengguna> results = query.getResultList();

                for (Pengguna pengguna : results) {
                    // Tambahkan baris ke model berdasarkan data pengguna
                    model.addRow(new Object[]{
                        pengguna.getIdPengguna(),
                        pengguna.getNim(),
                        pengguna.getNama(),
                        pengguna.getJurusan(),
                        pengguna.getTempatLahir(),
                        pengguna.getTanggalLahir(),
                        pengguna.getUsername(),
                        pengguna.getPassword(),
                        pengguna.getAlamat(),
                        pengguna.getLevel(),
                        pengguna.getJenisKelamin(),
                        pengguna.getTelephone(),
                        pengguna.getEmail(),});
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                if (em != null && em.isOpen()) {
                    em.close();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
