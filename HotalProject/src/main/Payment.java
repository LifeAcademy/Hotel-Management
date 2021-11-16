
package main;

import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
public class Payment extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    PreparedStatement stat;
    public Payment() throws SQLException {
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
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PAYMENT PAGE");

        jLabel1.setFont(new Font("Arial Black", Font.ITALIC, 12));
        jLabel1.setText("Room No.");

        jLabel2.setFont(new Font("Arial Black", Font.ITALIC, 12));
        jLabel2.setText("Price");

        jLabel3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jLabel3.setText("Days of Stay");

        jButton1.setFont(new Font("Arial Black", Font.ITALIC, 12));
        jButton1.setText("Get Amount");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 

        jTextField2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 

        jTextField3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 

        jButton2.setFont(new Font("Arial Black", Font.ITALIC, 12)); 
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(46)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(15)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel3)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jLabel2)
        							.addComponent(jLabel1, Alignment.TRAILING)))
        					.addGap(95)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(jTextField3)
        						.addComponent(jTextField2, Alignment.LEADING)
        						.addComponent(jTextField1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton1)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jButton2)))
        			.addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(110)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(37)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addGap(31)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2))
        			.addGap(32))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        System.exit(0);
       
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        try{
        stat=con.prepareStatement("INSERT INTO TOTALPAYMENT VALUES(?,?,?)");
        stat.setString(1,jTextField1.getText());
        stat.setString(2, jTextField2.getText());
        stat.setString(3, jTextField3.getText());
        stat.executeUpdate();
        int tot=Integer.parseInt(jTextField2.getText())*Integer.parseInt(jTextField3.getText());
        JOptionPane.showMessageDialog(rootPane,"The Total Payment is "+tot,null,JOptionPane.PLAIN_MESSAGE);
        }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e, null, JOptionPane.ERROR_MESSAGE);
        }
      
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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new Payment().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
   
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
  
}
