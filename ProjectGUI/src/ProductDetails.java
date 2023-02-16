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
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ProductDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductDetails frame = new ProductDetails();
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
	public ProductDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ProductDetails");
		lblNewLabel.setBounds(170, 36, 114, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PID");
		lblNewLabel_1.setBounds(38, 102, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(108, 99, 176, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PNAME");
		lblNewLabel_2.setBounds(38, 166, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 163, 176, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("PPRICE");
		lblNewLabel_3.setBounds(38, 222, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 219, 176, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnNewButton = new JButton("AddProducts");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					String pname=textField_1.getText();
					int price=Integer.parseInt(textField_2.getText());
					
					String str1="insert into product1 values('"+pid+"','"+pname+"','"+price+"')";
					
					 Class.forName("com.mysql.cj.jdbc.Driver");
					    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack25","root","root");
					    Statement stmt=conn.createStatement();
					    stmt.executeUpdate(str1);
					    JOptionPane.showMessageDialog(btnNewButton,"AddProduct");
				}
				catch(Exception t)
				{
                      System.out.println(t);					
				}
			}
		});
		btnNewButton.setBounds(118, 281, 136, 23);
		contentPane.add(btnNewButton);
	}

}
