import javax.swing.JOptionPane;

public class CircuitoResistencias {
    public static void main(String[] args) {
        String r1Str = JOptionPane.showInputDialog("Digite o valor da primeira resistência (Ω):");
        String r2Str = JOptionPane.showInputDialog("Digite o valor da segunda resistência (Ω):");
        String r3Str = JOptionPane.showInputDialog("Digite o valor da terceira resistência (Ω):");
        String r4Str = JOptionPane.showInputDialog("Digite o valor da quarta resistência (Ω):");

        double r1 = Double.parseDouble(r1Str);
        double r2 = Double.parseDouble(r2Str);
        double r3 = Double.parseDouble(r3Str);
        double r4 = Double.parseDouble(r4Str);

        // Para resistências em série
        double resistenciaEquivalente = r1 + r2 + r3 + r4;

        // Encontrar maior e menor resistência
        double maior = Math.max(Math.max(r1, r2), Math.max(r3, r4));
        double menor = Math.min(Math.min(r1, r2), Math.min(r3, r4));

        String mensagem = String.format(
                "Resistência Equivalente: %.2f Ω%n" +
                        "Maior Resistência: %.2f Ω%n" +
                        "Menor Resistência: %.2f Ω",
                resistenciaEquivalente, maior, menor
        );

        JOptionPane.showMessageDialog(null, mensagem);
    }
}