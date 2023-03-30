package media;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Teste {
	static ArrayList<Aluno> alunos;
	public static void main(String[] args) {
		alunos = new ArrayList<Aluno>();
		menu();
	}
	public static void menu() {
		int m = Integer.parseInt(JOptionPane.showInputDialog("\nBem vindos ao Sistema de Cadastro Escolar da Fuctura"+"\n"+"\nEscolha uma das operações"+"\n"+"\nOpção 1 - Cadastrar Aluno "+"\nOpção 2 - Média Aluno  "+"\nOpção 3 - Média Turma "+"\nOpção 4 - Sair"+"\n")); 

		switch (m) {
		case 1:
			cadastroAluno();
			break;
		case 2:
			//mediaAluno();
			break;
		case 3:
			//mediaTurma();
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Obrigado por usar os serviços!");
			System.exit(0);
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
			menu();
			break;
		}
	}
	
	public static void cadastroAluno() {
		Pessoa alun = new Pessoa();
		alun.setNome(JOptionPane.showInputDialog("Nome: "));
		alun.setCpf(JOptionPane.showInputDialog("CPF: "));
		double nota01 = Double.parseDouble(JOptionPane.showInputDialog("Nota 01: "));
		double nota02 = Double.parseDouble(JOptionPane.showInputDialog("Nota 02: "));
		
		Aluno a = new Aluno(alun, nota01, nota02);
		alunos.add(a);
		System.out.println(alunos);
		menu();
	}
	
}
