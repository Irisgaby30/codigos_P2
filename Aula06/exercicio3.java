import java.util.Scanner;
public class exercicio3 {
  public static void main(String[]args){
    Scanner leitor = new Scanner(System.in);
    System.out.print("Digite uma palavra:");
    String palavra = leitor.nextLine();
    int quantidade = palavra.length();
    System.out.println("A palavra'"+ palavra + "'possui" + quantidade + "caracteres");
    leitor.close();
  }
}
