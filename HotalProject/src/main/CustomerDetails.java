package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDetails extends javax.swing.JFrame {

	private JFrame frame;
	private JTextField txt_cudid;
	private JTextField txt_name;
	private JTextField txt_address;
	private JTextField txt_phoneno;
	private JTextField txt_proof;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerDetails window = new CustomerDetails();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CustomerDetails() throws SQLException {
		initialize();
	}


	private void initialize() throws SQLException {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBounds(100, 100, 678, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
        
		
		
		
		JLabel lblNewLabel = new JLabel("CUSID");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setBounds(109, 50, 69, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBounds(109, 93, 69, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ADDRESS");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(109, 142, 91, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PHONENO");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setBounds(109, 189, 86, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ID PROOF NO");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_4.setBounds(109, 214, 105, 62);
		frame.getContentPane().add(lblNewLabel_4);
		
		txt_cudid = new JTextField();
		txt_cudid.setBounds(280, 47, 140, 20);
		frame.getContentPane().add(txt_cudid);
		txt_cudid.setColumns(10);
		
		txt_name = new JTextField();
		txt_name.setBounds(280, 90, 140, 20);
		frame.getContentPane().add(txt_name);
		txt_name.setColumns(10);
		
		txt_address = new JTextField();
		txt_address.setBounds(280, 136, 140, 20);
		frame.getContentPane().add(txt_address);
		txt_address.setColumns(10);
		
		txt_phoneno = new JTextField();
		txt_phoneno.setBounds(280, 183, 140, 20);
		frame.getContentPane().add(txt_phoneno);
		txt_phoneno.setColumns(10);
		
		txt_proof = new JTextField();
		txt_proof.setBounds(280, 235, 140, 20);
		frame.getContentPane().add(txt_proof);
		txt_proof.setColumns(10);
		
		JButton btnadd = new JButton("ADD");
		btnadd.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
		btnadd.setBounds(195, 297, 89, 23);
		frame.getContentPane().add(btnadd);
		
		JButton btndelete = new JButton("DELETE");
		btndelete.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
		btndelete.setBounds(324, 297, 89, 23);
		frame.getContentPane().add(btndelete);
		
		JButton btnearchcud = new JButton("SEARCH CUS");
		btnearchcud.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
		btnearchcud.setBounds(437, 298, 140, 23);
		frame.getContentPane().add(btnearchcud);
		
		
		btnadd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Connection con;
		        Statement stmt;
		        PreparedStatement stat;
		        con=JDBCConnection.getConnection();
		        try {
					stmt=con.createStatement();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
				
				stat=con.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?,?,?,?)");
				stat.setString(1,txt_cudid.getText());
		        stat.setString(2,txt_name.getText());
		        stat.setString(3,txt_address.getText());
		        stat.setString(4,txt_phoneno.getText());
		        stat.setString(5,txt_proof.getText());
		        
		        stat.executeUpdate();
		        
		        JOptionPane.showMessageDialog(rootPane, "User Added Sucessfully");
		        
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(rootPane, ex, null, JOptionPane.ERROR_MESSAGE);
				}
		        
				
				
				
			}
		});
		
		btndelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Connection con;
		        Statement stmt;
		        PreparedStatement stat;
		        con=JDBCConnection.getConnection();
				
				try {
					
					    stat=con.prepareStatement("DELETE FROM CUSTOMER WHERE CUSID=?");
				        stat.setString(1,txt_cudid.getText());
				        stat.executeUpdate();
				        
				        
				        JOptionPane.showMessageDialog(rootPane, "User Deleted Sucessfully", null,JOptionPane.WARNING_MESSAGE);
					
					
					
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(rootPane, ex, null, JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		
		
		btnearchcud.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Connection con;
		        Statement stmt;
		        PreparedStatement stat;
		        con=JDBCConnection.getConnection();
				
				try {
					
					stat=con.prepareStatement("SELECT * FROM CUSTOMER WHERE CUSID=?");
					stat.setString(1,txt_cudid.getText());
				    ResultSet rs=stat.executeQuery();
				    int a=0;
				    while(rs.next()){
				        a=1;
				    txt_cudid.setText(rs.getString("CUSID"));
				    txt_name.setText(rs.getString("NAME"));
				    txt_address.setText(rs.getString("ADDRESS"));
				    txt_phoneno.setText(rs.getString("PHONENO"));
				    txt_proof.setText(rs.getString("PROOF"));
				    
				    }
				    if(a==0){
				        JOptionPane.showMessageDialog(rootPane, "No Record Found","Find",JOptionPane.INFORMATION_MESSAGE);
				    }
					
					
					
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(rootPane, ex, null, JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
	
		
		
		
	}
}
