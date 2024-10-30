
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lizsotomayor
 */
public class DeleteUserPage extends javax.swing.JFrame {

    /**
     * Creates new form DeleteUserPage
     */
    public DeleteUserPage() {
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
        jLabel1 = new javax.swing.JLabel();
        EnterUsername = new javax.swing.JTextField();
        DeleteButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        EnterUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 140));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 254, 244));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 18)); // NOI18N
        jLabel1.setText("Enter User's Username To Delete:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 10, 300, 28);

        EnterUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(EnterUsername);
        EnterUsername.setBounds(125, 41, 213, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(6, 6, 0, 0);

        DeleteButton2.setText("Delete");
        DeleteButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteButton2);
        DeleteButton2.setBounds(200, 100, 72, 23);

        jPanel5.setBackground(new java.awt.Color(255, 254, 244));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 18)); // NOI18N
        jLabel2.setText("Enter User's Username To Delete:");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(80, 10, 310, 28);

        EnterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterUserActionPerformed(evt);
            }
        });
        jPanel5.add(EnterUser);
        EnterUser.setBounds(125, 41, 213, 23);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 10, 455, 84);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 470, 140);

        setSize(new java.awt.Dimension(470, 167));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EnterUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterUsernameActionPerformed

    private void DeleteButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButton2ActionPerformed
        String url = "jdbc:postgresql://localhost:5432/humane_society";
        String user = "postgres";
        String query = "delete from users where username = ?";
        String user_entered = EnterUser.getText();
        try{
            Connection conn = DriverManager.getConnection(url, user, null);
            Statement stmnt = conn.createStatement();
            PreparedStatement stm = conn.prepareCall(query);

            stm.setString(1, user_entered);
            stm.execute();

            JOptionPane.showMessageDialog(this, "User deleted successfully.");

            EnterUser.setText(null);
            this.dispose();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Error executing SQL: " + ex.getMessage());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Unexpected error: " + e.getMessage());
        }
    }//GEN-LAST:event_DeleteButton2ActionPerformed

    private void EnterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterUserActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteUserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUserPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton1;
    private javax.swing.JButton DeleteButton2;
    private javax.swing.JTextField EnterUser;
    private javax.swing.JTextField EnterUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}