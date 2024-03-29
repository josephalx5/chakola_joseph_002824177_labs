/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.VitalSigns;
import model.VitalSignsHistory;

/**
 *
 * @author josephchakola
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private final VitalSignsHistory vt;
    public ViewJPanel(VitalSignsHistory vt) {
        initComponents();
        this.vt = vt;
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        vtTable = new javax.swing.JTable();
        vwBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        tempLabel = new javax.swing.JLabel();
        bpLabel = new javax.swing.JLabel();
        plLabel = new javax.swing.JLabel();
        dtLabel = new javax.swing.JLabel();
        tempField = new javax.swing.JTextField();
        bpField = new javax.swing.JTextField();
        plField = new javax.swing.JTextField();
        dtField = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(400, 300));

        mainLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("View Vital Signs");

        vtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Temperature", "Blood Pressure", "Pulse"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(vtTable);

        vwBtn.setText("View");
        vwBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vwBtnActionPerformed(evt);
            }
        });

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vwBtn)
                                .addGap(18, 18, 18)
                                .addComponent(delBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
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
                    .addComponent(dtField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(mainLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vwBtn)
                    .addComponent(delBtn))
                .addGap(35, 35, 35)
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
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vwBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vwBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = vtTable.getSelectedRow();
         if(selectedRow!=-1){
             VitalSigns vs = vt.getSpecificIndex(selectedRow);
             tempField.setText(Double.toString(vs.getTemperature()));
             plField.setText(Integer.toString(vs.getPulse()));
             bpField.setText(Double.toString(vs.getBloodPressure()));
             dtField.setText(vs.getDate());
             
         } else{
             JOptionPane.showMessageDialog(this, "Please select a column.");
         }

    }//GEN-LAST:event_vwBtnActionPerformed

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

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
         int selectedRow = vtTable.getSelectedRow();
         if(selectedRow!=-1){
             vt.removeVital(selectedRow);
             JOptionPane.showMessageDialog(this, "Row deleted successfuly.");
             populateTable();
         } else{
             JOptionPane.showMessageDialog(this, "Please select a column.");
         }
    }//GEN-LAST:event_delBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bpField;
    private javax.swing.JLabel bpLabel;
    private javax.swing.JButton delBtn;
    private javax.swing.JTextField dtField;
    private javax.swing.JLabel dtLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JTextField plField;
    private javax.swing.JLabel plLabel;
    private javax.swing.JTextField tempField;
    private javax.swing.JLabel tempLabel;
    private javax.swing.JTable vtTable;
    private javax.swing.JButton vwBtn;
    // End of variables declaration//GEN-END:variables

  private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) vtTable.getModel();
        model.setRowCount(0 );
        for(VitalSigns vs: vt.getVitalSignsList()){
            Object[] obj = new Object[4];
            obj[0]=vs.getDate();
            obj[1]=vs.getTemperature();
            obj[2]=vs.getBloodPressure();
            obj[3]=vs.getPulse();
            model.addRow(obj);
        }
        
    }
}