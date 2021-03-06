/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliquanao;

import Init.Init;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.*;
import java.sql.*;
import java.util.HashSet;
import java.util.*;
import java.util.logging.*;
import java.util.regex.*;
import javax.swing.*;
import javax.swing.table.*;
import ketnoidatabase.*;

/**
 *
 * @author henryangminh
 */
public class editFrame extends javax.swing.JFrame {

    /**
     * Creates new form showHang
     */
    public editFrame() {
        initComponents();
        Combo();
        ShowHang();
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
        tblShowHang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        chkSelectAll = new javax.swing.JCheckBox();
        slcSize = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        slcGender = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        slcSortBy = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        slcAscDesc = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        slcType = new javax.swing.JComboBox<>();
        btnEdit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbRowCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblShowHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "ID", "Tên sản phẩm", "Loại sản phẩm", "Giới tính", "Size", "Giá", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblShowHang);
        if (tblShowHang.getColumnModel().getColumnCount() > 0) {
            tblShowHang.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblShowHang.getColumnModel().getColumn(0).setMaxWidth(5);
            tblShowHang.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblShowHang.getColumnModel().getColumn(1).setMaxWidth(10);
            tblShowHang.getColumnModel().getColumn(4).setPreferredWidth(60);
            tblShowHang.getColumnModel().getColumn(4).setMaxWidth(60);
            tblShowHang.getColumnModel().getColumn(5).setPreferredWidth(40);
            tblShowHang.getColumnModel().getColumn(5).setMaxWidth(40);
            tblShowHang.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblShowHang.getColumnModel().getColumn(6).setMaxWidth(60);
            tblShowHang.getColumnModel().getColumn(7).setPreferredWidth(60);
            tblShowHang.getColumnModel().getColumn(7).setMaxWidth(60);
        }

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Tìm kiếm / Xóa / Sửa");

