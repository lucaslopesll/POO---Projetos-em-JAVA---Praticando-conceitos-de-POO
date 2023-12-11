
package testeveiculo2;


class Carro extends Veiculo {
    private int numPortas;

    public Carro(int numPortas, String modelo, int ano) {
        super(modelo, ano);
        this.numPortas = numPortas;
    }

    
    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Portas: " + this.numPortas);
    }
    public Carro(){

    }
    
}