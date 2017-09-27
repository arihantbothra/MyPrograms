/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import homework1.Accounts;
import homework1.Address;
import homework1.CreditCard;
import homework1.License;
import homework1.Person;
import homework1.Spouse;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Arihant
 */
public class DataEntry extends javax.swing.JPanel {

    /**
     * Creates new form DataEntry
     */
    public Person person;
    public Accounts accounts;
    public Address address;
    public CreditCard creditcard;
    public License license;
    public Spouse spouse;
    
    public DataEntry(Person person, Accounts accounts, Address address, CreditCard creditcard, License license, Spouse spouse) {
        initComponents();
        this.person = person;
        this.accounts = accounts;
        this.address = address;
        this.creditcard = creditcard;
        this.license = license;
        this.spouse = spouse;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        sex = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        licensenumber = new javax.swing.JTextField();
        licenseissue = new javax.swing.JTextField();
        licenseissuelocation = new javax.swing.JTextField();
        licenseexpiry = new javax.swing.JTextField();
        vehiclenumber = new javax.swing.JTextField();
        ccnumber = new javax.swing.JTextField();
        cctype = new javax.swing.JTextField();
        cccvv = new javax.swing.JTextField();
        ccexpiry = new javax.swing.JTextField();
        cclimit = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        apartment = new javax.swing.JTextField();
        street = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        zip = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        accountnumber = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        accountcreation = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        accountstatus = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        accountbalance = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        accounttype = new javax.swing.JTextField();
        submitbutton = new javax.swing.JButton();
        spousecontact = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        spouseage = new javax.swing.JTextField();
        spouselast = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        spousefirst = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        selfimage = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jLabel28.setText("Type:");

        jLabel31.setText("Balance:");

        jLabel1.setText("First Name:");

        jLabel2.setText("Last Name:");

        jLabel3.setText("Age:");

        jLabel4.setText("Sex:");

        jLabel5.setText("Contact:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Basic Information");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("License");

        jLabel8.setText("License Number:");

        jLabel9.setText("Issue Date:");

        jLabel10.setText("Expiry:");

        jLabel11.setText("Issue Location:");

        jLabel12.setText("Vehicle Number:");

        jLabel13.setText("Number:");

        jLabel14.setText("Type:");

        jLabel15.setText("Expiry:");

        jLabel16.setText("CVV:");

        jLabel17.setText("Limit:");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel18.setText("Credit Card");

        jLabel19.setText("Apartment:");

        jLabel20.setText("Street:");

        jLabel21.setText("City:");

        jLabel22.setText("State:");

        jLabel23.setText("Zip:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("   Address");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Account");

        jLabel26.setText("Account Number:");

        jLabel27.setText("Creation Date:");

        jLabel29.setText("Status:");

        jLabel30.setText("Balance:");

        jLabel32.setText("Type:");

        accounttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accounttypeActionPerformed(evt);
            }
        });

        submitbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitbutton.setText("Submit");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });

        jLabel34.setText("Contact:");

        jLabel35.setText("Last Name:");

        jLabel36.setText("First Name:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Spouse");

        jLabel38.setText("Age:");

        selfimage.setText("Upload Image");
        selfimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selfimageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(firstname, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                            .addComponent(lastname)
                                            .addComponent(age)
                                            .addComponent(sex)
                                            .addComponent(contact)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel12))
                                                .addGap(25, 25, 25)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(licensenumber)
                                            .addComponent(licenseissue)
                                            .addComponent(licenseexpiry)
                                            .addComponent(licenseissuelocation)
                                            .addComponent(vehiclenumber, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17))
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(ccnumber)
                                                .addComponent(cctype)
                                                .addComponent(ccexpiry)
                                                .addComponent(cccvv)
                                                .addComponent(cclimit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel26))
                                                    .addGap(25, 25, 25))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel29)
                                                    .addGap(73, 73, 73)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel30)
                                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(accountstatus)
                                            .addComponent(accountcreation, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                            .addComponent(accountnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                            .addComponent(accountbalance)
                                            .addComponent(accounttype))))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(submitbutton)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(141, 141, 141)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel36)
                                            .addComponent(jLabel34))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(spouseage, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                            .addComponent(spouselast)
                                            .addComponent(spousefirst)
                                            .addComponent(spousecontact))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel20)
                                                .addComponent(jLabel21)
                                                .addComponent(jLabel22)
                                                .addComponent(jLabel23))
                                            .addGap(88, 88, 88))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addGap(67, 67, 67)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(apartment)
                                        .addComponent(street)
                                        .addComponent(city)
                                        .addComponent(state)
                                        .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(selfimage)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(apartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccexpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cccvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cclimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(licensenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(licenseissue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(accountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(accountcreation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(licenseexpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(accountstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(licenseissuelocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(accountbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(vehiclenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel32)
                                .addComponent(accounttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(spousefirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(spouselast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(spouseage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spousecontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitbutton)
                    .addComponent(selfimage))
                .addContainerGap(176, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void accounttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accounttypeActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_accounttypeActionPerformed

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        // TODO add your handling code here:
        
        //Assigning values to Person Class
        
        person.setFirstname(firstname.getText());
        person.setLastname(lastname.getText());
        person.setAge(age.getText());
        person.setSex(sex.getText());
        person.setContact(contact.getText());
        
        //Passing the values to respective Classes through Person's Class
        
        person.setaddress(address, apartment.getText(), street.getText(), city.getText(), state.getText(), zip.getText());
        
        person.setaccounts(accounts, accountnumber.getText(), accountcreation.getText(), accountstatus.getText(), accountbalance.getText(), accounttype.getText());
        
        person.setcredit(creditcard, ccnumber.getText(), cctype.getText(), ccexpiry.getText(), cclimit.getText(), cccvv.getText());
        
        person.setlicense(license, licensenumber.getText(), licenseissue.getText(), licenseexpiry.getText(), licenseissuelocation.getText(), vehiclenumber.getText());
        
        person.setspouse(spouse, spousefirst.getText(), spouselast.getText(), spousecontact.getText(), spouseage.getText());
        
        //Message Dialog Box
        JOptionPane.showMessageDialog(null, "Profile Created Successfully");
        
        //Link for getting the data from Classes 2-5 with Person Class
        person.getaddress(address);
        person.getaccounts(accounts);
        person.getcreditcard(creditcard);
        person.getlicense(license);
        person.getspouse(spouse);
    }//GEN-LAST:event_submitbuttonActionPerformed

    
    private void selfimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selfimageActionPerformed
        // TODO add your handling code here:
        
        // To prompt user to select the Profile Image
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        java.io.File file = chooser.getSelectedFile();        
        person.setFile(file);
         
    }//GEN-LAST:event_selfimageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountbalance;
    private javax.swing.JTextField accountcreation;
    private javax.swing.JTextField accountnumber;
    private javax.swing.JTextField accountstatus;
    private javax.swing.JTextField accounttype;
    private javax.swing.JTextField age;
    private javax.swing.JTextField apartment;
    private javax.swing.JTextField cccvv;
    private javax.swing.JTextField ccexpiry;
    private javax.swing.JTextField cclimit;
    private javax.swing.JTextField ccnumber;
    private javax.swing.JTextField cctype;
    private javax.swing.JTextField city;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField firstname;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField licenseexpiry;
    private javax.swing.JTextField licenseissue;
    private javax.swing.JTextField licenseissuelocation;
    private javax.swing.JTextField licensenumber;
    private javax.swing.JButton selfimage;
    private javax.swing.JTextField sex;
    private javax.swing.JTextField spouseage;
    private javax.swing.JTextField spousecontact;
    private javax.swing.JTextField spousefirst;
    private javax.swing.JTextField spouselast;
    private javax.swing.JTextField state;
    private javax.swing.JTextField street;
    private javax.swing.JButton submitbutton;
    private javax.swing.JTextField vehiclenumber;
    private javax.swing.JTextField zip;
    // End of variables declaration//GEN-END:variables
}