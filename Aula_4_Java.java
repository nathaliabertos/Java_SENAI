package sp.senai.br.aula_3_java;
import java.util.ArrayList;
public class Aula_4_Java {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] primos = {2,3,5,7,11};
            System.out.println(numeros.length);
            System.out.println(primos.length);
            
        for(int numero:numeros){
            System.out.println(numero);
        }
        for(int primo:primos){
            System.out.println(primo);
        }
        
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add("Nathalia");
        nomes.add("João");
        
        nomes.set(1, "Mario");
        
        for (String nome: nomes){
            System.out.println(nome);
        }
        
    }
}
