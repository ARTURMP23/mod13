package artur.matos;


	public class pessoaJuridica implements Ipessoa {
		
		private String nome;
		private String cnpj;
		private String razaoSocial;

		public pessoaJuridica(String nome, String cnpj, String razaoSocial) {
		
			this.nome = nome;
			this.cnpj = cnpj;
			this.razaoSocial = razaoSocial;
 }

		public void imprimirInformacoes() {
			System.out.println("Pessoa Juridica");
			System.out.println("Nome: " + nome);
			System.out.println("CNPJ: " + cnpj);
			System.out.println("Razão Social: " + razaoSocial);
 }
}