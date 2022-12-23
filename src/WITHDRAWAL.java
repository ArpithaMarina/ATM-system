/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import UI.Email;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author Marina
 */
public class WITHDRAWAL extends javax.swing.JFrame {

    /**
     * Creates new form WITHDRAWAL
     */
    public WITHDRAWAL() {
        initComponents();
    }
    public WITHDRAWAL(String us) {
        initComponents();
        user.setText(us);
    }
 public String sendMail(String Email,String Password,String ToEmail, String Subject,String Text){

	String Msg;
    
        final String username = Email;
        final String password = Password;

        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Email));//ur email
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(Email));//u will send to
            message.setSubject(Subject);
            message.setText(Text);
            Transport.send(message);
            Msg="true";
    	    return Msg;

        } catch (Exception e) {
            return e.toString();
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

        jPanel3 = new javax.swing.JPanel();
        NULL1 = new javax.swing.JButton();
        CANCEL = new javax.swing.JButton();
        serice = new javax.swing.JButton();
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
        SAVING = new javax.swing.JLabel();
        TX = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CURRENTS3 = new javax.swing.JLabel();
        CURRENTS2 = new javax.swing.JLabel();
        withdraw = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        acc = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        three = new javax.swing.JLabel();
        CONFIRM = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        NULL2 = new javax.swing.JButton();
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

        CANCEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smlbutton.jpg"))); // NOI18N
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });
        jPanel3.add(CANCEL);
        CANCEL.setBounds(40, 590, 160, 150);

        serice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smlbutton.jpg"))); // NOI18N
        serice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sericeActionPerformed(evt);
            }
        });
        jPanel3.add(serice);
        serice.setBounds(1330, 590, 160, 150);

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
        jLabel19.setBounds(190, 470, 43, 50);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("-");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(190, 630, 43, 50);

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

        SAVING.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        SAVING.setForeground(new java.awt.Color(204, 255, 204));
        SAVING.setText("Enter the Amount  to be Withdrawn");
        jPanel4.add(SAVING);
        SAVING.setBounds(160, 250, 830, 71);

        TX.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        TX.setForeground(new java.awt.Color(255, 255, 204));
        TX.setText("CANCEL");
        jPanel4.add(TX);
        TX.setBounds(40, 600, 250, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pops.jpg"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(250, 20, 570, 140);

        CURRENTS3.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        CURRENTS3.setForeground(new java.awt.Color(255, 255, 204));
        CURRENTS3.setText("<< SERIVICES");
        jPanel4.add(CURRENTS3);
        CURRENTS3.setBounds(750, 600, 290, 72);

        CURRENTS2.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        CURRENTS2.setForeground(new java.awt.Color(255, 255, 204));
        CURRENTS2.setText("CONFIRM");
        jPanel4.add(CURRENTS2);
        CURRENTS2.setBounds(840, 440, 200, 72);

        withdraw.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        withdraw.setForeground(new java.awt.Color(0, 102, 153));
        jPanel4.add(withdraw);
        withdraw.setBounds(460, 350, 210, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Rs.");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(380, 350, 90, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/glossy.png"))); // NOI18N
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 10, 1050, 710);

        user.setText("user");
        jPanel4.add(user);
        user.setBounds(860, 130, 110, 40);
        jPanel4.add(acc);
        acc.setBounds(930, 130, 0, 0);
        jPanel4.add(Email);
        Email.setBounds(120, 100, 0, 0);
        jPanel4.add(password);
        password.setBounds(50, 40, 0, 0);
        jPanel4.add(balance);
        balance.setBounds(560, 670, 0, 0);
        jPanel4.add(three);
        three.setBounds(890, 30, 0, 0);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(223, 31, 1070, 730);

        CONFIRM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smlbutton.jpg"))); // NOI18N
        CONFIRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONFIRMActionPerformed(evt);
            }
        });
        jPanel3.add(CONFIRM);
        CONFIRM.setBounds(1330, 430, 160, 150);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smlbutton.jpg"))); // NOI18N
        jPanel3.add(jButton9);
        jButton9.setBounds(40, 430, 160, 150);

        NULL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smlbutton.jpg"))); // NOI18N
        jPanel3.add(NULL2);
        NULL2.setBounds(1330, 270, 160, 150);

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
        jLabel13.setBounds(220, 10, 1090, 70);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed

        this.setVisible(false);
        new CANCEL().setVisible(true);
        dispose();
    }//GEN-LAST:event_CANCELActionPerformed

    private void sericeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sericeActionPerformed
        String us = user.getText();
        this.setVisible(false);
        new SERVICE(us).setVisible(true);
        dispose();
    }//GEN-LAST:event_sericeActionPerformed

    private void CONFIRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONFIRMActionPerformed
        Connection con=null;
        PreparedStatement mystmt=null;
        ResultSet rs=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull", "root", "");
            mystmt = con.prepareStatement( "Select * from atmm where username=?");
            mystmt.setString(1, user.getText());
            rs = mystmt.executeQuery();
            if(rs.next()){
                Email.setText(rs.getString("EmailID"));
                password.setText(rs.getString("EmailPassword"));
                acc.setText(rs.getString("Account_code"));
                balance.setText(rs.getString("Balance"));
                int ba=Integer.parseInt(balance.getText());
                int am=Integer.parseInt(withdraw.getText());
                int code=Integer.parseInt(acc.getText());;
                
                if(ba>am||ba==am){
                if(code<2&&am<50001&&am>499){
                    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                     Date date=new Date();  
                    String strDate=sdf.format(date);
                    SimpleDateFormat sd=new SimpleDateFormat("hh:mm:ss aa");
                    String strTime=sd.format(date);
                   
                
                      mystmt = con.prepareStatement( "insert into withdraww values(?,?,?,?)");
                    mystmt.setString(1, user.getText());
                    mystmt.setString(2, withdraw.getText());
                    mystmt.setString(3, strDate);
                    mystmt.setString(4, strTime);
                    mystmt.executeUpdate();
                    
                    int one=Integer.parseInt(balance.getText());
                    int two=Integer.parseInt(withdraw.getText());
                    String usu = String.valueOf(one-two);
                    three.setText(usu);
                    String thr=three.getText();
                    String fou=withdraw.getText();
                    String quer="UPDATE atmm SET Balance=? WHERE username=?";
                    mystmt= con.prepareStatement(quer);
                    mystmt.setString(1, three.getText());
                    mystmt.setString(2, user.getText());
                    mystmt.executeUpdate();
                   
                     
                    String EMAIL = Email.getText();
                    String PW=password.getText();
                    String To=Email.getText();
                    String SUBJECT="SWIZZ BANK ..WITHDRAWAL";
                    String MESGE="Dear Customer, Rs. "+withdraw.getText()+" has been debited from your A/c number xxxxxxxxx, your available balance is "+three.getText();

                    String DATA=new Email().sendMail(EMAIL, PW, To, SUBJECT, MESGE);
                    System.out.println(DATA);
                    if(DATA.equals("true")){
                        this.setVisible(false);
                        new CANCEL().setVisible(true);
                    }
                    else{
                      JOptionPane.showMessageDialog(this,"An Error Occured While Sending Email confirmation on your deposit ","Error",JOptionPane.ERROR_MESSAGE);
                      this.setVisible(false);
                      new CANCEL().setVisible(true);
                    }
                      }
                else{
                   JOptionPane.showMessageDialog(this,"Minimun withdrawal amount is Rs.500 and maximum withdrawal amount is 50000  ","Transaction failed!",JOptionPane.ERROR_MESSAGE);
                    withdraw.setText("");
                }       
                
                   
               
                if(code>1&&am<100001&&am>499){
                    
                       SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                     Date date=new Date();  
                    String strDate=sdf.format(date);
                    SimpleDateFormat sd=new SimpleDateFormat("hh:mm:ss aa");
                    String strTime=sd.format(date);
                    
                     
                    mystmt = con.prepareStatement( "insert into withdraww values(?,?,?,?)");
                    mystmt.setString(1, user.getText());
                    mystmt.setString(2, withdraw.getText());
                    mystmt.setString(3, strDate);
                    mystmt.setString(4, strTime);
                    mystmt.executeUpdate();
                   
                    int one=Integer.parseInt(balance.getText());
                    int two=Integer.parseInt(withdraw.getText());
                    String usu = String.valueOf(one+two);
                    three.setText(usu);
                    String thr=three.getText();
                    String fou=withdraw.getText();
                    String quer="UPDATE atmm SET Balance=? WHERE username=?";
                    mystmt= con.prepareStatement(quer);
                    mystmt.setString(1, three.getText());
                    mystmt.setString(2, user.getText());
                    mystmt.executeUpdate();
                    
                    
                    String EMAIL = Email.getText();
                    String PW=password.getText();
                    String To=Email.getText();
                    String SUBJECT="SWIZZ BANK .. WITHDRAWAL";
                    String MESGE="Dear Customer, Rs. "+withdraw.getText()+" has been debited from your A/c number xxxxxxxxx, your available balance is "+three.getText()+"\n\n\n THANK YOU \n\n REGARDS SWIZZ BANK";
                    String DATA=new Email().sendMail(EMAIL, PW, To, SUBJECT, MESGE);
                    System.out.println(DATA);
                      JOptionPane.showMessageDialog(this,"Transaction Complete");
                    if(DATA.equals("true")){
                        this.setVisible(false);
                        new CANCEL().setVisible(true);
                    }else{

                        JOptionPane.showMessageDialog(this,"An Error Occured While Sending Email confirmation on your deposit ","Error",JOptionPane.ERROR_MESSAGE);
                         this.setVisible(false);
                        new CANCEL().setVisible(true);
                        }
                }
                else{
                   JOptionPane.showMessageDialog(this,"Minimun withdrawal amount is Rs.500 and maximum withdrawal amount is 100000  ","Transaction failed!",JOptionPane.ERROR_MESSAGE);
                    withdraw.setText("");
                }       
                
              
                }
                else{
                    JOptionPane.showMessageDialog(this,"Insufficient Balance  ","Transaction failed!",JOptionPane.ERROR_MESSAGE);
                    this.setVisible(false);
                      new CANCEL().setVisible(true);
                }
            }

            else{
                JOptionPane.showMessageDialog(this,"Unable to withdraw cash at the movement, Please try again later","Transaction Failed ",JOptionPane.ERROR_MESSAGE);
                this.setVisible(false);
                new CANCEL().setVisible(true);
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_CONFIRMActionPerformed

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
            java.util.logging.Logger.getLogger(WITHDRAWAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WITHDRAWAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WITHDRAWAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WITHDRAWAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WITHDRAWAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANCEL;
    private javax.swing.JButton CONFIRM;
    private javax.swing.JLabel CURRENTS2;
    private javax.swing.JLabel CURRENTS3;
    private javax.swing.JLabel Email;
    private javax.swing.JButton NULL1;
    private javax.swing.JButton NULL2;
    private javax.swing.JLabel SAVING;
    private javax.swing.JLabel TX;
    private javax.swing.JLabel acc;
    private javax.swing.JLabel balance;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel password;
    private javax.swing.JButton serice;
    private javax.swing.JLabel three;
    public static javax.swing.JLabel user;
    private javax.swing.JTextField withdraw;
    // End of variables declaration//GEN-END:variables
}
