/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuutama;
import menuutama.rental_lanjut;
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        transparant2 = new rentalmobil.transparant();
        jPanel4 = new javax.swing.JPanel();
        transparant1 = new rentalmobil.transparant();
        transparant3 = new rentalmobil.transparant();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tambah = new java.awt.Button();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pengembalian = new java.awt.Button();
        listuser = new java.awt.Button();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        button2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rentalMobil1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        rentalMobil1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 153, 102));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/rentalmobil/foto/car-rent.png")))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELAMAT DATANG DI APLIKASI RENTAL MOBIL");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 50));

        rentalMobil1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 1080, 170));

        transparant2.setBackground(new java.awt.Color(255, 255, 255));
        transparant2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        rentalMobil1.add(transparant2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 153, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transparant1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(transparant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 300, 740));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENU ");

        javax.swing.GroupLayout transparant3Layout = new javax.swing.GroupLayout(transparant3);
        transparant3.setLayout(transparant3Layout);
        transparant3Layout.setHorizontalGroup(
            transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparant3Layout.createSequentialGroup()
                .addGroup(transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transparant3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transparant3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        transparant3Layout.setVerticalGroup(
            transparant3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparant3Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(565, Short.MAX_VALUE))
        );

        jPanel4.add(transparant3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 740));

        rentalMobil1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 740));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuutama/car-insurance.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rentalMobil1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 160, 160));

        button1.setBackground(new java.awt.Color(255, 204, 153));
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Form Peminjaman Mobil");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        rentalMobil1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 300, 56));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/car (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rentalMobil1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, -1, -1));

        tambah.setBackground(new java.awt.Color(255, 153, 102));
        tambah.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tambah.setForeground(new java.awt.Color(255, 255, 255));
        tambah.setLabel("Tambah Kendaraan");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        rentalMobil1.add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 300, 56));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuutama/car (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rentalMobil1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuutama/user (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        rentalMobil1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, -1, -1));

        pengembalian.setBackground(new java.awt.Color(255, 204, 153));
        pengembalian.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pengembalian.setForeground(new java.awt.Color(255, 255, 255));
        pengembalian.setLabel("Pengembalian");
        pengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengembalianActionPerformed(evt);
            }
        });
        rentalMobil1.add(pengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, 300, 56));

        listuser.setBackground(new java.awt.Color(255, 153, 102));
        listuser.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        listuser.setForeground(new java.awt.Color(255, 255, 255));
        listuser.setLabel("List User");
        listuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listuserActionPerformed(evt);
            }
        });
        rentalMobil1.add(listuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 650, 300, 58));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuutama/group.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rentalMobil1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 210, -1, -1));

        button2.setBackground(new java.awt.Color(255, 204, 153));
        button2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setLabel("About");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        rentalMobil1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 390, 280, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rentalMobil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rentalMobil1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        rental_lanjut m = new rental_lanjut();
                    m.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void pengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengembalianActionPerformed
     pengembalian m = new pengembalian();
                    m.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_pengembalianActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
           TambahKendaraan m = new TambahKendaraan();
                    m.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_tambahActionPerformed

    private void listuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listuserActionPerformed
        // TODO add your handling code here:
         ListUser l = new ListUser();
                    l.setVisible(true);
                    this.dispose();
    
    }//GEN-LAST:event_listuserActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
      About m = new About();
                    m.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_button2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Button listuser;
    private java.awt.Button pengembalian;
    private rentalmobil.RentalMobil rentalMobil1;
    private java.awt.Button tambah;
    private rentalmobil.transparant transparant1;
    private rentalmobil.transparant transparant2;
    private rentalmobil.transparant transparant3;
    // End of variables declaration//GEN-END:variables
}
