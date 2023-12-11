
package testeveiculo2;

import java.util.Scanner;


public class TesteVeiculo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Carro gol = new Carro();
        //Moto cg = new Moto();
        
        System.out.println("Digite o Modelo do CARRO: ");
        gol.setModelo(input.next());
        
        System.out.println("Digite o ano do CARRO: ");
        gol.setAno(input.nextInt());
        
        System.out.println("Digite as portas do CARRO: ");
        gol.setNumPortas(input.nextInt());

        System.out.println("Modelo: "+gol.getModelo());
        System.out.println("ANO: "+gol.getAno());
        System.out.println("Portas: "+gol.getNumPortas());
    }
    
}
