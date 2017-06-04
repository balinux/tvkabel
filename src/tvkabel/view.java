/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvkabel;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author balinux
 */
public class view extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    /**
     * Creates new form view
     */
    public view() {
        initComponents();
        
        tableModel = new DefaultTableModel();
        tablePelanggan.setModel(tableModel);
        tableModel.addColumn("id");
        tableModel.addColumn("nama");
        tableModel.addColumn("alamat");
        loadData();
        
    }
    
    private void loadData(){
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        
     Connection connection = Database.getConnection();
     String sql = "select * from tbl_pelanggan";
     try{
        PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
        ResultSet result            = statement.executeQuery();
        while(result.next()){
            Object[] o = new Object[3];
            o[0] = result.getInt("id");
            o[1] = result.getString("nama");            
            o[2] = result.getString("alamat");            
            tableModel.addRow(o);
        }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, e);
        }
     
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        textNama = new javax.swing.JTextField();
        textAlamat = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePelanggan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABEL PELANGGAN TV KABEL");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel2.setText("ID Pelanggan");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        textID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDActionPerformed(evt);
            }
        });

        textAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAlamatActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tablePelanggan.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePelangganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePelanggan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textAlamat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textNama)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addGap(18, 18, 18)
                .addComponent(btnTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUbah)
                .addGap(18, 18, 18)
                .addComponent(btnHapus)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah)
                    .addComponent(btnTambah)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String id   = textID.getText();
        String nama = textNama.getText();
        String alamat= textAlamat.getText();
        
//        Membat validasi inputan kosong

        if(id.equals("")){
            JOptionPane.showMessageDialog(this,"kolom id tidak boleh kosong");
        }
        else if(nama.equals("")){
        JOptionPane.showMessageDialog(this,"kolom nama tidak boleh kosong");
        }
        else if(alamat.equals("")){
        JOptionPane.showMessageDialog(this,"kolom alaamt tidak boleh kosong");
        }
        else{
        Integer idInt = null;
//        validasi inputan berupa integer atau tidak
        try{
            idInt = Integer.parseInt(id);
        }
        catch(Exception e){
        System.out.println("inputan bukan berupa int");
        }
    
        try{
        Connection connection = Database.getConnection();
        String q = "insert into tbl_pelanggan(id,nama, alamat) values(?,?,?)"; 
        PreparedStatement statement = (PreparedStatement) connection.prepareStatement(q);
        statement.setInt(1, idInt);
        statement.setString(2, nama);
        statement.setString(3, alamat);
        
        statement.executeUpdate();
        JOptionPane.showMessageDialog(this, "data dengan id '"+idInt+"' sudah di input");
        loadData();
        }
        catch(SQLException e){ 
            JOptionPane.showMessageDialog(this, "Data gagal di input");
        }
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void textAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAlamatActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        String id   = textID.getText();
        String nama = textNama.getText();
        String alamat= textAlamat.getText();
        
//        Membat validasi inputan kosong

        if(id.equals("")){
            JOptionPane.showMessageDialog(this,"kolom id tidak boleh kosong");
        }
        else if(nama.equals("")){
        JOptionPane.showMessageDialog(this,"kolom nama tidak boleh kosong");
        }
        else if(alamat.equals("")){
        JOptionPane.showMessageDialog(this,"kolom alaamt tidak boleh kosong");
        }
        else{
        Integer idInt = null;
//        validasi inputan berupa integer atau tidak
        try{
            idInt = Integer.parseInt(id);
        }
        catch(Exception e){
        System.out.println("inputan bukan berupa int");
        }
    
        try{
        Connection connection = Database.getConnection();
        String q = "update tbl_pelanggan set nama=?, alamat=? where id=?"; 
        PreparedStatement statement = (PreparedStatement) connection.prepareStatement(q);
        statement.setString(1, nama);
        statement.setString(2, alamat);
        statement.setInt(3, idInt);
        
        statement.executeUpdate();
        JOptionPane.showMessageDialog(this, "data dengan id '"+idInt+"' sudah di Update");
        loadData();
        }
        catch(SQLException e){ 
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Data gagal di input");
        }
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String id = textID.getText();
        if (id.equals("")) {
            JOptionPane.showMessageDialog(this, "masukkan id data yang anda mau hapus");
        }
        else{
            Integer idInt;
            try{
                idInt = Integer.parseInt(id);
            }catch(Exception e){
                JOptionPane.showConfirmDialog(this, "harus berupa integer");
                return;
            }
            
            try{
                 Connection connection = Database.getConnection();
        String q = "delete from tbl_pelanggan where id=?"; 
        PreparedStatement statement = (PreparedStatement) connection.prepareStatement(q);
        statement.setInt(1, idInt);
        
        statement.executeUpdate();
        JOptionPane.showMessageDialog(this, "data dengan id '"+idInt+"' sudah di hapus");
        loadData();
       }catch(Exception e){
           JOptionPane.showMessageDialog(this, "data dengan id '"+idInt+"' gagal di hapus");
       }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tablePelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePelangganMouseClicked
        int i = tablePelanggan.getSelectedRow();
        if (i==-1) {
            JOptionPane.showMessageDialog(this, "pilih data");
        }else{
            textID.setText(tableModel.getValueAt(i, 0)+"");
            textNama.setText((String) tableModel.getValueAt(i, 1));
            textAlamat.setText((String) tableModel.getValueAt(i, 2));

             textID.setEditable(false);
        }
    }//GEN-LAST:event_tablePelangganMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        textID.setText("");
        textNama.setText("");
        textAlamat.setText("");
        textID.setEditable(true);
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePelanggan;
    private javax.swing.JTextField textAlamat;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textNama;
    // End of variables declaration//GEN-END:variables
}