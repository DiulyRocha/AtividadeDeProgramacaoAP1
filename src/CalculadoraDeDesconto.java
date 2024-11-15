
import java.util.Scanner;

public class CalculadoraDeDesconto {
    public static void main(String[] argd) {
        Scanner scanner = new Scanner(System.in);

        //Solicitando o valor do produto

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        //Solicitando a porcentagem de desconto
        System.out.print("Digite o percentual de desconto: ");
        double porcentagemDesconto = scanner.nextDouble();

        //Calcula o valor do desconto e o preço final

        double valorDesconto = valorProduto * (porcentagemDesconto / 100);
        double precoFinal = valorProduto - valorDesconto;

        //Exibe o valor do destonco e o preço final

        System.out.printf("Valor do desnto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor do produto: R$ %.2f%n", precoFinal);

        //Fecha o scanner
        scanner.close();
    }
}
