public class ex3 {
    public static void main(String[] Args) {
        int[] vet1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
        int[] vet2 = {1, 2, 3, 4, 5};  
        int[] vet3 = new int[10];  
        int[] vet4 = new int[10];  

        for (int i = 0; i < vet1.length; i++) {
            if (vet1[i] % 2 == 0) {  
                int soma = 0;
                for (int j = 0; j < vet2.length; j++) {
                    soma += vet1[i] + vet2[j];
                }
                vet3[i] = soma;
            }
        }

        for (int i = 0; i < vet1.length; i++) {
            if (vet1[i] % 2 != 0) {  
                int contDivisores = 0;
                for (int j = 0; j < vet2.length; j++) {
                    if (vet1[i] % vet2[j] == 0) {
                        contDivisores++;
                    }
                }
                vet4[i] = contDivisores;
            }
        }

        System.out.println("Vetor 3 (Soma dos pares de vet1 com vet2): ");
        for (int i = 0; i < vet3.length; i++) {
            if (vet1[i] % 2 == 0) {
                System.out.println("vet3[" + i + "] = " + vet3[i]);
            }
        }

        System.out.println("\nVetor 4 (Quantidade de divisores dos ímpares de vet1 em vet2): ");
        for (int i = 0; i < vet4.length; i++) {
            if (vet1[i] % 2 != 0) {
                System.out.println("vet4[" + i + "] = " + vet4[i]);
            }
        }
    }
}
