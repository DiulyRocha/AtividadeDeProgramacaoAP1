import javax.swing.JOptionPane;

public class GeradorDeTabuada {

    public static void main(String[] args) {

        //Solicitando ao usuário um número para a tabuada
        String input = JOptionPane.showInputDialog("Digite um número para gerar a tabuada:");
        int numero;

        //verificando se o usuário inseriu um número válido
        try {
            numero = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido,", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Gera a tabuada do núemro 1 a 10
        StringBuilder tabuada = new StringBuilder("Tabuada do número" + numero + ":\n");
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            tabuada.append(numero).append("x").append(i).append(" = ").append(resultado).append("\n");
        }

        //Exibindo a tabuada
        JOptionPane.showMessageDialog(null, tabuada.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }
}

/*
Teste - número 5
    Saída: Tabuada do 5
    5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50

 */