import javax.swing.JOptionPane;

public class MediaNotas {
    public static void main(String[] args) {
        // Entrada das notas
        double prova1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Prova 1:"));
        double prova2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Prova 2:"));
        double trabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do Trabalho:"));

        // Cálculo da média
        double media = (prova1 + prova2 + trabalho) / 3;

        // Verificação do resultado
        String resultado;
        if (media >= 6) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }

        // Exibição da saída
        JOptionPane.showMessageDialog(null, 
            "Média: " + String.format("%.2f", media) + "\nResultado: " + resultado);
    }
}
