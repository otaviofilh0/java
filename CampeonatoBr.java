import java.util.Scanner;

public class CampeonatoBr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite os pontos do líder: ");
        int lider = sc.nextInt();

        System.out.print("Digite os pontos do lanterna: ");
        int lanterna = sc.nextInt();

        // Diferença de pontos
        int diferenca = lider - lanterna;

        // Cálculo do número de vitórias necessárias
        int vitorias = (int) Math.ceil(diferenca / 3.0);

        // Saída
        System.out.println("O lanterna precisa de " + vitorias + " vitórias para alcançar ou ultrapassar o líder.");

        sc.close();
    }
}
