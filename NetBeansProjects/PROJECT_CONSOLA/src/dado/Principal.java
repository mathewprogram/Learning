package dado;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Esperar a ingresar el número 1
        int input = 0;
        while (input != 1) {
            System.out.print("Para lanzar dado ingrese 1: ");
            input = sc.nextInt();
        }

        // Inicializar contadores para cada cara del dado
        int[] contador = new int[6];

        // Lanzar el dado 100 veces y almacenar los resultados
        int[] resultados = new int[100];
        for (int i = 0; i < 100; i++) {
            int dado = (int) (Math.random() * 6 + 1);
            resultados[i] = dado;
            contador[dado - 1]++;
        }

        // Imprimir los resultados en líneas de 10 números cada una
        for (int i = 0; i < 100; i++) {
            System.out.print(resultados[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println(); // Nueva línea cada 10 números
            }
        }

        // Imprimir resultados del conteo
        System.out.println();
        for (int i = 0; i < 6; i++) {
            switch (i + 1) {
                case 1:break;
                case 2:break;
                case 3:break;
                case 4:break;
                case 5:break;
                case 6:break;
            }
            System.out.println("El número " + (i + 1) + " salió " + contador[i] + " veces.");
        }
    }
}




