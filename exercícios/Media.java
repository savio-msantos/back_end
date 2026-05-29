package exercícios;
import java.util.Scanner;

public class Media {
   public Media() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double nota1 = sc.nextDouble();
      double nota2 = sc.nextDouble();
      double media = (nota1 + nota2) / (double)2.0F;
      if (media >= (double)7.0F) {
         System.out.println("ALUNO APROVADO: " + media);
      } else {
         System.out.println("ALUNO REPROVADO: " + media);
      }

      sc.close();
   }
}
