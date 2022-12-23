
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josep
 */
public class ACCOUNT extends javax.swing.JFrame {
    
    public ACCOUNT() {
        initComponents();
    }
    
    public ACCOUNT(String us){
         initComponents();
         user.setText(us);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        NULL1 = new javax.swing.JButton();
        current = new javax.swing.JButton();
        NULL = new javax.swing.JButton();
        Account_savings = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        SAVING1 = new javax.swing.JLabel();
        CURRENTS = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(9, 9, 9, 9, new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        NULL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smlbutton.jpg"))); // NOI18N
        jPanel3.add(NULL1);
        NULL1.setBounds(1330, 110, 160, 150);

        current.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smlbutton.jpg"))); // NOI18N
        current.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentActionPerformed(evt);
            }
        });
        jPanel3.add(current);
        current.setBounds(1330, 590, 160, 150);

        NULL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smlbutton.jpg"))); // NOI18N
        jPanel3.add(NULL);
        NULL.setBounds(1330, 270, 160, 150);

        Account_savings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smlbutton.jpg"))); // NOI18N
        Account_savings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Account_savingsActionPerformed(evt);
            }
        });
        jPanel3.add(Account_savings);
        Account_savings.setBounds(1330, 430, 160, 150);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smlbutton.jpg"))); // NOI18N
        jPanel3.add(jButton8);
        jButton8.setBounds(40, 430, 160, 150);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smlbutton.jpg"))); // NOI18N
        jPanel3.add(jButton9);
        jButton9.setBounds(40, 590, 160, 150);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smlbutton.jpg"))); // NOI18N
        jPanel3.add(jButton10);
        jButton10.setBounds(40, 110, 160, 150);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("-");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(1290, 610, 50, 100);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("-");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(190, 480, 43, 50);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("-");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(190, 640, 43, 50);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setText("-");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(190, 150, 50, 50);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("-");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(190, 310, 43, 50);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("-");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(1290, 160, 50, 50);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("-");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(1290, 450, 50, 100);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("-");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(1290, 310, 50, 50);

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        name.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        name.setForeground(new java.awt.Color(204, 255, 204));
        jPanel4.add(name);
        name.setBounds(300, 320, 360, 71);

        SAVING1.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        SAVING1.setForeground(new java.awt.Color(255, 255, 204));
        SAVING1.setText("SAVINGS A/C");
        jPanel4.add(SAVING1);
        SAVING1.setBounds(720, 440, 320, 71);

        CURRENTS.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        CURRENTS.setForeground(new java.awt.Color(255, 255, 204));
        CURRENTS.setText("CURRENT A/C");
        jPanel4.add(CURRENTS);
        CURRENTS.setBounds(710, 590, 320, 72);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("Select Account Type");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(400, 140, 310, 45);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pops.jpg"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(250, 20, 570, 140);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/glossy.png"))); // NOI18N
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 10, 1050, 710);

        user.setText("jLabel1");
        jPanel4.add(user);
        user.setBounds(940, 100, 34, 14);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(223, 31, 1070, 730);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/border.jpg"))); // NOI18N
        jPanel3.add(jLabel10);
        jLabel10.setBounds(1293, 11, 210, 770);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smlbutton.jpg"))); // NOI18N
        jPanel3.add(jButton7);
        jButton7.setBounds(40, 270, 160, 150);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/border.jpg"))); // NOI18N
        jPanel3.add(jLabel11);
        jLabel11.setBounds(9, 11, 220, 770);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/border.jpg"))); // NOI18N
        jPanel3.add(jLabel13);
        jLabel13.setBounds(220, 10, 1070, 70);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/border.jpg"))); // NOI18N
        jPanel3.add(jLabel12);
        jLabel12.setBounds(230, 730, 1070, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void Account_savingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Account_savingsActionPerformed
        Connection con=null;
        PreparedStatement mystmt=null;
        ResultSet rs=null;
        String u;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull", "root", "");
            mystmt = con.prepareStatement( "Select * from atmm where username=? and Account_type=?");
            mystmt.setString(1, user.getText());
            mystmt.setString(2, "savings");
            rs = mystmt.executeQuery();   
            String us=user.getText();
            if(rs.next()){         
                this.setVisible(false);
                new SERVICE(us).setVisible(true);
                dispose();
                
            } 
            else{
                JOptionPane.showMessageDialog(null,"Your specified  account is not a savings account");
            }
            
 
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }//GEN-LAST:event_Account_savingsActionPerformed

    private void currentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentActionPerformed
        Connection con=null;
        PreparedStatement mystmt=null;
        ResultSet rs=null;
        String u;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull", "root", "");
            mystmt = con.prepareStatement( "Select * from atmm where username=? and Account_type=?");
            mystmt.setString(1, user.getText());
            mystmt.setString(2, "current");
            String us=user.getText();
            rs = mystmt.executeQuery();
            if(rs.next()){
            
                this.setVisible(false);
                new SERVICE(us).setVisible(true);
            } 
            else{
                JOptionPane.showMessageDialog(null,"Your specified  account is not a current account");
            }
            
 
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
        
                                                   
    }//GEN-LAST:event_currentActionPerformed
        
            
        
   
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
            java.util.logging.Logger.getLogger(ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACCOUNT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Account_savings;
    private javax.swing.JLabel CURRENTS;
    private javax.swing.JButton NULL;
    private javax.swing.JButton NULL1;
    private javax.swing.JLabel SAVING1;
    private javax.swing.JButton current;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel name;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
