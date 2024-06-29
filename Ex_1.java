package sp.senai.br.aula_1_java;
import java.util.Scanner;
public class Ex_1 {
    
/*Crie um programa que solicite e armazene, respectivamente, em uma variável o
nome, o sobrenome e a idade do usuário, após solicitar todos os dados imprima em
uma única linha a seguinte mensagem.
“O usuário nome sobrenome, tem idade anos.”
Obs: Substitua nome, sobrenome e idade pelos valores armazenados nas variáveis*/

        Scanner scanner = new Scanner(System.in);    
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        System.out.println("Digite sua idade: ");
        String idade = scanner.nextLine();
        
        System.out.println(nome + " " + altura + " " + idade + "");
}
