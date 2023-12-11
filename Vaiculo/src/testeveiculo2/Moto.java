
package testeveiculo2;


public class Moto extends Veiculo {
     private int cilindradas;

    public Moto(int cilindradas, String modelo, int ano) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Cilindradas: " + this.cilindradas);
    }
    public Moto(){
        
    }
     
}
