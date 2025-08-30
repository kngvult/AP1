import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {
        String valorTransacaoStr = JOptionPane.showInputDialog("Digite o valor de transação do imóvel:");
        String valorVenalStr = JOptionPane.showInputDialog("Digite o valor venal do imóvel:");
        String porcentagemITBIStr = JOptionPane.showInputDialog("Digite a porcentagem do ITBI:");

        double valorTransacao = Double.parseDouble(valorTransacaoStr);
        double valorVenal = Double.parseDouble(valorVenalStr);
        double porcentagemITBI = Double.parseDouble(porcentagemITBIStr);

        double baseCalculo = Math.max(valorTransacao, valorVenal);
        double impostoITBI = baseCalculo * (porcentagemITBI / 100);

        String mensagem = String.format("Base de cálculo: R$ %.2f%nImposto ITBI: R$ %.2f",
                baseCalculo, impostoITBI);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}