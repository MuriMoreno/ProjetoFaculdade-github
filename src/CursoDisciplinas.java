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

public class CursoDisciplinas extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodCurso;
	private JTextField txtCargaHoraria;
	private JTextField txtCodInst;
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
					CursoDisciplinas frame = new CursoDisciplinas();
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
	public CursoDisciplinas() {
		
		setBounds(100, 100, 685, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastramentoDeCursos = new JLabel("Mostrar Cursos");
		lblCadastramentoDeCursos.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCadastramentoDeCursos.setBounds(242, 21, 199, 41);
		contentPane.add(lblCadastramentoDeCursos);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo do Curso:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 59, 96, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Carga Hor\u00E1ria:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 84, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setBounds(141, 57, 46, 17);
		contentPane.add(txtCodCurso);
		txtCodCurso.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo do Instituto:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 109, 120, 14);
		contentPane.add(lblNewLabel_2);
		
		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(140, 108, 47, 16);
		contentPane.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);
		
		txtCodInst = new JTextField();
		txtCodInst.setBounds(141, 84, 46, 17);
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
		list.setBounds(270, 86, 191, 156);
		contentPane.add(list);
		
		JLabel lblCursos = new JLabel("CURSOS:");
		lblCursos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCursos.setBounds(270, 59, 62, 14);
		contentPane.add(lblCursos);
		
		JRadioButton rdBacharel = new JRadioButton("Bacharel");
		rdBacharel.setBackground(SystemColor.activeCaption);
		rdBacharel.setBounds(510, 84, 109, 23);
		contentPane.add(rdBacharel);
		
		JLabel lblTipoDeCurso = new JLabel("Tipo de Curso:");
		lblTipoDeCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoDeCurso.setBounds(510, 59, 88, 14);
		contentPane.add(lblTipoDeCurso);
		
		JRadioButton rdGestao = new JRadioButton("Gest\u00E3o");
		rdGestao.setBackground(SystemColor.activeCaption);
		rdGestao.setBounds(510, 110, 109, 23);
		contentPane.add(rdGestao);
		
		JRadioButton rdOutros = new JRadioButton("Outros");
		rdOutros.setBackground(SystemColor.activeCaption);
		rdOutros.setBounds(510, 136, 109, 23);
		contentPane.add(rdOutros);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
			}
		});
		btnSair.setBounds(10, 439, 89, 23);
		contentPane.add(btnSair);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 253, 762, 2);
		contentPane.add(separator);
		
		JLabel label = new JLabel("C\u00F3digo da Disciplina:");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(10, 345, 129, 17);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Nome da Disciplina:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(10, 373, 124, 17);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Carga Hor\u00E1ria:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(10, 401, 99, 14);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(141, 344, 63, 17);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 371, 63, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(141, 399, 63, 17);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("Aulas Semanais:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(323, 323, 115, 17);
		contentPane.add(label_3);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setBackground(SystemColor.activeCaption);
		radioButton.setBounds(270, 355, 109, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setBackground(SystemColor.activeCaption);
		radioButton_1.setBounds(270, 382, 109, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setBackground(SystemColor.activeCaption);
		radioButton_2.setBounds(270, 408, 109, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("4");
		radioButton_3.setBackground(SystemColor.activeCaption);
		radioButton_3.setBounds(381, 355, 109, 23);
		contentPane.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("5");
		radioButton_4.setBackground(SystemColor.activeCaption);
		radioButton_4.setBounds(381, 382, 109, 23);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("6");
		radioButton_5.setBackground(SystemColor.activeCaption);
		radioButton_5.setBounds(381, 408, 109, 23);
		contentPane.add(radioButton_5);
		
		JLabel label_4 = new JLabel("Mostrar Disciplina");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 27));
		label_4.setBounds(217, 269, 250, 43);
		contentPane.add(label_4);
	}
}
