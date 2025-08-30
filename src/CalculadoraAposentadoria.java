import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");
        String sexoStr = JOptionPane.showInputDialog("Digite seu sexo (H/M):");
        String anosContribuicaoStr = JOptionPane.showInputDialog("Digite seus anos de contribuição:");

        int idade = Integer.parseInt(idadeStr);
        char sexo = sexoStr.toUpperCase().charAt(0);
        int anosContribuicao = Integer.parseInt(anosContribuicaoStr);

        String resultado = verificarAposentadoria(idade, sexo, anosContribuicao);

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static String verificarAposentadoria(int idade, char sexo, int anosContribuicao) {
        // Regras de aposentadoria
        int idadeMinima = (sexo == 'H') ? 65 : 62;
        int tempoMinimoContribuicao = (sexo == 'H') ? 35 : 30;

        boolean porIdade = idade >= idadeMinima;
        boolean porTempo = anosContribuicao >= tempoMinimoContribuicao;

        if (porIdade || porTempo) {
            return "Você já pode se aposentar!";
        } else {
            int anosFaltandoIdade = idadeMinima - idade;
            int anosFaltandoContribuicao = tempoMinimoContribuicao - anosContribuicao;

            int anosParaAposentar = Math.max(anosFaltandoIdade, anosFaltandoContribuicao);

            return String.format("Faltam %d anos para você se aposentar.", anosParaAposentar);
        }
    }
}