package simpus;

import Interfacej.IFPengguna;
import com.toedter.calendar.JDateChooser;
import dao.DaoPengguna;
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
import tabelModel.TabelPengguna;

/**
 *
 * @author Ailsa
 */
public class FormPengguna extends javax.swing.JPanel {

    private Pengguna mod = new Pengguna();
    private IFPengguna servis = new DaoPengguna();
    private TabelPengguna tblModel = new TabelPengguna();

    public FormPengguna() {
        initComponents();
        jTablePengguna.setModel(tblModel);
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

    public FormPengguna(java.awt.Frame parent, boolean modal) {
        super();
        initComponents();
        jLabel6.requestFocus();
        tf_id.setText(servis.nomer());
    }

    public FormPengguna(java.awt.Frame parent, boolean modal, String id) {
        super();
        initComponents();
        jLabel6.requestFocus();
        mod = servis.getById(id);

        setForm(mod);

    }

    private void kosongkan_form() {
        tf_id.setText("");
        tf_nim.setText("");
        tf_nama.setText("");
        tf_jurusan.setText("");
        tf_tempat.setText("");
        tf_tanggal.setText("");
        tf_alamat.setText("");
        tf_telp.setText("");
        tf_user.setText("");
        tf_pass.setText("");
        tf_email.setText("");
        cbLevel.setSelectedIndex(0); // Pilih indeks yang sesuai jika ingin memilih item default
        cbJenis.setSelectedIndex(0); // Pilih indeks yang sesuai jika ingin memilih item default
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectedDate1 = new com.raven.datechooser.SelectedDate();
        mainPanel = new javax.swing.JPanel();
        dataBuku = new javax.swing.JPanel();
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
        jLabel9 = new javax.swing.JLabel();
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
        cbJenis = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        tf_telp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        tf_pass = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(983, 638));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(983, 638));
        mainPanel.setLayout(new java.awt.CardLayout());

        dataBuku.setBackground(new java.awt.Color(255, 255, 255));
        dataBuku.setPreferredSize(new java.awt.Dimension(983, 638));

