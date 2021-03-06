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
public class Transfer extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;

    private Connection conn;
    private PreparedStatement insert;
    private PreparedStatement update_from_account;
    private PreparedStatement update_to_account;
    private ResultSet rs;

    /**
     * Creates new form Transfer
     */
    public Transfer() {
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

        jTextField4 = new javax.swing.JTextField();
        TransferAccountPanel = new javax.swing.JPanel();
        FromAccountLabel = new javax.swing.JLabel();
        BalanceLabel = new javax.swing.JLabel();
        ToAccountLabel = new javax.swing.JLabel();
        AmountLabel = new javax.swing.JLabel();
        FromAccountTextField = new javax.swing.JTextField();
        ToAccountTextField = new javax.swing.JTextField();
        AmountTextField = new javax.swing.JTextField();
        FindButton = new javax.swing.JButton();
        BalanceValue = new javax.swing.JLabel();
        TransferTitleLabel = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        TransferAccountPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Account"));

        FromAccountLabel.setText("From Account");

        BalanceLabel.setText("Balance");

        ToAccountLabel.setText("To Account");

        AmountLabel.setText("Amount");

        FindButton.setText("Find");
        FindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindButtonActionPerformed(evt);
            }
        });

        BalanceValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BalanceValue.setText("jLabel6");

        javax.swing.GroupLayout TransferAccountPanelLayout = new javax.swing.GroupLayout(TransferAccountPanel);
        TransferAccountPanel.setLayout(TransferAccountPanelLayout);
        TransferAccountPanelLayout.setHorizontalGroup(
            TransferAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferAccountPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(TransferAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FromAccountLabel)
                    .addComponent(BalanceLabel)
                    .addComponent(ToAccountLabel)
                    .addComponent(AmountLabel))
                .addGap(50, 50, 50)
                .addGroup(TransferAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FindButton)
                    .addComponent(FromAccountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToAccountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BalanceValue))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        TransferAccountPanelLayout.setVerticalGroup(
            TransferAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferAccountPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(TransferAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FromAccountLabel)
                    .addComponent(FromAccountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(FindButton)
                .addGap(36, 36, 36)
                .addGroup(TransferAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BalanceLabel)
                    .addComponent(BalanceValue))
                .addGap(34, 34, 34)
                .addGroup(TransferAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToAccountLabel)
                    .addComponent(ToAccountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(TransferAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountLabel)
                    .addComponent(AmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        TransferTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TransferTitleLabel.setText("Bank of Dio Aditya");

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(OKButton)
                        .addGap(36, 36, 36)
                        .addComponent(CancelButton))
                    .addComponent(TransferTitleLabel)
                    .addComponent(TransferAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(TransferTitleLabel)
                .addGap(29, 29, 29)
                .addComponent(TransferAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKButton)
                    .addComponent(CancelButton))
                .addGap(81, 81, 81))
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
            String from_account = FromAccountTextField.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            setConn(DriverManager.getConnection(
                    "jdbc:mysql://localhost/bank_of_dio_aditya", "root", ""
            ));
            setInsert(getConn().prepareStatement("select balance from account "
                    + "where account_id = ?"));
            getInsert().setString(1, from_account);
            setRs(getInsert().executeQuery());

            if (getRs().next() == false) {
                JOptionPane.showMessageDialog(this, "Account not Found");
                FromAccountTextField.setText("");
            } else {
                String balance = getRs().getString(1);
                BalanceValue.setText(balance.trim());
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Transfer.class.getName()).log(
                    Level.SEVERE, null, ex
            );
        }
    }//GEN-LAST:event_FindButtonActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        try {
            // TODO add your handling code here:
            String from_account = FromAccountTextField.getText();
            String to_account = ToAccountTextField.getText();
            String amount = AmountTextField.getText();

            Class.forName("com.mysql.cj.jdbc.Driver");
            setConn(DriverManager.getConnection(
                    "jdbc:mysql://localhost/bank_of_dio_aditya", "root", ""
            ));
            getConn().setAutoCommit(false);
            setInsert(getConn().prepareStatement(
                    "insert into transfer(from_account,to_account,transfer_amount)"
                    + "values(?,?,?)"
            ));
            getInsert().setString(1, from_account);
            getInsert().setString(2, to_account);
            getInsert().setString(3, amount);
            getInsert().executeUpdate();

            setUpdate_from_account(getConn().prepareStatement(
                    "update account set balance "
                    + "= balance - ? where account_id = ?"
            ));
            getUpdate_from_account().setString(1, amount);
            getUpdate_from_account().setString(2, from_account);
            getUpdate_from_account().executeUpdate();

            setUpdate_to_account(getConn().prepareStatement(
                    "update account set balance "
                    + "= balance + ? where account_id = ?"
            ));
            getUpdate_to_account().setString(1, amount);
            getUpdate_to_account().setString(2, to_account);
            getUpdate_to_account().executeUpdate();

            JOptionPane.showMessageDialog(this, "Transfer Successful");
            getConn().commit();

            FromAccountTextField.setText("");
            BalanceValue.setText("");
            ToAccountTextField.setText("");
            AmountTextField.setText("");

            FromAccountTextField.requestFocus();
        } catch (SQLException ex) {
            try {
                Logger.getLogger(Transfer.class.getName()).log(Level.SEVERE, null, ex);
                getConn().rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(Transfer.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Transfer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_OKButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmountLabel;
    private javax.swing.JTextField AmountTextField;
    private javax.swing.JLabel BalanceLabel;
    private javax.swing.JLabel BalanceValue;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton FindButton;
    private javax.swing.JLabel FromAccountLabel;
    private javax.swing.JTextField FromAccountTextField;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel ToAccountLabel;
    private javax.swing.JTextField ToAccountTextField;
    private javax.swing.JPanel TransferAccountPanel;
    private javax.swing.JLabel TransferTitleLabel;
    private javax.swing.JTextField jTextField4;
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
     * @return the update_from_account
     */
    public PreparedStatement getUpdate_from_account() {
        return update_from_account;
    }

    /**
     * @param update_from_account the update_from_account to set
     */
    public void setUpdate_from_account(PreparedStatement update_from_account) {
        this.update_from_account = update_from_account;
    }

    /**
     * @return the update_to_account
     */
    public PreparedStatement getUpdate_to_account() {
        return update_to_account;
    }

    /**
     * @param update_to_account the update_to_account to set
     */
    public void setUpdate_to_account(PreparedStatement update_to_account) {
        this.update_to_account = update_to_account;
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
