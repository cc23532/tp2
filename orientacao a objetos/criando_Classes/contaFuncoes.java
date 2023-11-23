import java.util.Scanner;
public class contaFuncoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String titular = scanner.nextLine();

        System.out.println("\nDigite sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("\nDigite o número de sua conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("\nDigite seu saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("\nDigite a data de abertura de sua conta: ");
        String dataDeAbertura = scanner.nextLine();

        Conta conta= new Conta(titular, numero, agencia, saldo, dataDeAbertura);
        System.out.println(conta.toString());

    }
}
