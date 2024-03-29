package test.GUI.UserLoginCase;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIRegister extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(extensions.view.GuiUtils.FAST_LOOK_AND_FEEL);
					GUI frame = new GUI();
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
	public GUIRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		lblUsername.setBounds(65, 48, 62, 27);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("΢���ź�", Font.PLAIN, 12));
		lblPassword.setBounds(65, 85, 62, 27);
		contentPane.add(lblPassword);
		
		username = new JTextField();
		username.setBounds(161, 51, 153, 21);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(161, 88, 153, 21);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton login = new JButton("Register");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		login.setBounds(106, 135, 93, 23);
		contentPane.add(login);
		
		JButton clear = new JButton("Cancel");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI main = new GUI();
				((JFrame) contentPane.getTopLevelAncestor()).dispose();
				main.setVisible(true);
			}
		});
		clear.setBounds(258, 135, 93, 23);
		contentPane.add(clear);
		
		init();
	}
	
	public void init() {
		// set GUI in the center of the screen
		extensions.view.GuiUtils.setFrameCenter(this);
		
		// set GUI icon
		extensions.view.GuiUtils.setFrameImage(this, "source\\1.jpg");
		
		// set title
		this.setTitle("Register");
		
		// set not resizable
		this.setResizable(false);
	}
}
