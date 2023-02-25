import java.util.List;
import java.util.ArrayList;
public class Caixa {
    private static boolean isOpen;
    private static double valor;
    List<String> produtosClientesBarra = new ArrayList<String>();
    List<Double> produtosClientes = new ArrayList<Double>();

    Caixa(Funcionario funcionario, String senha, Login login){
        if(login.validaLogin(funcionario.getNome(), senha)){
            isOpen = true;
            System.out.println("Caixa aberto");
        } else {
            isOpen = false;
            System.out.println("Caixa fechado");
        }
    }
    public void caixaEstoque(String codigoBarra, Estoque estoque){
        //System.out.println(estoque.contemProduto(codigoBarra));
        valor = 0;
        for(int i=0;i < estoque.control();i++){
            if (estoque.produtosEstoque.get(i).getCodigoBarra() == codigoBarra){
                if (estoque.produtosEstoque.get(i).getQuantidade()>0){
                    produtosClientesBarra.add(estoque.produtosEstoque.get(i).getCodigoBarra());
                    produtosClientes.add(estoque.produtosEstoque.get(i).getPrecoUnitario());
                    estoque.produtosEstoque.get(i).setQuantidade(estoque.produtosEstoque.get(i).getQuantidade() - 1);
                } else {
                    System.out.println("Produto esgotado.");
                    return;
                }
            }
        } 
        for(int i= 0; i < produtosClientes.size(); i++){
            valor += produtosClientes.get(i);
        }
        System.out.println("SUBTOTAL: " + valor);
        //total += valor;        
    }

    // public void caixaEstoque(String codigoBarra, Estoque estoque){
    //     if (estoque.contemProduto(codigoBarra)){
    //         produtosClientes.add(codigoBarra);
    //         System.out.println(produtosClientes.size());
    //         this.subtotal(codigoBarra, estoque);
    //     } else {
    //         System.out.println("Sem estoque.");
    //     }
        
    // }

    // public void subtotal(String codigoBarra, Estoque estoque){
    //     for(int i=0;i<estoque.control();i++){
    //         //System.out.println(super.produtosEstoque.size());
    //         if (estoque.produtosEstoque.get(i).getCodigoBarra() == codigoBarra){
    //             valor += estoque.produtosEstoque.get(i).getPrecoUnitario();
    //             System.out.println("Subtotal = "+valor);
    //         }
    //     }
    // }

    public void abrirCaixa(Funcionario funcionario, String senha, Login login){
        valor=0;
        new Caixa(funcionario, senha, login);
    }

    public void fecharCaixa(Financeiro financeiro, Estoque estoque){
        this.notaFiscal(estoque);
        System.out.println("Fechando caixa...");
        isOpen = false;
        financeiro.totalCaixa(valor);
        System.out.println("Caixa fechado.");
        produtosClientes.clear();
        produtosClientesBarra.clear();
        System.out.println("Preço a pagar: "+valor);
        valor = 0;
    }

    public void notaFiscal(Estoque estoque){
        //List<CadastroProduto> notaFiscal = new ArrayList<>();
        System.out.println("Nota fiscal: ");
        for (int i = 0; i < produtosClientesBarra.size(); i++) {
            System.out.println("Produto ---> "+ estoque.getNome(produtosClientesBarra.get(i)));
            System.out.println("\tPreço: "+estoque.getPreco(produtosClientesBarra.get(i)));
        }
    }
}
