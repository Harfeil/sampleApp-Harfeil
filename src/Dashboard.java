
import java.awt.Color;
import internalPanes.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harfe
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    DashboardPage dashboard = new DashboardPage();
    Color navgar = new Color(0,153,153);
    Color bodyColor = new Color(204,204,255);
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navbarPane = new javax.swing.JPanel();
        reportPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addProdPane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        profilePane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        updatePane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        maindeskPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        navbarPane.setBackground(new java.awt.Color(0, 153, 153));
        navbarPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportPane.setBackground(new java.awt.Color(0, 153, 153));
        reportPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportPaneMouseExited(evt);
            }
        });
        reportPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SOLD PRODUCTS");
        reportPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        navbarPane.add(reportPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 160, 40));

        addProdPane.setBackground(new java.awt.Color(0, 153, 153));
        addProdPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProdPaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addProdPaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addProdPaneMouseExited(evt);
            }
        });
        addProdPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADD PRODUCTS");
        addProdPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        navbarPane.add(addProdPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 160, 50));

        profilePane.setBackground(new java.awt.Color(0, 153, 153));
        profilePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profilePaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profilePaneMouseExited(evt);
            }
        });
        profilePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PROFILE");
        profilePane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        navbarPane.add(profilePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 160, 40));

        updatePane.setBackground(new java.awt.Color(0, 153, 153));
        updatePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatePaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatePaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatePaneMouseExited(evt);
            }
        });
        updatePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UPDATE HERE");
        updatePane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        navbarPane.add(updatePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 160, 50));

        jPanel1.add(navbarPane);
        navbarPane.setBounds(0, 0, 160, 420);

        maindeskPane.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout maindeskPaneLayout = new javax.swing.GroupLayout(maindeskPane);
        maindeskPane.setLayout(maindeskPaneLayout);
        maindeskPaneLayout.setHorizontalGroup(
            maindeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        maindeskPaneLayout.setVerticalGroup(
            maindeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        jPanel1.add(maindeskPane);
        maindeskPane.setBounds(160, 50, 590, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reportPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportPaneMouseEntered
        
        reportPane.setBackground(bodyColor);
        
    }//GEN-LAST:event_reportPaneMouseEntered

    private void reportPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportPaneMouseExited
        
        reportPane.setBackground(navgar);
        
    }//GEN-LAST:event_reportPaneMouseExited

    private void addProdPaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProdPaneMouseEntered

        addProdPane.setBackground(bodyColor);
       
    }//GEN-LAST:event_addProdPaneMouseEntered

    private void addProdPaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProdPaneMouseExited
        
        addProdPane.setBackground(navgar);
        
    }//GEN-LAST:event_addProdPaneMouseExited

    private void profilePaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilePaneMouseEntered

        profilePane.setBackground(bodyColor);
        
    }//GEN-LAST:event_profilePaneMouseEntered

    private void profilePaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilePaneMouseExited
        
        profilePane.setBackground(navgar);
        
    }//GEN-LAST:event_profilePaneMouseExited


    private void addProdPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProdPaneMouseClicked
       
        maindeskPane.add(dashboard).setVisible(true);
        
    }//GEN-LAST:event_addProdPaneMouseClicked

    private void reportPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportPaneMouseClicked

        dashboard.setVisible(false);
        
    }//GEN-LAST:event_reportPaneMouseClicked

    private void updatePaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePaneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePaneMouseClicked

    private void updatePaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePaneMouseEntered

        updatePane.setBackground(bodyColor);
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePaneMouseEntered

    private void updatePaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePaneMouseExited
        
        updatePane.setBackground(navgar);
        
    }//GEN-LAST:event_updatePaneMouseExited

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addProdPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane maindeskPane;
    private javax.swing.JPanel navbarPane;
    private javax.swing.JPanel profilePane;
    private javax.swing.JPanel reportPane;
    private javax.swing.JPanel updatePane;
    // End of variables declaration//GEN-END:variables
}
