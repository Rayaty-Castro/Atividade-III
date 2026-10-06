import java.util.Scanner;

public class InputValidator {
    private static final Scanner scanner = new Scanner(System.in);

    public static String lerTextoNaoVazio(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine();
            if (entrada != null && !entrada.trim().isEmpty()) {
                return entrada.trim();
            }
            System.out.println("Erro: Este campo é obrigatório e não pode ser em branco.");
        }
    }

    public static int lerInteiroPositivo(String mensagem, int min, int max) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine();
            try {
                int valor = Integer.parseInt(entrada.trim());
                if (valor >= min && valor <= max) {
                    return valor;
                }
                System.out.printf("Erro: Digite um número inteiro entre %d e %d.\n", min, max);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
            }
        }
    }
}