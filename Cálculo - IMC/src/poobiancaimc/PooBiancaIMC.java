
package poobiancaimc;


public class PooBiancaIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      // Criando uma instância de PessoaComIMC
        PessoaComIMC pessoa = new PessoaComIMC("João", 25, 70.5, 1.75);

        // Exibindo o status do IMC
        pessoa.exibirStatusIMC();
    }
}
