import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ManuCurso extends JFrame {

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
					ManuCurso frame = new ManuCurso();
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
	public ManuCurso() {
		
		setBounds(100, 100, 673, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastramentoDeCursos = new JLabel("Manuten\u00E7\u00E3o Cursos");
		lblCadastramentoDeCursos.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCadastramentoDeCursos.setBounds(208, 31, 278, 40);
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
		btnSair.setBounds(429, 412, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAlterar.setBounds(27, 412, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(137, 412, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(252, 412, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnConfirmaExcluir = new JButton("Confirmar");
		btnConfirmaExcluir.setEnabled(false);
		btnConfirmaExcluir.setBounds(137, 412, 89, 23);
		contentPane.add(btnConfirmaExcluir);
		
		JButton btnConfirmaAlteracao = new JButton("Confirmar");
		btnConfirmaAlteracao.setEnabled(false);
		btnConfirmaAlteracao.setBounds(28, 412, 89, 23);
		contentPane.add(btnConfirmaAlteracao);
	}
}
