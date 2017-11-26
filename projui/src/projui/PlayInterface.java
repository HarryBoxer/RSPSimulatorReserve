/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projui;

/**
 *
 * @author karn
 */
public class PlayInterface extends javax.swing.JFrame {
    private RPS rps = new RPS();
    /**
     * Creates new form PlayInterface
     */
    public PlayInterface() {
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

        scissorsButt = new javax.swing.JButton();
        paperButt = new javax.swing.JButton();
        rockButt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scissorsButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BtnS.png"))); // NOI18N
        scissorsButt.setBorderPainted(false);
        scissorsButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorsButtActionPerformed(evt);
            }
        });
        getContentPane().add(scissorsButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 120, 130));

        paperButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BtnP.png"))); // NOI18N
        paperButt.setBorderPainted(false);
        paperButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperButtActionPerformed(evt);
            }
        });
        getContentPane().add(paperButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 120, 130));

        rockButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnR.png"))); // NOI18N
        rockButt.setBorderPainted(false);
        rockButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockButtActionPerformed(evt);
            }
        });
        getContentPane().add(rockButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 120, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BG3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rockButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockButtActionPerformed
        rps.choose = "rock";  
        System.out.println("you choosing = " +RPS.choose);
        rps.runChoose();
    }//GEN-LAST:event_rockButtActionPerformed

    private void paperButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperButtActionPerformed
        rps.choose = "paper";
        System.out.println("you choosing = " +RPS.choose);
        rps.runChoose();
    }//GEN-LAST:event_paperButtActionPerformed

    private void scissorsButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorsButtActionPerformed
        rps.choose = "scissors";
        System.out.println("you choosing = " +RPS.choose);
        rps.runChoose();
    }//GEN-LAST:event_scissorsButtActionPerformed

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
            java.util.logging.Logger.getLogger(PlayInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton paperButt;
    private javax.swing.JButton rockButt;
    private javax.swing.JButton scissorsButt;
    // End of variables declaration//GEN-END:variables
}
