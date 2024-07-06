package sp.senai.br.aula_2_java2;
import java.util.Scanner;
public class Aula_2_Java2 {

    public static void main(String[] args) {
    
    

Scanner scanner = new Scanner(System.in);

    /*Verifique se um número é positivo, menor que 100, E não é zero.*/
    System.out.println("Digite um número: ");
    int numero = scanner.nextInt();
    
    if (numero > 0 && numero <100 && numero != 0){
        System.out.println("O número está dentro do range");
    } else {
        System.out.println("O numero está fora do range");
    }
    
    /*Se um estudante obteve uma nota maior ou igual a 60 na prova E uma nota maior que 70 no trabalho final 
    OU obteve 100 em ambos, então está aprovado.*/
    System.out.println("Digite a nota da prova: ");
    float p1 = scanner.nextFloat();
    System.out.println("Digite a nota do trabalho: ");
    float t1 = scanner.nextFloat();
    
    if (p1 >= 60 && t1 > 70 || p1 == 100 && t1 == 100){
        System.out.println("Vocês está aprovado!");
        
    } else {
        System.out.println("Você está reprovado!");
    }
    
    /*Utilizando a estrutura condicional, desenvolva um programa que solicite a altura e peso de uma pessoa, calcule o índice de massa corporal (IMC) 
    e imprima o estado de saúde dela.
    Fórmula: imc = peso/(altura²)*/
    System.out.println("Digite seu peso: ");
    double peso = scanner.nextDouble();
    System.out.println("Digite sua altura: ");
    double altura = scanner.nextDouble();
    
    double imc = (peso / (altura * altura));
    System.out.println("Seu IMC é:" + imc);
    
    if (imc < 18.5) {
       System.out.println("Você está classificado como magreza");
    } else if (imc >= 18.5 && imc <= 24.9) {
        System.out.println("Você está classificado como normal");
    } else if (imc >= 25 && imc <= 29.9) {
        System.out.println("Você está classificado como sobrepeso!");
    } else if (imc >= 30 && imc <= 39.9) {
        System.out.println("Você está classificado como sobrepeso!");
    } else if (imc > 40) {    
        System.out.println("Você está classificado como obesidade grave!");
    }

    /*Utilizando a estrutura condicional desenvolva um programa que solicite idade de uma pessoa, classifique-a em uma categoria de idade, e imprima sua categoria*/
    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();
    
    if (idade > 0 && idade <=12){
        System.out.println("Classificação: Criança");
    } if (idade >12 && idade <=17){
        System.out.println("Classificação: Adolescente");
    } if (idade > 17 && idade <=65){
        System.out.println("Classificação: Adulto");
    } else if (idade > 65){
        System.out.println("Classificação: Idoso");
    }
    
    System.out.println("Digite qual exercicio deseja executar: ");
    int exercicio = scanner.nextInt();
    
    switch(exercicio) {
        case 1:
            System.out.println("Exercicio 1");
            break;
        case 2:
            System.out.println("Exercicio 2");
            break;
        case 3:
            System.out.println("Exercicio 3");
            break;
        case 4:
            System.out.println("Exercicio 4");
            break;
        default:
            System.out.println("Nenhuma opção válida digitada");
    }
    
    }
}

    