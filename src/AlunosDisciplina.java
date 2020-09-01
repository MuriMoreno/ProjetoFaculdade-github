import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;

public class AlunosDisciplina extends JFrame {

	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtCodCurso;
	private JTextField txtNomeCurso;
	private JTextField txtNP1;
	private JTextField txtNP2;
	private JTextField txtFaltas;
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
					AlunosDisciplina frame = new AlunosDisciplina();
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
	public AlunosDisciplina() {
		
		setBounds(100, 100, 794, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastramentoAluno = new JLabel("Mostrar Aluno");
		lblCadastramentoAluno.setBounds(263, 23, 224, 33);
		lblCadastramentoAluno.setFont(new Font("Tahoma", Font.BOLD, 27));
		contentPane.add(lblCadastramentoAluno);
		
		JLabel lblNewLabel = new JLabel("Matr\u00EDcula:");
		lblNewLabel.setBounds(25, 63, 73, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(25, 91, 59, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Nascimento:");
		lblNewLabel_2.setBounds(25, 116, 132, 15);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_2);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(180, 61, 103, 17);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(180, 89, 103, 17);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtData = new JTextField();
		txtData.setBounds(180, 116, 103, 17);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("C\u00F3digo do Curso:");
		lblNewLabel_3.setBounds(322, 61, 101, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNomeDoCurso = new JLabel("Nome do Curso:");
		lblNomeDoCurso.setBounds(322, 86, 101, 14);
		lblNomeDoCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNomeDoCurso);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setBounds(449, 58, 86, 20);
		contentPane.add(txtCodCurso);
		txtCodCurso.setColumns(10);
		
		txtNomeCurso = new JTextField();
		txtNomeCurso.setBounds(449, 88, 86, 20);
		contentPane.add(txtNomeCurso);
		txtNomeCurso.setColumns(10);
		
		JList list = new JList();
		list.setBackground(SystemColor.activeCaption);
		list.setToolTipText("");
		list.setBounds(549, 56, 219, 176);
		list.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"1 - Administra\u00E7\u00E3o", "2 - Biomedicina", "3 - Ci\u00EAncias Bi\u00F3logicas", "4 - Ci\u00EAncias da Computa\u00E7\u00E3o", "5 - Direito", "6 - Educa\u00E7\u00E3o F\u00EDsica", "7 - Farmacologia", "8 - Rede de Computadores", "9 - Sistemas da Informa\u00E7\u00E3o"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		contentPane.add(list);
		
		JLabel lblNewLabel_4 = new JLabel("NOTAS");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(322, 118, 66, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("NP1:");
		lblNewLabel_5.setBounds(322, 143, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("NP2:");
		lblNewLabel_6.setBounds(322, 168, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		txtNP1 = new JTextField();
		txtNP1.setBounds(378, 143, 86, 20);
		contentPane.add(txtNP1);
		txtNP1.setColumns(10);
		
		txtNP2 = new JTextField();
		txtNP2.setBounds(378, 165, 86, 20);
		contentPane.add(txtNP2);
		txtNP2.setColumns(10);
		
		JLabel lblFaltas = new JLabel("Faltas:");
		lblFaltas.setBounds(322, 193, 46, 14);
		contentPane.add(lblFaltas);
		
		txtFaltas = new JTextField();
		txtFaltas.setBounds(378, 190, 86, 20);
		contentPane.add(txtFaltas);
		txtFaltas.setColumns(10);
		
		JButton btnMdia = new JButton("M\u00E9dia");
		btnMdia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double media = (Double.parseDouble(txtNP1.getText()) + Double.parseDouble(txtNP2.getText()))/2;
				
				
				JOptionPane.showMessageDialog(null, "MÉDIA: " + media);
			}
		});
		btnMdia.setBounds(378, 220, 89, 23);
		contentPane.add(btnMdia);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnSair.setBounds(613, 427, 89, 23);
		contentPane.add(btnSair);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 265, 758, 2);
		contentPane.add(separator);
		
		JLabel label = new JLabel("C\u00F3digo da Disciplina:");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(25, 355, 129, 17);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Nome da Disciplina:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(25, 394, 124, 17);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Carga Hor\u00E1ria:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(25, 436, 99, 14);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(159, 353, 63, 17);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(159, 391, 63, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(159, 434, 63, 17);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("Aulas Semanais:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(372, 353, 115, 17);
		contentPane.add(label_3);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setBackground(SystemColor.activeCaption);
		radioButton.setBounds(322, 374, 109, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setBackground(SystemColor.activeCaption);
		radioButton_1.setBounds(322, 401, 109, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setBackground(SystemColor.activeCaption);
		radioButton_2.setBounds(322, 427, 109, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("4");
		radioButton_3.setBackground(SystemColor.activeCaption);
		radioButton_3.setBounds(433, 374, 109, 23);
		contentPane.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("5");
		radioButton_4.setBackground(SystemColor.activeCaption);
		radioButton_4.setBounds(433, 400, 109, 23);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("6");
		radioButton_5.setBackground(SystemColor.activeCaption);
		radioButton_5.setBounds(433, 427, 109, 23);
		contentPane.add(radioButton_5);
		
		JLabel label_4 = new JLabel("Mostrar Disciplina");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 27));
		label_4.setBounds(248, 278, 250, 43);
		contentPane.add(label_4);
	}
}
