import java.util.Scanner;
import static java.lang.Math.*;

public class CalculoAlcance {

    private static final double GRAVIDADE = 9.8;

    public static double selecionarVelocidade(Scanner scanner) {
        System.out.println("Escolha o tanque:");
        System.out.println("1 - M1 Abrams (~1700 m/s)");
        System.out.println("2 - Obuseiro M109 (~600 m/s)");
        System.out.println("3 - Schwerer Gustav (~820 m/s)");
        System.out.print("Digite a opção: ");

        switch (scanner.nextLine()) {
            case "1": return 1700.0;
            case "2": return 600.0;
            case "3": return 820.0;
            default:
                System.out.println("Opção inválida, usando valor padrão (15 m/s).");
                return 15.0;
        }
    }

    public static double calcularAlcance(double v0, double angulo) {
        double rad = toRadians(angulo);
        return (v0 * v0 * sin(2 * rad)) / GRAVIDADE;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double v0 = selecionarVelocidade(scanner);

            System.out.print("Digite o ângulo de lançamento (graus): ");
            double angulo = scanner.nextDouble();

            double alcance = calcularAlcance(v0, angulo) / 1000.0;

            System.out.printf("Para v0 = %.1f m/s e ângulo = %.1f°, alcance = %.2f km%n",
                    v0, angulo, alcance);
        }
    }
}
