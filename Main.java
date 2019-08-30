
package app;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String nome = leia.next();
        int ano = Integer.parseInt(leia.next());
        float valor = Float.parseFloat(leia.next());
        
        System.out.println("-----------------------");
        
        iPhone meuIphone = new iPhone(nome, ano, valor);
        meuIphone.setFone("AirPods");
        meuIphone.setCarregador("Universal");
        meuIphone.setCabo("Cabo Lighting");
        meuIphone.setNumeroModelo("BR458DSAD5");
        meuIphone.setNumeroSerie("12A34R56N");
        
        
        System.out.println(meuIphone.getModeloCelular());
        System.out.println(meuIphone.getAnoLancamento());
        System.out.println(meuIphone.getValor());
        System.out.println(meuIphone.getCabo());
        System.out.println(meuIphone.getCarregador());
        System.out.println(meuIphone.getNumeroModelo());
       
        
        
    }
    
}
