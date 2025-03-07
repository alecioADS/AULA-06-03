import java.util.Scanner;

public class Main {
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();
        System.out.println("O número " + num + " é par? " + ehPar(num));

    }
}