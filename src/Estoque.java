import java.util.ArrayList;
import java.util.List;
public class Estoque {
    List<CadastroProduto> produtosEstoque = new ArrayList<>();
    Estoque(){
        System.out.println("Estoque aberto");
    }
    public int control(){
        return produtosEstoque.size();
    }
    public boolean contemProduto(String codigoBarra){
        boolean itsIn = false;
        for (int i = 0; i < control(); i++) {
            if(produtosEstoque.get(i).getCodigoBarra() == codigoBarra){
                itsIn = true;
            }
        }
        return itsIn;
    }
    //string para classe cadastroProduto
    public boolean produtoDados(String codigoBarra){
        if(!contemProduto(codigoBarra)){
            System.out.println("produto nao cadastrado!");
            return false;
        }
        for(int x = 0; x < control(); x++){
            if(codigoBarra == produtosEstoque.get(x).getNomeProduto()){
                System.out.println("Dados do produto " + produtosEstoque.get(x).getNomeProduto() + ":");
                System.out.println(" -Preço unitário:  R$ " + produtosEstoque.get(x).getPrecoUnitario());
                System.out.println(" -Codigo de barras: " + produtosEstoque.get(x).getCodigoBarra());
            } 
        } 
        return true;
    }

    public void todosProdutos(){
        for (int i = 0; i < control(); i++) {
            System.out.println(produtosEstoque.get(i).getNomeProduto());
        }
    }
    public String getNome(String codigoBarra){
        String nomeProduto="aaa";
        for(int i=0;i<control();i++){
            if (produtosEstoque.get(i).getCodigoBarra() == codigoBarra){
                nomeProduto=produtosEstoque.get(i).getNomeProduto();
            }
        }
        return nomeProduto;
    }
    public double getPreco(String codigoBarra){
        double precoProduto=0;
        for(int i=0;i<control();i++){
            if (produtosEstoque.get(i).getCodigoBarra() ==codigoBarra){
                precoProduto=produtosEstoque.get(i).getPrecoUnitario();
            }
        }
        return precoProduto;
    }
            // if(nomeProduto == produtos.get(x).getNomeProduto()){
               
            // }
}
        
