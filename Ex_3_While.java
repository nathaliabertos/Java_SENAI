package sp.senai.br.ex_3_while;
import java.util.Scanner;
public class Ex_3_While {

    public static void main(String[] args) {
   /*Peça ao usuário para digitar uma senha e continue solicitando até que a senha digitada seja correta ("senha123").*/
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite uma senha: ");
       String senha = scanner.nextLine();
      
      if (senha.equals("senha123")){
         System.out.println("Senha correta");  
       } else {
          while(!senha.equals("senha123")){
             System.out.println("Senha incorreta"); 
        System.out.println("Digite uma senha: ");
        senha = scanner.nextLine();          
                  }
        }
   
      /*Crie um jogo onde o programa solicita ao usuario 1 um numero aleatorio de 1 a 100, e o usuário 2 deve adivinhar o número. O jogo continua até que o usuário acerte o número.*/
      Scanner userUm = new Scanner(System.in);
      System.out.println("Digite um numero de 1 a 100: ");
      int num = userUm.nextInt();
      
      Scanner userDois = new Scanner(System.in);
      System.out.println("Adivinhe o numero do UserUm: ");
      int num2 = userDois.nextInt();
      
      while (num2 != num) {
        System.out.println("Valor incorreto, tente novamente: ");
        num2 = userDois.nextInt();
      }
        System.out.println("Valor correto!");    
           
     /* Implemente um programa que simule um caixa eletrônico, onde o usuário pode sacar dinheiro enquanto tiver saldo disponível. 
        O programa continua permitindo saques até que o usuário escolha encerrar.  Solicite o saldo inicial da conta */
      Scanner caixa = new Scanner(System.in);
      System.out.println("Saldo da conta: ");
      float saldo = caixa.nextFloat();
      
      boolean desejaContinuar = true;
      while(desejaContinuar) {
      System.out.println("O saldo da conta é de: " + saldo);    
      System.out.println("Quanto deseja sacar?");    
      float saque = caixa.nextFloat();
      
      if (saque <= saldo){
          saldo -= saque;
          System.out.println("Saque realizado");
      } else {
          System.out.println("Saldo insuficiente");
      }
      
      System.out.println("Deseja continuar?");
      desejaContinuar = caixa.nextBoolean();
      }

     
       
    }
}    
   

