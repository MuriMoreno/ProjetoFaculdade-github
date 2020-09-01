import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DisciplinasMostrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodDisc;
	private JTextField txtNomeDisc;
	private JTextField txtCargaDisc;
	private JTextField txtAbrir;
	private JTextField txtAulas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisciplinasMostrar frame = new DisciplinasMostrar();
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
	public DisciplinasMostrar() {
		
		setBounds(100, 100, 557, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastramentoDisciplina = new JLabel("Mostrar Disciplina");
		lblCadastramentoDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCadastramentoDisciplina.setBounds(158, 26, 250, 43);
		contentPane.add(lblCadastramentoDisciplina);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo da Disciplina:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(32, 111, 129, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome da Disciplina:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(32, 150, 124, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Carga Hor\u00E1ria:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(32, 192, 99, 14);
		contentPane.add(lblNewLabel_2);
		
		txtCodDisc = new JTextField();
		txtCodDisc.setEnabled(false);
		txtCodDisc.setBounds(166, 109, 86, 17);
		contentPane.add(txtCodDisc);
		txtCodDisc.setColumns(10);
		
		txtNomeDisc = new JTextField();
		txtNomeDisc.setEnabled(false);
		txtNomeDisc.setBounds(166, 147, 86, 20);
		contentPane.add(txtNomeDisc);
		txtNomeDisc.setColumns(10);
		
		txtCargaDisc = new JTextField();
		txtCargaDisc.setEnabled(false);
		txtCargaDisc.setBounds(166, 190, 86, 20);
		contentPane.add(txtCargaDisc);
		txtCargaDisc.setColumns(10);
		
		JLabel lblAulasSemanais = new JLabel("Aulas Semanais:");
		lblAulasSemanais.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAulasSemanais.setBounds(32, 230, 115, 17);
		contentPane.add(lblAulasSemanais);
		
		JButton btnSairDisciplina = new JButton("Sair");
		btnSairDisciplina.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSairDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
			}
		});
		btnSairDisciplina.setBounds(222, 266, 89, 23);
		contentPane.add(btnSairDisciplina);
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtAbrir.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Informe o Código da Disciplina");
				} else {
					
					try {
						
						Connection con = Conexao.getConnection();
						
						String sql = "select * from disciplina where coddisc = ?";
						PreparedStatement stmt = con.prepareStatement(sql);
						stmt.setInt(1, Integer.parseInt(txtAbrir.getText()));
						
						ResultSet rs = stmt.executeQuery();
						
						while (rs.next()) {
							txtCodDisc.setText(rs.getString("coddisc"));
							txtNomeDisc.setText(rs.getString("nome"));
							txtCargaDisc.setText(rs.getString("carga"));
							txtAulas.setText(rs.getString("aulas"));
							
							
						}
						
						txtAbrir.setText("");
						
						rs.close();
						con.close();
							
					}  catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
		});
		btnAbrir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAbrir.setBounds(10, 266, 89, 23);
		contentPane.add(btnAbrir);
		
		txtAbrir = new JTextField();
		txtAbrir.setBounds(111, 267, 86, 20);
		contentPane.add(txtAbrir);
		txtAbrir.setColumns(10);
		
		txtAulas = new JTextField();
		txtAulas.setEnabled(false);
		txtAulas.setBounds(166, 228, 86, 20);
		contentPane.add(txtAulas);
		txtAulas.setColumns(10);
	}
}
