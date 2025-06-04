import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DiaDaSemana diaEnum;

        System.out.println("Escolha o dia da semana:");

        //Percorrer o enum e exibir os dias
        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia);
        }
        String diaTexto = input.next();
        diaEnum = DiaDaSemana.valueOf(diaTexto.toUpperCase());

        System.out.println("O dia escolhido foi: " + diaEnum);

        // Exemplo de uso do método estático
        FormaDePagamento formaPag = FormaDePagamento.DINHEIRO;
        System.out.println("Forma de pagamento: " + formaPag.getDescricao() + " (Código: " + formaPag.getCodigo() + ")");
    }
}
