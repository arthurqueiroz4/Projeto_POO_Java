import java.util.List;
import java.util.ArrayList;
public class Caixa extends Estoque{
    private static boolean isOpen=false;
    private Funcionario funcionario;
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
        double valor = 0;
        for(int i=0;i < estoque.control();i++){
            if (estoque.produtosClientes.get(i).getCodigoBarra() == codigoBarra){
                produtosClientes.add(estoque.produtosClientes.get(i).getPrecoUnitario());
            }
        } 
        for(int i= 0; i < produtosClientes.size(); i++){
            valor += produtosClientes.get(i);
        }
        System.out.println("SUBTOTAL: " + valor);
        
    }
}
