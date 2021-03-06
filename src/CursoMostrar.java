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

public class CursoMostrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodCurso;
	private JTextField txtCargaHoraria;
	private JTextField txtCodInst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CursoMostrar frame = new CursoMostrar();
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
	public CursoMostrar() {
		
		setBounds(100, 100, 673, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastramentoDeCursos = new JLabel("Mostrar Cursos");
		lblCadastramentoDeCursos.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCadastramentoDeCursos.setBounds(233, 29, 199, 41);
		contentPane.add(lblCadastramentoDeCursos);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo do Curso:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(28, 108, 96, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Carga Hor\u00E1ria:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(28, 144, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setBounds(156, 106, 46, 17);
		contentPane.add(txtCodCurso);
		txtCodCurso.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo do Instituto:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(32, 181, 120, 14);
		contentPane.add(lblNewLabel_2);
		
		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(155, 143, 47, 16);
		contentPane.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);
		
		txtCodInst = new JTextField();
		txtCodInst.setBounds(156, 179, 46, 17);
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
		list.setBounds(379, 225, 191, 156);
		contentPane.add(list);
		
		JLabel lblCursos = new JLabel("CURSOS:");
		lblCursos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCursos.setBounds(379, 198, 62, 14);
		contentPane.add(lblCursos);
		
		JRadioButton rdBacharel = new JRadioButton("Bacharel");
		rdBacharel.setBackground(SystemColor.activeCaption);
		rdBacharel.setBounds(28, 251, 109, 23);
		contentPane.add(rdBacharel);
		
		JLabel lblTipoDeCurso = new JLabel("Tipo de Curso:");
		lblTipoDeCurso.setBounds(28, 226, 88, 14);
		contentPane.add(lblTipoDeCurso);
		
		JRadioButton rdGestao = new JRadioButton("Gest\u00E3o");
		rdGestao.setBackground(SystemColor.activeCaption);
		rdGestao.setBounds(28, 277, 109, 23);
		contentPane.add(rdGestao);
		
		JRadioButton rdOutros = new JRadioButton("Outros");
		rdOutros.setBackground(SystemColor.activeCaption);
		rdOutros.setBounds(28, 303, 109, 23);
		contentPane.add(rdOutros);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
			}
		});
		btnSair.setBounds(32, 371, 89, 23);
		contentPane.add(btnSair);
	}
}
