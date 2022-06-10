/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuutama;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rentalmobil.koneksi;

public class TambahKendaraan extends javax.swing.JFrame {

    private DefaultTableModel model;
    Connection con;//deklarasi variabel connection
    Statement stat;//deklarasi variabel statement, query
    ResultSet rs; // hasil load dari query
    String sql;
    
    public TambahKendaraan() {
        initComponents();
        load_table();
        kosong();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rentalMobil1 = new rentalmobil.RentalMobil();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();
        transparant1 = new rentalmobil.transparant();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nama3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nama4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nama5 = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        the_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rentalMobil1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setText("FORM TAMBAH KENDARAAN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 24, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuutama/rent-a-car (2).png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 16, 67, 68));

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/backspace-arrow-point-left_318-1409.jpg"))); // NOI18N
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        jPanel2.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        rentalMobil1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("DATA TAMBAH KENDARAAN");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Mobil *");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Plat Nomor*");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("Harga*");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Status*");

        button1.setBackground(new java.awt.Color(255, 255, 255));
        button1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button1.setLabel("Simpan");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(255, 255, 255));
        button2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button2.setLabel("Hapus");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(255, 255, 255));
        button3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button3.setLabel("Edit");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(255, 255, 255));
        button4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button4.setLabel("Clear");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transparant1Layout = new javax.swing.GroupLayout(transparant1);
        transparant1.setLayout(transparant1Layout);
        transparant1Layout.setHorizontalGroup(
            transparant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparant1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(transparant1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transparant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(transparant1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nama3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transparant1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nama4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transparant1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nama2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transparant1Layout.createSequentialGroup()
                        .addGroup(transparant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(transparant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(transparant1Layout.createSequentialGroup()
                                .addGap(30, 35, Short.MAX_VALUE)
                                .addComponent(nama5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(transparant1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        transparant1Layout.setVerticalGroup(
            transparant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparant1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(72, 72, 72)
                .addGroup(transparant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nama2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(transparant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nama3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(transparant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nama4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(transparant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nama5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(transparant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 124, Short.MAX_VALUE))
        );

        rentalMobil1.add(transparant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        the_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Mobil", "Plat Nomor", "Harga", "Status"
            }
        ));
        the_table.setGridColor(new java.awt.Color(0, 204, 204));
        the_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                the_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(the_table);

        rentalMobil1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 604, 540));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        rentalMobil1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 335, -1, -1));

        jPanel1.add(rentalMobil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void the_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_the_tableMouseClicked
 // menampilkan data kedalam form pengisian:
        
        int baris = the_table.rowAtPoint(evt.getPoint());
    
        String mobil = the_table.getValueAt(baris,1).toString();
        nama2.setText(mobil);
        String plat_nomor =the_table.getValueAt(baris, 2).toString();
        nama3.setText(plat_nomor);

        String harga=the_table.getValueAt(baris, 3).toString();
        nama4.setText(harga);
        String status=the_table.getValueAt(baris, 4).toString();
        nama5.setText(status);
             
    }//GEN-LAST:event_the_tableMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // bersihkan form
        kosong();
    }//GEN-LAST:event_button4ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // fungsi hapus data
        try {
            String sql ="delete from stock where plat_nomor='"+nama3.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.config();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // Edit Data
        try {
            String sql ="UPDATE stock SET mobil = '"+nama2.getText()+"', plat_nomor = '"+nama3.getText()+"',harga= '"+nama4.getText()+"',status= '"+nama5.getText()+"' WHERE plat_nomor = '"+nama3.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.config();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute(); //utk mengeksekusi query
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_button3ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        try {
            String sql = "INSERT INTO stock (mobil,plat_nomor,harga,status) VALUES ('"+nama2.getText()+"','"+nama3.getText()+"','"+nama4.getText()+"','"+nama5.getText()+"')";
            java.sql.Connection con=(Connection)koneksi.config();
            java.sql.PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_button1ActionPerformed

     private void load_table(){
       // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel(); //DefaultTableModel mendeklarasikan class yang digunakan untuk memberikan header dan data pada kolom dan baris tabel
        model.addColumn("Id");
        model.addColumn("Mobil");
        model.addColumn("Plat Nomor");
        model.addColumn("Harga");
        model.addColumn("Status");
        
        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "SELECT mobil,plat_nomor,harga,status FROM stock ORDER BY id_mobil DESC";
            java.sql.Connection con=(Connection)koneksi.config();
            java.sql.Statement stm=con.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4)});
            }
            the_table.setModel(model);
        } catch (Exception e) {
        }
    }
    
    private void kosong(){
        nama2.setText(null);
        nama3.setText(null);
        nama4.setText(null);
        nama5.setText(null);  
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TambahKendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahKendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahKendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahKendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahKendaraan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_back;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama2;
    private javax.swing.JTextField nama3;
    private javax.swing.JTextField nama4;
    private javax.swing.JTextField nama5;
    private rentalmobil.RentalMobil rentalMobil1;
    private javax.swing.JTable the_table;
    private rentalmobil.transparant transparant1;
    // End of variables declaration//GEN-END:variables
}
