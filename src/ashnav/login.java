/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ashnav;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HCL
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jButton1 = new javax.swing.JButton();
        pf1 = new javax.swing.JPasswordField();
        tf1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setFont(new java.awt.Font("Aharoni", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 255));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 180, 60));

        pf1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        getContentPane().add(pf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 203, 43));

        tf1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 203, 44));

        jLabel3.setBackground(new java.awt.Color(51, 204, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 120, 50));

        jLabel4.setBackground(new java.awt.Color(51, 204, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 255));
        jLabel4.setText("Log ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 110, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setText("WELCOME DECK");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 410, 80));

        jButton2.setBackground(new java.awt.Color(204, 204, 0));
        jButton2.setFont(new java.awt.Font("Aharoni", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 255));
        jButton2.setText("REGITER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 463, 155, 60));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Colse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 255, 0));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\APSASC 20\\Documents\\photo pro\\2ND.PNG")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        setSize(new java.awt.Dimension(1000, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a = tf1.getText();
        String b = new String(pf1.getPassword());
        String pass;
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aski", "root", "admin");

            Statement s = con.createStatement();

            String query = "Select * from ashnav where uname = '" + a + "';";

            ResultSet rs = s.executeQuery(query);
            if (rs.next() == true) {
                    System.out.print("WORKS");
                    pass = rs.getString("pass");
                    if (b.equals(pass)) {
                        new menu().setVisible(true);
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(this, "Check the Password");
                    }

            } else {
                JOptionPane.showMessageDialog(this, "Check the User Name");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new registr().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new WELCOME().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
