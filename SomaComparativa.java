import java.util.Scanner;

public class SomaComparativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("Digite o número A: ");
        a = scanner.nextInt();

        System.out.print("Digite o número B: ");
        b = scanner.nextInt();

        System.out.print("Digite o número C: ");
        c = scanner.nextInt();

        int soma = a + b;

        System.out.println(a + " + " + b + " = " + soma);

        if (soma > c) {
            System.out.println("A Soma de A + B é Maior do que C");
        } else if (soma < c) {
            System.out.println("A Soma de A + B é Menor do que C");
        } else {
            System.out.println("A Soma de A + B é Igual a C");
        }

        scanner.close();
    }
}

