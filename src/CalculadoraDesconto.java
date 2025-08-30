import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor do produto: R$ ");
            double valorProduto = scanner.nextDouble();

            System.out.print("Digite a porcentagem de desconto: ");
            double porcentagemDesconto = scanner.nextDouble();

            double valorDesconto = valorProduto * (porcentagemDesconto / 100);
            double precoFinal = valorProduto - valorDesconto;

            System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
            System.out.printf("Preço final: R$ %.2f%n", precoFinal);
        }
    }
}
