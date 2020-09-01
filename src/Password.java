import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Password extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Password frame = new Password();
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
	public Password() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 244, 94);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 14, 46, 14);
		contentPane.add(lblSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtSenha.getText().equals("projeto")) {
					
					JOptionPane.showMessageDialog(null, "Acesso Permitido");
					Menu frame = new Menu();
					frame.setVisible(true);
					dispose();
					
				} else {
					
					JOptionPane.showMessageDialog(null, "Acesso Negado");
					
				}
				
			}
		});
		btnEntrar.setBounds(136, 10, 89, 23);
		contentPane.add(btnEntrar);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(50, 11, 76, 22);
		contentPane.add(txtSenha);
	}
}
