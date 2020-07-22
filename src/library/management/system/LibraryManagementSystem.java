package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LibraryManagementSystem extends JFrame implements ActionListener{

        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;//auto generated default
	
		JLabel l1;
        JButton b1;
        
       
        
        public LibraryManagementSystem() {
		
        		setTitle("Library Management System");
                setSize(864, 486);
                setLayout(null);
                               

                l1 = new JLabel("");
                b1 = new JButton("Lets Get in ->");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/first.jpg"));
                Image i3 = i1.getImage().getScaledInstance(864, 486,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
               
                b1.setBounds(640,350,200,60);
		l1.setBounds(0, 0, 864, 486);
                
                l1.add(b1);
		add(l1);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ImageIcon iconLogoMain  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logoMain.png"));
        Image imageLogoMain = iconLogoMain.getImage().getScaledInstance(240, 240,Image.SCALE_DEFAULT);
        setIconImage(imageLogoMain);
                
                b1.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login_user().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                LibraryManagementSystem window = new LibraryManagementSystem();
                window.setVisible(true);			
	}
}
