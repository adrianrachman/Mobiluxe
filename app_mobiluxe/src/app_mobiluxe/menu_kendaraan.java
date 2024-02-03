/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app_mobiluxe;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class menu_kendaraan extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi ();
    /**
     * Creates new form tambah_kendaraan
     */
    public menu_kendaraan() {
        initComponents();
        k.connection();
        refreshTable();
    }
    
    class kendaraan extends menu_kendaraan{
        int id_kendaraan, harga;
        String nama_kendaraan, jenis_kendaraan, warna;

        public kendaraan() {
            this.nama_kendaraan = text_nama_kendaraan.getText();
            this.harga = Integer.parseInt(text_harga.getText());
            this.jenis_kendaraan = combo_jenis_kendaraan.getSelectedItem().toString();
            this.warna = combo_warna.getSelectedItem().toString();
        }
        
        
    }
    
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("Id Kendaraan");
        model.addColumn("Nama Kendaraan");
        model.addColumn("Jenis Kendaraan");
        model.addColumn("Harga");
        model.addColumn("Warna");
        table_kendaraan.setModel(model);
        try {
            this.stat = k.getCon().prepareStatement("select * from kendaraan");
            this.rs = this.stat.executeQuery();
            while (rs.next()) {                
                Object[] data={
                    rs.getInt("id_kendaraan"),
                    rs.getString("nama_kendaraan"),
                    rs.getString("jenis_kendaraan"),
                    rs.getInt("harga"),
                    rs.getString("warna")
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        text_id_kendaraan.setText("");
        text_nama_kendaraan.setText("");
        text_harga.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel_id_kendaraan = new javax.swing.JLabel();
        jLabel_nama_kendaraan = new javax.swing.JLabel();
        jLabel_jenis_kendaraan = new javax.swing.JLabel();
        jLabel_harga = new javax.swing.JLabel();
        jLabel_warna = new javax.swing.JLabel();
        text_id_kendaraan = new javax.swing.JTextField();
        text_nama_kendaraan = new javax.swing.JTextField();
        text_harga = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_input = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_menu_registrasi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_kendaraan = new javax.swing.JTable();
        combo_warna = new javax.swing.JComboBox<>();
        btn_logout = new javax.swing.JButton();
        btn_menu_transaksi = new javax.swing.JButton();
        combo_jenis_kendaraan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_id_kendaraan.setText("Id Kendaraan");

        jLabel_nama_kendaraan.setText("Nama Kendaraan");

        jLabel_jenis_kendaraan.setText("Jenis Kendaraan");

        jLabel_harga.setText("Harga");

        jLabel_warna.setText("Warna");

        text_id_kendaraan.setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_input.setText("INPUT");
        btn_input.setEnabled(false);
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });

        btn_update.setText("UPDATE");
        btn_update.setEnabled(false);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("DELETE");
        btn_delete.setEnabled(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_menu_registrasi.setText("MENU REGISTRASI");
        btn_menu_registrasi.setEnabled(false);
        btn_menu_registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_registrasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_input)
                .addGap(18, 18, 18)
                .addComponent(btn_update)
                .addGap(18, 18, 18)
                .addComponent(btn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_menu_registrasi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_input)
                    .addComponent(btn_update)
                    .addComponent(btn_delete)
                    .addComponent(btn_menu_registrasi))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        table_kendaraan.setModel(new javax.swing.table.DefaultTableModel(
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
        table_kendaraan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_kendaraanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_kendaraan);

        combo_warna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hitam", "Putih", "Merah" }));

        btn_logout.setText("logout");
        btn_logout.setEnabled(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_menu_transaksi.setText("menu transaksi");
        btn_menu_transaksi.setEnabled(false);
        btn_menu_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_transaksiActionPerformed(evt);
            }
        });

        combo_jenis_kendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sport", "SUV", "MPV" }));

        jLabel1.setText("menu kendaraan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_id_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text_id_kendaraan))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_nama_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_jenis_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_warna, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_nama_kendaraan)
                            .addComponent(text_harga)
                            .addComponent(combo_warna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_jenis_kendaraan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_menu_transaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_logout)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_logout)
                    .addComponent(btn_menu_transaksi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_id_kendaraan)
                    .addComponent(text_id_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_nama_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nama_kendaraan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_jenis_kendaraan)
                    .addComponent(combo_jenis_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_harga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_warna)
                    .addComponent(combo_warna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
        try {
            kendaraan m = new kendaraan();
            this.stat = k.getCon().prepareStatement("insert into kendaraan values(?,?,?,?,?)");
            stat.setInt(1, 0);
            stat.setString(2, m.nama_kendaraan);
            stat.setString(3, m.jenis_kendaraan);
            stat.setInt(4, m.harga);
            stat.setString(5, m.warna);
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        try {
            kendaraan m = new kendaraan();
            this.stat = k.getCon().prepareStatement("update kendaraan set nama_kendaraan=?,"
                    + "jenis_kendaraan=?,harga=?,warna=? where id_kendaraan=?");
            stat.setString(1, m.nama_kendaraan);
            stat.setString(2, m.jenis_kendaraan);
            stat.setInt(3, m.harga);
            stat.setString(4, m.warna);
            stat.setInt(5, Integer.parseInt(text_id_kendaraan.getText()));
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        login log = new login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void table_kendaraanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_kendaraanMouseClicked
        // TODO add your handling code here:
        text_id_kendaraan.setText(model.getValueAt(table_kendaraan.getSelectedRow(), 0).toString());
        text_nama_kendaraan.setText(model.getValueAt(table_kendaraan.getSelectedRow(), 1).toString());
        text_harga.setText(model.getValueAt(table_kendaraan.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_table_kendaraanMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        try {
            this.stat = k.getCon().prepareStatement("delete from kendaraan where id_kendaraan=?");
            stat.setInt(1, Integer.parseInt(text_id_kendaraan.getText()));
            stat.executeUpdate();
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_menu_registrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_registrasiActionPerformed
        // TODO add your handling code here:
        menu_registrasi reg = new menu_registrasi();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_menu_registrasiActionPerformed

    private void btn_menu_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_transaksiActionPerformed
        // TODO add your handling code here:
        menu_transaksi tran = new menu_transaksi();
        tran.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_menu_transaksiActionPerformed

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
            java.util.logging.Logger.getLogger(kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_kendaraan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_delete;
    public javax.swing.JButton btn_input;
    public javax.swing.JButton btn_logout;
    public javax.swing.JButton btn_menu_registrasi;
    public javax.swing.JButton btn_menu_transaksi;
    public javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> combo_jenis_kendaraan;
    private javax.swing.JComboBox<String> combo_warna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_harga;
    private javax.swing.JLabel jLabel_id_kendaraan;
    private javax.swing.JLabel jLabel_jenis_kendaraan;
    private javax.swing.JLabel jLabel_nama_kendaraan;
    private javax.swing.JLabel jLabel_warna;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table_kendaraan;
    private javax.swing.JTextField text_harga;
    private javax.swing.JTextField text_id_kendaraan;
    private javax.swing.JTextField text_nama_kendaraan;
    // End of variables declaration//GEN-END:variables
}
