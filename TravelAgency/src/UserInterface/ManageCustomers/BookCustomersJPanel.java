/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import javax.swing.JPanel;

/**
 *
 * @author arihant
 */
public class BookCustomersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookCustomersJPanel
     */
    JPanel userProcessContainer;
    public BookCustomersJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Airliner:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 67, -1, -1));

        jLabel2.setText("Emirates");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 67, -1, -1));

        jLabel3.setText("Source: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 92, -1, -1));

        jLabel4.setText("Boston");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 92, -1, -1));

        jLabel5.setText("Destination:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 117, -1, -1));

        jLabel6.setText("Dubai");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 117, -1, -1));

        jLabel7.setText("Departure Time:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 142, -1, -1));

        jLabel8.setText("Arrival Time:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 167, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Customer Details");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 198, -1, -1));

        jButton1.setText("Book the flight");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 311, -1, -1));

        jLabel10.setText("Name:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 224, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 221, 103, -1));

        jLabel11.setText("Other Fields....");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 259, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Book Flight for the Customer");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 20, -1, -1));

        jButton2.setText("<<back");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}