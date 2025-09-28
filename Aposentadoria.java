import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite seu sexo (M para masculino / F para feminino): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        System.out.print("Digite seus anos de contribuição: ");
        int contribuicao = sc.nextInt();

        // Definição dos requisitos
        int idadeMinima, tempoMinimo;
        if (sexo == 'F') {
            idadeMinima = 60;
            tempoMinimo = 30;
        } else {
            idadeMinima = 65;
            tempoMinimo = 35;
        }

        // Verificação das condições de aposentadoria
        if (idade >= idadeMinima || contribuicao >= tempoMinimo) {
            System.out.println("Você já tem o direito à aposentadoria.");
        } else {
            int faltaIdade = idadeMinima - idade;
            int faltaContribuicao = tempoMinimo - contribuicao;

            System.out.println("Ainda não pode se aposentar.");
            System.out.println("Faltam " + faltaIdade + " anos de idade ou "
                               + faltaContribuicao + " anos de contribuição.");
        }

        sc.close();
    }
}
