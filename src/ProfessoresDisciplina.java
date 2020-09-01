import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;

public class ProfessoresDisciplina extends JFrame {

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
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfessoresDisciplina frame = new ProfessoresDisciplina();
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
	public ProfessoresDisciplina() {
		
		setBounds(100, 100, 792, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastramentoProfessor = new JLabel("Mostrar Professor");
		lblCadastramentoProfessor.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblCadastramentoProfessor.setBounds(244, 25, 262, 33);
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
		lblEndereo.setBounds(26, 186, 69, 14);
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
		textField_2.setBounds(107, 183, 272, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(150, 144, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(389, 183, 60, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(18, 228, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(107, 228, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(199, 228, 37, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNmero.setBounds(389, 169, 46, 14);
		contentPane.add(lblNmero);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBairro.setBounds(18, 214, 46, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCidade.setBounds(107, 214, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUf.setBounds(200, 214, 46, 14);
		contentPane.add(lblUf);
		
		JLabel lblTelefoneFixo = new JLabel("Telefone Fixo:");
		lblTelefoneFixo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefoneFixo.setBounds(279, 93, 99, 17);
		contentPane.add(lblTelefoneFixo);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCelular.setBounds(279, 119, 46, 14);
		contentPane.add(lblCelular);
		
		textField_8 = new JTextField();
		textField_8.setBounds(386, 91, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(386, 116, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Direito");
		chckbxNewCheckBox.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox.setBounds(478, 112, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Inform\u00E1tica");
		chckbxNewCheckBox_1.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_1.setBounds(478, 138, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Matem\u00E1tica");
		chckbxNewCheckBox_2.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_2.setBounds(478, 164, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Medicina");
		chckbxNewCheckBox_3.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_3.setBounds(478, 190, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JLabel lblEspecialidade = new JLabel("Especialidade:");
		lblEspecialidade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEspecialidade.setBounds(478, 91, 86, 14);
		contentPane.add(lblEspecialidade);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Bacharel");
		chckbxNewCheckBox_4.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_4.setBounds(577, 112, 171, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Especialista Lato Sensu");
		chckbxNewCheckBox_5.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_5.setBounds(577, 138, 171, 23);
		contentPane.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Mestrado");
		chckbxNewCheckBox_6.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_6.setBounds(577, 164, 171, 23);
		contentPane.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Doutorado");
		chckbxNewCheckBox_7.setBackground(SystemColor.activeCaption);
		chckbxNewCheckBox_7.setBounds(577, 190, 171, 23);
		contentPane.add(chckbxNewCheckBox_7);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTtulo.setBounds(577, 91, 46, 14);
		contentPane.add(lblTtulo);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
			}
		});
		btnSair.setBounds(588, 417, 89, 23);
		contentPane.add(btnSair);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 272, 756, 7);
		contentPane.add(separator);
		
		JLabel label = new JLabel("C\u00F3digo da Disciplina:");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(26, 345, 129, 17);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Nome da Disciplina:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(26, 384, 124, 17);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Carga Hor\u00E1ria:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(26, 426, 99, 14);
		contentPane.add(label_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(160, 343, 63, 17);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(160, 381, 63, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(160, 424, 63, 17);
		contentPane.add(textField_12);
		
		JLabel label_3 = new JLabel("Aulas Semanais:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(346, 345, 115, 17);
		contentPane.add(label_3);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setBackground(SystemColor.activeCaption);
		radioButton.setBounds(299, 364, 109, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setBackground(SystemColor.activeCaption);
		radioButton_1.setBounds(299, 391, 109, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setBackground(SystemColor.activeCaption);
		radioButton_2.setBounds(299, 417, 109, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("4");
		radioButton_3.setBackground(SystemColor.activeCaption);
		radioButton_3.setBounds(410, 364, 109, 23);
		contentPane.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("5");
		radioButton_4.setBackground(SystemColor.activeCaption);
		radioButton_4.setBounds(410, 392, 109, 23);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("6");
		radioButton_5.setBackground(SystemColor.activeCaption);
		radioButton_5.setBounds(410, 417, 109, 23);
		contentPane.add(radioButton_5);
		
		JLabel label_4 = new JLabel("Mostrar Disciplina");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 27));
		label_4.setBounds(238, 291, 250, 43);
		contentPane.add(label_4);
	}
}
