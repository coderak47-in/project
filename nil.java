import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.sql.*;
import java.util.zip.*;
import javax.swing.JPopupMenu;
public class nil extends JFrame// implements ActionListener
{
	JTextField name,pho,id,tot;

	JLabel lid,lname,lpho,ltot;
	int t=0,i=0,j=0;
	JOptionPane jp = new JOptionPane();
	public nil()
	{
		
		String ch[]={"Item id","Item Name","Cost","Tax","Count"};
		Object d[][]=new Object[50][6];//{{"muni","10"},{"brejesh","55"}};
		JTable jt=new JTable(d,ch);;
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(jt,v,h);

		
		try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection c = DriverManager.getConnection("jdbc:odbc:sysDSN","system","manager");
				Statement stm = c.createStatement();
				t=0;
				ResultSet rs = stm.executeQuery("select * from item where stock=0");
				while(rs.next())
				{	
					t=1;	
		
			   		j=0;
					d[i][j]=rs.getString("id");j++;
					d[i][j]=rs.getString("name");j++;
					d[i][j]=rs.getString("cost");j++;
					d[i][j]=rs.getString("tax");j++;
					d[i][j]=rs.getString("stock");i++;
				}
				if(t==0)
				{
					jp.showMessageDialog(this,"Sorry, No Such Record exisits","INFORMATION",jp.ERROR_MESSAGE);
					t=0;
				}
		        	c.close();
				stm.close();
		}
		catch(ClassNotFoundException cnf)
		{
			jp.showMessageDialog(this,cnf,"EXCEPTION",jp.ERROR_MESSAGE);
			System.out.println("Cnf Exception");
		}
		catch(SQLException sql)
		{
			jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);
		}
		//jsp.setBounds(10,150,200,400);
		add(jsp);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void n11()//public static void main(String arg[])
	{
		//nil u=new nil();
		this.setBounds(0,0,850,590);
		//u.show();
	}
	
}