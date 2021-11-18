import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.zip.*;
import javax.swing.JPopupMenu;
 class login extends JFrame implements ActionListener
{
	JTextField uname,id;
	JPasswordField pass;
	Container c;
	JButton enter,exit;
	JLabel luname,lpass,ltype,lid;
	JOptionPane jp = new JOptionPane();
	Choice ctype;
	String tu,p;
	static String pe="admin";
	 login()
	{
		super("Billing Project");
		c = getContentPane(); c.setBackground(new Color(255,179,179));
		c.setLayout(null); 
		setBounds(0,0,400,400);
		
		
		JLabel luname = new JLabel("User Name :"); 
		luname.setForeground(Color.black);
		luname.setBounds(80,150,220,20);
		c.add(luname);
		JLabel lpass = new JLabel("Password :"); 
		lpass.setForeground(Color.black);
		lpass.setBounds(80,200,220,20);
		c.add(lpass);
		ctype = new Choice();
		ctype.add("admin");
		
		ctype.setBounds(160,105,80,30);
		c.add(ctype);
		
		
		uname = new JTextField();
		uname.setForeground(Color.black); 
		uname.setBackground(Color.white);
		uname.setBounds(160,150,180,25);
		c.add(uname);
		pass = new JPasswordField();
		pass.setForeground(Color.black); 
		pass.setBackground(Color.white);
		pass.setBounds(160,200,180,25);
		c.add(pass);
		
		enter = new JButton("Enter"); 
		enter.setForeground(Color.white); 
		enter.setBackground(new Color(128,0,0));
		enter.setToolTipText("Login in to Project");
		enter.setBounds(130,300,100,30);
		enter.addActionListener(this);
		c.add(enter);

		exit = new JButton("Exit"); 
		exit.setForeground(Color.white);
		exit.setBackground(new Color(128,0,0));
		exit.setBounds(240,300,100,30);
		exit.addActionListener(this);
		c.add(exit);
				
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}

	public void actionPerformed(ActionEvent ae)
	{	
		String str1=(String)ae.getActionCommand();
		//Object source = ae.getSource();
		String tu=uname.getText();
			  String p=pass.getText();
		if(str1.equals("Enter"))
		{
			try
			{
			  
			
			if((tu.equals("aman"))&&(p.equals("1234")))
			{
				
				//this.dispose();
				new home();
				System.out.println("chal gayal guru");
				
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
                       

 		}
		if(str1.equals("Exit"))
		{
			System.exit(0);
		}
	}	
	public static void main(String arg[])
 	{
 		
		 login u=new login();
		//u.setResizable(false);
		u.setBounds(0,0,450,450);
		u.show();
	 }
}