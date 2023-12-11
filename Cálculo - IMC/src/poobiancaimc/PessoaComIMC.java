
package poobiancaimc;
    
// Classe derivada PessoaComIMC que herda de Pessoa
class PessoaComIMC extends Pessoa {
    // Construtor que chama o construtor da classe base
    public PessoaComIMC(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    // Método adicional para exibir a situação do IMC
    public void exibirStatusIMC() {
        double imc = calcularIMC();
        System.out.println(getNome() + " tem IMC de " + imc);

        // Exemplo de condição para exibir a situação do IMC
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else {
            System.out.println("Acima do peso");
        }
    }
}
