import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Marcos Santana";
        String tipoConta = "Conta-Corrente";
        double saldo = 1694.99;
        int opcao = 0;

        System.out.println("*************************");
        System.out.println("Dados iniciais do cliente");
        System.out.println("*************************");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Tipo conta: %s\n", tipoConta);
        System.out.printf("Saldo inicial: %.2f\n", saldo);
        System.out.println("*************************");

        String menu = """
                \n** Informe a sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                *************************
                """;

        while (opcao != 4) {
            System.out.println(menu);
            System.out.printf("Opção: ");
            opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.printf("O saldo atualizado é: %.2f\n", saldo);
            } else if (opcao == 2) {
                System.out.println("Valor que desejar transferir: ");
                double valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.printf("Novo saldo: %.2f\n", saldo);
                }
            } else if (opcao == 3) {
                System.out.printf("Valor recebido: ");
                double valor = sc.nextDouble();
                saldo += valor;
                System.out.printf("\nNovo saldo: %.2f\n", saldo);
            } else if (opcao != 4){
                System.out.println("Opção invalida!");
            }
        }
    }

    public int transferencia() {
        return 99;
    }
}