package questao_7;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		Contato contato1 = new Contato("Reginaldo", "regicsf@ufpa.br");
		Contato contato2 = new Contato("Luiz", "luizedums02@gmail.com");
		Contato contato3 = new Contato("Fulano", "fulanodetal@ufpa.br");
		Contato contato4 = new Contato("Ciclano", "ciclanodetal@ufpa.br");
		
		agenda.adicionarContato(contato1);
		agenda.adicionarContato(contato2);
		agenda.adicionarContato(contato3);
		agenda.adicionarContato(contato4);
		
		agenda.listarContatos();
		System.out.println("");
		
		Contato contato5 = new Contato("Beltrano", "beltranodetal@ufpa.br");
		agenda.adicionarContato(contato5); // adicionar beltrano
		agenda.excluirContato("Fulano"); // excluir fulano
		System.out.println("");
		
		agenda.listarContatos();
		
	}

}
