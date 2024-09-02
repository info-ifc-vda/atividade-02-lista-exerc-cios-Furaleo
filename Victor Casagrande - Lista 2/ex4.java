/*Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os
códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados
em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo
código) e os saldos devem ser armazenados em um vetor de números reais. O saldo
deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi
armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta
posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o
seguinte menu na tela:
• Efetuar depósito
• Efetuar saque
• Consultar o ativo bancário (soma de todos os saldos)
• Finalizar programa
Obs.1: ao depositar, deve-se solicitar o valor e o código da conta a receber o depósito.
Obs.2: para sacar, a mesma coisa. Também, deve-se verificar se tem saldo suficiente
para o saque. */

import java.util.Scanner;

public class ex4 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        int[] codigos = new int[10]; 
        double[] saldos = new double[10];  

        for (int i = 0; i < 10; i++) {
            boolean codigoDuplicado;
            do {
                codigoDuplicado = false;
                System.out.print("Digite o código da conta " + (i + 1) + ": ");
                codigos[i] = scanner.nextInt();

                for (int j = 0; j < i; j++) {
                    if (codigos[i] == codigos[j]) {
                        System.out.println("Código de conta já existe. Digite um código diferente.");
                        codigoDuplicado = true;
                        break;
                    }
                }
            } while (codigoDuplicado);

            System.out.print("Digite o saldo inicial da conta " + (i + 1) + ": ");
            saldos[i] = scanner.nextDouble();
        }

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Efetuar depósito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar o ativo bancário");
            System.out.println("4. Finalizar programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: 
                    System.out.print("Digite o código da conta para depósito: ");
                    int codigoDeposito = scanner.nextInt();
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    boolean depositoRealizado = false;
                    for (int i = 0; i < 10; i++) {
                        if (codigos[i] == codigoDeposito) {
                            saldos[i] += valorDeposito;
                            System.out.println("Depósito realizado com sucesso! Novo saldo: R$" + saldos[i]);
                            depositoRealizado = true;
                            break;
                        }
                    }
                    if (!depositoRealizado) {
                        System.out.println("Código de conta não encontrado.");
                    }
                    break;

                case 2:  
                    System.out.print("Digite o código da conta para saque: ");
                    int codigoSaque = scanner.nextInt();
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    boolean saqueRealizado = false;
                    for (int i = 0; i < 10; i++) {
                        if (codigos[i] == codigoSaque) {
                            if (saldos[i] >= valorSaque) {
                                saldos[i] -= valorSaque;
                                System.out.println("Saque realizado com sucesso! Novo saldo: R$" + saldos[i]);
                            } else {
                                System.out.println("Saldo insuficiente.");
                            }
                            saqueRealizado = true;
                            break;
                        }
                    }
                    if (!saqueRealizado) {
                        System.out.println("Código de conta não encontrado.");
                    }
                    break;

                case 3:  
                    double ativoBancario = 0;
                    for (int i = 0; i < 10; i++) {
                        ativoBancario += saldos[i];
                    }
                    System.out.println("O ativo bancário total é: R$" + ativoBancario);
                    break;

                case 4:  
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida, Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
