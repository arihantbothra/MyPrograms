/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EmployeeHelpSubRoles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.GenderInequalityDepartmentOrganization;
import Business.Organization.HRManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.HeadOfficeRole.ProcessHeadOfficeWorkRequestJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arihant
 */
public class GenderInequalityWorkAreaJPanel extends javax.swing.JPanel {

   
  
      private JPanel userProcessContainer;
     private EcoSystem business;
     private UserAccount userAccount;
     private GenderInequalityDepartmentOrganization genderInequalityDepartmentOrganization;
     private Enterprise enterprise;
     
    public GenderInequalityWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
 
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.userAccount =account;
        this.business = business;
        this.genderInequalityDepartmentOrganization=  (GenderInequalityDepartmentOrganization) organization;
        this.enterprise=enterprise;
        populateGenderInequalityTable();
       valueLabel.setText(enterprise.getName());
    }

   
public void populateGenderInequalityTable(){
      DefaultTableModel model = (DefaultTableModel)tblGenderInequality.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : genderInequalityDepartmentOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getEmployeeName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmployeeName();
            row[3] = request.getStatus();
//              request.getCompanyInfo();
//              request.getComplaintAgainst();
//              request.getComplaintType();
            
            model.addRow(row);
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGenderInequality = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        tblGenderInequality.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "complaint", "sender", "reciever", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblGenderInequality);

        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setText("process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        valueLabel.setText("jLabel3");

        jLabel3.setText("Enterprise:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(108, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssign)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcess)
                        .addGap(118, 118, 118))))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addGap(75, 75, 75)
                .addComponent(valueLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel)
                    .addComponent(jLabel3))
                .addGap(112, 112, 112)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnProcess))
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
  int selectedRow = tblGenderInequality.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)tblGenderInequality.getValueAt(selectedRow, 0);
        System.out.println(request);
        System.out.println(userAccount);
        request.setReceiver(userAccount);
//        
        request.setStatus("Pending");
        populateGenderInequalityTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblGenderInequality.getSelectedRow();

        if (selectedRow < 0){
            
            JOptionPane.showMessageDialog(null,"select a row");
            return;
        }

        LabTestWorkRequest request = (LabTestWorkRequest)tblGenderInequality.getValueAt(selectedRow, 0);
        
       
        request.setStatus("Processing");

        ProcessRequestJPanel processRequestJPanel = new ProcessRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processRequestJPanel", processRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblGenderInequality;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
