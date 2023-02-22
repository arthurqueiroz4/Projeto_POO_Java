import java.util.ArrayList;
import java.util.List;
public class Estoque {
    List<CadastroProduto> produtos = new ArrayList<>();
    Estoque(){
        System.out.println("Estoque aberto");
    }
    public String numProdutos(){
        return "Produtos em estoque: "+ produtos.size();
    }
    public int control(){
        return produtos.size();
    }
    public boolean contemProduto(String nomeProduto){
        boolean itsIn = false;
        for (int i = 0; i < control(); i++) {
            if(produtos.get(i).getNomeProduto() == nomeProduto){
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
                System.out.println("Dados do produto " + produtos.get(x).getNomeProduto() + ":");
                System.out.println("\tPreço unitário:  R$ " + produtos.get(x).getPrecoUnitario());
                System.out.println("\tCodigo de barras: " + produtos.get(x).getCodigoBarra());
                } 
        return true;
        }
            // if(nomeProduto == produtos.get(x).getNomeProduto()){
               
            // }
        }
        
