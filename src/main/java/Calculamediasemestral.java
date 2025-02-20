import java.util.Scanner;

public class Calculamediasemestral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obter valores de PC&R e GS do usuário
        System.out.print("Digite o valor da nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite o valor da nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite sua nota do trabalho: ");
        double trabalho = scanner.nextDouble();

        // Cálculo de MS
        double ms = (nota1 * 0.4) + (nota2 * 0.4) + (trabalho * 0.2);

        if (ms >= 7) {
            System.out.print("Você passou de ano!");
        } else {
            System.out.print("Você ficou de exame :/ \n Quanto você tirou no exame? ");
            double exame = scanner.nextDouble();

            double me = (ms + exame) / 2;

            if (me >= 5) {
                System.out.print("Você foi aprovado após o exame!");

            } else {
                System.out.print("Você foi reprovado após o exame.");
            }
        }
        // Fechar o scanner
        scanner.close();
    }
}