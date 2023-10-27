package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int a = scanner.nextInt();
        System.out.println("Wprowadź: " + a + " liczb");
        double[] tab = new double[a];
        for (int i = 0; i < a; i++) {
            double b = scanner.nextDouble();
            tab[i] = b;
        }
        double sum = 0;
        for (double v : tab) {
            sum += v * v;
        }
        System.out.println("Suma kwadratów wynosi: " + sum);
    }
}
