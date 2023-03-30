package media;

public class Pessoa {
	// Atributos
	private static int contador = 0;
	private String nome;
	private String cpf;

	// Métodos Personalizados:
	public String toString() {
		return "\nNome: " + this.getNome() + "\nCPF: " + this.getCpf();
	}

	// Métodos Especiais:
	// Constructor
	public Pessoa() {

	}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		contador += 1;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {

		StringBuilder strBuilder = new StringBuilder(this.cpf);
		String a = strBuilder.insert(3, ".").toString();
		StringBuilder str = new StringBuilder(a);
		String b = str.insert(7, ".").toString();
		StringBuilder st = new StringBuilder(b);
		String c = st.insert(11, " - ").toString();
		return c;

		// return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
