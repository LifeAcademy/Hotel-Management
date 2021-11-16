
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
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class LoginPage extends javax.swing.JFrame {
   
    Connection con;
    Statement stmt;
    private String[] args;
    public LoginPage() throws SQLException {
    	getContentPane().setBackground(new Color(0, 128, 128));
        con=JDBCConnection.getConnection();
        stmt=con.createStatement();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("icon64.png"));
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN PAGE");

        jLabel1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jLabel1.setText("UserName");

        jLabel2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jLabel2.setText("Password");

        jTextField1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));

        jPasswordField1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));

        jButton2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new Font("Arial Black", Font.BOLD, 20));
        jLabel4.setText("LOGIN PAGE");
        
        label = new JLabel("");
        label.setIcon(new ImageIcon("F:\\java projects\\HotalProject\\IMAGE\\icons8-user-100.png"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(label, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel1)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addGroup(layout.createSequentialGroup()
        									.addGap(56)
        									.addComponent(jButton2)
        									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        									.addComponent(jButton3))
        								.addGroup(layout.createSequentialGroup()
        									.addGap(86)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        										.addComponent(jPasswordField1, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))))
        						.addComponent(jLabel2)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(289)
        					.addComponent(jLabel4)))
        			.addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(57)
        			.addComponent(jLabel4)
        			.addGap(57)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(50)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(55)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2)
        				.addComponent(jButton3))
        			.addGap(71))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(129)
        			.addComponent(label, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(143, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("");
        jPasswordField1.setText("");
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String luser=jTextField1.getText();
            String lpass=jPasswordField1.getText();
            int i=0;
            ResultSet rs=stmt.executeQuery("Select * from userlogin");
            while(rs.next()){
                if(luser.equals(rs.getString("Users"))&&(lpass.equals(rs.getString("Password")))){
                    i=1;
                    GeneralManager.main(args);
                }
            }
            if(i==0){
            JOptionPane.showMessageDialog(rootPane, "No Such UserName or Password Found", "User Not Found", JOptionPane.ERROR_MESSAGE);
            }
          
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane, ex, null, JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new LoginPage().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private JLabel label;
   


}
