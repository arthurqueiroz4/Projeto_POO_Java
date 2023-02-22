public class Caixa extends Estoque{
    private static boolean isOpen=false;
    private Funcionario funcionario;
    
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
        for(int i=0;;i++){
            if (estoque.produtos.get(i).getCodigoBarra() == codigoBarra){
                
            }
            System.out.println(estoque.produtos.get(0));
        } 
        
    }
}
