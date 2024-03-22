import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir os números
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        // Verificando e imprimindo o maior número
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os números são iguais.");
        }

        scanner.close();
    }
}
