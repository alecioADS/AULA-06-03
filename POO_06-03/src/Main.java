import java.util.Scanner;

public class Main {
    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Número inválido! Digite um número positivo.");
        } else {
            System.out.println("Fatorial de " + num + " é " + calcularFatorial(num));

        }
    }
}