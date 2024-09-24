import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nomeCliente = scanner.nextLine();
        conta.setNomeCliente(nomeCliente);

        System.out.println("Informe a sua agência: ");
        String agencia = scanner.nextLine();
        conta.setAgencia(agencia);

        System.out.println("Informe o número de sua conta: ");
        int numero = Integer.parseInt(scanner.nextLine());
        conta.setNumero(numero);

        System.out.println("Informe seu saldo: ");
        double saldo = Double.parseDouble(scanner.nextLine());
        conta.setSaldo(saldo);

        conta.exibirMensagem();
        scanner.close();
    }
}