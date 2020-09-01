import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.SystemException;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class Menu extends JFrame implements ActionListener{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Menu");
		
		setBounds(100, 100, 708, 418);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		menuBar.add(mnCadastrar);
		
		JMenuItem mCurso = new JMenuItem("Curso");
		mCurso.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				if(mCurso.getText().equals("Curso")) {
					
					JOptionPane.showMessageDialog(null, "Curso");
					
				}
				Curso frame = new Curso();
				frame.setVisible(true);
				
				
			}
		});
		mnCadastrar.add(mCurso);
		
		
		
		JMenuItem mDisciplina = new JMenuItem("Disciplina");
		mDisciplina.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				if(mDisciplina.getText().equals("Disciplina")) {
					
					JOptionPane.showMessageDialog(null, "Disciplina");
					
				}
				
				Disciplinas frame = new Disciplinas();
				frame.setVisible(true);
				
				
			}
		});
		mnCadastrar.add(mDisciplina);
		
		JMenuItem mProfessor = new JMenuItem("Professor");
		mProfessor.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
					if(mProfessor.getText().equals("Professor")) {
					
					JOptionPane.showMessageDialog(null, "Professor");
					
				}
					Professor frame = new Professor();
					frame.setVisible(true);
		
				
			}
		});
		
		JMenuItem mAluno = new JMenuItem("Aluno");
		mAluno.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
					if(mAluno.getText().equals("Aluno")) {
					
					JOptionPane.showMessageDialog(null, "Aluno");
					
				}
					
					Aluno frame = new Aluno();
					frame.setVisible(true);
				
			}
		});
		mnCadastrar.add(mAluno);
		mnCadastrar.add(mProfessor);
		
		JMenu mnMostrar = new JMenu("Mostrar");
		menuBar.add(mnMostrar);
		
		JMenuItem mCurso1 = new JMenuItem("Curso");
		mCurso1.addActionListener(new ActionListener() {
			
	
			public void actionPerformed(ActionEvent e) {
				
					if(mCurso1.getText().equals("Curso")) {
					
					JOptionPane.showMessageDialog(null, "Curso");
					
				}
					CursoMostrar frame = new CursoMostrar();
					frame.setVisible(true);
				
				
			}
		});
		mnMostrar.add(mCurso1);
		
		JMenuItem mDisciplina1 = new JMenuItem("Disciplina");
		mDisciplina1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
					if(mDisciplina1.getText().equals("Disciplina")) {
					
					JOptionPane.showMessageDialog(null, "Disciplina");
					
				}
					DisciplinasMostrar frame = new DisciplinasMostrar();
					frame.setVisible(true);
				
			}
		});
		mnMostrar.add(mDisciplina1);
		
		JMenuItem mAluno1 = new JMenuItem("Aluno");
		mAluno1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
					if(mAluno1.getText().equals("Aluno")) {
					
					JOptionPane.showMessageDialog(null, "Aluno");
					
				}
					AlunoMostrar frame = new AlunoMostrar();
					frame.setVisible(true);
				
			}
		});
		mnMostrar.add(mAluno1);
		
		JMenuItem mProfessor1 = new JMenuItem("Professor");
		mProfessor1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e ) {
					if(mProfessor1.getText().equals("Professor")) {
					
					JOptionPane.showMessageDialog(null, "Professor");
					
				}
					ProfessorMostrar frame = new ProfessorMostrar();
					frame.setVisible(true);
				
			}
		});
		mnMostrar.add(mProfessor1);
		
		JMenuItem mCursoProfessores = new JMenuItem("Curso/Professores");
		mCursoProfessores.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
					if(mCursoProfessores.getText().equals("Curso/Professores")) {
					
					JOptionPane.showMessageDialog(null, "Curso/Professores");
					
				}
					
					CursoProfessores frame = new CursoProfessores();
					frame.setVisible(true);
				
			}
		});
		
		JSeparator separator_1 = new JSeparator();
		mnMostrar.add(separator_1);
		mnMostrar.add(mCursoProfessores);
		
		JMenuItem mCursoDisciplinas = new JMenuItem("Curso/Disciplinas");
		mCursoDisciplinas.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
					if(mCursoDisciplinas.getText().equals("Curso/Disciplinas")) {
					
					JOptionPane.showMessageDialog(null, "Curso/Disciplinas");
					
				}
				
					CursoDisciplinas frame = new CursoDisciplinas();
					frame.setVisible(true);
			}
		});
		mnMostrar.add(mCursoDisciplinas);
		
		JMenuItem mAlunosDisciplina = new JMenuItem("Alunos/Disciplina");
		mAlunosDisciplina.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
					if(mAlunosDisciplina.getText().equals("Alunos/Disciplina")) {
					
					JOptionPane.showMessageDialog(null, "Alunos/Disciplina");
					
				}
				
					AlunosDisciplina frame = new AlunosDisciplina();
					frame.setVisible(true);
			}
		});
		mnMostrar.add(mAlunosDisciplina);
		
		JMenuItem mProfessoresDisciplina = new JMenuItem("Professores/Disciplina");
		mProfessoresDisciplina.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
					if(mProfessoresDisciplina.getText().equals("Professores/Disciplina")) {
					
					JOptionPane.showMessageDialog(null, "Professores/Disciplina");
					
				}
					
					ProfessoresDisciplina frame = new ProfessoresDisciplina();
					frame.setVisible(true);
				
			}
		});
		mnMostrar.add(mProfessoresDisciplina);
		
		JMenu mnSair = new JMenu("Sair");
		menuBar.add(mnSair);
		
		JMenuItem mSair = new JMenuItem("SAIR");
		mSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(mSair.getText().equals("SAIR")) {
					
					JOptionPane.showMessageDialog(null, "Sair");
					
					
				}
				
				System.exit(0);
			}
			
		});
		mnSair.add(mSair);
		
		JMenu mnManuteno = new JMenu("Manuten\u00E7\u00E3o");
		menuBar.add(mnManuteno);
		
		JMenuItem mntmAlterarCurso = new JMenuItem("Curso");
		mnManuteno.add(mntmAlterarCurso);
		
		JMenuItem mntmAlterarDisciplina = new JMenuItem("Disciplina");
		mntmAlterarDisciplina.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				ManuDisciplina frame = new ManuDisciplina();
						frame.setVisible(true);
				
				
			}
		});
		mnManuteno.add(mntmAlterarDisciplina);
		
		JMenuItem mntmAlterarAluno = new JMenuItem("Aluno");
		mnManuteno.add(mntmAlterarAluno);
		
		JMenuItem mntmAlterarProfessor = new JMenuItem("Professor");
		mnManuteno.add(mntmAlterarProfessor);
		
		JSeparator separator = new JSeparator();
		mnManuteno.add(separator);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
