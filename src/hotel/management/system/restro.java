/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author snehal
 */
public class restro extends JFrame{
    private  JButton btnNewButton;
    private JButton btnNewButton1;
    private JButton btnNewButton2;
    JLabel l1;
     private JButton btnNewButton4;
     private JPanel contentPane;
    public static void main(String[] args) {
       new restro().setVisible(true);
    }
    
    public restro() {
        super("HOTEL MANAGEMENT SYSTEM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 957, 630);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/resto.jpg"));
        Image i3 = i1.getImage().getScaledInstance(957, 630,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                l1.setBounds(0, 0, 957, 630);
                
		add(l1);
    }
}