package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblLging = new JLabel("Login");
		lblLging.setBounds(143, 66, 46, 14);
		frame.getContentPane().add(lblLging);

		textField = new JTextField();
		textField.setBounds(143, 148, 184, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(143, 123, 46, 14);
		frame.getContentPane().add(lblSenha);

		textField_1 = new JTextField();
		textField_1.setBounds(143, 92, 184, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (checkLogin(textField_1.getText(), new String(textField.getText()))) {
					JOptionPane.showMessageDialog(null,"Bem-vindo ao Sistema");
				}else{
						JOptionPane.showMessageDialog(null,"Autenticação Incorreta"); 
					}
				}
			});
		btnNewButton.setBounds(192, 196, 89, 23);
		frame.getContentPane().add(btnNewButton);

		}

		//solução, pois nao estamos usando banco de dados 
		public boolean checkLogin(String login, String senha) {

			return login.equals("usuario") && senha.equals("123");

		}

	}

