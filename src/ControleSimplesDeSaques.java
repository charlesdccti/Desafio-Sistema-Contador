import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        boolean condicao = true;

        // TODO: Crie um loop 'for' para iterar sobre os saques:
        for (; condicao == true ;) {
            // TODO: Solicite ao usuário o valor do saque:
            double valorSaque = scanner.nextDouble();
            // TODO: Verifique se o valor do saque é zero, encerrando as transações:
            // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
            if( valorSaque == 0){
                System.out.println("Transacoes encerradas.");
                break;
            }
            else if( valorSaque < limiteDiario){
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: "+ limiteDiario);
            }
            else{
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } 

        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close(); 
    }
}