import javax.swing.JOptionPane;

public class SistemaAvaliacao {
    public static void main(String[] args) {
        String nota1Str = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
        String nota2Str = JOptionPane.showInputDialog("Digite a nota da segunda prova:");
        String notaTrabalhoStr = JOptionPane.showInputDialog("Digite a nota do trabalho:");

        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);
        double notaTrabalho = Double.parseDouble(notaTrabalhoStr);

        double media = (nota1 + nota2 + notaTrabalho) / 3;
        String situacao = media >= 6 ? "APROVADO" : "REPROVADO";

        String mensagem = String.format("Média: %.2f%nSituação: %s", media, situacao);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}