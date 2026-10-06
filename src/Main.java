import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Personagem> party = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("  CRIAÇÃO DE PERSONAGENS RPG (JDK 25)    ");

        boolean executando = true;
        while (executando) {
            exibeMenu();
            int opcao = InputValidator.lerInteiroPositivo("Escolha uma opção: ", 1, 4);

            switch (opcao) {
                case 1 -> criarGuerreiro();
                case 2 -> criarMago();
                case 3 -> listarEUsarHabilidades();
                case 4 -> {
                    System.out.println("\nSaindo do sistema... Até a próxima aventura!");
                    executando = false;
                }
            }
        }
    }

    private static void exibeMenu() {
        System.out.println("\n MENU PRINCIPAL");
        System.out.println("1. Criar Guerreiro");
        System.out.println("2. Criar Mago");
        System.out.println("3. Listar Grupo e Usar Habilidades");
        System.out.println("4. Sair");
    }

    private static void criarGuerreiro() {
        System.out.println("\n--- Criação de Guerreiro ---");
        String nome = InputValidator.lerTextoNaoVazio("Nome do Guerreiro: ");
        int nivel = InputValidator.lerInteiroPositivo("Nível (1 a 100): ", 1, 100);
        int hp = InputValidator.lerInteiroPositivo("Pontos de Vida (HP): ", 1, 9999);
        int forca = InputValidator.lerInteiroPositivo("Pontos de Força: ", 1, 500);

        try {
            Guerreiro guerreiro = new Guerreiro(nome, nivel, hp, forca);
            party.add(guerreiro);
            System.out.println("Guerreiro registrado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar guerreiro: " + e.getMessage());
        }
    }

    private static void criarMago() {
        System.out.println("\n--- Criação de Mago ---");
        String nome = InputValidator.lerTextoNaoVazio("Nome do Mago: ");
        int nivel = InputValidator.lerInteiroPositivo("Nível (1 a 100): ", 1, 100);
        int hp = InputValidator.lerInteiroPositivo("Pontos de Vida (HP): ", 1, 9999);
        int mana = InputValidator.lerInteiroPositivo("Pontos de Mana: ", 1, 9999);

        try {
            Mago mago = new Mago(nome, nivel, hp, mana);
            party.add(mago);
            System.out.println("✅ Mago registrado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar mago: " + e.getMessage());
        }
    }

    private static void listarEUsarHabilidades() {
        if (party.isEmpty()) {
            System.out.println("\n⚠️ Nenhum personagem cadastrado no grupo.");
            return;
        }


        System.out.println("---GRUPO DE AVENTUREIROS---");

        // Exemplo prático de Polimorfismo: chamando métodos sobrescritos sem checar tipo concreto
        for (Personagem p : party) {
            System.out.println(p.exibeFicha());
            System.out.println("Ação: " + p.executarHabilidadeEspecial());
            System.out.println();
        }
    }
}