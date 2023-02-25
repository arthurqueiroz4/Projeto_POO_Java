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
            if(codigoBarra.equals(produtosEstoque.get(i).getCodigoBarra())){  
                itsIn = true;
            }
        }
        return itsIn;
    }
    
    public boolean produtoDados(String codigoBarra){
        if(!contemProduto(codigoBarra)){
            System.out.println("produto nao cadastrado!");
            return false;
        }
        for(int x = 0; x < control(); x++){
            if(codigoBarra.equals(produtosEstoque.get(x).getCodigoBarra())){
                System.out.println("Dados do produto " + produtosEstoque.get(x).getNomeProduto() + ":");
                System.out.println(" -Preço unitário:  R$ " + produtosEstoque.get(x).getPrecoUnitario());  
                System.out.println(" -Quantidade: " + produtosEstoque.get(x).getQuantidade());
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
            if (codigoBarra.equals(produtosEstoque.get(i).getCodigoBarra())){   
                nomeProduto = produtosEstoque.get(i).getNomeProduto();
            }
        }
        return nomeProduto;
    }
    public double getPreco(String codigoBarra){
        double precoProduto=0;
        for(int i=0;i<control();i++){
            if (codigoBarra.equals(produtosEstoque.get(i).getCodigoBarra())){
                precoProduto = produtosEstoque.get(i).getPrecoUnitario();
            }
        }
        return precoProduto;
    }
}
        
