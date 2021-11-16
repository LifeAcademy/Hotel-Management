
package main;

import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Font;
import java.awt.Color;


public class RoomReservation extends javax.swing.JFrame {

 
    Connection con;
    Statement stmt;
    PreparedStatement stat;
    private String[] args;
    public RoomReservation() throws SQLException {
    	getContentPane().setBackground(new Color(0, 128, 128));
        con=JDBCConnection.getConnection();
        stmt=con.createStatement();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ROOM RESERVATION ");

        jLabel1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jLabel1.setText("Confirmation ID");

        jLabel2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jLabel2.setText("Room No.");

        jLabel3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jLabel3.setText("Check-In Date");

        jLabel4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jLabel4.setText("Check-Out Date");

        jButton1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));

        jTextField2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 

        jTextField3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 

        jTextField4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 

        jButton2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jButton2.setText("Cancel Registration");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jButton4.setText("Pay Amount");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(68)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton4)
        					.addGap(39)
        					.addComponent(jButton1)
        					.addGap(33)
        					.addComponent(jButton2))
        				.addComponent(jLabel4)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2)
        						.addComponent(jLabel1)
        						.addComponent(jLabel3))
        					.addGap(130)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextField4, 141, 141, 141)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(jTextField2)
        							.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jTextField3, 141, 141, 141))))
        			.addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(78)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(33)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addGap(32)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(36)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(43)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton4)
        				.addComponent(jButton1)
        				.addComponent(jButton2))
        			.addContainerGap(149, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        int i=0;
        try{
        stat=con.prepareStatement("INSERT INTO ROOMRESERVATION VALUES(?,?,?,?)");
        stat.setString(1, jTextField1.getText());
        stat.setString(2,jTextField2.getText());
        stat.setString(3,jTextField3.getText());
        stat.setString(4,jTextField4.getText());
        stat.executeUpdate();
        stat=con.prepareStatement("SELECT CONFNO FROM ROOMRESERVATION WHERE ROOMNOS=? AND CHECKINDATE=?");
        stat.setString(1,jTextField2.getText());
        stat.setString(2,jTextField3.getText());
        ResultSet rs=stat.executeQuery();
        while(rs.next()){
            i=1;
        JOptionPane.showMessageDialog(rootPane, "Booking Confirmed And the Confirmation ID is "+rs.getString("CONFNO"), null, JOptionPane.PLAIN_MESSAGE);
        }
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        if(i==0){
        JOptionPane.showMessageDialog(rootPane, "Booking Terminated", null, JOptionPane.INFORMATION_MESSAGE);
        }
        }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e, null, JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        try{
        stat=con.prepareStatement("DELETE FROM ROOMRESERVATION WHERE CONFNO=?");
        stat.setString(1,jTextField1.getText());
        stat.executeUpdate();
        JOptionPane.showMessageDialog(rootPane, "Booking Cancellation Done", null, JOptionPane.PLAIN_MESSAGE);
        }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e,null,JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        Payment.main(args);
        
    }

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new RoomReservation().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(RoomReservation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
   
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
   
}
