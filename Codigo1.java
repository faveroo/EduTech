/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Codigo1 {
	public static void main(String[] args) {
		Contato c = new Contato("Asdrubal", "9.9999-9999");
		System.out.println(c);
	}
	static class Contato {
		private final String nome;
		private final String telefone;
		Contato(String nome, String telefone){
			this.nome = nome;
			this.telefone = telefone;
		}
		
		@Override
        public String toString() {
            return "Nome: " + nome + " - Fone: " + telefone;
        }
	}
}

/*
Fazer com que o código anterior exiba: "Nome: Asdrubal - Fone: 9.9999-9999"
Sem alterar nenhuma linha do método main().
 */
