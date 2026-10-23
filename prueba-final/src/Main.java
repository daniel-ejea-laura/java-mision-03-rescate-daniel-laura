import java.awt.*;
import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        int filaRobot = 0;
        int columnaRobot = 0;
        char ROBOT = 'R';

        char[][] matriz = new char[10][10];


        int vidas = 10;
        // 3) Dani
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                matriz[fila][columna] = '*';
            }
        }
        matriz[filaRobot][columnaRobot] = ROBOT;
        // 4º) Carlos y Héctor
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }


        char CASILLA_FINAL = 'F';
        matriz[9][9] = CASILLA_FINAL;

        Random aleatorios = new Random();

        int filaRandom = aleatorios.nextInt(10);
        int columnaRandom = aleatorios.nextInt(10);

        matriz[filaRandom][columnaRandom] = 'B';


        int filaAleatoria2;
        int columnaAleatoria2;


        for (int i = 0; i < 5; i++) {
            do {
                filaAleatoria2 = aleatorios.nextInt(10);
                columnaAleatoria2 = aleatorios.nextInt(10);
            } while (matriz[filaAleatoria2][columnaAleatoria2] != '*');
            matriz[filaAleatoria2][columnaAleatoria2] = 'X';
        }
        System.out.println();
        System.out.println();
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
        // Pablo


        System.out.println("Tu jugador se encuentra en la casilla 0,0");
        System.out.println("y te puedes desplazar con las letras W A S D");


        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Dime una letra: ");
            char desplazamiento = sc.next().charAt(0);

            System.out.println("La letra elegida es " + desplazamiento);

            if (desplazamiento == 'W') {
                matriz[filaRobot][columnaRobot] = '*';
                filaRobot = filaRobot - 1;
                matriz[filaRobot][columnaRobot] = ROBOT;
            }
            if (desplazamiento == 'A') {
                matriz[filaRobot][columnaRobot] = '*';
                columnaRobot = columnaRobot + 1;
                matriz[filaRobot][columnaRobot] = ROBOT;
            }

            if (desplazamiento == 'D') {
                matriz[filaRobot][columnaRobot] = '*';
                columnaRobot = columnaRobot + 1;
                matriz[filaRobot][columnaRobot] = ROBOT;

            }
            if (desplazamiento == 'S') {
                matriz[filaRobot][columnaRobot] = '*';
                filaRobot = filaRobot + 1;
                matriz[filaRobot][columnaRobot] = ROBOT;
            }


            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz.length; columna++) {
                    System.out.print(matriz[fila][columna] + " ");
                }
                System.out.println();
            }
            vidas--;
        }
        while (vidas >= 0);

        int libres = 0;
        int contadorRobot = 0;
        int contadorFinal = 0;
        int contadorBaterias = 0;
        int contadorObstaculos = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {

                if (matriz[fila][columna] == '*') {
                    libres++;
                }

                if (matriz[fila][columna] == 'R') {
                    contadorRobot++;
                }

                if (matriz[fila][columna] == 'F') {
                    contadorFinal++;
                }

                if (matriz[fila][columna] == 'B') {
                    contadorBaterias++;
                }

                if (matriz[fila][columna] == 'X') {
                    contadorObstaculos++;
                }
            }
        }

        System.out.println("Posiciones libres (*): " + libres);
        System.out.println("Robot (R): " + contadorRobot);
        System.out.println("Final (F): " + contadorFinal);
        System.out.println("Baterias (B): " + contadorBaterias);
        System.out.println("Obstaculos (X): " + contadorObstaculos);


    }
}


