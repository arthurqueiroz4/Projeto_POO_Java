import java.util.ArrayList;
import java.util.List;
public class Estoque {
    List<String> produtos = new ArrayList<>();
    Estoque(){
        System.out.println("Estoque aberto");
    }
    public String numProdutos(){
        return "Produtos em estoque: "+produtos.size();
    }
    public void produtoDados(String nomeProduto){
    }
}
