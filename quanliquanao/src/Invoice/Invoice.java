/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ketnoidatabase.Connect;
import ketnoidatabase.DataProvider;
import Init.Init;

/**
 *
 * @author henryangminh
 */
public class Invoice extends javax.swing.JFrame {

    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
        ShowHoaDon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvoice = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnEditInvoice = new javax.swing.JButton();
        btnEditInvoice1 = new javax.swing.JButton();
        btnDelInvoice = new javax.swing.JButton();
        btnViewInvoice = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setText("Hóa Đơn");

        tblInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "username", "Tổng Tiền", "Trạng Thái", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInvoice);

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnEditInvoice.setText("Sửa Hóa Đơn");
        btnEditInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInvoiceActionPerformed(evt);
            }
        });

        btnEditInvoice1.setText("Thêm Hóa Đơn");
        btnEditInvoice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInvoice1ActionPerformed(evt);
            }
        });

        btnDelInvoice.setText("Xóa Hóa Đơn");
        btnDelInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelInvoiceActionPerformed(evt);
            }
        });

        btnViewInvoice.setText("Xem Hóa Đơn");
        btnViewInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInvoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(310, 310, 310))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnEditInvoice1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditInvoice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelInvoice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewInvoice)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditInvoice)
                    .addComponent(btnEditInvoice1)
                    .addComponent(btnDelInvoice)
                    .addComponent(btnViewInvoice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Init init = new Init();
        init.show();
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEditInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInvoiceActionPerformed
        // TODO add your handling code here:
        int count=0,row = 0;
        for(int i=0;i<tblInvoice.getRowCount();i++)
            if((Boolean)tblInvoice.getValueAt(i, 4))
            {
                count++;
                row = i;
            }
        if(count > 1)
            JOptionPane.showMessageDialog(null, "Không được chỉnh sửa nhiều hơn 1 đơn hàng","THÔNG BÁO",1);
        else if(count==1)
        {
            if(tblInvoice.getValueAt(row, 3).toString().equals("Đã Thanh Toán"))
                JOptionPane.showMessageDialog(null, "Hóa Đơn này đã được thanh toán, không thể sửa","THÔNG BÁO",1);
            else
            {
                String InvoiceID=tblInvoice.getValueAt(row, 0).toString();
                editInvoice EditInvoice;
                try {
                    EditInvoice = new editInvoice(InvoiceID);
                    EditInvoice.show();
                    setVisible(false);
                    dispose();
                } catch (Exception ex) {
                }
            }
        }
    }//GEN-LAST:event_btnEditInvoiceActionPerformed

    private void btnEditInvoice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInvoice1ActionPerformed
        // TODO add your handling code here:
        addInvoice AddInvoice;
        try {
            AddInvoice = new addInvoice();
            AddInvoice.show();
        } catch (SQLException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnEditInvoice1ActionPerformed

    private void btnDelInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelInvoiceActionPerformed
        // TODO add your handling code here:
        int count=0;
        for(int i=0;i<tblInvoice.getRowCount();i++)
            if((Boolean)tblInvoice.getValueAt(i, 4))
                count++;
        if(count > 0)
        {
            int countDel=0;
            for(int i=0;i<tblInvoice.getRowCount();i++)
            {
                if((Boolean)tblInvoice.getValueAt(i, 4))
                    if(tblInvoice.getValueAt(i, 3).toString().equals("Đã Thanh Toán"))
                        JOptionPane.showMessageDialog(null, "Hóa Đơn "+tblInvoice.getValueAt(i, 0)+" đã được thanh toán, không thể xóa","THÔNG BÁO",1);
                    else
                    {
                    try {
                        String sql = "DELETE FROM InvoiceDetails WHERE InvoiceID='"+tblInvoice.getValueAt(i, 0)+"'";
                        DataProvider.executeSql(sql);
                        sql = "DELETE FROM Invoice WHERE InvoiceID='"+tblInvoice.getValueAt(i, 0)+"'";
                        DataProvider.executeSql(sql);
                        countDel++;
                    } catch (SQLException ex) {
                        Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        
                    }
            }
            JOptionPane.showMessageDialog(null, "Xóa thành công "+countDel+" hóa đơn chưa được thanh toán","THÔNG BÁO",1);
            ShowHoaDon();
        }
    }//GEN-LAST:event_btnDelInvoiceActionPerformed

    private void btnViewInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInvoiceActionPerformed
        // TODO add your handling code here:
        int count=0,row = 0;
        for(int i=0;i<tblInvoice.getRowCount();i++)
            if((Boolean)tblInvoice.getValueAt(i, 4))
            {
                count++;
                row = i;
            }
        if(count > 1)
            JOptionPane.showMessageDialog(null, "Không được xem nhiều hơn 1 đơn hàng","THÔNG BÁO",1);
        else if(count==1)
        {
            String InvoiceID=tblInvoice.getValueAt(row, 0).toString();
            viewInvoice ViewInvoice;
            try {
                ViewInvoice = new viewInvoice(InvoiceID);
                ViewInvoice.show();
                setVisible(false);
                dispose();
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_btnViewInvoiceActionPerformed

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelInvoice;
    private javax.swing.JButton btnEditInvoice;
    private javax.swing.JButton btnEditInvoice1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnViewInvoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInvoice;
    // End of variables declaration//GEN-END:variables

    private void ShowHoaDon()
    {
        String[] col = {"Mã Hóa Đơn","username", "Tổng Tiền", "Trạng Thái", ""};
        DefaultTableModel tblModel = new DefaultTableModel(col,0)
        {
            @Override
            public Class <?> getColumnClass (int Column)
            {
                switch (Column)
                {
                    case 4: return Boolean.class;
                    default: return Object.class;
                }
            }
        };
        
        try {
            String sql = "SELECT * FROM Invoice";
            ResultSet rs = DataProvider.executeQuery(sql);

            int count=0;
            while(rs.next())
            {
                String MaHoaDon = rs.getString("InvoiceID");
                String UsrName = rs.getString("UsrName");
                String Total = rs.getString("Total");
                String Status = rs.getString("Status");
                tblModel.addRow(new Object[]{MaHoaDon, UsrName, Total, Status, false});
                tblInvoice.setModel(tblModel);
                count++;
            }
            if(count==0)
                tblInvoice.setModel(tblModel);
            //CheckAll();
            //lbRowCount.setText(count+"");
        } catch (Exception ex) {
            if(Connect.getConnect()==null)
            {
                JOptionPane.showMessageDialog(null, "Không có kết nối","WARNING",1);
                setVisible(false);
                dispose();
            }
        }
    }
}