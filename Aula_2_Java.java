package sp.senai.br.aula_2_java;

public class Aula_2_Java {

    public static void main(String[] args) {
        double n1 = 8;
        double n2 = 9;
        double media = (n1 + n2) / 2;
      
     if (media < 5){   
        System.out.println("Reprovado");
             } 
     else if (media <=7){ 
        System.out.println("Recuperação");
             }
     else  { 
        System.out.println("Aprovado"); 
             }
     
     System.out.println(n1 == n2);
     System.out.println(n1 != n2);
     System.out.println(n1 > n2);
     System.out.println(n1 >= n2);
     System.out.println(n1 < n2);
     System.out.println(n1 <= n2);
    }
}
