package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//LookAndFeel - mundando a aparencia
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	        	//fluxo de saída é usado para exibir mensagens de erro ou outras informações que devem vir 
	            System.err.println(ex);
	        } catch (InstantiationException ex) {
	        	 System.err.println(ex);;
	        } catch (IllegalAccessException ex) {
	        	 System.err.println(ex);;
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        	 System.err.println(ex);;
	        }
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
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
	public Tela() {
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

		textField = new JTextField();
		textField.setBounds(108, 112, 205, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){

				JOptionPane.showMessageDialog(null,"Nome: "+textField.getText());

			}
		});
		btnMostrar.setBounds(163, 153, 107, 23);
		frame.getContentPane().add(btnMostrar);

		JLabel lblNome = new JLabel("NOME");
		lblNome.setBounds(108, 84, 46, 14);
		frame.getContentPane().add(lblNome);
	}
}
