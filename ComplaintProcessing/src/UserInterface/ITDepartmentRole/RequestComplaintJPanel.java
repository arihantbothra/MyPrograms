/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ITDepartmentRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author arihant
 */

import Business.EcoSystem;

import Business.Enterprise.Enterprise;
import Business.Organization.HRManagerOrganization;
import Business.Organization.ITDepartmentOrganization;
import Business.Organization.MarketingDepartmentOrganization;

import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.network.Network;
import ReviewForm.ReviewRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.security.Provider;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
public class RequestComplaintJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestComplaintJPanel
     */
     private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;
    private EcoSystem business;
        

   public RequestComplaintJPanel(JPanel userProcessContainer, Organization organization, UserAccount userAccount, Enterprise enterprise, EcoSystem business) {

    initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount =  userAccount;
        this.business =business;
        this.organization = organization;
        valueLabel.setText(enterprise.getName());
        populateComboBox();
        populateComplaintTypeComboBox();
  
    }

     public void populateComboBox()
   {
       for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
           if(!(organization instanceof HRManagerOrganization))
              {
           for(UserAccount userAccount1:organization.getUserAccountDirectory().getUserAccountList()){
               if((!userAccount1.equals(userAccount))==false){
                   
               }
               else{
                 comboBoxAgainst.addItem(userAccount1);
               }
           }
              }
       }
   }
     public void populateComplaintTypeComboBox()
    {
        comboBoxCompType.addItem("Racisist Offence");
        comboBoxCompType.addItem("Sexual Offence");
        comboBoxCompType.addItem("Gender based offence");
        comboBoxCompType.addItem("Other");
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        comboBoxAgainst = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxCompType = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtTeam = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Send Request ");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        messageJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageJTextFieldActionPerformed(evt);
            }
        });
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 283, -1));

        add(comboBoxAgainst, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 283, -1));

        jLabel2.setText("Complaint Against");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setText("Complaint Type");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        add(comboBoxCompType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 283, -1));

        jLabel4.setText("Manager");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 86, 17));
        add(txtTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 283, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String message = messageJTextField.getText();
        String manager = txtTeam.getText();
              
        LabTestWorkRequest request = new LabTestWorkRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setComplaintAgainst((UserAccount) comboBoxAgainst.getSelectedItem());
        request.setComplaintType((String) comboBoxCompType.getSelectedItem());
        
        request.setCompanyInfo(organization.toString());
        request.setManager(manager);
             
        ReviewRequest reviewreq = new ReviewRequest();
        reviewreq.setOrg(organization);
        reviewreq.setEmployee(userAccount);
        if(reviewreq.getSubmit_status() == null)
            reviewreq.setSubmit_status("Pending 1");
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof HRManagerOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request); // sending to complaint request the hrmanagerorganization
            userAccount.getWorkQueue().getWorkRequestList().add(request);// displaying myself of the complaint raised
        }
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            
            if (organization instanceof HRManagerOrganization){
                organization.getReviewList().getReviewform_arraylist().add(reviewreq);
            }
            if (organization instanceof ITDepartmentOrganization){
                organization.getReviewList().getReviewform_arraylist().add(reviewreq);
            }
            if (organization instanceof MarketingDepartmentOrganization){
                organization.getReviewList().getReviewform_arraylist().add(reviewreq);
            }
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ITDepartmentComplaintWorkAreaJPanel itdwajp = (ITDepartmentComplaintWorkAreaJPanel) component;
        itdwajp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void messageJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox comboBoxAgainst;
    private javax.swing.JComboBox comboBoxCompType;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextField txtTeam;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
