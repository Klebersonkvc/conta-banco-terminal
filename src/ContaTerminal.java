import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        //Exiber as mensagens para o nosso usuario
        System.out.println("Por favor, digite o número da Agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();// Cunsumir a nova linha pendente

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + "e seu saldo " + saldo + "já está disponivel para saque.");

        scanner.close();
    }
}
