package DiagramClass;

import java.util.Collection;

public class Aluno {

	private String nome;

	private String CPF;

	private String Sexo;

	private date data_nascimento;

	private Endereço endereço;

	private Collection<Contato> contato;

	public boolean valida_cpf() {
		return false;
	}

	public boolean valida_data.nasc() {
		return false;
	}

}
