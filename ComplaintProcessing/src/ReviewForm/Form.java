/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReviewForm;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.ITDepartmentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author arihant
 */
public class Form extends javax.swing.JPanel {

    /**
     * Creates new form Form
     */
    ReviewForm reviewForm;
    private Enterprise enterprise;
    private Organization tot_organization, org;
    JPanel userProcessContainer;
    UserAccount ua, emp;
    
    public Form(JPanel panel, Organization tot_organization, Organization org, UserAccount emp, Enterprise enterprise, ReviewForm request, UserAccount ua) {
        initComponents();
        this.userProcessContainer = panel;
        this.enterprise= enterprise; 
        this.org = org;
        this.tot_organization = tot_organization;
        this.reviewForm = request;
        this.ua = ua;
        this.emp = emp;
        employee.setText(emp.toString());
        employee.setEditable(false);
        organization.setText(org.toString());
//        popOrganizationComboBox();
//        populateEmployeeComboBox(org);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        organization = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        enthusiasm = new javax.swing.JTextField();
        jobknowledge = new javax.swing.JTextField();
        productivity = new javax.swing.JTextField();
        workquality = new javax.swing.JTextField();
        technicalskills = new javax.swing.JTextField();
        workconsistency = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        attendance = new javax.swing.JTextField();
        cooperation = new javax.swing.JTextField();
        attitude = new javax.swing.JTextField();
        workrelation = new javax.swing.JTextField();
        creativity = new javax.swing.JTextField();
        punctuality = new javax.swing.JTextField();
        initiative = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        dependabiltiy = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        communicationskills = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        overallrating = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        employee = new javax.swing.JTextField();
        submitresponse = new javax.swing.JButton();
        welcome1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organization.setFont(new java.awt.Font("Viner Hand ITC", 3, 16)); // NOI18N
        add(organization, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 280, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("*Rate on the scale of 0-100");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Job Knowledge");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Productivity");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Work Quality");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Technical Skills");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Work Consistency");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Enthusiasm");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 70, 20));
        add(enthusiasm, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 60, -1));

        jobknowledge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobknowledgeActionPerformed(evt);
            }
        });
        add(jobknowledge, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 60, -1));
        add(productivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 60, -1));
        add(workquality, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 60, -1));
        add(technicalskills, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 60, -1));
        add(workconsistency, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 60, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Cooperation");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 70, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setText("Initiative");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 70, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setText("Attitude");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 70, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("Work Relation");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 90, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel13.setText("Creativity");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 90, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel14.setText("Punctuality");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 70, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel15.setText("Attendance");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 70, 20));
        add(attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 60, -1));

        cooperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cooperationActionPerformed(evt);
            }
        });
        add(cooperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 60, -1));
        add(attitude, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 60, -1));
        add(workrelation, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 60, -1));
        add(creativity, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 60, -1));
        add(punctuality, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 60, -1));

        initiative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initiativeActionPerformed(evt);
            }
        });
        add(initiative, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 60, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel16.setText("Dependability");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 90, 20));
        add(dependabiltiy, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 60, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setText("Communication Skills");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 130, 20));
        add(communicationskills, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 60, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel18.setText("Overall Rating");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 100, 20));
        add(overallrating, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 60, -1));

        back.setBackground(new java.awt.Color(153, 0, 0));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 60, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel38.setText("Employee");
        add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 20));

        employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });
        add(employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 60, -1));

        submitresponse.setBackground(new java.awt.Color(153, 0, 0));
        submitresponse.setText("Submit");
        submitresponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitresponseActionPerformed(evt);
            }
        });
        add(submitresponse, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, -1));

        welcome1.setFont(new java.awt.Font("Viner Hand ITC", 3, 16)); // NOI18N
        add(welcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jobknowledgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobknowledgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobknowledgeActionPerformed

    private void cooperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cooperationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cooperationActionPerformed

    private void initiativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initiativeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_initiativeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backActionPerformed

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeActionPerformed

    private void submitresponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitresponseActionPerformed
        
        for(ReviewForm review : tot_organization.getReviewList().getReviewform_arraylist()){
            if(review.getOrg().equals(org)){
                if(review.getEmployee().equals(emp)){
                    try{
                        review.setAttendance(Double.parseDouble(attendance.getText()));
                        review.setAttitude(Double.parseDouble(attitude.getText()));
                        review.setCommunication_skills(Double.parseDouble(communicationskills.getText()));
                        review.setCooperation(Double.parseDouble(cooperation.getText()));
                        review.setCreativity(Double.parseDouble(creativity.getText()));
                        review.setDependability(Double.parseDouble(dependabiltiy.getText()));
                        review.setEnthusiasm(Double.parseDouble(enthusiasm.getText()));
                        review.setInitiative(Double.parseDouble(initiative.getText()));
                        review.setJobknowledge(Double.parseDouble(jobknowledge.getText()));
                        review.setOverall_rating(Double.parseDouble(overallrating.getText()));
                        review.setProductivity(Double.parseDouble(productivity.getText()));
                        review.setPunctuality(Double.parseDouble(punctuality.getText()));
                        review.setTechnical_skills(Double.parseDouble(technicalskills.getText()));
                        review.setWork_consistency(Double.parseDouble(workconsistency.getText()));
                        review.setWork_relations(Double.parseDouble(workrelation.getText()));
                        review.setWorkquality(Double.parseDouble(workquality.getText()));
            //            reviewForm.setResponse_emp(ua);
                    } catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Error Submitting the response");
                    }
                    if(review.getSubmit_status() == null){
                        continue;
                    }
                    else if(review.getSubmit_status().equalsIgnoreCase("Pending 1")){
                        review.setResponses("Initial_Submitted");
                        review.setPerformance1();
                    }
                    else if(review.getSubmit_status().equalsIgnoreCase("Submit 1")){
                        review.setResponses("Final_Submit");
                        review.setSubmit_status("Submit 2");
                        review.setPerformance2();
                    }
                }
            }
          
        }
        
//        displaycontent();
        
        

    }//GEN-LAST:event_submitresponseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField attendance;
    private javax.swing.JTextField attitude;
    private javax.swing.JButton back;
    private javax.swing.JTextField communicationskills;
    private javax.swing.JTextField cooperation;
    private javax.swing.JTextField creativity;
    private javax.swing.JTextField dependabiltiy;
    private javax.swing.JTextField employee;
    private javax.swing.JTextField enthusiasm;
    private javax.swing.JTextField initiative;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jobknowledge;
    private javax.swing.JLabel organization;
    private javax.swing.JTextField overallrating;
    private javax.swing.JTextField productivity;
    private javax.swing.JTextField punctuality;
    private javax.swing.JButton submitresponse;
    private javax.swing.JTextField technicalskills;
    private javax.swing.JLabel welcome1;
    private javax.swing.JTextField workconsistency;
    private javax.swing.JTextField workquality;
    private javax.swing.JTextField workrelation;
    // End of variables declaration//GEN-END:variables
}
