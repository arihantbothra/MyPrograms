/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Create.Address;
import javafx.scene.control.SplitPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Create.Person;

/**
 *
 * @author arihant
 */
public class create extends javax.swing.JFrame {

    /**
     * Creates new form create
     */
    public Person getdetails;
    public Address address;
    public create() {
        initComponents();
        getdetails = new Person();
        address = new Address();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        controlpanel = new javax.swing.JPanel();
        createprofile = new javax.swing.JButton();
        displayprofile = new javax.swing.JButton();
        displaypanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createprofile.setText("Create");
        createprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createprofileActionPerformed(evt);
            }
        });

        displayprofile.setText("Display");
        displayprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayprofileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlpanelLayout = new javax.swing.GroupLayout(controlpanel);
        controlpanel.setLayout(controlpanelLayout);
        controlpanelLayout.setHorizontalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createprofile)
                    .addComponent(displayprofile))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        controlpanelLayout.setVerticalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(createprofile)
                .addGap(18, 18, 18)
                .addComponent(displayprofile)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        splitPanel.setLeftComponent(controlpanel);

        javax.swing.GroupLayout displaypanelLayout = new javax.swing.GroupLayout(displaypanel);
        displaypanel.setLayout(displaypanelLayout);
        displaypanelLayout.setHorizontalGroup(
            displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );
        displaypanelLayout.setVerticalGroup(
            displaypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        splitPanel.setRightComponent(displaypanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayprofileActionPerformed
        // TODO add your handling code here:
        output output = new output(getdetails, address);
        splitPanel.setRightComponent(output);
    }//GEN-LAST:event_displayprofileActionPerformed

    private void createprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createprofileActionPerformed
        // TODO add your handling code here:
        input input = new input(getdetails, address);
        splitPanel.setRightComponent(input);
        
    }//GEN-LAST:event_createprofileActionPerformed

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
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        JFrame frame = new JFrame();
//        frame.setSize(1000,700);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        JPanel panel = new JPanel(null);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlpanel;
    private javax.swing.JButton createprofile;
    private javax.swing.JPanel displaypanel;
    private javax.swing.JButton displayprofile;
    private javax.swing.JSplitPane splitPanel;
    // End of variables declaration//GEN-END:variables
}
