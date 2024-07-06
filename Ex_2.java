package sp.senai.br.ex_2;
import java.util.Scanner;
public class Ex_2 {

    public static void main(String[] args) {
    /*Peça ao usuário para digitar um número e escreva um programa que imprima se o número é positivo, negativo ou zero.*/
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    double numero = scanner.nextDouble();
    
    if (numero >= 1) {
      System.out.println("Numero positivo!");
      } else if (numero ==0) {
      System.out.println("Numero zero!"); 
      } else {
      System.out.println("Numero negativo!");    
      }      
        
    /*Crie um programa que determine se um número digitado pelo usuário é par ou ímpar.*/
    
    System.out.println("Digite um número: ");
    double par_impar = scanner.nextDouble();
    
    if (par_impar % 2==0) {
    System.out.println("Número par!");
    } else {
    System.out.println("Número ímpar!");
    }
    
    /*Solicite ao usuário três números e determine qual é o maior deles.*/
    
    System.out.println("Me forneça um número inteiro: ");
    double n1 = scanner.nextDouble();
    System.out.println("Me forneça um número inteiro: ");
    double n2 = scanner.nextDouble();
    System.out.println("Me forneça um número inteiro: ");
    double n3 = scanner.nextDouble();
    
    if (n1 > n2 && n1 >3) {
    System.out.println("n1 é maior!");
    } else if (n2 > n1 && n2 >n3){
    System.out.println("n2 é maior");
    } else {
    System.out.println("n3 é maior!");
       }
    
    /*Peça ao usuário para digitar os três lados de um triângulo e determine se ele é equilátero 
    (três lados iguais), isósceles (dois lados iguais) ou escaleno (nenhum lado igual).*/
    
    System.out.println("Me forneça um lado de um triangulo: ");
    int t1 = scanner.nextInt();
    System.out.println("Me forneça um lado de um triangulo: ");
    int t2 = scanner.nextInt();
    System.out.println("Me forneça um lado de um triangulo: ");
    int t3 = scanner.nextInt();
    
    if (t1 == t2 && t1 == t3 && t2 == t3) {
    System.out.println("Triangulo equilatero!");
    } else if (t1 == t2 || t1 == t3) {
    System.out.println("Triangulo iósceles!");
    } else { System.out.println("Triangulo escaleno!");
    }
    
    /*Desenvolva um programa que verifique se um ano informado pelo usuário é bissexto ou não.
Considere um ano bissexto se ele for múltiplo de 4.*/
    
    System.out.println("Me forneça um ano: ");
    int ano = scanner.nextInt();
    
    if (ano %4 ==0) {
    System.out.println("Ano bissexto");
    } else {
    System.out.println("Não é ano bissexto");
    }
    }
}
    
