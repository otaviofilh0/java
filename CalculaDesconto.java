import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculaDesconto {
    public static void main(String[] args) throws IOException {
        // Criando objeto para leitura
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Entrada de dados
        System.out.print("Digite o valor do produto: ");
        double valorProduto = Double.parseDouble(br.readLine());

        System.out.print("Digite a porcentagem de desconto: ");
        double percentualDesconto = Double.parseDouble(br.readLine());

        // Cálculo do desconto
        double valorDesconto = valorProduto * percentualDesconto / 100;
        double valorComDesconto = valorProduto - valorDesconto;

        // Saída de dados
        System.out.println("\nValor do desconto: R$ " + valorDesconto);
        System.out.println("Valor do produto com desconto: R$ " + valorComDesconto);
    }
}
