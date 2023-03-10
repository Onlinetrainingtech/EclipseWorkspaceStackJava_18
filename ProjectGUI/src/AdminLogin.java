import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AdminLogin");
		lblNewLabel.setBounds(182, 11, 101, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AdminId");
		lblNewLabel_1.setBounds(29, 70, 73, 19);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(137, 69, 146, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(35, 133, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 130, 146, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
				    String u1=textField.getText();	
				    String p1=textField_1.getText();
				    String str1="select * from adminlogin";
				    Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack25","root","root");
				    Statement stmt=conn.createStatement();
				    ResultSet rs=stmt.executeQuery(str1);
				    rs.next();
				    String adminid=rs.getString(1);
				    String adminpass=rs.getString(2);
				    if(u1.equals(adminid)&&p1.equals(adminpass))
				    {
				    	JOptionPane.showMessageDialog(btnNewButton,"LoginSucess!!");
				    	new AdminHomePage().setVisible(true);
				    	//System.out.println("LoginSucess..");
				    }
				    else
				    {
				    	JOptionPane.showMessageDialog(btnNewButton,"LoginFail!!!");
				    	//System.out.println("Login Fail!!");
				    }
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnNewButton.setBounds(49, 208, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(210, 208, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
