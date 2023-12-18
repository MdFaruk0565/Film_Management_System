
package RifatFilm;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.ImageIcon;


public class AdminPanel extends javax.swing.JFrame {
Connection_Page cp = new Connection_Page();
   
    public AdminPanel() {
        initComponents();
        ImageIcon myImg1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/rifat.jpg")));
        Image imf = myImg1.getImage();
        Image img0 = imf.getScaledInstance(bgImg.getWidth(), bgImg.getHeight(), Image.SCALE_AREA_AVERAGING);
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(img0);
        bgImg.setIcon(imageIcon);
        
        ResultSet rs,rs1,rs2,rs3;
    try{
        String bol="SELECT * FROM movies WHERE Category = 'Bolloywood'";
       
        rs=cp.stm.executeQuery(bol);
        
        while(rs.next()){
            String getName=rs.getString("Movie_Name");
            bolloywood.addItem(getName);  
        }
    }catch(Exception e){
        System.out.println("Database Error!1");
    }
    
     try{
        String hol="SELECT * FROM movies WHERE Category = 'Holloywood'";
        
        rs1=cp.stm.executeQuery(hol);
        
        while(rs1.next()){
            String getName=rs1.getString("Movie_Name");
            holloywood.addItem(getName);  
        }
    }catch(Exception e){
        System.out.println("Database Error2!");
    }
     
      try{
        String banM="SELECT * FROM movies WHERE Category = 'Bangla Movies'";
        
        rs2=cp.stm.executeQuery(banM);
       
        while(rs2.next()){
            String getName=rs2.getString("Movie_Name");
            banglaMovie.addItem(getName);  
        }
    }catch(Exception e){
        System.out.println("Database Error!3");
    }
      
       try{
        String Others="SELECT * FROM movies WHERE Category = 'Others Movies'";
       
        rs3=cp.stm.executeQuery(Others);
        
        while(rs3.next()){
            String getName=rs3.getString("Movie_Name");
            othersMovie.addItem(getName);  
        }
    }catch(Exception e){
        System.out.println("Database Error!4");
    }
       
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banglaMovie = new javax.swing.JComboBox<>();
        bolloywood = new javax.swing.JComboBox<>();
        holloywood = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        othersMovie = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 20));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        banglaMovie.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        banglaMovie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangla Movies" }));
        banglaMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banglaMovieActionPerformed(evt);
            }
        });
        getContentPane().add(banglaMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 250, 40));

        bolloywood.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bolloywood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bolloywood" }));
        getContentPane().add(bolloywood, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, 40));

        holloywood.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        holloywood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Holloywood" }));
        getContentPane().add(holloywood, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 240, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Add Movie");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 210, 60));

        othersMovie.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        othersMovie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Others Movies" }));
        getContentPane().add(othersMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 200, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Update Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 140, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Update Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Update Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 140, 40));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Update Data");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 140, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RIFAT Film Industry Limited");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 580, 70));
        getContentPane().add(bgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new addMovie().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String MovieNames=bolloywood.getSelectedItem().toString();
        new UpdateMovies(MovieNames).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String MovieNames=holloywood.getSelectedItem().toString();
        new UpdateMovies(MovieNames).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void banglaMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banglaMovieActionPerformed
        // TODO add your handling code here:
        String MovieNames=banglaMovie.getSelectedItem().toString();
        new UpdateMovies(MovieNames).setVisible(true);
    }//GEN-LAST:event_banglaMovieActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String MovieNames=othersMovie.getSelectedItem().toString();
        new UpdateMovies(MovieNames).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> banglaMovie;
    private javax.swing.JLabel bgImg;
    private javax.swing.JComboBox<String> bolloywood;
    private javax.swing.JComboBox<String> holloywood;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> othersMovie;
    // End of variables declaration//GEN-END:variables
}
