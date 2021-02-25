/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.EmptyBorder;


public class userdashboard extends JFrame{
    private  JButton btnNewButton;
    private JButton btnNewButton1;
    private JButton btnNewButton2;
  
     private JButton btnNewButton4;
     private JPanel contentPane;
    public static void main(String[] args) {
       new userdashboard().setVisible(true);
    }
    
    public userdashboard() {
        super("HOTEL MANAGEMENT SYSTEM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
       
	JLabel NewLabel = new JLabel();
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel AirlineManagementSystem = new JLabel("THE TAJ GROUP WELCOMES YOU");
	AirlineManagementSystem.setForeground(Color.WHITE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
	AirlineManagementSystem.setBounds(600, 60, 1000, 85);
	NewLabel.add(AirlineManagementSystem);
		
		
        
	btnNewButton1 = new JButton("Rooms");
        btnNewButton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae){
             try {
                 new roominfo().setVisible(true);
                 /*this.setVisible(false);*/
             } catch (SQLException ex) {
                 Logger.getLogger(userdashboard.class.getName()).log(Level.SEVERE, null, ex);
             }
                
        }
         });
        btnNewButton = new JButton("Restaurant");
        btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae){
             new restro().setVisible(true);
            /* this.setVisible(false);*/
                
        }
         });
       
        btnNewButton2 = new JButton("Pickup Service");
        btnNewButton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae){
             try {
                 new pickupuser().setVisible(true);
                 /*this.setVisible(false);*/
             } catch (SQLException ex) {
                 Logger.getLogger(userdashboard.class.getName()).log(Level.SEVERE, null, ex);
             }
                
        }
         });
         
         btnNewButton4 = new JButton("logout");
        btnNewButton4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae) {
				try {
                                    new Login().setVisible(true);
                                    setVisible(false);
                                    
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
         });
        btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton1.setBounds(400, 50, 200, 74);
        contentPane.add(btnNewButton1);
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(400, 150 , 200, 74);
        contentPane.add(btnNewButton);
        btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton2.setBounds(400, 250, 200, 74);
        contentPane.add(btnNewButton2);
        
        btnNewButton4.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton4.setBounds(400, 350, 200, 74);
        contentPane.add(btnNewButton4);
        
    }
}