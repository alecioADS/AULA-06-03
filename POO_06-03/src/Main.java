import java.util.Scanner;

public class Main {
    public static String inverterString(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto ou palavra: ");
        String texto = scanner.nextLine();
        System.out.println("Texto ou palavra invertido: " + inverterString(texto));
    }
}