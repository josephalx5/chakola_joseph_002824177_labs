/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.VitalSigns;
import model.VitalSignsHistory;

/**
 *
 * @author josephchakola
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    private VitalSignsHistory vitals;

    /**
     * Creates new form createJPanel
     */
    public CreateJPanel(VitalSignsHistory vitals) {
        initComponents();
        this.vitals = vitals;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLabel = new javax.swing.JLabel();
        tempLabel = new javax.swing.JLabel();
        bpLabel = new javax.swing.JLabel();
        plLabel = new javax.swing.JLabel();
        dtLabel = new javax.swing.JLabel();
        tempField = new javax.swing.JTextField();
        bpField = new javax.swing.JTextField();
        plField = new javax.swing.JTextField();
        dtField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        mainLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("Create Vitals");

        tempLabel.setText("Temperature:");

        bpLabel.setText("Blood Pressure:");

        plLabel.setText("Pulse:");

        dtLabel.setText("Date:");

        tempField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempFieldActionPerformed(evt);
            }
        });

        bpField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpFieldActionPerformed(evt);
            }
        });

        plField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plFieldActionPerformed(evt);
            }
        });

        dtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtFieldActionPerformed(evt);
            }
        });

        saveButton.setText("Save Vitals");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dtLabel)
                    .addComponent(plLabel)
                    .addComponent(bpLabel)
                    .addComponent(tempLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tempField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bpField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tempLabel)
                    .addComponent(tempField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bpLabel)
                    .addComponent(bpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plLabel)
                    .addComponent(plField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtLabel)
                    .addComponent(dtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(saveButton)
                .addContainerGap(288, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tempFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempFieldActionPerformed

    private void bpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpFieldActionPerformed

    private void plFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plFieldActionPerformed

    private void dtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dtFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        VitalSigns vs = new VitalSigns(
                Double.parseDouble(tempField.getText()),
                Double.parseDouble(bpField.getText()),
                Integer.parseInt(plField.getText()),
                dtField.getText()
        );
        vitals.addNewVital(vs);
        JOptionPane.showMessageDialog(this, "New Vital Saved.");
        tempField.setText("");
        bpField.setText("");
        plField.setText("");
        dtField.setText("");
        
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bpField;
    private javax.swing.JLabel bpLabel;
    private javax.swing.JTextField dtField;
    private javax.swing.JLabel dtLabel;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JTextField plField;
    private javax.swing.JLabel plLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField tempField;
    private javax.swing.JLabel tempLabel;
    // End of variables declaration//GEN-END:variables
}
