import javax.swing.JOptionPane;

public class SistemaDeLogin {
    public static void main(String[] args) {

        // Credenciais pre definidas
        final String LOGIN_CORRETO = "java8";
        final String SENHA_CORRETA = "java8";

        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {

            //Solicitando o login e a senha
            String login = JOptionPane.showInputDialog("Digite o login:");
            String senha = JOptionPane.showInputDialog("Digite sua senha:");

            //Verificando se o login e a senhra estão corretos
            if (LOGIN_CORRETO.equals(login) && SENHA_CORRETA.equals(senha)) {
                JOptionPane.showMessageDialog(null, "Login bem sucedido! Bem vindo ao sistema.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return; //Encerra o programa caso o login seja bem sucedido.

            } else {
                tentativasRestantes--; //Reduz a quantidade de tentativas
                if (tentativasRestantes > 0) {
                    JOptionPane.showMessageDialog(null,
                            "Login ou senha incorretos. Voc}e tem " + tentativasRestantes + " tentativa(s) restante(s).",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null,
                            "Número máximo de tentativas excedido. Acesso bloqueado.",
                            "Bloqueado",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}

/*
Login: java8
Senha: java8
 */