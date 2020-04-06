/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ketnoidatabase.Connect;
import ketnoidatabase.DataProvider;
import Init.Init;
import quanliquanao.editFrame;

/**
 *
 * @author henryangminh
 */
public class editInvoice extends javax.swing.JFrame {

    private String InvoiceID;
    /**
     * Creates new form editInvoice
     */
    public editInvoice() {
        initComponents();
    }
    
    public editInvoice(String InvoiceID) throws SQLException {
        initComponents();
        this.InvoiceID=InvoiceID;
        lblInvoiceID.setText(InvoiceID);
        
        String sql="SELECT * FROM Invoice WHERE InvoiceID='"+InvoiceID+"'";
        ResultSet rs = DataProvider.executeQuery(sql);
        
        while(rs.next())
            lblUsrName.setText(rs.getString("UsrName"));
        
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
        jLabel2 = new javax.swing.JLabel();
        lblInvoiceID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsrName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvoiceDetails = new javax.swing.JTable();
        btnCheckOut = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnAddProducts = new javax.swing.JButton();
        btnDelProduct = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setText("Chi Tiết Hóa Đơn");

        jLabel2.setText("Mã Hóa Đơn: ");

        lblInvoiceID.setText("xxx");

        jLabel3.setText("UserName:");

        lblUsrName.setText("xxx");

        tblInvoiceDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hàng Hóa", "Tên Hàng Hóa", "Đơn Giá", "Số Lượng", "Thành Tiền", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInvoiceDetails);

        btnCheckOut.setText("Thanh Toán");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAddProducts.setText("Thêm Hàng");
        btnAddProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductsActionPerformed(evt);
            }
        });

        btnDelProduct.setText("Xóa Hàng");
        btnDelProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelProductActionPerformed(evt);
            }
        });

        jLabel4.setText("Tổng Cộng:");

        lblTotal.setText("xxx");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblInvoiceID))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblUsrName)))
                        .addGap(173, 173, 173)
                        .addComponent(btnAddProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelProduct)
                        .addGap(0, 88, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(18, 18, 18)
                .addComponent(btnCheckOut)
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal)
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblInvoiceID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblUsrName)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddProducts)
                        .addComponent(btnDelProduct)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckOut)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Invoice invoice = new Invoice();
        invoice.show();
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductsActionPerformed
        // TODO add your handling code here:
        addProducts AddProduct = new addProducts(InvoiceID);
        AddProduct.show();
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnAddProductsActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        int n=tblInvoiceDetails.getRowCount();
        if(n>0)
            try {
                String sql = "UPDATE Invoice SET Status='Đã Thanh Toán' WHERE InvoiceID='"+InvoiceID+"'";
                DataProvider.executeSql(sql);
                JOptionPane.showMessageDialog(null, "Thanh Toán Thành Công","THÔNG BÁO",1);
                Invoice invoice = new Invoice();
                invoice.show();
                setVisible(false);
                dispose();
            } catch (Exception ex) {
            }
        else
        {
            JOptionPane.showMessageDialog(null, "Hóa Đơn này không có hàng, không thể thanh toán","THÔNG BÁO",1);
        }
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnDelProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelProductActionPerformed
        // TODO add your handling code here:
        int count=0;
        for(int i=0;i<tblInvoiceDetails.getRowCount();i++)
            if((Boolean)tblInvoiceDetails.getValueAt(i, 5))
                count++;
        if(count>0){
            for(int i=0;i<tblInvoiceDetails.getRowCount();i++)
            {
                if((Boolean)tblInvoiceDetails.getValueAt(i, 5))
                {
                    try {
                        String sql = "DELETE FROM InvoiceDetails WHERE InvoiceID='" +InvoiceID+"' AND ProductID='"+tblInvoiceDetails.getValueAt(i, 0)+"'";
                        DataProvider.executeSql(sql);
                    } catch (SQLException ex) {
                    }
                }
            }
            try {
                String sql="SELECT SUM(SubTotal) AS TempSubTotal FROM InvoiceDetails WHERE InvoiceID='"+InvoiceID+"'";
                ResultSet rs=DataProvider.executeQuery(sql);
                if(rs.next())
                {
                    String s;
                    s = rs.getString("TempSubTotal");
                    if(s==null)
                        s="0";
                    DataProvider.executeSql("UPDATE Invoice SET Total="+s+" WHERE InvoiceID='"+InvoiceID+"'");
                }
            } catch (Exception ex) {
                System.out.print(ex);
            }
            JOptionPane.showMessageDialog(null, "Xóa Hàng Thành Công","THÔNG BÁO",1);
            ShowHoaDon();
        }
    }//GEN-LAST:event_btnDelProductActionPerformed

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
            java.util.logging.Logger.getLogger(editInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProducts;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnDelProduct;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInvoiceID;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsrName;
    private javax.swing.JTable tblInvoiceDetails;
    // End of variables declaration//GEN-END:variables

    private void ShowHoaDon()
    {
        String[] col = {"Mã Hàng Hóa","Tên Hàng Hóa", "Đơn Giá", "Số Lượng", "Thành Tiền", ""};
        DefaultTableModel tblModel = new DefaultTableModel(col,0)
        {
            @Override
            public Class <?> getColumnClass (int Column)
            {
                switch (Column)
                {
                    case 5: return Boolean.class;
                    default: return Object.class;
                }
            }
        };
        
        try {
            String sql = "SELECT * FROM InvoiceDetails INNER JOIN Product INNER JOIN ProductType WHERE InvoiceDetails.ProductID=Product.ProductID AND "
                    + "Product.ProductType=ProductType.ProductTypeID AND "
                    + "InvoiceID='"+InvoiceID+"'";
            ResultSet rs = DataProvider.executeQuery(sql);
            int Total=0;

            int count=0;
            while(rs.next())
            {
                String MaHang = rs.getString("ProductID");
                String TenHang = rs.getString("ProductName");
                String DonGia = rs.getString("Price");
                String SoLuong = rs.getString("Quantities");
                int ThanhTien = parseInt(DonGia)*parseInt(SoLuong);
                Total += ThanhTien;
                tblModel.addRow(new Object[]{MaHang, TenHang, DonGia, SoLuong, ThanhTien, false});
                tblInvoiceDetails.setModel(tblModel);
                count++;
            }
            if(count==0)
                tblInvoiceDetails.setModel(tblModel);
            
            lblTotal.setText(Integer.toString(Total));
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
