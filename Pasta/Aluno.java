package media;

public class Aluno extends Pessoa {
	private Pessoa pessoa;
	private double nota01;
	private double nota02;

	public String toString() {
		return "\nNome: " + pessoa.getNome() + "\nCPF: " + pessoa.getCpf() + "\nMatéria: Matemática" + "\nNota 01: "
				+ this.getNota01() + "\nNota 02: " + this.getNota02() + "\nMédia: " + media();
	}
	
	private double media() {
		return (this.getNota01()+this.getNota02())/2;
	}

	public Aluno(Pessoa pe, double nota01, double nota02) {
		this.setPessoa(pe);
		this.setNota01(nota01);
		this.setNota02(nota02);
	}

	public Aluno() {
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public double getNota01() {
		return nota01;
	}

	public void setNota01(double nota01) {
		this.nota01 = nota01;
	}

	public double getNota02() {
		return nota02;
	}

	public void setNota02(double nota02) {
		this.nota02 = nota02;
	}

}
