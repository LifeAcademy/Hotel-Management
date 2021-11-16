package main;

import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
public class HouseKeeping extends javax.swing.JFrame {

  
    Connection con;
    Statement stmt;
    PreparedStatement stat;
    public HouseKeeping() throws SQLException {
    	getContentPane().setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
    	getContentPane().setBackground(new Color(0, 128, 128));
        setIconImage(Toolkit.getDefaultToolkit().getImage("icon64.ico"));
        con=JDBCConnection.getConnection();
        stmt=con.createStatement();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        jTextField3.setText("1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HOUSE KEEPING");

        jButton1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jButton2.setText("Update Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jLabel1.setText("Floor No.");

        jLabel2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jLabel2.setText("Room No.");

        jLabel3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jLabel3.setText("Status");

        jLabel4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jLabel4.setText("Assigned To");

        jComboBox1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 

        jTextField2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jRadioButton3.setText("Cleaned");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jRadioButton4.setText("Not-Cleaned");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel5))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addGap(192)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1)
        						.addComponent(jLabel2)
        						.addComponent(jLabel3)
        						.addComponent(jLabel4))
        					.addGap(114)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jRadioButton4, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 104, Short.MAX_VALUE)
        						.addComponent(jTextField2, Alignment.TRAILING)
        						.addGroup(Alignment.TRAILING, layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(jTextField1)
        							.addComponent(jComboBox1, 0, 104, Short.MAX_VALUE)
        							.addComponent(jRadioButton3, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))))
        			.addGap(119))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(255, Short.MAX_VALUE)
        			.addComponent(jButton2)
        			.addGap(60)
        			.addComponent(jButton1)
        			.addGap(109))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel5)
        					.addGap(42))
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(jLabel1)))
        			.addGap(34)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jRadioButton3)
        						.addComponent(jLabel3)))
        				.addComponent(jLabel2))
        			.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
        			.addComponent(jRadioButton4)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel4)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(58)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2))
        			.addGap(62))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {

        String s=(String) jComboBox1.getSelectedItem();
        jTextField3.setText(s);
       
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        System.exit(0);
       
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        try{
        	stat=con.prepareStatement("UPDATE ROOMINFO SET FLOORNO=?,STATUS=?,ASSIGNEDTO=? WHERE ROOMNO=?");
            stat.setString(1,jTextField3.getText());
            stat.setString(2,jTextField4.getText());
            stat.setString(3,jTextField2.getText());
            stat.setString(4,jTextField1.getText());
            stat.executeUpdate();
        JOptionPane.showMessageDialog(rootPane, "Status Updated", null, JOptionPane.INFORMATION_MESSAGE);
        jTextField1.setText("");
        jTextField2.setText("");
        }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e, null,JOptionPane.ERROR_MESSAGE);
        }
     
    }

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        jTextField4.setText("Cleaned");
      
    }

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        jTextField4.setText("Not-Cleaned");
      
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
            java.util.logging.Logger.getLogger(HouseKeeping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HouseKeeping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HouseKeeping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HouseKeeping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new HouseKeeping().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(HouseKeeping.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
  
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    
}