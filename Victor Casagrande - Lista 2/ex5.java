/*Faça um programa que preencha uma matriz 7x7 de números inteiros e crie dois vetores
com sete posições cada um que contenham, respectivamente, o maior elemento de
cada uma das linhas e o menor elemento de cada uma das colunas. Escreva a matriz
e os dois vetores gerados. */

import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        
        final int SIZE = 7;
        int[][] matriz = new int[SIZE][SIZE];
        int[] maioresLinhas = new int[SIZE];
        int[] menoresColunas = new int[SIZE];
        
        Random random = new Random();

        System.out.println("Matriz 7x7:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matriz[i][j] = random.nextInt(100); 
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < SIZE; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < SIZE; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            maioresLinhas[i] = maior;
        }

        for (int j = 0; j < SIZE; j++) {
            int menor = matriz[0][j];
            for (int i = 1; i < SIZE; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            menoresColunas[j] = menor;
        }

        System.out.println("\nMaiores elementos de cada linha:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(maioresLinhas[i] + "\t");
        }
        System.out.println();

        System.out.println("\nMenores elementos de cada coluna:");
        for (int j = 0; j < SIZE; j++) {
            System.out.print(menoresColunas[j] + "\t");
        }
    }
}
