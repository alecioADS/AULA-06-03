import java.util.Scanner;

public class Main {
    public static int somar(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Soma: " + somar(num1, num2));
    }
}