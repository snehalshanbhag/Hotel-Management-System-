/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
public class roominfo extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblAvailability;
	private JLabel lblCleanStatus;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblRoomNumber;
	private JLabel lblId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					roominfo frame = new roominfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

        
	public roominfo() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/eight.jpg"));
                Image i3 = i1.getImage().getScaledInstance(600, 600,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(500,0,600,600);
                add(l1);
                
		
		table = new JTable();
		table.setBounds(0, 40, 500, 400);
		contentPane.add(table);
		
		JButton btnLoadData = new JButton("Load Data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
                                    conn c = new conn();
					String displayCustomersql = "select price , bed_type  from room order by bed_type ASC";
					//PreparedStatement pst = conn.prepareStatement(displayCustomersql);
					ResultSet rs = c.s.executeQuery(displayCustomersql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
                                        
					
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
                        
		});
		btnLoadData.setBounds(50, 470, 120, 30);
                btnLoadData.setBackground(Color.BLACK);
                btnLoadData.setForeground(Color.WHITE);
		contentPane.add(btnLoadData);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new userdashboard().setVisible(true);
                                setVisible(false);
			}
		});
		btnNewButton.setBounds(190, 470, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
                JButton btnNextButton = new JButton("Book");
		btnNextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            JOptionPane.showMessageDialog(null,"FOR BOOKING PURPOSE CONTACT 1234567890 ");
                                setVisible(false);
			}
		});
		btnNextButton.setBounds(350, 470, 120, 30);
                btnNextButton.setBackground(Color.BLACK);
                btnNextButton.setForeground(Color.WHITE);
		contentPane.add(btnNextButton);
                
		/*lblAvailability = new JLabel("Availability");
		lblAvailability.setBounds(119, 15, 69, 14);
		contentPane.add(lblAvailability);
		
		/*lblCleanStatus = new JLabel("Clean Status");
		lblCleanStatus.setBounds(216, 15, 76, 14);
		contentPane.add(lblCleanStatus);
		*/
		lblNewLabel = new JLabel("Price");
		lblNewLabel.setBounds(100, 15, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Bed Type");
		lblNewLabel_1.setBounds(300, 15, 76, 14);
		contentPane.add(lblNewLabel_1);

		
		/*lblId = new JLabel("Room Number");
		lblId.setBounds(12, 15, 90, 14);
		contentPane.add(lblId);*/
                
                getContentPane().setBackground(Color.WHITE);
	}

}