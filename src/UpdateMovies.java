/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RifatFilm;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class UpdateMovies extends javax.swing.JFrame {

   Connection_Page cp = new Connection_Page();
   private String MovieName;
   
    public UpdateMovies(String MovieName) {
        this.MovieName=MovieName;
        ResultSet rs;
        initComponents();
        try{
           String query = "SELECT * FROM movies WHERE Movie_Name = '" + MovieName + "'";
        rs=cp.stm.executeQuery(query);
        while(rs.next()){
            movie_name.setText(rs.getString("Movie_Name"));
            director.setText(rs.getString("Director"));
            producer.setText(rs.getString("Producer"));
            relaise.setText(rs.getString("Relaise_Date"));
           
        }
        }catch(Exception e){System.out.println("Database Error11!");}
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        category = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        relaise = new javax.swing.JTextField();
        producer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        director = new javax.swing.JTextField();
        movie_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bolloywood", "Holloywood", "Bangla Movies", "Others Movies" }));
        getContentPane().add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 250, 40));

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 210, 50));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 100, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Category");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 120, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Release Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 120, 30));

        relaise.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(relaise, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 260, 30));

        producer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(producer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 260, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Producor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Director");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 120, 30));

        director.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(director, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 260, 30));

        movie_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        movie_name.setEnabled(false);
        getContentPane().add(movie_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 260, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name of the Movie");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String gMovieName=movie_name.getText();
        String gDirector=director.getText();
        String gProducer=producer.getText();
        String gRelaise=relaise.getText();
        String gCategory=category.getSelectedItem().toString();

        String query = String.format("UPDATE movies SET Director='%s', Producer='%s', Relaise_Date='%s', Category='%s' WHERE Movie_Name='%s'", gDirector, gProducer, gRelaise, gCategory, gMovieName);

        try{
            int i = cp.stm.executeUpdate(query);
            

            if (i != 0) {
                JOptionPane.showMessageDialog(this, "Movie Update Susscessfull");
                this.dispose();
                new AdminPanel().setVisible(true);
            }
        } catch (Exception e) {
            System.out.println("Something Went Wrong");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMovies("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> category;
    private javax.swing.JTextField director;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField movie_name;
    private javax.swing.JTextField producer;
    private javax.swing.JTextField relaise;
    // End of variables declaration//GEN-END:variables
}
