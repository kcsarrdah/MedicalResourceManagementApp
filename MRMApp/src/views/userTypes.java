/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import models.communityAdmin;
import models.doctor;
import models.patient;
import static mrmapp.MRMApp.communityAdmins;
import static mrmapp.MRMApp.doctors;
import static mrmapp.MRMApp.hospitals;
import static mrmapp.MRMApp.patients;

/**
 *
 * @author kcsar
 */
public class userTypes extends javax.swing.JFrame {

    /**
     * Creates new form userTypes
     */
    public userTypes() {
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

        btnPatient = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnCommAdmin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPatient.setText("Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        btnCommAdmin.setText("Community Admin");
        btnCommAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommAdminActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCommAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(btnPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnCommAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnPatient)
                .addGap(18, 18, 18)
                .addComponent(btnDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        viewItemsPage view = new viewItemsPage();
        view.jlHeader.setText("Patients");
        String[] columnNames = {"Patient ID", "Patient Name", "Community", "City"};
        String[][] rows = new String[patients.size()][4];
        int i = 0;
        for (HashMap.Entry<String, patient> set : patients.entrySet()) {
            rows[i][0] = Integer.toString(set.getValue().getPatientId());
            rows[i][1] = set.getValue().getFirstName();
            rows[i][2] = set.getValue().getName();
            rows[i][3] = set.getValue().getCityName();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        view.jTable2.setModel(model);
        view.btnCreate.setVisible(false);
        view.show();
    }//GEN-LAST:event_btnPatientActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        systemAdminDashboard sd = new systemAdminDashboard();
        sd.show();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
        viewItemsPage view = new viewItemsPage();
        view.jlHeader.setText("Doctors");
        String[] columnNames = {"Doctor ID", "Name", "Hospital Name", "Community", "City"};
        String[][] rows = new String[doctors.size()][5];

        int i = 0;
        for (HashMap.Entry<String, doctor> set : doctors.entrySet()) {
            rows[i][0] = Integer.toString(set.getValue().getDoctorID());
            rows[i][1] = set.getValue().getFirstName();
            rows[i][2] = set.getValue().getHospitalName();
            System.out.println(set.getValue().getHospitalName());
            rows[i][3] = set.getValue().getCityName();
            rows[i][4] = set.getValue().getName();
            
            i++;
        }

        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        view.jTable2.setModel(model);
        view.show();
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnCommAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommAdminActionPerformed
        // TODO add your handling code here:
        viewItemsPage view = new viewItemsPage();
        view.jlHeader.setText("Community Admin");
        String[] columnNames = {"Name", "Community", "City"};
        String[][] rows = new String[doctors.size()][3];

        int i = 0;
        for (HashMap.Entry<String, communityAdmin> set : communityAdmins.entrySet()) {
            rows[i][0] = set.getValue().getAdminName();
            rows[i][1] = set.getValue().getName();
            rows[i][2] = set.getValue().getCityName();            
            i++;
        }

        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        view.jTable2.setModel(model);
        view.btnDelete.setVisible(false);
        view.show();
    }//GEN-LAST:event_btnCommAdminActionPerformed

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
            java.util.logging.Logger.getLogger(userTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userTypes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommAdmin;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
