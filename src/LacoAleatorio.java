import java.util.Random;
import java.util.Scanner;

public class LacoAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numero;
        int soma = 0;

        System.out.println("Escolha um numero de 1 a 6");
        numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
            int numeroSorteado = random.nextInt(1, 7);

            soma += numeroSorteado;

            System.out.printf("O número sorteado foi %d. \n", numeroSorteado);
        }
        System.out.printf("A soma dos números sorteados é %d \n ", soma);
    }
}
