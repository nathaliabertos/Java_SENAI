package sp.senai.br.ex_4;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Ex_4 {

    public static void main(String[] args) {
/*Uso de ArrayList e if:
Implemente um programa que armazene uma lista de números inteiros em um ArrayList. Em seguida, percorra essa lista e imprima apenas os números pares.*/
    
ArrayList<Integer> numInteiro = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

for (Integer num : numInteiro){
    if(num % 2 ==0){
        System.out.println("Par: " + num);
    }
    }

/*Uso de array e for e print:
Crie um programa que inicialize um array de strings com nomes de cores (ex: "vermelho", "azul", "verde"). 
Utilize um loop for para percorrer o array e imprimir cada cor.*/

String[] cores = {"Amarelo", "Azul", "Vermelho", "Verde", "Laranja"};

for (String cor : cores){
    System.out.println("Cor: " + cor);
    }

/*Uso de do-while, if, print e Scanner:
Implemente um programa que simule um jogo onde o jogador tem que adivinhar um número entre 1 e 100. Utilize um loop do-while para permitir múltiplas tentativas, 
informando se o número digitado é maior ou menor que o número secreto. */

Scanner scan = new Scanner(System.in);
    int numSecreto = 0;   
    do{
    System.out.println("Adivinhe o numero secreto: ");
    numSecreto = scan.nextInt();
    }while(numSecreto != 53);
        if(numSecreto == 53){
        System.out.println("Parabéns, você adivinhou!");
    }
    
/*Uso de ArrayList, while, for e Scanner:
Implemente um programa que permita ao usuário cadastrar uma lista de nomes utilizando um ArrayList. 
Utilize um loop para continuar adicionando nomes até que o usuário decida parar. depois imprima todos os nomes salvos*/

ArrayList<String> nomes = new ArrayList<>();

Scanner scanner = new Scanner(System.in);
boolean continuar = true;

while(continuar){
    System.out.println("Digite um nome para cadastro:  - caso queira parar, escreva sair ");
    String nome = scanner.nextLine();
    
if(nome.equalsIgnoreCase("sair")){
    continuar = false;
} else {
    nomes.add(nome);
}    
}
for(String nome : nomes){
    System.out.println("Nomes cadastrados: " + nome);
}

/*Uso de switch-case, do-while, if Scanner e print:
Desenvolva um sistema de banco simples onde o usuário pode realizar operações como depósito, saque e consulta de saldo. Utilize loops do-while para manter o usuário interagindo até que ele decida sair do sistema. 
Utilize a classe Scanner para entrada de dados e garanta que o saldo não fique negativo após saques*/

Scanner entrada = new Scanner(System.in);
double saldo = 0;
int opcao;

do{
    System.out.println("Escolha a opção desejada: ");
    System.out.println("1 - Saldo ");
    System.out.println("2 - Depósito ");
    System.out.println("3 - Saque ");
    System.out.println("4 - Sair do Sistema ");
    
    opcao = entrada.nextInt();
    switch (opcao){
        case 1:
            System.out.println("Seu saldo é: " + saldo);
            break;
            
        case 2:
            System.out.println("Digite o valor do depósito: ");
        double deposito = scanner.nextDouble();
        if (deposito > 0){
            saldo += deposito;
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Valor de depósito inválido");
        }
            break;
        
        case 3: 
            System.out.println("Digite o valor do saque: ");
        double saque = scanner.nextDouble();
        if(saque > 0 && saldo >= saque){
            saldo -= saque;
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        } 
         break;
        
        case 4:
            System.out.println("Saindo do sistema...");
        break;
        
    } 
} while (opcao != 4);

    }
}
