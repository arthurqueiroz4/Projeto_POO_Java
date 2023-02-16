import java.util.ArrayList;
import java.util.List;
public class Estoque {
    List<String> produtos = new ArrayList<>();
    Estoque(){
        System.out.println("Estoque aberto");
    }
    public String numProdutos(){
        return "Produtos em estoque: "+ produtos.size();
    }
    public int control(){
        return produtos.size();
    }
    //string para classe cadastroProduto
    public void produtoDados(List<CadastroProduto> Produto, String nomeProduto){
        for(int x = 0; x < control(); x++){
            if(nomeProduto == Produto.get(x).getNomeProduto()){
               if(produtos.contains(Produto.get(x).getNomeProduto())){
                    System.out.println("Dados do produto " + Produto.get(x).getNomeProduto() + ":");
                    System.out.println("-Preço unitário: " + Produto.get(x).getPrecoUnitario() + " R$");
                    System.out.println("-Codigo de barras: " + Produto.get(x).getCodigoBarra());
                } 
            }
        }
        if(produtos.contains(nomeProduto) == false){
            System.out.println("produto não cadastrado!");
        }
        
    }
}
