/*Faça um programa que, dados 2 vetores com 10 números inteiros cada, gere e imprima
um vetor dos números não comuns aos vetores */

public class ex2 {
    public static void main(String[] Args) {
        int[] vet1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vet2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] vet3 = new int[20]; 
        int cont = 0;

        for (int i = 0; i < vet1.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < vet2.length; j++) {
                if (vet1[i] == vet2[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                vet3[cont] = vet1[i];
                cont++;
            }
        }

        for (int i = 0; i < vet2.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < vet1.length; j++) {
                if (vet2[i] == vet1[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                vet3[cont] = vet2[i];
                cont++;
            }
        }

        System.out.println("Terceiro Vetor: ");
        for (int i = 0; i < cont; i++) {
            System.out.print(vet3[i] + " ");
        }
    }
}

/*brincadeira com numeros aleatorios:

import java.util.Random;

public class ex2 {
    public static void main(String[] Args) {
        Random random = new Random();
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];  // Vetor para armazenar os números não comuns
        int cont = 0;

        // Gerar valores aleatórios entre 0 e 100 para vet1
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = random.nextInt(101);  // Gera um número entre 0 e 100
        }

        // Gerar valores aleatórios entre 0 e 100 para vet2
        for (int i = 0; i < vet2.length; i++) {
            vet2[i] = random.nextInt(101);  // Gera um número entre 0 e 100
        }

        // Comparar vet1 com vet2
        for (int i = 0; i < vet1.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < vet2.length; j++) {
                if (vet1[i] == vet2[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                vet3[cont] = vet1[i];
                cont++;
            }
        }

        // Comparar vet2 com vet1
        for (int i = 0; i < vet2.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < vet1.length; j++) {
                if (vet2[i] == vet1[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                vet3[cont] = vet2[i];
                cont++;
            }
        }

        // Imprimir vetores gerados e o terceiro vetor (números não comuns)
        System.out.println("Vetor 1: ");
        for (int i = 0; i < vet1.length; i++) {
            System.out.print(vet1[i] + " ");
        }
        System.out.println("\nVetor 2: ");
        for (int i = 0; i < vet2.length; i++) {
            System.out.print(vet2[i] + " ");
        }
        System.out.println("\nTerceiro Vetor: ");
        for (int i = 0; i < cont; i++) {
            System.out.print(vet3[i] + " ");
        }
    }
}

*/
