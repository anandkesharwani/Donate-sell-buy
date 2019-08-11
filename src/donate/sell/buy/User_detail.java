
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
 class User_detail extends JFrame {

	private JPanel contentPane1;
	private JTable table1;

	public void completed() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_detail frame = new User_detail();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public User_detail() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(150, 100, 450, 300);
		contentPane1 = new JPanel();
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane1.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane1);
		String data[][]=null;
		String column[]=null;
		try{
			Connection con=DB22.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user_history",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
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
		
		table1 = new JTable(data,column);
		JScrollPane sp=new JScrollPane(table1);
		
		contentPane1.add(sp, BorderLayout.CENTER);
	}
        public static void main(String arg[])
        {
           User_detail n1=new User_detail();
           n1.completed();
        }

}
class DB22 {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/donate","root","");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
} 
