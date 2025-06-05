import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dicionario = new HashMap<>();
        dicionario.put("Palavra1", "Significado da Palavra 1");
        dicionario.put("Palavra2", "Significado da Palavra 2");
        dicionario.put("Palavra3", "Significado da Palavra 3");
        dicionario.put("Palavra4", "Significado da Palavra 4");

        // Exemplo de uso do dicionário
        // Verifica se uma palavra está no dicionário
        if (dicionario.containsKey("Palavra1")) {
            System.out.println("A palavra 'Palavra1' está no dicionário.");
        } else {
            System.out.println("A palavra 'Palavra1' não está no dicionário.");
        }


        // Exemplo de nome de produto e quantidade
        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Maçã", 10);
        estoque.put("Uva", 30);
        estoque.put("Melão", 20);
        estoque.put("Laranja", 15);

        for(String chave : estoque.keySet()) {
            System.out.println("Produto: " + chave + ", Quantidade: " + estoque.get(chave));
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-");
        // Verifica a quantidade de um produto específico
        System.out.println("Quantidade de Maçãs no estoque: " + estoque.get("Uva"));

    }
}
