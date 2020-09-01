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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;

public class CursoProfessores extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodCurso;
	private JTextField txtCargaHoraria;
	private JTextField txtCodInst;
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
					CursoProfessores frame = new CursoProfessores();
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
	public CursoProfessores() {
		
		setBounds(100, 100, 783, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastramentoDeCursos = new JLabel("Mostrar Cursos");
		lblCadastramentoDeCursos.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblCadastramentoDeCursos.setBounds(246, 11, 272, 36);
		contentPane.add(lblCadastramentoDeCursos);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo do Curso:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(20, 48, 96, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Carga Hor\u00E1ria:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 73, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setBounds(156, 46, 46, 17);
		contentPane.add(txtCodCurso);
		txtCodCurso.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo do Instituto:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(20, 98, 120, 14);
		contentPane.add(lblNewLabel_2);
		
		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(156, 72, 47, 16);
		contentPane.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);
		
		txtCodInst = new JTextField();
		txtCodInst.setBounds(156, 98, 46, 17);
		contentPane.add(txtCodInst);
		txtCodInst.setColumns(10);
		
		JList list = new JList();
		list.setForeground(Color.BLACK);
		list.setFont(new Font("Tahoma", Font.BOLD, 11));
		list.setBackground(SystemColor.activeCaption);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Administra\u00E7\u00E3o", "Bio Medicina", "Ci\u00EAncias Biol\u00F3gicas", "Ci\u00EAncias da Computa\u00E7\u00E3o", "Direito", "Educa\u00E7\u00E3o F\u00EDsica", "Farmacologia", "Rede de Computadores", "Sistemas de Informa\u00E7\u00F5es"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setToolTipText("");
		list.setBounds(246, 63, 191, 156);
		contentPane.add(list);
		
		JLabel lblCursos = new JLabel("CURSOS:");
		lblCursos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCursos.setBounds(246, 48, 62, 14);
		contentPane.add(lblCursos);
		
		JRadioButton rdBacharel = new JRadioButton("Bacharel");
		rdBacharel.setBackground(SystemColor.activeCaption);
		rdBacharel.setBounds(470, 69, 109, 23);
		contentPane.add(rdBacharel);
		
		JLabel lblTipoDeCurso = new JLabel("Tipo de Curso:");
		lblTipoDeCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoDeCurso.setBounds(470, 48, 88, 14);
		contentPane.add(lblTipoDeCurso);
		
		JRadioButton rdGestao = new JRadioButton("Gest\u00E3o");
		rdGestao.setBackground(SystemColor.activeCaption);
		rdGestao.setBounds(470, 94, 109, 23);
		contentPane.add(rdGestao);
		
		JRadioButton rdOutros = new JRadioButton("Outros");
		rdOutros.setBackground(SystemColor.activeCaption);
		rdOutros.setBounds(470, 120, 109, 23);
		contentPane.add(rdOutros);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
			}
		});
		btnSair.setBounds(318, 435, 89, 23);
		contentPane.add(btnSair);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 230, 731, 2);
		contentPane.add(separator);
		
		JLabel label = new JLabel("Identidade:");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(20, 293, 78, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Nome:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(20, 321, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Data de Nascimento:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(20, 346, 116, 14);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(155, 290, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(155, 318, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(155, 343, 86, 20);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("Telefone Fixo:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(273, 292, 99, 17);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Celular:");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(273, 321, 46, 14);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(372, 290, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(372, 318, 86, 20);
		contentPane.add(textField_4);
		
		JLabel label_5 = new JLabel("Endere\u00E7o:");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(23, 390, 69, 14);
		contentPane.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(83, 387, 272, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(365, 387, 60, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(20, 436, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(116, 436, 86, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(212, 436, 37, 20);
		contentPane.add(textField_9);
		
		JLabel label_6 = new JLabel("N\u00FAmero");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(365, 371, 46, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Bairro");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_7.setBounds(20, 418, 46, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Cidade");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_8.setBounds(116, 418, 46, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("UF");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_9.setBounds(212, 418, 46, 14);
		contentPane.add(label_9);
		
		JCheckBox checkBox = new JCheckBox("Direito");
		checkBox.setBackground(SystemColor.activeCaption);
		checkBox.setBounds(459, 355, 97, 23);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Inform\u00E1tica");
		checkBox_1.setBackground(SystemColor.activeCaption);
		checkBox_1.setBounds(459, 381, 97, 23);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("Matem\u00E1tica");
		checkBox_2.setBackground(SystemColor.activeCaption);
		checkBox_2.setBounds(459, 407, 97, 23);
		contentPane.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Medicina");
		checkBox_3.setBackground(SystemColor.activeCaption);
		checkBox_3.setBounds(459, 433, 97, 23);
		contentPane.add(checkBox_3);
		
		JLabel label_10 = new JLabel("Especialidade:");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_10.setBounds(470, 334, 86, 14);
		contentPane.add(label_10);
		
		JCheckBox checkBox_4 = new JCheckBox("Bacharel");
		checkBox_4.setBackground(SystemColor.activeCaption);
		checkBox_4.setBounds(570, 352, 171, 23);
		contentPane.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Especialista Lato Sensu");
		checkBox_5.setBackground(SystemColor.activeCaption);
		checkBox_5.setBounds(570, 380, 171, 23);
		contentPane.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("Mestrado");
		checkBox_6.setBackground(SystemColor.activeCaption);
		checkBox_6.setBounds(570, 405, 171, 23);
		contentPane.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("Doutorado");
		checkBox_7.setBackground(SystemColor.activeCaption);
		checkBox_7.setBounds(570, 430, 171, 23);
		contentPane.add(checkBox_7);
		
		JLabel label_11 = new JLabel("T\u00EDtulo:");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_11.setBounds(570, 334, 46, 14);
		contentPane.add(label_11);
		
		JLabel lblMostrarProfessor = new JLabel("Mostrar Professor");
		lblMostrarProfessor.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblMostrarProfessor.setBounds(219, 243, 277, 36);
		contentPane.add(lblMostrarProfessor);
	}
}
