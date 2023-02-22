import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //Interface x =new Interface();
        Financeiro financeiro = new Financeiro();
        Login login = new Login();
        Estoque estoque = new Estoque();

        //List<CadastroProduto> produtos = new ArrayList<CadastroProduto>();
        CadastroProduto produto1 = new CadastroProduto("Acucar", 2.50, "123456", estoque);
        CadastroProduto produto2 = new CadastroProduto("Maca", 1.50, "123436", estoque);
        CadastroProduto produto3 = new CadastroProduto("Maca grande", 3.50, "123436", estoque);
        
        Funcionario operador1 = new Funcionario("Jose", "000.000.000-00", 1201, financeiro, login);
        Funcionario operador2 = new Funcionario("Maria", "000.000.000-01", 1220, financeiro, login);
        Funcionario operador3 = new Funcionario("Arthur", "000.000.000-02", 1250, financeiro, login);
        Funcionario operador4 = new Funcionario("Silva", "000.010.000-02", 1250, financeiro, login);
        
        //Folha de pagamento em reais
        //System.out.println(financeiro.getFolhaPagamento());
        
       //Trocar senha do usuario 
       //login.trocarSenha(operador4, "123");
        
        //Dados dos Funcionarios:
        //financeiro.dadosFolhaPagamento();
        
        //Valida login
        // if(login.validaLogin("Arthur", "default")){
        //     System.out.println("Login Aceito");
        // } else {
        //     System.out.println("Login negado");
        // }

        //Mostra todos os usuarios cadastrados e suas senhas
        //login.mostrarUser();
        
        //Numero de produtos em estoque
        //System.out.println("Produtos em estoque: "+estoque.control());

        Caixa caixa = new Caixa(operador1, "default", login);
        estoque.produtoDados("Maca grande");

        
    }   
}   
    
