/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Restaurant.Java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Random;
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MY ASUS
 */
public class Register extends JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jButton1 = new JButton();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Enter the password again");

        jTextField1.setText("");

        jTextField2.setText("");

        jTextField3.setText("");

        jButton1.setText("Add");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLabel5.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("Register");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(256, 256, 256)
                                                .addComponent(jButton1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(155, 155, 155)
                                                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                                                        .addComponent(jTextField2)
                                                                        .addComponent(jTextField3))))))
                                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField3, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(67, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        setResizable(false);
        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(ActionEvent evt) {

        String new_acc = jTextField1.getText();
        String new_pass = jTextField2.getText();
        String trypass = jTextField3.getText();
        String num_access = "";
        if(!new_acc.isEmpty() && !new_pass.isEmpty() && !trypass.isEmpty()){
            // TODO add your handling code here:
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Restaurant", "root", "1234");
                Statement statement = con.createStatement();
                ResultSet result = statement.executeQuery("select * from acc");
                boolean accountExists = false;
                Random random = new Random();
                int num = random.nextInt(21333);
                String numstring = String.valueOf(num);
                
                boolean numrequest = true;
                while (result.next()) {
                    if (result.getString("acc_name").equals(new_acc)) {
                        accountExists = true;
                        break;
                    }
                    while(numrequest){
                        if(!(result.getString("acc_access").contains(numstring))){
                            numrequest = false;
                            num_access = "CUSTOMER_"+numstring;
                        }
                    }
                }

                if (accountExists) {
                    JOptionPane.showMessageDialog(null, "Account already exists", "Errol", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (new_pass.equals(trypass)){
                        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Restaurant", "root", "1234");
                             PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO acc(acc_name, acc_pass,acc_access) VALUES (?, ?, ?)")) {
                            preparedStatement.setString(1, new_acc);
                            preparedStatement.setString(2, new_pass);
                            preparedStatement.setString(3, num_access);
                            preparedStatement.executeUpdate();
                        } catch (SQLException sqlException) {
                            sqlException.printStackTrace();
                        }
                        JOptionPane.showMessageDialog(null, "Account created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Check your password", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }catch (SQLException e){
                e.getMessage();
            }
    }else {
            JOptionPane.showMessageDialog(null, "Please enter all information.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Register().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
}