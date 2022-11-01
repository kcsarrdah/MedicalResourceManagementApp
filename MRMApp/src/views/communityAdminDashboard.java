/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.hospital;
import models.house;
import mrmapp.LoginPage;
import mrmapp.MRMApp;
import static mrmapp.MRMApp.cities;
import static mrmapp.MRMApp.hospitals;
import static mrmapp.MRMApp.houses;

/**
 *
 * @author kcsar
 */
public class communityAdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form communityAdminDashboard
     */
    public communityAdminDashboard() {
        initComponents();
         if(MRMApp.commName.length() > 0) {
            jLabel1.setText(MRMApp.commName);
         }

    }
    
    public void getComm(String communityName, String cityName){ 
        jLabel1.setText(communityName);
        MRMApp.commName = communityName;
        MRMApp.cityName = cityName;
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
        jButton1 = new javax.swing.JButton();
        btnHouse = new javax.swing.JButton();
        btnHospital = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Community");

        jButton1.setText("logOut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnHouse.setText("House");
        btnHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHouseActionPerformed(evt);
            }
        });

        btnHospital.setText("Hospitals");
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(btnHouse)
                .addGap(39, 39, 39)
                .addComponent(btnHospital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        LoginPage lp = new LoginPage();
        lp.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHouseActionPerformed
        // TODO add your handling code here:
        viewCommunityAdmin view = new viewCommunityAdmin();
        view.jLabel1.setText(btnHouse.getText());
        String[] columnNames = {"Houses", "Zip Code"};
        String[][] rows = new String[houses.size()][2];
        int i = 0;
        for (HashMap.Entry<String, house> set : houses.entrySet()) {
            if(set.getValue().getName().equals(jLabel1.getText())) {
                rows[i][0] = set.getValue().getHouseName();
                int a = set.getValue().getZip();
                rows[i][1] = Integer.toString(a);
                i++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        view.jTable1.setModel(model);
        view.show();
    }//GEN-LAST:event_btnHouseActionPerformed

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        // TODO add your handling code here:
        viewCommunityAdmin view = new viewCommunityAdmin();
        view.jLabel1.setText(btnHospital.getText());
        String[] columnNames = {"Hospital ID", "HospitalName", "City", "Community Name"};
        String[][] rows = new String[hospitals.size()][4];
        int i = 0;
        for(HashMap.Entry<Integer, hospital>set:hospitals.entrySet()){
            System.out.println(jLabel1.getText());
            if(set.getValue().getName().equals(jLabel1.getText())){
            System.out.println("here now");
            rows[i][0] = Integer.toString(set.getValue().getHospitalID());
            rows[i][1] = set.getValue().getHospitalName();
            rows[i][2] = set.getValue().getCityName();
            rows[i][3] = set.getValue().getName();
            i++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        view.jTable1.setModel(model);
        view.show();
    }//GEN-LAST:event_btnHospitalActionPerformed

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
            java.util.logging.Logger.getLogger(communityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(communityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(communityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(communityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new communityAdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnHouse;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
