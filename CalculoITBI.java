import javax.swing.JOptionPane;

public class CalculoITBI {
    public static void main(String[] args) {
        // Entrada de dados
        double valorTransacao = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor da transação:"));
        double valorVenal = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor venal do imóvel:"));
        double percentual = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o percentual do imposto (ex: 3):"));

        // Definição da base de cálculo (maior valor)
        double baseCalculo = Math.max(valorTransacao, valorVenal);

        // Cálculo do imposto
        double imposto = baseCalculo * percentual / 100.0;

        // Saída
        JOptionPane.showMessageDialog(null,
                "Base de cálculo: R$ " + baseCalculo +
                "\nValor do imposto a pagar: R$ " + imposto);
    }
}
