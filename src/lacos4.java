import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class lacos4 {
    public static void main(String[] args) {
        int tentativas = 0;
        int numero;
        int sorteado = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite aqui um numero ");
        numero = scanner.nextInt();
        Random random = new Random(7);

        while (sorteado != numero) {
            sorteado = random.nextInt(1, 7);
            tentativas++;
            System.out.printf("numero sorteado foi %d \n", sorteado);
        }
        System.out.printf("O numero gasto de tentativas foi %d \n ", tentativas);


    }

}
