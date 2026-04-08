import java.util.Scanner;
public class exercicio2 {
  public static void main(String[]args){
    Scanner leitor = new Scanner(System.in);
    System.out.print("Digite a primeira palavra:");
    String p1 = leitor.nextLine();
    System.out.print("Digite a segunda palavra:");
    String p2 = leitor.nextLine();
    if (p1.equalsIngoreCase(p2)) {
      System.out.println("As palavras sao iguais (ingorando maiusculas/minusculas).");
    } else {
      System.out.println("As palavras sao diferentes.");
    }
    leitor.close();
  }
}
