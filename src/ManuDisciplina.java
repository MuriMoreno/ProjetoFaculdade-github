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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ManuDisciplina extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodDisc;
	private JTextField txtNomeDisc;
	private JTextField txtCargaDisc;
	private JTextField txtAbrir;
	private JTextField txtAula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManuDisciplina frame = new ManuDisciplina();
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
	public ManuDisciplina() {
		
		setBounds(100, 100, 557, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastramentoDisciplina = new JLabel("Manuten\u00E7\u00E3o Disciplina");
		lblCadastramentoDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCadastramentoDisciplina.setBounds(140, 26, 324, 41);
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
		btnSairDisciplina.setBounds(442, 266, 89, 23);
		contentPane.add(btnSairDisciplina);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtCodDisc.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Informe o Código da Disciplina");
					
				} else {
					
				} try {
					
					Connection con = Conexao.getConnection();
					String sql = "update disciplina set nome = ?, carga = ?, aulas = ? where  coddisc = ?";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setString(1, txtNomeDisc.getText());
					stmt.setInt(2, Integer.parseInt(txtCargaDisc.getText()));
					if(rd1.isSelected()) {
						
						stmt.setInt(3,Integer.parseInt(rd1.getText()));
						
					} else if (rd2.isSelected()) {
						
						stmt.setInt(3,Integer.parseInt(rd2.getText()));
					} else if (rd3 .isSelected()) {
						
						stmt.setInt(3,Integer.parseInt(rd3.getText()));
					} else if (rd4.isSelected()) {
						
						stmt.setInt(3,Integer.parseInt(rd4.getText()));
					} else if (rd5.isSelected()) {
						
						stmt.setInt(3,Integer.parseInt(rd5.getText()));
					} else if (rd6.isSelected()) {
						
						stmt.setInt(3,Integer.parseInt(rd6.getText()));
					} else {
						JOptionPane.showMessageDialog(null, "Selecione um valor");
					}
					
					stmt.setInt(4, Integer.parseInt(txtCodDisc.getText()));
					
					stmt.execute();
					stmt.close();
					con.close();
					
					JButton btnConfirmaralterar = new JButton("Confirmar");
					
					btnAlterar.setVisible(false);
					btnConfirmaralterar.setVisible(true);
					
						
					
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				
			
			}
		});
		btnAlterar.setBounds(10, 266, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtCodDisc.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Informe o Código da Disciplina");
				
				} else {
					try {
						Connection con = Conexao.getConnection();
						String sql = "delete from disciplina where coddisc = ?";
						
						PreparedStatement stmt = con.prepareStatement(sql);
						stmt.setString(1, txtCodDisc.getText());
						
						stmt.execute();
						stmt.close();
						con.close();
						JButton btnConfirmarExcluir = new JButton("Confirmar");
						btnExcluir.setVisible(false);
						btnConfirmarExcluir.setVisible(true);
						
						
						
						
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
			}
		});
		btnExcluir.setBounds(113, 266, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
					JOptionPane.showMessageDialog(null, "Sem valor");
				}
				
				
			}
		});
		btnLimpar.setBounds(212, 266, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnConfirmaralterar = new JButton("Confirmar");
		btnConfirmaralterar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Disciplina alterada");
				
				if(btnConfirmaralterar.isVisible()) {
					btnConfirmaralterar.setVisible(false);
					btnAlterar.setVisible(true);
					
				}
				
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
					JOptionPane.showMessageDialog(null, "Sem valor");
				}
			}
		});
		btnConfirmaralterar.setBounds(10, 267, 89, 20);
		contentPane.add(btnConfirmaralterar);
		
		JButton btnConfirmarExcluir = new JButton("Confirmar");
		btnConfirmarExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Disciplina excluída");
				
				if(btnConfirmarExcluir.isVisible()) {
					btnConfirmarExcluir.setVisible(false);
					btnExcluir.setVisible(true);
			}
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
					JOptionPane.showMessageDialog(null, "Sem valor");
				}
		}});
		btnConfirmarExcluir.setBounds(113, 266, 89, 23);
		contentPane.add(btnConfirmarExcluir);
		
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
							txtAula.setText(rs.getString("aulas"));	
							
							
						}
						
						
						
						if(txtAula.getText().equals("1")){
							rd1.setSelected(true);
							
						} else if(txtAula.getText().equals("2")){
							rd2.setSelected(true);
						} else if(txtAula.getText().equals("3")){
							rd3.setSelected(true);
						} else if(txtAula.getText().equals("4")){
							rd4.setSelected(true);
						} else if(txtAula.getText().equals("5")){
							rd5.setSelected(true);
						} else if(txtAula.getText().equals("6")){
							rd6.setSelected(true);
						} else {
							
						}
						txtAbrir.setText("");
						txtAula.setText("");
						rs.close();
						con.close();
							
					}  catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}});
		btnAbrir.setBounds(10, 232, 89, 23);
		contentPane.add(btnAbrir);
		
		txtAbrir = new JTextField();
		txtAbrir.setBounds(116, 233, 86, 20);
		contentPane.add(txtAbrir);
		txtAbrir.setColumns(10);
		
		txtAula = new JTextField();
		txtAula.setEditable(false);
		txtAula.setBounds(422, 109, 51, 19);
		contentPane.add(txtAula);
		txtAula.setColumns(10);
	}
}
