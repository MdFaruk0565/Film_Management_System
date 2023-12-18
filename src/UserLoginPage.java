
package RifatFilm;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class UserLoginPage extends javax.swing.JFrame {
Connection_Page cp=new Connection_Page();

    public UserLoginPage() {
        initComponents();
        
        ImageIcon myImg1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/rifat.jpg")));
        Image imf = myImg1.getImage();
        Image img0 = imf.getScaledInstance(bgImg.getWidth(), bgImg.getHeight(), Image.SCALE_AREA_AVERAGING);
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(img0);
        bgImg.setIcon(imageIcon);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submit = new javax.swing.JButton();
        submit1 = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        Email = new javax.swing.JTextField();
        error = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 50));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Login");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 190, 50));

        submit1.setBackground(new java.awt.Color(204, 204, 204));
        submit1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit1.setText("Create new account");
        submit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit1MouseClicked(evt);
            }
        });
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });
        getContentPane().add(submit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 220, 50));

        Password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 270, 40));

        Email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 270, 40));

        error.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 250, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 90, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 90, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apon Film Industry Limited");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 70));
        getContentPane().add(bgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_submitMouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        if(Email.getText().equals("")||Password.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter Every Field");
        }
        else{
            String email = Email.getText();
            char[] passwordChars = Password.getPassword();
            String pass = new String(passwordChars);

            ResultSet rs = null;
            try {
                String query = "SELECT * FROM register WHERE Email = '"+email+"' AND Password = '"+pass+"'";

                rs=cp.stm.executeQuery(query);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this,"Login Successfull");
                    //new HomePage(email).setVisible(true);
                    this.setVisible(false);

                } else {
                    error.setText("Email or Password was incorrect!");
                }
            } catch (Exception e) {
                System.out.println("Check Database Connection "+e);
            }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void submit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_submit1MouseClicked

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new signUpPage().setVisible(true);
    }//GEN-LAST:event_submit1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel bgImg;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton submit;
    private javax.swing.JButton submit1;
    // End of variables declaration//GEN-END:variables
}
