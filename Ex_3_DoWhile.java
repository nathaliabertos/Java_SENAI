package sp.senai.br.ex_3_dowhile;
import java.util.Scanner;
public class Ex_3_DoWhile {

    public static void main(String[] args) {
    /*Escreva um programa que utilize um do-while para imprimir uma contagem regressiva de 10 até 1*/
       
    int contador = 10;
        do{
        System.out.println("contador: " + contador);
        contador --;
        } while (contador <=10 && contador >= 1);
        
    /*Crie um programa que solicite ao usuário um número entre 1 e 100. Utilize um do-while para garantir que o número inserido esteja dentro desse intervalo. 
    (Repita ate que o numero seja valido)*/
    
    Scanner scan = new Scanner(System.in);
    int num = 0;   
    do{
    System.out.println("Digite um numero entre 1 a 100: ");
    num = scan.nextInt();
    
    }while(num < 1 || num >100);
    
    /*Implemente um programa que solicite números ao usuário até que a soma dos números digitados seja maior que 100. Utilize um do-while para repetir a solicitação.*/
    
    int soma = 0;
    
    do{
        System.out.println("Digite um numero para somar: ");
        int numero = scan.nextInt();
        
        soma += numero;
        System.out.println("A soma atual é:" + soma);
    } while(soma < 100);
    
    }}