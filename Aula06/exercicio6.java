import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma frase");
        String frase = leitor.nextLine();
        System.out.print("Digite a palavra para buscar:");
        String palavra = leitor.nextLine();
        int posição = frase.indexOf(palavra);
        if (posição!= -1) {
        System.out.println("A palavras aparece na frase na posição: + posição ");
        } else {
            System.out.println("A palavra não foi encontarada (Retorno:-1)");
        }
        leitor.close();

    }
}
