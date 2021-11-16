
package main;

import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
public class GeneralManager extends javax.swing.JFrame {
	
	
	
	
    private String[] args;

    
    Connection con;
    Statement stmt;
    PreparedStatement stat;
    public GeneralManager() throws SQLException {
    	getContentPane().setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
    	getContentPane().setBackground(new Color(0, 128, 128));
    	getContentPane().setEnabled(false);
    con=JDBCConnection.getConnection();
    stmt=con.createStatement();
    initComponents();
    }

  
    @SuppressWarnings("unchecked")
    private void initComponents() {
    	
    	
    	ImageIcon water = new ImageIcon("");

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton1.setIcon(new ImageIcon("F:\\java projects\\HotalProject\\IMAGE\\icons8-add-user-male-42.png"));
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton2.setIcon(new ImageIcon("F:\\java projects\\HotalProject\\IMAGE\\icons8-delete-user-male-42.png"));
        jButton3 = new javax.swing.JButton();
        jButton3.setIcon(new ImageIcon("F:\\java projects\\HotalProject\\IMAGE\\icons8-reset-42.png"));
        jButton4 = new javax.swing.JButton();
        jButton4.setIcon(new ImageIcon("F:\\java projects\\HotalProject\\IMAGE\\icons8-close-window-42.png"));
        jButton5 = new javax.swing.JButton();
        jButton5.setIcon(new ImageIcon("F:\\java projects\\HotalProject\\IMAGE\\icons8-housekeeping-42.png"));
        jButton6 = new javax.swing.JButton();
        jButton6.setIcon(new ImageIcon("F:\\java projects\\HotalProject\\IMAGE\\icons8-employee-42.png"));
        jButton7 = new javax.swing.JButton();
        jButton7.setIcon(new ImageIcon("F:\\java projects\\HotalProject\\IMAGE\\icons8-hotel-bed-42.png"));
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin");

        jLabel1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jLabel1.setText("UserName");

        jLabel2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jLabel2.setText("Password");

        jLabel3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jLabel3.setText("Confirm Password");

        jButton1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 

        jButton2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        
        btnAddCustomer = new JButton("add customer");
        btnAddCustomer.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnAddCustomerActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 

        jPasswordField2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));
        
        JLabel lblNewLabel = new JLabel("House Keeping");
        lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        
        JLabel lblNewLabel_1 = new JLabel("Employee");
        lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        
        JLabel lblNewLabel_2 = new JLabel("Room Reservation");
        lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        
        JLabel lblNewLabel_3 = new JLabel("Add Employee");
        lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        
        JLabel lblNewLabel_4 = new JLabel("Delete Employee");
        lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        
        JLabel lblNewLabel_5 = new JLabel("Reset");
        lblNewLabel_5.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        
        JLabel lblNewLabel_6 = new JLabel("Cancle");
        lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(155)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel3)
        						.addComponent(jLabel2)
        						.addComponent(jLabel1))
        					.addGap(87)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jPasswordField2)
        						.addComponent(jPasswordField1)
        						.addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(20)
        							.addComponent(lblNewLabel))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(37)
        							.addComponent(jButton5)))
        					.addGap(60)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jButton6)
        						.addComponent(lblNewLabel_1))
        					.addGap(28)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButton7)
        							.addGap(60))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(lblNewLabel_2)
        							.addGap(38)))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblNewLabel_3)
        						.addComponent(jButton1))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(66)
        							.addComponent(jButton2))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(42)
        							.addComponent(lblNewLabel_4)))
        					.addGap(45)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButton3)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(10)
        							.addComponent(lblNewLabel_5)))
        					.addGap(51)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(10)
        							.addComponent(lblNewLabel_6))
        						.addComponent(jButton4)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(462)
        					.addComponent(btnAddCustomer)))
        			.addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jButton4)
        				.addComponent(jButton3)
        				.addComponent(jButton5)
        				.addComponent(jButton1)
        				.addComponent(jButton7)
        				.addComponent(jButton6)
        				.addComponent(jButton2))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_6)
        				.addComponent(lblNewLabel)
        				.addComponent(lblNewLabel_5)
        				.addComponent(lblNewLabel_3)
        				.addComponent(lblNewLabel_2)
        				.addComponent(lblNewLabel_1)
        				.addComponent(lblNewLabel_4))
        			.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(23)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel3)
        				.addComponent(jPasswordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(56)
        			.addComponent(btnAddCustomer)
        			.addGap(111))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        jTextField1.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        System.exit(0);
      
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

        HouseKeeping.main(args);
        
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

        EmployeeUpdate.main(args);
       
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {

        RoomReservation.main(args);
        
    }
    
    
    
    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {

    	CustomerDetails.main(args);
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        try{
            if(jPasswordField1.getText().equals(jPasswordField2.getText())){
        stat=con.prepareStatement("INSERT INTO USERLOGIN VALUES(?,?)");
        stat.setString(1,jTextField1.getText());
        stat.setString(2,jPasswordField1.getText());
        stat.executeUpdate();
        JOptionPane.showMessageDialog(rootPane, "User Added Successfully", null, JOptionPane.PLAIN_MESSAGE);
            }else{
            JOptionPane.showMessageDialog(rootPane,"Password Do Not Match", null,JOptionPane.INFORMATION_MESSAGE );
            }
        }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane,e, null,JOptionPane.ERROR_MESSAGE );
        }
       
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        try{
        stat=con.prepareStatement("DELETE FROM USERLOGIN WHERE USERS=?");
        stat.setString(1,jTextField1.getText());
        stat.executeUpdate();
        JOptionPane.showMessageDialog(rootPane,"User Deleted Successfully", null, JOptionPane.PLAIN_MESSAGE);
        }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane,e, null,JOptionPane.ERROR_MESSAGE );
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
            java.util.logging.Logger.getLogger(GeneralManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new GeneralManager().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(GeneralManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton btnAddCustomer;
}
