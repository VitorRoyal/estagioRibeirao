import java.util.Scanner;

public class VerificaLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qualquer coisa para análise: ");
        String texto = scanner.nextLine(); //lendo a entrada do usuário

        int count = 0; //inicializando um contador vazio
        for (char c : texto.toLowerCase().toCharArray()) { //convertendo o texto para minúsculo e transformando em um array de caracteres
            if (c == 'a') {
                count++; //incrementando o contador
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' foi encontrada!");
            System.out.println("A letra 'a' aparece " + count + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi encontrada!");
        }
    }
}
