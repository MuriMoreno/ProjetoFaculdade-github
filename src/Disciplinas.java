import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Disciplinas extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodDisc;
	private JTextField txtNomeDisc;
	private JTextField txtCargaDisc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Disciplinas frame = new Disciplinas();
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
	public Disciplinas() {
		
		setBounds(100, 100, 557, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastramentoDisciplina = new JLabel("Cadastramento Disciplina");
		lblCadastramentoDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCadastramentoDisciplina.setBounds(105, 26, 324, 41);
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
		txtCodDisc.setBounds(166, 109, 63, 17);
		contentPane.add(txtCodDisc);
		txtCodDisc.setColumns(10);
		
		txtNomeDisc = new JTextField();
		txtNomeDisc.setBounds(166, 147, 63, 20);
		contentPane.add(txtNomeDisc);
		txtNomeDisc.setColumns(10);
		
		txtCargaDisc = new JTextField();
		txtCargaDisc.setBounds(166, 190, 63, 17);
		contentPane.add(txtCargaDisc);
		txtCargaDisc.setColumns(10);
		
		JLabel lblAulasSemanais = new JLabel("Aulas Semanais:");
		lblAulasSemanais.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAulasSemanais.setBounds(320, 111, 115, 17);
		contentPane.add(lblAulasSemanais);
		
		JRadioButton rd1 = new JRadioButton("1");
		rd1.setBackground(SystemColor.activeCaption);
		rd1.setBounds(320, 135, 109, 23);
		contentPane.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("2");
		rd2.setBackground(SystemColor.activeCaption);
		rd2.setBounds(320, 162, 109, 23);
		contentPane.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("3");
		rd3.setBackground(SystemColor.activeCaption);
		rd3.setBounds(320, 188, 109, 23);
		contentPane.add(rd3);
		
		JRadioButton rd4 = new JRadioButton("4");
		rd4.setBackground(SystemColor.activeCaption);
		rd4.setBounds(320, 214, 109, 23);
		contentPane.add(rd4);
		
		JRadioButton rd5 = new JRadioButton("5");
		rd5.setBackground(SystemColor.activeCaption);
		rd5.setBounds(320, 240, 109, 23);
		contentPane.add(rd5);
		
		JRadioButton rd6 = new JRadioButton("6");
		rd6.setBackground(SystemColor.activeCaption);
		rd6.setBounds(320, 266, 109, 23);
		contentPane.add(rd6);
		
		JButton btnSairDisciplina = new JButton("Sair");
		btnSairDisciplina.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSairDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
			}
		});
		btnSairDisciplina.setBounds(147, 266, 89, 23);
		contentPane.add(btnSairDisciplina);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					Connection con = Conexao.getConnection();
					String sql = "insert into disciplina (coddisc,nome, carga, aulas) values (?,?,?,?)";
					PreparedStatement stmt = con.prepareStatement(sql);
					
					stmt.setInt(1, Integer.parseInt(txtCodDisc.getText()));
					stmt.setString(2, txtNomeDisc.getText());
					stmt.setString(3, txtCargaDisc.getText());
					if(rd1.isSelected()) {
						
						stmt.setInt(4,Integer.parseInt(rd1.getText()));
						
					} else if (rd2.isSelected()) {
						
						stmt.setInt(4,Integer.parseInt(rd2.getText()));
					} else if (rd3 .isSelected()) {
						
						stmt.setInt(4,Integer.parseInt(rd3.getText()));
					} else if (rd4.isSelected()) {
						
						stmt.setInt(4,Integer.parseInt(rd4.getText()));
					} else if (rd5.isSelected()) {
						
						stmt.setInt(4,Integer.parseInt(rd5.getText()));
					} else if (rd6.isSelected()) {
						
						stmt.setInt(4,Integer.parseInt(rd6.getText()));
					} else {
						JOptionPane.showMessageDialog(null, "Selecione um valor");
					}
					stmt.execute();
					stmt.close();
					con.close();
					JOptionPane.showMessageDialog(null, "Disciplina Cadastrada");
					
					txtCodDisc.setText("");
					txtCargaDisc.setText("");
					txtNomeDisc.setText("");
					if(rd1.isSelected()) {
						
						rd1.setSelected(false);
						
					} else if (rd2.isSelected()) {
						
						rd2.setSelected(false);
					} else if (rd3 .isSelected()) {
						
						rd3.setSelected(false);
					} else if (rd4.isSelected()) {
						
						rd4.setSelected(false);
					} else if (rd5.isSelected()) {
						
						rd5.setSelected(false);
					} else if (rd6.isSelected()) {
						
						rd6.setSelected(false);
					} else {
						JOptionPane.showMessageDialog(null, "Sem valor"); }}
					 catch (SQLException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
					
				
				}
			}
		);
		btnSalvar.setBounds(32, 266, 89, 23);
		contentPane.add(btnSalvar);
	}
}
