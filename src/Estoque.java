import java.util.ArrayList;
import java.util.List;
public class Estoque {
    List<CadastroProduto> produtosClientes = new ArrayList<>();
    Estoque(){
        System.out.println("Estoque aberto");
    }
    public int control(){
        return produtosClientes.size();
    }
    public boolean contemProduto(String nomeProduto){
        boolean itsIn = false;
        for (int i = 0; i < control(); i++) {
            if(produtosClientes.get(i).getNomeProduto() == nomeProduto){
                itsIn = true;
            } else {
                itsIn = false;
            }
        }
        return itsIn;
    }
    //string para classe cadastroProduto
    public boolean produtoDados(String nomeProduto){
        if(!contemProduto(nomeProduto)){
            System.out.println("produto nao cadastrado!");
            return false;
        }
        for(int x = 0; x < control(); x++){
            if(nomeProduto == produtosClientes.get(x).getNomeProduto()){
                System.out.println("Dados do produto " + produtosClientes.get(x).getNomeProduto() + ":");
                System.out.println(" -Preço unitário:  R$ " + produtosClientes.get(x).getPrecoUnitario());
                System.out.println(" -Codigo de barras: " + produtosClientes.get(x).getCodigoBarra());
            } 
        } 
        return true;
    }
            // if(nomeProduto == produtos.get(x).getNomeProduto()){
               
            // }
}
        
