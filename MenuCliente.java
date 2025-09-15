import java.util.Scanner;

public class MenuCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU DE OPÇÕES:");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Excluir cliente");
        System.out.println("3 - Sair");
        System.out.print("Digite a opção desejada: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Cliente cadastrado com sucesso!");
                break;
            case 2:
                System.out.println("Cliente excluído com sucesso!");
                break;
            case 3:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
