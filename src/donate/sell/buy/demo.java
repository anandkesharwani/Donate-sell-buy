package donate.sell.buy;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
 class NewClass extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public void completed() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewClass frame = new NewClass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 	 
	public NewClass() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(150, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		String data[][]=null;
		String column[]=null;
		try{
			Connection con=DB2.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from member",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
			column=new String[cols];
			for(int i=1;i<=cols;i++){
				column[i-1]=rsmd.getColumnName(i);
			}
			
			rs.last();
			int rows=rs.getRow();
			rs.beforeFirst();

			data=new String[rows][cols];
			int count=0;
			while(rs.next()){
				for(int i=1;i<=cols;i++){
					data[count][i-1]=rs.getString(i);
				}
				count++;
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		table = new JTable(data,column);
		JScrollPane sp=new JScrollPane(table);
		
		contentPane.add(sp, BorderLayout.CENTER);
	}
        public static void main(String arg[])
        {
           NewClass n=new NewClass();
           n.completed();
        }

}
class DB2 {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/donate","root","54321");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
} 