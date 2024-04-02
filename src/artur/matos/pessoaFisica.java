package artur.matos;

public class pessoaFisica implements Ipessoa {

	private String nome;
	private String cpf;
	private int idade;
	

	public pessoaFisica(String nome, String string,int idade){
		
		this.nome = nome;
		this.cpf = string;
		this.idade = idade;
		
	}
		
	public void imprimirInformacoes() {
		System.out.println("Pessoa Fisica");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }

	
	


}
