package questao_7;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Contato> contatos;
	
	public Agenda() {
		contatos = new ArrayList<>();
	}
	
	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}
	
	public Contato buscarContato(String nome) {
		for (Contato contato : contatos) {
			if (contato.getNome().contains(nome)) {
				return contato;
			}
		}
		return null;
	}
	
	public void excluirContato(String nome) {
		for (Contato contato : contatos) {
			if (contato.getNome().contains(nome)) {
				System.out.printf("contato com o nome %s removido.%n",contato.getNome());
				contatos.remove(contato);
				return;
			}
		}
		System.out.println("Não há contatos com esse nome.");
	}
	
	public void listarContatos() {
		for (Contato contato : contatos) {
			System.out.printf("%s, %s %n", contato.getNome(), contato.getEmail());
		}
	}
}


