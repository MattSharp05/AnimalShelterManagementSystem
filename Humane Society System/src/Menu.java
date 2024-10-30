/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lizsotomayor
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NewApplicationButton = new javax.swing.JButton();
        PetCatalogButton = new javax.swing.JButton();
        ViewApplicationsButton = new javax.swing.JButton();
        NewIntakeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        StartAdoptionButton = new javax.swing.JButton();
        addDonation = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        SwitchUserButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("ITF Devanagari Marathi", 0, 10)); // NOI18N
        setMinimumSize(new java.awt.Dimension(559, 330));
        setPreferredSize(new java.awt.Dimension(559, 330));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 149, -1, -1));

        jPanel3.setBackground(new java.awt.Color(252, 249, 246));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("YuMincho +36p Kana", 2, 18)); // NOI18N
        jLabel1.setText("MENU");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(180, 20, 70, 24);

        NewApplicationButton.setText("New Application");
        NewApplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewApplicationButtonActionPerformed(evt);
            }
        });
        jPanel3.add(NewApplicationButton);
        NewApplicationButton.setBounds(30, 170, 140, 20);

        PetCatalogButton.setText("Pet Catalog");
        PetCatalogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetCatalogButtonActionPerformed(evt);
            }
        });
        jPanel3.add(PetCatalogButton);
        PetCatalogButton.setBounds(30, 90, 140, 20);

        ViewApplicationsButton.setText("View Applications");
        ViewApplicationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewApplicationsButtonActionPerformed(evt);
            }
        });
        jPanel3.add(ViewApplicationsButton);
        ViewApplicationsButton.setBounds(30, 200, 140, 20);

        NewIntakeButton.setText("New Intake");
        NewIntakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewIntakeButtonActionPerformed(evt);
            }
        });
        jPanel3.add(NewIntakeButton);
        NewIntakeButton.setBounds(30, 60, 140, 20);

        jLabel2.setFont(new java.awt.Font("YuMincho +36p Kana", 1, 14)); // NOI18N
        jLabel2.setText("Animals");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 40, 60, 19);

        jLabel3.setFont(new java.awt.Font("YuMincho +36p Kana", 1, 14)); // NOI18N
        jLabel3.setText("Applications");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 150, 110, 19);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_BpVfRm3n_1719507623928_raw.jpg"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(250, 80, 110, 100);

        StartAdoptionButton.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        StartAdoptionButton.setText("Start Adoption");
        StartAdoptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartAdoptionButtonActionPerformed(evt);
            }
        });
        jPanel3.add(StartAdoptionButton);
        StartAdoptionButton.setBounds(30, 120, 140, 20);

        addDonation.setText("Add Donation");
        addDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDonationActionPerformed(evt);
            }
        });
        jPanel3.add(addDonation);
        addDonation.setBounds(30, 280, 140, 23);

        jLabel8.setFont(new java.awt.Font("YuMincho +36p Kana", 1, 14)); // NOI18N
        jLabel8.setText("Donations");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 230, 150, 19);

        jButton2.setText("View Donations");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(30, 250, 140, 23);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 350));

        jPanel4.setBackground(new java.awt.Color(0, 102, 51));
        jPanel4.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/South-Florida-Bulls-Logo.png"))); // NOI18N
        jPanel4.add(jLabel7);
        jLabel7.setBounds(40, 110, 100, 100);

        SwitchUserButton.setText("Switch User");
        SwitchUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwitchUserButtonActionPerformed(evt);
            }
        });
        jPanel4.add(SwitchUserButton);
        SwitchUserButton.setBounds(30, 300, 110, 23);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 170, 350));

        setSize(new java.awt.Dimension(559, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NewApplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewApplicationButtonActionPerformed
        new NewApplication().setVisible(true);
    }//GEN-LAST:event_NewApplicationButtonActionPerformed

    private void PetCatalogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetCatalogButtonActionPerformed
        new PetCatalog().setVisible(true);
    }//GEN-LAST:event_PetCatalogButtonActionPerformed

    private void ViewApplicationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewApplicationsButtonActionPerformed
        new Applications().setVisible(true);
    }//GEN-LAST:event_ViewApplicationsButtonActionPerformed

    private void NewIntakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewIntakeButtonActionPerformed
        new NewIntake().setVisible(true);
    }//GEN-LAST:event_NewIntakeButtonActionPerformed

    private void SwitchUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwitchUserButtonActionPerformed
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SwitchUserButtonActionPerformed

    private void StartAdoptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartAdoptionButtonActionPerformed
       new AdoptPage().setVisible(true);
    }//GEN-LAST:event_StartAdoptionButtonActionPerformed

    private void addDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDonationActionPerformed
        new NewDonation().setVisible(true);
    }//GEN-LAST:event_addDonationActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Donations().setVisible(true);
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
                if ("FlatlafCupertinoDark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewApplicationButton;
    private javax.swing.JButton NewIntakeButton;
    private javax.swing.JButton PetCatalogButton;
    private javax.swing.JButton StartAdoptionButton;
    private javax.swing.JButton SwitchUserButton;
    private javax.swing.JButton ViewApplicationsButton;
    private javax.swing.JButton addDonation;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}