/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ashnav;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author HCL
 */
public class splash extends javax.swing.JFrame {
/**
     * Creates new form Splash
     */
    public splash() {
        initComponents();
        exitL.setIcon(exited);

        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furqaan", "root", "admin");
            Statement stmt = con.createStatement();

            String comments = "create table location(Location varchar(100));";

            stmt.executeUpdate(comments);

            con.close();
            stmt.close();

        } catch (Exception e) {

        }

        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furqaan", "root", "admin");
            Statement stmt = con.createStatement();

            String admins = "create table admins(name varchar(20), password varchar(20));";

            stmt.executeUpdate(admins);

            con.close();
            stmt.close();

        } catch (Exception e) {

        }

        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furqaan", "root", "admin");
            Statement stmt = con.createStatement();

            String login_info = "create table login_info(name varchar(20), time varchar(20), access varchar(20));";

            stmt.executeUpdate(login_info);

            con.close();
            stmt.close();

        } catch (Exception e) {

        }

        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furqaan", "root", "admin");
            Statement stmt = con.createStatement();

            String headboy = "create table headboy(name varchar(20), count int(5));";

            stmt.executeUpdate(headboy);

            con.close();
            stmt.close();

        } catch (Exception e) {

        }

        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furqaan", "root", "admin");
            Statement stmt = con.createStatement();

            String headgirl = "create table headgirl(name varchar(20), count int(5));";

            stmt.executeUpdate(headgirl);

            con.close();
            stmt.close();

        } catch (Exception e) {

        }
        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furqaan", "root", "admin");
            Statement stmt = con.createStatement();

            String cultural = "create table cultural(name varchar(20), count int(5));";

            stmt.executeUpdate(cultural);

            con.close();
            stmt.close();

        } catch (Exception e) {

        }

        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furqaan", "root", "admin");
            Statement stmt = con.createStatement();

            String sports = "create table sports(name varchar(20), count int(5));";

            stmt.executeUpdate(sports);

            con.close();
            stmt.close();

        } catch (Exception e) {

        }

    }

    ImageIcon exited = new ImageIcon("src/res/exit.jpeg");
    ImageIcon entered = new ImageIcon("src/res/exit1.jpeg");
    static void setVariable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

   /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        exitL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.setForeground(new java.awt.Color(153, 255, 153));
        bar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 512, 510, 10));

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Chiller", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 51));
        jLabel2.setText("   FARMERS BUDDY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 410, 60));

        error.setBackground(new java.awt.Color(255, 255, 255));
        error.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setToolTipText("");
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 522, 500, 16));

        exitL.setBackground(new java.awt.Color(255, 0, 0));
        exitL.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        exitL.setText("Exit");
        exitL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitLMouseReleased(evt);
            }
        });
        getContentPane().add(exitL, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 70, 36));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(152, 15));
        jPanel2.setMinimumSize(new java.awt.Dimension(152, 15));

        jLabel13.setBackground(new java.awt.Color(0, 51, 153));
        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("+ Developed by asansa +");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 542, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\APSASC 20\\Documents\\photo pro\\asd.PNG")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitLMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLMouseReleased
        if (exitL.getIcon() == entered) {
            try {

                Thread.sleep(500);
                System.exit(0);

            } catch (InterruptedException ex) {
                Logger.getLogger(splash.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_exitLMouseReleased

    private void exitLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLMouseExited
        // TODO add your handling code here:
        exitL.setIcon(exited);
    }//GEN-LAST:event_exitLMouseExited

    private void exitLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLMouseEntered
        // TODO add your handling code here:
        exitL.setIcon(entered);
    }//GEN-LAST:event_exitLMouseEntered

    private void exitLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLMouseClicked
        if (exitL.getIcon() == entered) {
            try {

                Thread.sleep(500);
                System.exit(0);

            } catch (InterruptedException ex) {
                Logger.getLogger(splash.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  // TODO add your handling code here:
    }//GEN-LAST:event_exitLMouseClicked

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
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar bar;
    public javax.swing.JLabel error;
    private javax.swing.JLabel exitL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}