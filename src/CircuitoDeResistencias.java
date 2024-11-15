import javax.swing.JOptionPane;

public class CircuitoDeResistencias {

    public static void main(String[] args) {
        try {
            // Entrada dos valores das resistências
            double[] resistencias = new double[4];

            for (int i = 0; i < resistencias.length; i++) {
                String entrada = JOptionPane.showInputDialog("Digite o valor da resistência " + (i + 1) + " (em ohms):");
                resistencias[i] = Double.parseDouble(entrada);
            }

            // Cálculo da resistência equivalente
            double resistenciaEquivalente = 0;
            for (double resistencia : resistencias) {
                resistenciaEquivalente += resistencia;
            }

            // Determinação da maior e menor resistência
            double maiorResistencia = resistencias[0];
            double menorResistencia = resistencias[0];

            for (double resistencia : resistencias) {
                if (resistencia > maiorResistencia) {
                    maiorResistencia = resistencia;
                }
                if (resistencia < menorResistencia) {
                    menorResistencia = resistencia;
                }
            }

            // Exibição dos resultados
            String resultado = String.format(
                    "Resistência Equivalente: %.2f ohms%nMaior Resistência: %.2f ohms%nMenor Resistência: %.2f ohms",
                    resistenciaEquivalente, maiorResistencia, menorResistencia
            );

            JOptionPane.showMessageDialog(null, resultado, "Resultados", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            // Tratamento de entradas inválidas
            JOptionPane.showMessageDialog(null,
                    "Por favor, insira valores numéricos válidos para as resistências.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}


/* Teste para saber se funcionou:
Resistência 1: 10
Resistência 2: 20
Resistência 3: 15
Resistência 4: 5
        Resultado:
        Resistência Equivalente: 50.00 ohms
        Maior Resistência: 20.00 ohms
        Menor Resistência: 5.00 ohms

 */

