import javax.swing.JOptionPane;

public class GeradorTabuada {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Digite um número para gerar a tabuada:");
        int numero = Integer.parseInt(numeroStr);

        StringBuilder tabuada = new StringBuilder();
        tabuada.append("Tabuada do ").append(numero).append(":\n");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabuada.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
        }

        JOptionPane.showMessageDialog(null, tabuada.toString());
    }
}