        jTablePengguna.setModel(new javax.swing.table.DefaultTableModel(
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCariKeyReleased(evt);
            }
        });

        cbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih --", "ID Pengguna", "NIM", "Nama", "Jurusan", "Username", "Telephone", "Level", "Alamat" }));
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
                            .addGroup(dataBukuLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 650, Short.MAX_VALUE))
                            .addGroup(dataBukuLayout.createSequentialGroup()
                                .addComponent(btTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbCari, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE))
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
                        .addComponent(tfCari, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        mainPanel.add(dataBuku, "card2");

        tambahData.setBackground(new java.awt.Color(255, 255, 255));
        tambahData.setPreferredSize(new java.awt.Dimension(983, 638));

        btn_simpan.setBackground(new java.awt.Color(122, 182, 218));
        btn_simpan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/simpan.png"))); // NOI18N
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(202, 50, 0));
        jLabel9.setText("Tanggal Lahir");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(202, 50, 0));
        jLabel12.setText("Jurusan");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(202, 50, 0));
        jLabel5.setText("Level");

        tf_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        tf_nama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        tf_nim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_nim.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));
        tf_nim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nimKeyTyped(evt);
            }
        });

        tf_tanggal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_tanggal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));
        tf_tanggal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_tanggalMouseClicked(evt);
            }
        });
        tf_tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tanggalActionPerformed(evt);
            }
        });
        tf_tanggal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_tanggalKeyTyped(evt);
            }
        });

        tf_tempat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));
        tf_tempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tempatActionPerformed(evt);
            }
        });

        tf_jurusan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));

        tf_alamat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));
        tf_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_alamatActionPerformed(evt);
            }
        });

        cbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anggota", "Petugas" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(202, 50, 0));
        jLabel10.setText("Jenis Kelamin");

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - laki", "Perempuan" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(202, 50, 0));
        jLabel11.setText("Telephone");

        tf_telp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_telp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));
        tf_telp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_telpKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(202, 50, 0));
        jLabel13.setText("Email");

        tf_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));
        tf_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_emailKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(202, 50, 0));
        jLabel14.setText("Username");

        tf_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_user.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));
        tf_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_userKeyTyped(evt);
            }
        });

        tf_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(202, 50, 0)));
        tf_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_passKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(202, 50, 0));
        jLabel15.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tf_nim)))
                    .addComponent(jLabel3)
                    .addComponent(tf_alamat)
                    .addComponent(tf_tempat)
                    .addComponent(tf_jurusan)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                        .addGap(275, 275, 275))
                    .addComponent(tf_nama))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbLevel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbJenis, javax.swing.GroupLayout.Alignment.LEADING, 0, 296, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_telp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(tf_user)
                                    .addComponent(tf_pass))
                                .addGap(3, 3, 3)))
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(tf_email))
                        .addGap(73, 73, 73))))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_tempat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tambahDataLayout = new javax.swing.GroupLayout(tambahData);
        tambahData.setLayout(tambahDataLayout);
        tambahDataLayout.setHorizontalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 504, Short.MAX_VALUE))
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 578, Short.MAX_VALUE)
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

        if (btTambah.getText().equalsIgnoreCase("UBAH")) {
            mainPanel.removeAll();
            mainPanel.repaint();
            mainPanel.revalidate();

            jLabel6.setText("Perbarui Data Pengguna");

            int selectedRow = jTablePengguna.getSelectedRow();

            if (selectedRow >= 0) {
                // Dapatkan data dari baris yang dipilih
                Pengguna selectedBuku = tblModel.getData(selectedRow);            }

                mainPanel.add(tambahData);
                mainPanel.repaint();
                mainPanel.revalidate();
            } else {
                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();

                // Buka panel tambahData (sesuaikan dengan nama panel yang sesuai)
                mainPanel.add(tambahData);
                mainPanel.repaint();
                mainPanel.revalidate();
            }

            kosongkan_form();
            loadData();

    }//GEN-LAST:event_btTambahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        String s = (String) jTablePengguna.getValueAt(jTablePengguna.getSelectedRow(), 1);
        ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/hapus.png"));
        if (JOptionPane.showConfirmDialog(null, "Menghapus pengguna dengan ID " + s, "Apakah anda yakin", 0, 0, icon) == 0) {
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

    private void jTablePenggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePenggunaMouseClicked
        if (btTambah.getText().equalsIgnoreCase("TAMBAH")) {
            btTambah.setText("UBAH");
            ImageIcon icon = new ImageIcon(getClass().getResource("/gambar/edit.png"));
            btTambah.setIcon(icon);
        }
        btHapus.setVisible(true);
        btBatal.setVisible(true);
    }//GEN-LAST:event_jTablePenggunaMouseClicked

    private void btBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatalActionPerformed
        loadData();
    }//GEN-LAST:event_btBatalActionPerformed

    private void tfCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCariKeyReleased

    }//GEN-LAST:event_tfCariKeyReleased

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        // Buka panel tambahData (sesuaikan dengan nama panel yang sesuai)
        mainPanel.add(dataBuku);
        mainPanel.repaint();
        mainPanel.revalidate();

    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        mod.setIdPengguna(tf_id.getText());
        mod.setNim(tf_nim.getText());
        mod.setNama(tf_nama.getText());
        mod.setJurusan(tf_jurusan.getText());
        mod.setTempatLahir(tf_tempat.getText());
        mod.setTanggalLahir(tf_tanggal.getText());
        mod.setAlamat(tf_alamat.getText());
        mod.setTelephone(tf_telp.getText());
        mod.setUsername(tf_user.getText());
        mod.setPassword(tf_pass.getText());
        mod.setEmail(tf_email.getText());
        // Ambil item yang dipilih dari JComboBox
        String level = (String) cbLevel.getSelectedItem();
        mod.setLevel(level);
        String jenis = (String) cbJenis.getSelectedItem();
        mod.setJenisKelamin(jenis);

        if (jLabel6.getText().equalsIgnoreCase("Tambah Data Pengguna")) {
            servis.tambahData(mod);
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } else {
            servis.ubahData(mod);
            JOptionPane.showMessageDialog(this, "Data berhasil diubah!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }
        kosongkan_form();
        loadData();

        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(dataBuku);
        mainPanel.repaint();
        mainPanel.revalidate();
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

    private void tf_tempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_tempatActionPerformed

    private void tf_tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_tanggalActionPerformed

    private void tf_tanggalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_tanggalMouseClicked
        JFrame frame = new JFrame("Date Picker Example");
        frame.setSize(200, 100);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JDateChooser dateChooser = new JDateChooser();

// Menghapus editor dari JDateChooser agar tidak dapat diedit
        dateChooser.getDateEditor().setEnabled(false);

// Set format tanggal yang diinginkan pada JDateChooser
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateChooser.setDateFormatString("yyyy/MM/dd");

        dateChooser.addPropertyChangeListener(e -> {
            if ("date".equals(e.getPropertyName())) {
                Date selectedDate = dateChooser.getDate();
                if (selectedDate != null) {
                    String formattedDate = dateFormat.format(selectedDate);
                    dateChooser.setDate(selectedDate); // Menetapkan tanggal yang diformat kembali ke dateChooser
                    dateChooser.repaint(); // Memperbarui tampilan dateChooser
                    dateChooser.transferFocus(); // Pindah fokus dari dateChooser

                    // Set tanggal yang diformat ke j4
                    tf_tanggal.setText(formattedDate);
                }
            }
        });

        panel.add(dateChooser);

        frame.add(panel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_tf_tanggalMouseClicked

    private void tf_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_alamatActionPerformed

    private void tf_telpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_telpKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_telpKeyTyped

    private void tf_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_emailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_emailKeyTyped

    private void tf_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_userKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_userKeyTyped

    private void tf_passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_passKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_passKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btTambah;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cbCari;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JComboBox<String> cbLevel;
    private javax.swing.JPanel dataBuku;
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

    private void setColWidht() {
        int[] noCol = {0, 1, 2, 7, 8};
        int[] noColW = {60, 80, 150, 80, 80};

        TableColumnModel tblModel = jTablePengguna.getColumnModel();
        for (int i = 0; i < noCol.length; i++) {
            tblModel.getColumn(noCol[i]).setPreferredWidth(noColW[i]);
            tblModel.getColumn(noCol[i]).setMaxWidth(noColW[i]);
            tblModel.getColumn(noCol[i]).setMinWidth(noColW[i]);
        }
    }

    private void loadData() {
        List<Pengguna> list = servis.ambilData();
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
        String sc = tfCari.getText();
        List<Pengguna> list = new ArrayList<>();

        if (sc.isEmpty()) {
            list = servis.ambilData();
        } else {
            switch (cbCari.getSelectedIndex()) {
                case 1:
                    list = servis.getByID(sc);
                    break;
                case 2:
                    list = servis.getByNim(sc);
                    break;
                case 3:
                    list = servis.getByNama(sc);
                    break;
                case 4:
                    list = servis.getByJurusan(sc);
                    break;
                case 5:
                    list = servis.getByUsername(sc);
                    break;
                case 6:
                    list = servis.getByTelephone(sc);
                    break;
                case 7:
                    list = servis.getByLevel(sc);
                    break;
                case 8:
                    list = servis.getByAlamat(sc);
                    break;
                // tambahkan case lain sesuai kebutuhan
            }
        }

        tblModel.setData(list);
    }

    private void setForm(Pengguna mod) {
        jLabel6.setText("Perbarui Data Buku");
        tf_id.setText(mod.getIdPengguna());
        tf_nim.setText(mod.getNim());
        tf_nama.setText(mod.getNama());
        tf_jurusan.setText(mod.getJurusan());
        tf_tempat.setText(mod.getTempatLahir());
        tf_tanggal.setText(mod.getTanggalLahir());
        tf_alamat.setText(mod.getAlamat());
        tf_telp.setText(mod.getTelephone());
        tf_user.setText(mod.getUsername());
        tf_pass.setText(mod.getPassword());
        tf_email.setText(mod.getEmail());
        String level = (String) cbLevel.getSelectedItem();
        mod.setLevel(level);
        String jenis = (String) cbJenis.getSelectedItem();
        mod.setJenisKelamin(jenis);
    }

}
