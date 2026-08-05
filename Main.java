import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        String nome;
        boolean nomeValido;
        String caracteresPermitidos = "[\\p{L}\\p{M} ]+";

        do {
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine().trim();

            if (nome.isBlank()) {
                System.out.println("O nome não pode ficar vazio.");
                nomeValido = false;
            } else if (nome.length() < 3) {
                System.out.println("O nome deve ter pelo menos 3 caracteres.");
                nomeValido = false;
            } else if (nome.length() > 50) {
                System.out.println("O nome não pode ter mais de 50 caracteres.");
                nomeValido = false;
            } else if (!nome.matches(caracteresPermitidos)) {
                System.out.println("O nome contém caracteres não permitidos.");
                nomeValido = false;
            } else {
                nomeValido = true;
            }
            } while (!nomeValido);

        System.out.println("Olá, " + nome + "!");

        scanner.close();
    }
}
