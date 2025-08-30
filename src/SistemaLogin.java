import javax.swing.JOptionPane;

public class SistemaLogin {
    public static void main(String[] args) {
        final String LOGIN_CORRETO = "java8";
        final String SENHA_CORRETA = "java8";

        int tentativas = 3;
        boolean acessoPermitido = false;

        while (tentativas > 0 && !acessoPermitido) {
            String login = JOptionPane.showInputDialog("Digite o login:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");

            if (LOGIN_CORRETO.equals(login) && SENHA_CORRETA.equals(senha)) {
                acessoPermitido = true;
                JOptionPane.showMessageDialog(null, "Acesso permitido! Bem-vindo ao sistema.");
            } else {
                tentativas--;
                if (tentativas > 0) {
                    JOptionPane.showMessageDialog(null,
                            "Login ou senha incorretos! Tentativas restantes: " + tentativas);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Número máximo de tentativas excedido! Acesso bloqueado.");
                }
            }
        }
    }
}