import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.math.*;
public class Caixa {
    private static boolean isOpen;
    private static double valor;
    List<String> produtosClientesBarra = new ArrayList<String>();
    List<Double> produtosClientes = new ArrayList<Double>();

    Caixa(Funcionario funcionario, String senha, Login login){
        valor = 0;
        if(login.validaLogin(funcionario.getNome(), senha)){
            isOpen = true;
            System.out.println("Caixa aberto");
        } else {
            isOpen = false;
            System.out.println("Caixa fechado");
        }
    }
    public void vendaProdutos(String codigoBarra, Estoque estoque){
        
        valor = 0;
        boolean esgotado = false;
        for(int i=0;i < estoque.control();i++){
            if (codigoBarra.equals(estoque.produtosEstoque.get(i).getCodigoBarra())){
                if (estoque.produtosEstoque.get(i).getQuantidade()>0){
                    produtosClientesBarra.add(estoque.produtosEstoque.get(i).getCodigoBarra());
                    produtosClientes.add(estoque.produtosEstoque.get(i).getPrecoUnitario());
                    estoque.produtosEstoque.get(i).setQuantidade(estoque.produtosEstoque.get(i).getQuantidade() - 1);
                } else {
                    System.out.println("Produto esgotado.");
                    esgotado = true;  
                }
            }
        } 
        for(int i= 0; i < produtosClientes.size(); i++){
            valor += produtosClientes.get(i);
        }
        
        if(!esgotado){
            BigDecimal valorEditado = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
            System.out.println("SUBTOTAL: " + valorEditado);
        }          
    }

    public void fecharCaixa(Financeiro financeiro, Estoque estoque){
        this.notaFiscal(estoque);
        System.out.println("Fechando caixa...");
        isOpen = false;
        financeiro.totalCaixa(valor);
        System.out.println("Caixa fechado.");
        produtosClientes.clear();
        produtosClientesBarra.clear();
    }

    public void notaFiscal(Estoque estoque){
        BigDecimal valorEditado = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println();
        System.out.println("Nota fiscal: ");
        Map<String, Integer> ocorrencias = new HashMap<>();
        for (int i = 0; i < produtosClientesBarra.size(); i++) {
            String elemento = produtosClientesBarra.get(i);
            //caso a ocorrencia exista na lista o valor é adicionado +1, caso n contenha, recebe 1
            if (ocorrencias.containsKey(elemento)) {
                ocorrencias.put(elemento, ocorrencias.get(elemento) + 1);
            } else {
                ocorrencias.put(elemento, 1);
            }
        }
        // para cada chave há um valor de ocorrencia, então é possível realizar a informação de dados por aqui
        for (String chave : ocorrencias.keySet()) {
            int valor = ocorrencias.get(chave);
            if(valor == 1){
                System.out.println("Produto ---> " + estoque.getNome(chave));
                System.out.println("\tPreço: " + estoque.getPreco(chave));
            }else{
                System.out.println("Produto ---> " + estoque.getNome(chave) + " x" + valor);
                System.out.println("\tPreço: " + estoque.getPreco(chave) * valor);
            }
        }
        System.out.println();
        System.out.println("Preço a pagar: "+ valorEditado);
        System.out.println();
    }
}
