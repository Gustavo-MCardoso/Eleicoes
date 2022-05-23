import java.util.Scanner;
public class Eleicoes {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int numEleitor = 0;
  int PT=0, PDT=0, PL=0, PSDB=0, nulo=0, branco=0;
  
  for(int i = 0; i < 50; i++)  {
    numEleitor++;
    System.out.println("\nEleitor " + numEleitor +", digite o numero do candidato a sua escolha.");
    System.out.print("Digite '13' para PT, '12' para PDT, '22' para PL, '45' para PSDB, '0' para voto Nulo, ou digite '9' para voto em branco!\nSua escolha e: ");
    int numero = scan.nextInt();

   // Opcoes de votacao com "cases"
   switch (numero){
     case 13:
       System.out.println("Voce votou no Candito do partido PT!");
       PT++;
       break;
     case 12:
       System.out.println("Voce votou no Candidato do partido PDT!");
       PDT++;
       break;
     case 22:
       System.out.println("Voce votou no Candidato do partido PL!");
       PL++;
       break;
     case 45:
       System.out.println("Voce votou no Candidato do partido PSDB!");
       PSDB++;
       break;
     case 0:
       System.out.println("Voce optou pelo voto Nulo!");
       nulo++;
       break;
     case 9:
       System.out.println("Voce optou por votar em Branco!");
       branco++;
       break;
     default:
       System.out.println("Voto invalido! Seu voto nao sera considerado na contagem final!"); 

    }
  } //Exibir o candidato em que foi votado
    System.out.printf("\nO total de votos para o PT foi igual a: " + PT + "!");
    System.out.printf("\nO total de votos para o PDT foi igual a: " + PDT + "!");
    System.out.printf("\nO total de votos para o PL foi igual a: " + PL + "!");
    System.out.printf("\nO total de votos para o PSDB foi igual a: " + PSDB + "!");
    System.out.printf("\nO total de votos nulos foi igual a: " + nulo + "!");
    System.out.printf("\nO total de votos em branco foi igual a: " + branco + "!"); 
 }
}