        jButton1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        chkSelectAll.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        chkSelectAll.setText("Chọn Tất Cả");
        chkSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSelectAllActionPerformed(evt);
            }
        });

        slcSize.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        slcSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "S", "M", "L", "XL" }));
        slcSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slcSizeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setText("Size");

        txtName.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setText("Tên");

        slcGender.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        slcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Nam", "Nữ", "Unisex" }));
        slcGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slcGenderActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setText("Giới tính");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setText("Sắp xếp theo");

        slcSortBy.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        slcSortBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "ID", "Tên Sản Phẩm", "Loại Sản Phẩm", "Giới Tính", "Size", "Giá", "Số Lượng" }));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel6.setText("Tăng/Giảm dần");

        slcAscDesc.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        slcAscDesc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng dần", "Giảm dần" }));

        btnSearch.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnReset.setText("Làm lại");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel7.setText("Loại");

        slcType.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        slcType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slcTypeActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel8.setText("Số sản phẩm");

        lbRowCount.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lbRowCount.setText("xxx");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(551, 551, 551))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkSelectAll)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(9, 9, 9)
                                .addComponent(slcSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(9, 9, 9)
                                .addComponent(slcType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(9, 9, 9)
                                .addComponent(slcGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbRowCount)
                                .addGap(262, 262, 262)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(9, 9, 9)
                        .addComponent(slcSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(9, 9, 9)
                        .addComponent(slcAscDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(slcType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkSelectAll)
                        .addComponent(slcSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(slcGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(slcSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(slcAscDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnDelete)
                    .addComponent(btnReset)
                    .addComponent(btnEdit)
                    .addComponent(jLabel8)
                    .addComponent(lbRowCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Init initFrame = new Init();
        initFrame.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        ShowHang();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void slcGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slcGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slcGenderActionPerformed

    private void slcTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slcTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slcTypeActionPerformed

    private void chkSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSelectAllActionPerformed
        // TODO add your handling code here:
        CheckAll();
    }//GEN-LAST:event_chkSelectAllActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int count=0;
        for(int i=0;i<tblShowHang.getRowCount();i++)
            if((Boolean)tblShowHang.getValueAt(i, 0))
                count++;
        if(count>0){
            JFrame frame = new JFrame();
            int dialogButton = JOptionPane.showConfirmDialog (frame,"Bạn có chắc muốn xóa "+count+" đối tượng này không???");
            if(dialogButton == 0)
            {
                for(int i=0;i<tblShowHang.getRowCount();i++)
                if((Boolean)tblShowHang.getValueAt(i, 0))
                {
                    String sql = "DELETE FROM Product WHERE ProductID='" + tblShowHang.getValueAt(i, 1) +"'";
                    try {
                        DataProvider.executeSql(sql);
                        ShowHang();
                    } catch (SQLException ex) {
                        Logger.getLogger(editFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }       
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void slcSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slcSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slcSizeActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        chkSelectAll.setSelected(false);
        CheckAll();
        slcSize.setSelectedIndex(0);
        txtName.setText("");
        slcType.setSelectedIndex(0);
        slcGender.setSelectedIndex(0);
        slcSortBy.setSelectedIndex(0);
        slcAscDesc.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        
        int count=0,row = 0;
        for(int i=0;i<tblShowHang.getRowCount();i++)
            if((Boolean)tblShowHang.getValueAt(i, 0))
            {
                count++;
                row = i;
            }
        if(count > 1)
            JOptionPane.showMessageDialog(null, "Không được chỉnh sửa nhiều hơn 1 sản phẩm","WARNING",1);
        else if(count==1)
        {
            String sql = "SELECT * FROM Product WHERE ProductID = '"+tblShowHang.getValueAt(row, 1).toString()+"'";
            String ID = null, ProductName = null, Price = null, Quantity = null;
            int ProductType = 0,Gender = 0,Size = 0;
            try {
                ResultSet rs = DataProvider.executeQuery(sql);
                
                while(rs.next())
                {
                    ID = rs.getString("ProductID");
                    ProductName = rs.getString("ProductName");
                    ProductType = rs.getInt("ProductType");
                    Gender = rs.getInt("Gender");
                    Size = rs.getInt("Size");
                    Price = rs.getString("Price");
                    Quantity = rs.getString("Quantity");
                }
                
            } catch (Exception ex) {
            }
            editProducts EditProducts = new editProducts(ID,ProductName,ProductType,Gender,Size,Price,Quantity);
            EditProducts.show();
            setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(editFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new editFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox chkSelectAll;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRowCount;
    private javax.swing.JComboBox<String> slcAscDesc;
    private javax.swing.JComboBox<String> slcGender;
    private javax.swing.JComboBox<String> slcSize;
    private javax.swing.JComboBox<String> slcSortBy;
    private javax.swing.JComboBox<String> slcType;
    private javax.swing.JTable tblShowHang;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    
    private void Combo()
    {
        try {
            ResultSet rs = DataProvider.executeQuery("SELECT * FROM ProductType");
            slcType.addItem("");
            while(rs.next())
                slcType.addItem(rs.getString("ProductTypeName"));
        } catch (Exception ex) {
        }
    }
    
    private void CheckAll()
    {
        for(int i=0;i<tblShowHang.getRowCount();i++)
            tblShowHang.setValueAt(chkSelectAll.isSelected(), i, 0);
    }
    
    private void ShowHang()
    {
        String[] col = {"","ID", "Tên sản phẩm", "Loại sản phẩm", "Giới tính", "Size", "Giá", "Số lượng"};
        
        DefaultTableModel tblModel = new DefaultTableModel(col,0)
        {
            @Override
            public Class <?> getColumnClass (int Column)
            {
                switch (Column)
                {
                    case 0: return Boolean.class;
                    default: return Object.class;
                }
            }
        };
        
        try {
            String sql = "SELECT * FROM Product";
            
            String sql_query = "";
            if(txtName.getText().length()!=0)
                sql_query += "ProductName LIKE '%"+txtName.getText()+"%' AND ";
            if(slcSize.getSelectedIndex()!=0)
                sql_query += "Size = '"+ slcSize.getSelectedIndex() + "' AND ";
            if(slcGender.getSelectedIndex()!=0)
                sql_query += "Gender = '"+ slcGender.getSelectedIndex() + "' AND ";
            if(slcType.getSelectedIndex()!=0)
                sql_query += "ProductType = '"+ slcType.getSelectedIndex() + "' AND ";
            if(sql_query.length()!=0)
            {
                sql_query = sql_query.replaceAll(" AND $", "");
                sql += " WHERE " + sql_query;
            }
            
            if(slcSortBy.getSelectedIndex()!=0)
            {
                String ascDesc = "";
                if(slcAscDesc.getSelectedIndex()==0)
                    ascDesc = "ASC";
                else
                    ascDesc = "DESC";
                
                switch(slcSortBy.getSelectedIndex())
                {
                    case 1: 
                        sql+=" ORDER BY ProductID "+ascDesc;
                        break;
                    
                    case 2: 
                        sql+=" ORDER BY ProductName "+ascDesc;
                        break;
                    
                    case 3: 
                        sql+=" ORDER BY ProductType "+ascDesc;
                        break;
                        
                    case 4: 
                        sql+=" ORDER BY Gender "+ascDesc;
                        break;
                        
                    case 5: 
                        sql+=" ORDER BY Size "+ascDesc;
                        break;
                    
                    case 6: 
                        sql+=" ORDER BY Price "+ascDesc;
                        break;
                    
                    case 7: 
                        sql+=" ORDER BY Quantity "+ascDesc;
                        break;
                }
            }
            
            ResultSet rs = DataProvider.executeQuery(sql);
            
            int count=0;
            while(rs.next())
            {
                String ID = rs.getString("ProductID");
                String ProductName = rs.getString("ProductName");
                String ProductType = slcType.getItemAt(rs.getInt("ProductType"));
                String Gender = slcGender.getItemAt(rs.getInt("Gender"));
                String Size = slcSize.getItemAt(rs.getInt("Size"));
                String Price = rs.getString("Price");
                String Quantity = rs.getString("Quantity");
                tblModel.addRow(new Object[]{false,ID, ProductName, ProductType, Gender, Size, Price, Quantity});
                tblShowHang.setModel(tblModel);
                count++;
            }
            if(count==0)
                tblShowHang.setModel(tblModel);
            CheckAll();
            lbRowCount.setText(count+"");
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
