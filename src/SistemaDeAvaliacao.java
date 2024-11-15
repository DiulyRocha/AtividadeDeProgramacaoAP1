import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {

    public static void main(String[] args) {
        try {
            // Inserindo as notas
            String nota1Str = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
            String nota2Str = JOptionPane.showInputDialog("Digite a nota da segunda prova:");
            String trabalhoStr = JOptionPane.showInputDialog("Digite a nota do trabalho:");

            // Conversão para double
            double nota1 = Double.parseDouble(nota1Str);
            double nota2 = Double.parseDouble(nota2Str);
            double notaTrabalho = Double.parseDouble(trabalhoStr);

            // Calculando a média
            double media = (nota1 + nota2 + notaTrabalho) / 3;

            // Verificando  a situação do aluno
            String status = (media >= 6) ? "Aprovado" : "Reprovado";

            // Exibe o resultado
            JOptionPane.showMessageDialog(null,
                    String.format("Média: %.2f%nSituação: %s", media, status),
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            // Trata entradas inválidas
            JOptionPane.showMessageDialog(null,
                    "Por favor, insira apenas valores numéricos válidos.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}

/* Tentanto a calculadora
Nota 1 = 6
Nota 2 = 7
Trabalho = 5
            Média = 6
            Situação: Aprovado

 Nota 1 = 5
 Nota 2 = 4
 Trabalho = 3
            Média = 4
            Situação: Reprovado
 */