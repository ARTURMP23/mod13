package artur.matos;

public class Programa {

	public static void main(String[] args) {
		
		Ipessoa pessoa1 = new pessoaJuridica("Empresa ABC", "12345678901234", "Empresa ABC Ltda");
        Ipessoa pessoa2 = new pessoaFisica("João", "123.456.789-10", 30);

        pessoa1.imprimirInformacoes();
        System.out.println();
        pessoa2.imprimirInformacoes();
		
	}

}
