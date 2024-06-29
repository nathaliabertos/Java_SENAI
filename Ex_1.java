package sp.senai.br.ex_1;
import java.util.Scanner;

public class Ex_1 {

    public static void main(String[] args) {
    
/*    Crie um programa que solicite e armazene, respectivamente, em uma variável o
nome, o sobrenome e a idade do usuário, após solicitar todos os dados imprima em
uma única linha a seguinte mensagem.
“O usuário nome sobrenome, tem idade anos.”
Obs: Substitua nome, sobrenome e idade pelos valores armazenados nas variáveis.*/

Scanner scanner = new Scanner(System.in);    
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        System.out.println("Digite sua idade: ");
        String idade = scanner.nextLine();
        
        System.out.println("O usuário " + nome + " " + sobrenome + ", tem " + idade + " anos.");
        
/*Solicite que o usuário forneça 5 números inteiros, calcule a soma de todos eles, e
depois apresente o resultado.*/
        System.out.println("Me forneça um número inteiro: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Me forneça um número inteiro: ");
        int numeroDois = scanner.nextInt();
        System.out.println("Me forneça um número inteiro: ");
        int numeroTres = scanner.nextInt();
        System.out.println("Me forneça um número inteiro: ");
        int numeroQuatro = scanner.nextInt();
        System.out.println("Me forneça um número inteiro: ");
        int numeroCinco = scanner.nextInt();
        
        System.out.println(numeroUm + numeroDois + numeroTres + numeroQuatro + numeroCinco);
        
/*Solicite que o usuário forneça dois números e realize a multiplicação entre eles.
Imprima o resultado.*/

        System.out.println("Me forneça um número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.println("Me forneça um número inteiro: ");
        int numero2 = scanner.nextInt();
        
        System.out.println(numero1 * numero2);

/*Solicite que o usuário forneça dois números e realize uma divisão entre eles.
Imprima o resultado.*/

        System.out.println("Me forneça um número inteiro: ");
        int numero_Um = scanner.nextInt();
        System.out.println("Me forneça um número inteiro: ");
        int numero_Dois = scanner.nextInt();
        
        System.out.println(numero_Um / numero_Dois);

/*Solicite que o usuário forneça duas strings e as concatene. Em seguida, imprima a
string resultante.*/     
        System.out.println("Escreva seu nome: ");
        String nome1 = scanner.nextLine();
        
        System.out.println("Sua cidade: ");
        String cidade1 = scanner.nextLine();
        
        String concatenado = "O nome do usuário é " + nome1 + " e ele mora em " + cidade1;
        System.out.println(concatenado);

/*Solicite que o usuário forneça uma temperatura em Celsius e converta-a para
Fahrenheit.
Fórmula:
f = (c × 9/5) + 32
OBS: Substitua o c da fórmula pela variável onde foi armazenado a temperatura
fornecida pelo usuário.*/

        System.out.println("Me forneça uma temperatura em Celsius: ");
        int temperatura = scanner.nextInt();
        
        System.out.println((temperatura * 1.8) + 32);

/*Solicite que o usuário forneça o preço de um item e a porcentagem de desconto a
ser aplicada. Calcule o preço final após o desconto e imprima-o.
Fórmula:
preco final = preco * (100 - desconto) / 100*/


        System.out.println("Me forneça um preço: ");
        float preco = scanner.nextFloat();
        
        System.out.println("Me forneça um desconto: ");
        float desconto = scanner.nextFloat();
        
        System.out.println(preco * (100 - desconto) / 100);

/*Solicite que o usuário forneça a largura e altura de um retângulo e calcule sua área e
perímetro, usando a fórmula:
Fórmula:
area = largura * altura*/

        System.out.println("Me forneça a largura de um retângulo: ");
        int largRetangulo = scanner.nextInt();
        
        System.out.println("Me forneça a altura de um retângulo: ");
        int altRetangulo = scanner.nextInt();
        
        System.out.println(largRetangulo * altRetangulo);

/*Solicite que o usuário forneça o raio de um círculo e calcule sua área e
circunferência.

Fórmula:
area = 3.1415 * raio2
circunferencia = 2 * 3.1415 * raio*/


        System.out.println("Me forneça o raio de um circulo: ");
        double raio = scanner.nextDouble();
        
        
        double area = 3.1415 * (raio * raio);
        System.out.println(area);


        
        
                


        
    }
}
