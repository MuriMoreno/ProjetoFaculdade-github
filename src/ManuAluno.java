import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ManuAluno extends JFrame {

	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtCodCurso;
	private JTextField txtNomeCurso;
	private JTextField txtNP1;
	private JTextField txtNP2;
	private JTextField txtFaltas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManuAluno frame = new ManuAluno();
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
	public ManuAluno() {
		
		setBounds(100, 100, 631, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastramentoAluno = new JLabel("Manuten\u00E7\u00E3o Aluno");
		lblCadastramentoAluno.setBounds(178, 28, 339, 33);
		lblCadastramentoAluno.setFont(new Font("Tahoma", Font.BOLD, 27));
		contentPane.add(lblCadastramentoAluno);
		
		JLabel lblNewLabel = new JLabel("Matr\u00EDcula:");
		lblNewLabel.setBounds(38, 94, 73, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(38, 135, 59, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Nascimento:");
		lblNewLabel_2.setBounds(38, 176, 132, 15);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_2);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(180, 92, 103, 17);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(180, 133, 103, 17);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtData = new JTextField();
		txtData.setBounds(180, 174, 103, 17);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("C\u00F3digo do Curso:");
		lblNewLabel_3.setBounds(367, 94, 101, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNomeDoCurso = new JLabel("Nome do Curso:");
		lblNomeDoCurso.setBounds(367, 135, 101, 14);
		lblNomeDoCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNomeDoCurso);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setBounds(479, 91, 86, 20);
		contentPane.add(txtCodCurso);
		txtCodCurso.setColumns(10);
		
		txtNomeCurso = new JTextField();
		txtNomeCurso.setBounds(479, 132, 86, 20);
		contentPane.add(txtNomeCurso);
		txtNomeCurso.setColumns(10);
		
		JList list = new JList();
		list.setBackground(SystemColor.activeCaption);
		list.setToolTipText("");
		list.setBounds(39, 229, 219, 176);
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
		lblNewLabel_4.setBounds(383, 201, 66, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("NP1:");
		lblNewLabel_5.setBounds(383, 234, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("NP2:");
		lblNewLabel_6.setBounds(383, 259, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		txtNP1 = new JTextField();
		txtNP1.setBounds(431, 231, 86, 20);
		contentPane.add(txtNP1);
		txtNP1.setColumns(10);
		
		txtNP2 = new JTextField();
		txtNP2.setBounds(431, 256, 86, 20);
		contentPane.add(txtNP2);
		txtNP2.setColumns(10);
		
		JLabel lblFaltas = new JLabel("Faltas:");
		lblFaltas.setBounds(383, 293, 46, 14);
		contentPane.add(lblFaltas);
		
		txtFaltas = new JTextField();
		txtFaltas.setBounds(431, 287, 86, 20);
		contentPane.add(txtFaltas);
		txtFaltas.setColumns(10);
		
		JButton btnMdia = new JButton("M\u00E9dia");
		btnMdia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double media = (Double.parseDouble(txtNP1.getText()) + Double.parseDouble(txtNP2.getText()))/2;
				
				
				JOptionPane.showMessageDialog(null, "MÉDIA: " + media);
			}
		});
		btnMdia.setBounds(431, 322, 89, 23);
		contentPane.add(btnMdia);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnSair.setBounds(431, 393, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(287, 322, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnExcluir.setBounds(287, 356, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(287, 393, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnConfirmarAlterar = new JButton("Confirmar");
		btnConfirmarAlterar.setEnabled(false);
		btnConfirmarAlterar.setBounds(287, 322, 89, 23);
		contentPane.add(btnConfirmarAlterar);
		
		JButton btnConfirmarExcluir = new JButton("Confirmar");
		btnConfirmarExcluir.setEnabled(false);
		btnConfirmarExcluir.setBounds(287, 356, 89, 23);
		contentPane.add(btnConfirmarExcluir);
	}
}
