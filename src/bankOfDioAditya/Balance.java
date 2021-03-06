/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankOfDioAditya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dio Aditya Putra Wardhono
 */
public class Balance extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;

    private Connection conn;
    private PreparedStatement insert;
    private ResultSet rs;

    /**
     * Creates new form Balance
     */
    public Balance() {
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

        AccountPanel = new javax.swing.JPanel();
        AccountNoLabel = new javax.swing.JLabel();
        AccountNoTextField = new javax.swing.JTextField();
        FindButton = new javax.swing.JButton();
        BalanceTitleLabel = new javax.swing.JLabel();
        CustomerNoLabel = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        CustomerNoValue = new javax.swing.JLabel();
        FirstNameValue = new javax.swing.JLabel();
        LastNameValue = new javax.swing.JLabel();
        BalanceLabel = new javax.swing.JLabel();
        BalanceValue = new javax.swing.JLabel();

        AccountPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Account"));

        AccountNoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AccountNoLabel.setText("Enter Account No.");

        FindButton.setText("Find");
        FindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AccountPanelLayout = new javax.swing.GroupLayout(AccountPanel);
        AccountPanel.setLayout(AccountPanelLayout);
        AccountPanelLayout.setHorizontalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(AccountNoLabel)
                .addGap(29, 29, 29)
                .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FindButton)
                    .addComponent(AccountNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        AccountPanelLayout.setVerticalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountNoLabel)
                    .addComponent(AccountNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(FindButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        BalanceTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BalanceTitleLabel.setText("Bank of Dio Aditya");

        CustomerNoLabel.setText("Customer No.");

        FirstNameLabel.setText("First Name");

        LastNameLabel.setText("Last Name");

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        CustomerNoValue.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CustomerNoValue.setText("jLabel1");

        FirstNameValue.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        FirstNameValue.setText("jLabel2");

        LastNameValue.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LastNameValue.setText("jLabel3");

        BalanceLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BalanceLabel.setText("Balance");

        BalanceValue.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BalanceValue.setForeground(new java.awt.Color(0, 102, 255));
        BalanceValue.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BalanceTitleLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustomerNoLabel)
                            .addComponent(FirstNameLabel)
                            .addComponent(LastNameLabel))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LastNameValue)
                            .addComponent(FirstNameValue)
                            .addComponent(CustomerNoValue)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BalanceLabel)
                            .addComponent(BalanceValue))))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(BalanceTitleLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BalanceLabel)
                        .addGap(36, 36, 36)
                        .addComponent(BalanceValue)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerNoLabel)
                    .addComponent(CustomerNoValue))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel)
                    .addComponent(FirstNameValue))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameLabel)
                    .addComponent(LastNameValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void FindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindButtonActionPerformed
        try {
            // TODO add your handling code here:
            String account_no = AccountNoTextField.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            setConn(DriverManager.getConnection(
                    "jdbc:mysql://localhost/bank_of_dio_aditya", "root", ""
            ));
            setInsert(getConn().prepareStatement("select c.customer_id, c.firstname,c.lastname, a.balance "
                    + "from customer c, account a "
                    + "where c.customer_id = a.customer_id "
                    + "and a.account_id = ?"));
            getInsert().setString(1, account_no);
            setRs(getInsert().executeQuery());

            if (getRs().next() == false) {
                JOptionPane.showMessageDialog(this, "Account not Found");
            } else {
                String customer_id = getRs().getString(1);
                String firstname = getRs().getString(2);
                String lastname = getRs().getString(3);
                String balance = getRs().getString(4);

                CustomerNoValue.setText(customer_id.trim());
                FirstNameValue.setText(firstname.trim());
                LastNameValue.setText(lastname.trim());
                BalanceValue.setText(balance.trim());
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Balance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FindButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountNoLabel;
    private javax.swing.JTextField AccountNoTextField;
    private javax.swing.JPanel AccountPanel;
    private javax.swing.JLabel BalanceLabel;
    private javax.swing.JLabel BalanceTitleLabel;
    private javax.swing.JLabel BalanceValue;
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel CustomerNoLabel;
    private javax.swing.JLabel CustomerNoValue;
    private javax.swing.JButton FindButton;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JLabel FirstNameValue;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JLabel LastNameValue;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * @return the insert
     */
    public PreparedStatement getInsert() {
        return insert;
    }

    /**
     * @param insert the insert to set
     */
    public void setInsert(PreparedStatement insert) {
        this.insert = insert;
    }

    /**
     * @return the rs
     */
    public ResultSet getRs() {
        return rs;
    }

    /**
     * @param rs the rs to set
     */
    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
}
