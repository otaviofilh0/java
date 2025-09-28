import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

    System.out.println("--- Calculadora de IMC ---");

    System.out.print("digite seu peso em kg: ");
double peso = scanner.nextDouble();

    System.out.print("digite sua altura em metros: ");

    double altura = scanner.nextDouble();

    double imc = peso/ (altura * altura);
    System.out.print("Seu IMC é: " + imc);

    scanner.close();


    }
}