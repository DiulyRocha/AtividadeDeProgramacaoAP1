import javax.swing.JOptionPane;

public class CalculadoraDeITBI {

    public static void main(String[] args) {
        try {
            // Entrada de dados usando JOptionPane
            String valorTransacaoStr = JOptionPane.showInputDialog("Digite o valor de transação do imóvel:");
            String valorVenalStr = JOptionPane.showInputDialog("Digite o valor venal do imóvel:");
            String porcentagemITBIStr = JOptionPane.showInputDialog("Digite a porcentagem do ITBI:");

            // Conversão das entradas para double
            double valorTransacao = Double.parseDouble(valorTransacaoStr);
            double valorVenal = Double.parseDouble(valorVenalStr);
            double porcentagemITBI = Double.parseDouble(porcentagemITBIStr);

            // Determina o maior valor entre o valor de transação e o valor venal
            double maiorValor = Math.max(valorTransacao, valorVenal);

            // Calcula o imposto ITBI
            double imposto = maiorValor * (porcentagemITBI / 100);

            // Exibe o resultado
            JOptionPane.showMessageDialog(null,
                    String.format("Maior valor considerado: R$ %.2f%nImposto ITBI: R$ %.2f", maiorValor, imposto),
                    "Resultado do Cálculo",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            // Trata entrada inválida
            JOptionPane.showMessageDialog(null,
                    "Por favor, insira valores numéricos válidos.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}

/* Teste simples de valores para testar se a calculadora está funcionado
valor de transação do imóvel = 200000
valor venal do móvel = 180000
porcentagem ITBI = 2

O resultado deve ser:
Maior valor considerado = R$200.000,00
Imposto de ITBI = R$4.000,00
 */