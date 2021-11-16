package main;

import java.awt.Toolkit;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class EmployeeUpdate extends javax.swing.JFrame {

   
        Connection con;
        Statement stmt;
        PreparedStatement stat;
        public EmployeeUpdate() throws SQLException {
    	getContentPane().setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
    	getContentPane().setBackground(new Color(0, 128, 128));
        con=JDBCConnection.getConnection();
        stmt=con.createStatement();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton3.setIcon(new ImageIcon("F:\\java projects\\HotalProject\\IMAGE\\icons8-close-window-42.png"));
        jButton2 = new javax.swing.JButton();
        jButton2.setIcon(new ImageIcon("F:\\java projects\\HotalProject\\IMAGE\\icons8-reset-42.png"));
        jButton4 = new javax.swing.JButton();
        jButton4.setIcon(new ImageIcon("F:\\java projects\\HotalProject\\IMAGE\\icons8-upload-42.png"));
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton6.setIcon(new ImageIcon("F:\\java projects\\HotalProject\\IMAGE\\icons8-search-client-42.png"));
        jComboBox1 = new javax.swing.JComboBox();
        
        
        
        

        jTextField7.setText("Assistant");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMPLOYEE PAGE|");

        jLabel1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jLabel1.setText("Employee ID");

        jLabel2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jLabel2.setText("Name");

        jLabel3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jLabel3.setText("Designation");

        jLabel4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jLabel4.setText("Address");

        jLabel5.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jLabel5.setText("Telephone");

        jLabel6.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jLabel6.setText("E-Mail");

        jTextField1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 
        jTextField2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 

        jTextField3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jButton1.setText(" Add User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12)); 
        jButton5.setText("Delete User");
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

        jComboBox1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); 
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Assistant", "Executive", "HouseKeeping", "Manager", "Vice-President" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        
        lblNewLabel = new JLabel("Close");
        lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        
        lblNewLabel_1 = new JLabel("Search Employee");
        lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        
        lblNewLabel_2 = new JLabel("Update Employee");
        lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
        
        lblNewLabel_3 = new JLabel("Reset");
        lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(661, Short.MAX_VALUE)
        			.addComponent(lblNewLabel_3)
        			.addGap(45))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(65)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2)
        						.addComponent(jLabel1)
        						.addComponent(jLabel4)
        						.addComponent(jLabel3)
        						.addComponent(jLabel5)
        						.addComponent(jLabel6))
        					.addGap(71))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton1)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jTextField4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        						.addComponent(jComboBox1, 0, 200, Short.MAX_VALUE)
        						.addComponent(jTextField5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jButton5)))
        					.addPreferredGap(ComponentPlacement.RELATED))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jTextField3, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED))
        				.addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        				.addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(179)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblNewLabel_2)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addGroup(layout.createSequentialGroup()
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        									.addComponent(jButton3)
        									.addComponent(jButton2)
        									.addComponent(jButton6))
        								.addGap(17))
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(lblNewLabel_1)
        								.addPreferredGap(ComponentPlacement.RELATED))))
        					.addGap(10))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jButton4)
        					.addGap(27))))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(666, Short.MAX_VALUE)
        			.addComponent(lblNewLabel)
        			.addGap(41))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(74, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1)
        						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
        				.addComponent(jButton3))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(lblNewLabel)
        			.addGap(16)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(22)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel4))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(jButton6)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(lblNewLabel_1)))
        			.addGap(45)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel5)
        						.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel6)
        						.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addComponent(jButton4))
        			.addGap(18)
        			.addComponent(lblNewLabel_2)
        			.addGap(31)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(jButton1)
        					.addComponent(jButton5))
        				.addComponent(jButton2))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(lblNewLabel_3)
        			.addGap(94))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
        stat=con.prepareStatement("INSERT INTO EMPLOYEES VALUES(?,?,?,?,?,?)");
        stat.setString(1,jTextField1.getText());
        stat.setString(2,jTextField2.getText());
        stat.setString(3,jTextField7.getText());
        stat.setString(4,jTextField3.getText());
        stat.setString(5,jTextField4.getText());
        stat.setString(6,jTextField5.getText());
   
        stat.executeUpdate();
        
        JOptionPane.showMessageDialog(rootPane, "User Added Sucessfully");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
      
        }catch(Exception ex){
        JOptionPane.showMessageDialog(rootPane, ex, null, JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
try{
        stat=con.prepareStatement("DELETE FROM EMPLOYEES WHERE ID=?");
        stat.setString(1,jTextField1.getText());
        stat.executeUpdate();
        
        JOptionPane.showMessageDialog(rootPane, "User Deleted Sucessfully", null,JOptionPane.WARNING_MESSAGE);
        jTextField1.setText("");
        }catch(Exception ex){
        JOptionPane.showMessageDialog(rootPane, ex, null, JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
try{
        stat=con.prepareStatement("UPDATE EMPLOYEES SET NAME=?,DESIGNATION=?,ADDRESS=?,TELEPHONE=?,EMAIL=? WHERE ID=?");
        stat.setString(6,jTextField1.getText());
        stat.setString(1,jTextField2.getText());
        stat.setString(2,jTextField7.getText());
        stat.setString(3,jTextField3.getText());
        stat.setString(4,jTextField4.getText());
        stat.setString(5,jTextField5.getText());
      
        stat.executeUpdate();
        
        JOptionPane.showMessageDialog(rootPane, "User Updated Sucessfully");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
      
        }catch(Exception ex){
        JOptionPane.showMessageDialog(rootPane, ex, null, JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
System.exit(0);        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("");

    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
   String s=(String)jComboBox1.getSelectedItem();
           jTextField7.setText(s);
        
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
    String search=JOptionPane.showInputDialog(rootPane, "Enter Employee ID");
    String exp="Exception";
    int a=0;
    try{
    stat=con.prepareStatement("SELECT * FROM EMPLOYEES WHERE ID=?");
    stat.setString(1,search);
    ResultSet rs=stat.executeQuery();
    while(rs.next()){
        a=1;
    jTextField1.setText(rs.getString("ID"));
    jTextField2.setText(rs.getString("NAME"));
    jTextField3.setText(rs.getString("ADDRESS"));
    jTextField4.setText(rs.getString("TELEPHONE"));
    jTextField5.setText(rs.getString("EMAIL"));

    
    
    
    }
    if(a==0){
    JOptionPane.showMessageDialog(rootPane, "No Record Found","Find",JOptionPane.INFORMATION_MESSAGE);
    }
    }catch(Exception e){
    JOptionPane.showMessageDialog(rootPane, e,exp ,JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(EmployeeUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new EmployeeUpdate().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EmployeeUpdate.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    
}
