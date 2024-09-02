import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] Args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> valores = new ArrayList<>();
        int contador = 0;

        while (true) {
            System.out.println("Digite um valor: ");
            double valor = teclado.nextDouble();

            if (valor <= 0) {  
                break;
            }

            valores.add(valor); 
            contador++;

            if (contador % 20 == 0) {  
                imprimirTabela(valores);
                valores.clear(); 
            }
        }

        if (!valores.isEmpty()) {
            imprimirTabela(valores);
        }

        teclado.close();
    }

    public static void imprimirTabela(ArrayList<Double> valores) {
        System.out.printf("%-10s %-10s %-10s%n", "Valor", "Cubo", "Raiz Quadrada");
        for (double valor : valores) {
            System.out.printf("%-10.2f %-10.2f %-10.2f%n", valor, Math.pow(valor, 3), Math.sqrt(valor));
        }
    }
}
