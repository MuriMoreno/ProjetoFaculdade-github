import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManuProfessor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManuProfessor frame = new ManuProfessor();
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
	public ManuProfessor() {
		
		setBounds(100, 100, 700, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastramentoProfessor = new JLabel("Manuten\u00E7\u00E3o Professor");
		lblCadastramentoProfessor.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblCadastramentoProfessor.setBounds(187, 27, 391, 33);
		contentPane.add(lblCadastramentoProfessor);
		
		JLabel lblNewLabel = new JLabel("Identidade:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(26, 94, 78, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(26, 119, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEndereo.setBounds(26, 214, 69, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataDeNascimento.setBounds(26, 147, 116, 14);
		contentPane.add(lblDataDeNascimento);
		
		textField = new JTextField();
		textField.setBounds(150, 91, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(150, 116, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(86, 211, 272, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(150, 144, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(368, 211, 60, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(438, 211, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(534, 211, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(630, 211, 37, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNmero.setBounds(368, 195, 46, 14);
		contentPane.add(lblNmero);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBairro.setBounds(438, 195, 46, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCidade.setBounds(534, 195, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUf.setBounds(630, 195, 46, 14);
		contentPane.add(lblUf);
		
		JLabel lblTelefoneFixo = new JLabel("Telefone Fixo:");
		lblTelefoneFixo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefoneFixo.setBounds(356, 91, 99, 17);
		contentPane.add(lblTelefoneFixo);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCelular.setBounds(356, 119, 46, 14);
		contentPane.add(lblCelular);
		
		textField_8 = new JTextField();
		textField_8.setBounds(457, 91, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(457, 116, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Direito");
		chckbxNewCheckBox.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox.setBounds(26, 317, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Inform\u00E1tica");
		chckbxNewCheckBox_1.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_1.setBounds(26, 343, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Matem\u00E1tica");
		chckbxNewCheckBox_2.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_2.setBounds(26, 369, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Medicina");
		chckbxNewCheckBox_3.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_3.setBounds(26, 395, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JLabel lblEspecialidade = new JLabel("Especialidade:");
		lblEspecialidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEspecialidade.setBounds(26, 296, 86, 14);
		contentPane.add(lblEspecialidade);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Bacharel");
		chckbxNewCheckBox_4.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_4.setBounds(187, 317, 171, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Especialista Lato Sensu");
		chckbxNewCheckBox_5.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_5.setBounds(187, 343, 171, 23);
		contentPane.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Mestrado");
		chckbxNewCheckBox_6.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_6.setBounds(187, 369, 171, 23);
		contentPane.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Doutorado");
		chckbxNewCheckBox_7.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_7.setBounds(187, 395, 171, 23);
		contentPane.add(chckbxNewCheckBox_7);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTtulo.setBounds(187, 296, 46, 14);
		contentPane.add(lblTtulo);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
			}
		});
		btnSair.setBounds(587, 395, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(397, 317, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(397, 351, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(395, 385, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnConfirmarAlterar = new JButton("Confirmar");
		btnConfirmarAlterar.setEnabled(false);
		btnConfirmarAlterar.setBounds(397, 317, 89, 23);
		contentPane.add(btnConfirmarAlterar);
		
		JButton btnConfirmarExcluir = new JButton("Confirmar");
		btnConfirmarExcluir.setEnabled(false);
		btnConfirmarExcluir.setBounds(397, 351, 89, 23);
		contentPane.add(btnConfirmarExcluir);
	}
}
