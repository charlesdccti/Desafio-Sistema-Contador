import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        double valor = 0;
        boolean condicao = true;

        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair
        while (condicao) {

            int opcao = scanner.nextInt();

            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas
            // pelo usuário.
            switch (opcao) {
                case 1: // 1: O programa solicitará o valor a ser depositado e atualizará o saldo.
                    valor = scanner.nextDouble();
                    saldo = saldo + valor;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    valor = scanner.nextDouble();
                    if (saldo > valor) {
                        saldo = saldo - valor;
                        valor = 0;
                    }
                    System.out.println((saldo > valor) ? "Saldo atual: " + saldo : "Saldo insuficiente.");
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    condicao = false;
                    System.out.println("Programa encerrado.");
                    break;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

}