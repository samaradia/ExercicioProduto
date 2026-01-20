import java.util.ArrayList;

public class TestePrincipal {
    public static void main(String[] args) {
        ArrayList<Produto>listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Garfo", 4.90,7);
        Produto produto2 = new Produto("Panela", 50.90, 3);
        Produto produto3 = new Produto("Copo de vidro", 5.60, 9);
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("O tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Primeira da lista: " + listaDeProdutos.get(0).getNome());

        for (Produto produto: listaDeProdutos) {
            System.out.println(produto);
        }

        Produto produtoNovo = new Produto("Novo produto", 23.40, 5);
        System.out.println(produtoNovo);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");
        System.out.println(produtoPerecivel);


    }
}
