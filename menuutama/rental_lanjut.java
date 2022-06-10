/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuutama;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import rentalmobil.koneksi;
/**
 *
 * @author asus
 */
public class rental_lanjut extends javax.swing.JFrame {
    
    
    private DefaultTableModel model;
    Connection con;//deklarasi variabel connection
    Statement stat;//deklarasi variabel statement, query
    ResultSet rs; // hasil load dari query
    String sql;
    
    /**
     * Creates new form rental_lanjut
     */
    public rental_lanjut() {
        initComponents();
        kosong();
        load_table();
        
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rentalMobil1 = new rentalmobil.RentalMobil();
        transparant2 = new rentalmobil.transparant();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nikTf = new javax.swing.JTextField();
        teleponTf = new javax.swing.JTextField();
        namaTf = new javax.swing.JTextField();
        alamatTf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_clear_dp = new java.awt.Button();
        transparant3 = new rentalmobil.transparant();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        mobilTf = new javax.swing.JTextField();
        platNomorTf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_simpan = new java.awt.Button();
        transparant4 = new rentalmobil.transparant();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        hargaTf = new javax.swing.JTextField();
        statusBayarTf = new javax.swing.JTextField();
        jumlahHariTf = new javax.swing.JTextField();
        totalHargaTf = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btn_hitung = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        statusTf = new javax.swing.JTextField();
        tglSewaTf = new com.toedter.calendar.JDateChooser();
        tglPengembalianTf = new com.toedter.calendar.JDateChooser();
        transparant5 = new rentalmobil.transparant();
        jLabel26 = new javax.swing.JLabel();
        cariMobilTf = new javax.swing.JTextField();
        btn_cari = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        the_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("DATA PEMINJAM");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Alamat *");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setText("Nama *");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setText("No.Telp *");

        teleponTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleponTfActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setText("* Wajib diisi");

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setText("No.KTP *");

        btn_clear_dp.setBackground(new java.awt.Color(255, 255, 255));
        btn_clear_dp.setLabel("Clear");
        btn_clear_dp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear_dpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transparant2Layout = new javax.swing.GroupLayout(transparant2);
        transparant2.setLayout(transparant2Layout);
        transparant2Layout.setHorizontalGroup(
            transparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparant2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(73, 73, 73))
            .addGroup(transparant2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transparant2Layout.createSequentialGroup()
                        .addGroup(transparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addGap(48, 48, 48)
                        .addGroup(transparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, transparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(teleponTf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(alamatTf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, transparant2Layout.createSequentialGroup()
                                .addGroup(transparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(namaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nikTf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addComponent(btn_clear_dp, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        transparant2Layout.setVerticalGroup(
            transparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparant2Layout.createSequentialGroup()
                .addGroup(transparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transparant2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18))
                    .addGroup(transparant2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(transparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(nikTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(transparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(namaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_clear_dp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(transparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(alamatTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(transparant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(teleponTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setText("PENYEWAAN");

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setText("Plat Nomor");

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setText("Tgl Sewa");

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel18.setText("Tgl Pengembalian");

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel19.setText("Mobil");

        btn_simpan.setBackground(new java.awt.Color(51, 255, 51));
        btn_simpan.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btn_simpan.setLabel("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel20.setText("PERHITUNGAN");

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel21.setText("Total Harga");

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel22.setText("Jumlah Hari");

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel23.setText("Status Pembayaran");

        statusBayarTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusBayarTfActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel24.setText("Penyewaan >= 5 Diskon 20%");

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel25.setText("Harga / Hari");

        btn_hitung.setBackground(new java.awt.Color(51, 255, 51));
        btn_hitung.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btn_hitung.setLabel("Hitung");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transparant4Layout = new javax.swing.GroupLayout(transparant4);
        transparant4.setLayout(transparant4Layout);
        transparant4Layout.setHorizontalGroup(
            transparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparant4Layout.createSequentialGroup()
                .addGroup(transparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(transparant4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(transparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(transparant4Layout.createSequentialGroup()
                                .addGroup(transparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel23))
                                .addGap(48, 48, 48)
                                .addGroup(transparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, transparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(statusBayarTf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(totalHargaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, transparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jumlahHariTf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hargaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))))
                .addGap(0, 206, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transparant4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transparant4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        transparant4Layout.setVerticalGroup(
            transparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparant4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hargaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(12, 12, 12)
                .addGroup(transparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jumlahHariTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(transparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(totalHargaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(transparant4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(statusBayarTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Status");

        statusTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusTfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transparant3Layout = new javax.swing.GroupLayout(transparant3);
        transparant3.setLayout(transparant3Layout);
        transparant3Layout.setHorizontalGroup(
            transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparant3Layout.createSequentialGroup()
                .addGroup(transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transparant3Layout.createSequentialGroup()
                        .addGroup(transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(transparant3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tglPengembalianTf, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(statusTf, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(platNomorTf, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(mobilTf)
                                    .addComponent(tglSewaTf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE))
                    .addGroup(transparant3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addComponent(transparant4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        transparant3Layout.setVerticalGroup(
            transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transparant4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transparant3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(mobilTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(statusTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(platNomorTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(tglSewaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(tglPengembalianTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel26.setText("CARI NAMA MOBIL");

        btn_cari.setBackground(new java.awt.Color(51, 255, 102));
        btn_cari.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btn_cari.setLabel("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transparant5Layout = new javax.swing.GroupLayout(transparant5);
        transparant5.setLayout(transparant5Layout);
        transparant5Layout.setHorizontalGroup(
            transparant5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparant5Layout.createSequentialGroup()
                .addComponent(jLabel26)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(transparant5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cariMobilTf, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        transparant5Layout.setVerticalGroup(
            transparant5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparant5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addGroup(transparant5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cari, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(cariMobilTf))
                .addContainerGap())
        );

        the_table.setModel(new javax.swing.table.DefaultTableModel(
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
        the_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                the_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(the_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rentalMobil1Layout = new javax.swing.GroupLayout(rentalMobil1);
        rentalMobil1.setLayout(rentalMobil1Layout);
        rentalMobil1Layout.setHorizontalGroup(
            rentalMobil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentalMobil1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rentalMobil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rentalMobil1Layout.createSequentialGroup()
                        .addGroup(rentalMobil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(rentalMobil1Layout.createSequentialGroup()
                                .addComponent(transparant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(transparant5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(transparant3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rentalMobil1Layout.setVerticalGroup(
            rentalMobil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentalMobil1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rentalMobil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transparant5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transparant2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transparant3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setText("FORM PEMINJAMAN MOBIL");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuutama/rent-a-car (2).png"))); // NOI18N

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/backspace-arrow-point-left_318-1409.jpg"))); // NOI18N
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back)
                .addGap(203, 203, 203)
                .addComponent(jLabel9)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addGap(31, 31, 31))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rentalMobil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rentalMobil1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
         String tampilan = "yyyy-MM-dd";
         SimpleDateFormat fm = new SimpleDateFormat(tampilan);
         String tanggal = String.valueOf(fm.format(tglSewaTf.getDate()));
         String tanggal2 = String.valueOf(fm.format(tglPengembalianTf.getDate()));
       
        try {
            String sql = "INSERT INTO peminjaman VALUES ('"+namaTf.getText()+"','"+nikTf.getText()+"','"+alamatTf.getText()+"','"+teleponTf.getText()+"','"+platNomorTf.getText()+"','"+hargaTf.getText()+"','"+tanggal+"','"+jumlahHariTf.getText()+"','"+tanggal2+"','"+totalHargaTf.getText()+"','"+statusBayarTf.getText()+"')";
            
            java.sql.Connection conn=(Connection)koneksi.config();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            
            this.setVisible(false);
            new rental_detail().setVisible(true);
            /*
            nikTf.setText("");
            namaTf.setText("");
            alamatTf.setText("");
            teleponTf.setText("");
            platNomorTf.setText("");
            hargaTf.setText("");
            tglSewaTf.setDateFormatString("");
            jumlahHariTf.setText("");
            tglPengembalianTf.setDateFormatString("");
            totalHargaTf.setText("");
            statusBayarTf.setText("");
            */
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
       kosong();
       load_table();
       
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_clear_dpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear_dpActionPerformed
        // bersihkan form
        kosong();
    }//GEN-LAST:event_btn_clear_dpActionPerformed

    private void teleponTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleponTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleponTfActionPerformed

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void statusBayarTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusBayarTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusBayarTfActionPerformed

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        // TODO add your handling code here:
        double hasilhitung = (int) Double.parseDouble(hargaTf.getText())*
        Double.parseDouble(jumlahHariTf.getText());
        
        double hari = (int) Double.parseDouble(jumlahHariTf.getText());
        double diskon = (int) hasilhitung * 0.2;
        
        double total = hasilhitung-diskon;
        
        if(hargaTf.getText().isEmpty() || jumlahHariTf.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Error :  data harus diisi","", JOptionPane.WARNING_MESSAGE);
        }else{
            
            if(hari>=5){
                totalHargaTf.setText(""+total);
            }
            else{
                totalHargaTf.setText(""+hasilhitung);
            }
        }
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
       load_table();
        /* try{
            Statement st = Lconnection.createStatement();
            ResultSet rs = st.executeQuery("Select * from stock" + "where mobil like('%" + cariMobilTf.getText() + "%')");
            
            if(rs.next()){
                btn_hitung.setEnabled(true);
                mobilTf.setText(rs.getString ("mobil"));
                platNomorTf.setText(rs.getString("plat_nomor"));
                hargaTf.setText(rs.getString("harga"));
                statusTf.setText(rs.getString("status"));
            }else{
                JOptionPane.showMessageDialog(this,"Nama : Salah","Informasi",JOptionPane.INFORMATION_MESSAGE);
                btn_hitung.setEnabled(false);
                mobilTf.setText("");
                platNomorTf.setText("");
                hargaTf.setText("");
                statusTf.setText("");
                cariMobilTf.setText("");
                cariMobilTf.requestFocus();
            }
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal" + e.toString());
        }
        */
    }//GEN-LAST:event_btn_cariActionPerformed

    private void statusTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusTfActionPerformed

    private void the_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_the_tableMouseClicked
        // TODO add your handling code here:
        int baris = the_table.rowAtPoint(evt.getPoint());

        String mobil = the_table.getValueAt(baris,1).toString();
        mobilTf.setText(mobil);
        
        String plat_nomor =the_table.getValueAt(baris, 2).toString();
        platNomorTf.setText(plat_nomor);

        String harga=the_table.getValueAt(baris, 3).toString();
        hargaTf.setText(harga);
        
        String status=the_table.getValueAt(baris, 4).toString();
        statusTf.setText(status);
    }//GEN-LAST:event_the_tableMouseClicked
    
    private void load_table(){
        DefaultTableModel model = new DefaultTableModel(); //DefaultTableModel mendeklarasikan class yang digunakan untuk memberikan header dan data pada kolom dan baris tabel
        model.addColumn("Id");
        model.addColumn("Mobil");
        model.addColumn("Plat Nomor");
        model.addColumn("Harga");
        model.addColumn("Status");
       // membuat tampilan model tabel
        
        String cari = cariMobilTf.getText();
        //menampilkan data database kedalam tabel
        try {
            con =koneksi.config();
            stat = con.createStatement();
            rs = stat.executeQuery("SELECT * From stock WHERE mobil LIKE '%"+cari+"%'");
           
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
            }
            the_table.setModel(model);
        } catch (SQLException e) {
        }
       
    }
    
    private void kosong(){
        nikTf.setText(null);
        namaTf.setText(null);
        alamatTf.setText(null);
        teleponTf.setText(null);  
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rental_lanjut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatTf;
    private javax.swing.JLabel btn_back;
    private java.awt.Button btn_cari;
    private java.awt.Button btn_clear_dp;
    private java.awt.Button btn_hitung;
    private java.awt.Button btn_simpan;
    private javax.swing.JTextField cariMobilTf;
    private javax.swing.JTextField hargaTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahHariTf;
    private javax.swing.JTextField mobilTf;
    private javax.swing.JTextField namaTf;
    private javax.swing.JTextField nikTf;
    private javax.swing.JTextField platNomorTf;
    private rentalmobil.RentalMobil rentalMobil1;
    private javax.swing.JTextField statusBayarTf;
    private javax.swing.JTextField statusTf;
    private javax.swing.JTextField teleponTf;
    private com.toedter.calendar.JDateChooser tglPengembalianTf;
    private com.toedter.calendar.JDateChooser tglSewaTf;
    private javax.swing.JTable the_table;
    private javax.swing.JTextField totalHargaTf;
    private rentalmobil.transparant transparant2;
    private rentalmobil.transparant transparant3;
    private rentalmobil.transparant transparant4;
    private rentalmobil.transparant transparant5;
    // End of variables declaration//GEN-END:variables

   

}
