import javax.swing.JOptionPane;

public class CalculadoraDeAposentadoria {

    public static void main(String[] args) {
        try {
            // Inserindo os dados
            String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");
            String sexo = JOptionPane.showInputDialog("Digite seu sexo (M para masculino, F para feminino):");
            String anosContribuicaoStr = JOptionPane.showInputDialog("Digite seus anos de contribuição:");

            // Conversão para números
            int idade = Integer.parseInt(idadeStr);
            int anosContribuicao = Integer.parseInt(anosContribuicaoStr);

            // Regras para se aposentar
            int idadeAposentadoria = (sexo.equalsIgnoreCase("M")) ? 65 : 62;
            int tempoContribuicaoNecessario = (sexo.equalsIgnoreCase("M")) ? 35 : 30;

            // Verificando se pode se aposentar por idade ou tempo de contribuição
            boolean podeAposentarPorIdade = idade >= idadeAposentadoria;
            boolean podeAposentarPorContribuicao = anosContribuicao >= tempoContribuicaoNecessario;

            String resultado;

            if (podeAposentarPorIdade || podeAposentarPorContribuicao) {
                resultado = "Parabéns! Você já pode se aposentar.";
            } else {
                int anosFaltandoIdade = Math.max(0, idadeAposentadoria - idade);
                int anosFaltandoContribuicao = Math.max(0, tempoContribuicaoNecessario - anosContribuicao);

                resultado = String.format(
                        "Você ainda não pode se aposentar.\nFaltam %d anos para atingir a idade mínima.\nFaltam %d anos para atingir o tempo de contribuição.",
                        anosFaltandoIdade, anosFaltandoContribuicao
                );
            }

            // Exibe o resultado
            JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            // Trata entradas inválidas
            JOptionPane.showMessageDialog(null,
                    "Por favor, insira valores numéricos válidos para idade e anos de contribuição.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}


/* testando a calculadora

Resultado negativo:
Idade 60
Sexo M
Contribuição 20
    Resultado: "Você ainda não pode se aposentar.
Faltam 5 anos para atingir a idade mínima.
Faltam 15 anos para atingir o tempo de contribuição."


Resultado Positivo:
idade 55
Sexo F
Contribuição 32
    Resuntado: "Parabéns! Você já pode se aposentar."
 */