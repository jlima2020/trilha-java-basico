import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Configura o scanner para usar o ponto como separador decimal

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer

        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, digite um valor numérico para o saldo.");
            scanner.next(); // Descartar a entrada inválida
        }
        double saldo = scanner.nextDouble();

        // Mensagem de confirmação
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
