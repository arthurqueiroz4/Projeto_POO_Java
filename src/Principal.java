import java.util.List;
import java.io.*;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        //Interface x =new Interface();
        Financeiro financeiro = new Financeiro();
        Login login = new Login();
        Estoque estoque = new Estoque();
        
        //pegar os dados dentro de um arquivo e colocar em nomeProduto, precoUnitario, codigoBarra e quantidade
        List<String> linha = new ArrayList<String>();
        File diretorio = new File("src"); 
        File arquivo = new File(diretorio, "produtos.txt");
        //teste caso queira saber se o arquivo existe
        //boolean existe = arquivo.exists();
        //System.out.println(existe);
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader( fr );
            while(br.ready()){
                String linha1 = br.readLine();
                linha.add(linha1);
            }
        } catch (IOException error) {
            error.printStackTrace();
        }
        
        for (int i = 0; i <linha.size(); i++) {
            String[] row= linha.get(i).split(", ");
            
            new CadastroProduto(row[0], Double.parseDouble(row[1]), row[2], estoque,Integer.parseInt(row[3]));
            
        }
            
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

        //Mostra todos os usuarios cadastrados e suas senhas
        //login.mostrarUser();
        
        //Numero de produtos em estoque
        //System.out.println("Produtos em estoque: "+estoque.control());

        
        
        //Mostra dados do produto
        //estoque.produtoDados("7891234567890");
        
        //produto lido pelo caixa
        
        System.out.println("/////////////////////////////////////////////");
        Caixa caixa = new Caixa(operador1, "default", login);

        caixa.vendaProdutos("7891234567890", estoque);
        caixa.vendaProdutos("7890123456789", estoque);
        caixa.vendaProdutos("6789012345678", estoque);
        caixa.vendaProdutos("6789012345678", estoque);
        
        caixa.fecharCaixa(financeiro, estoque);
        financeiro.faturamento();
        System.out.println("/////////////////////////////////////////////");
        
        Caixa caixa1 = new Caixa(operador4, "default", login);
       
        caixa1.vendaProdutos("4567890123456", estoque);
        caixa1.vendaProdutos("4567890123456", estoque);
        caixa1.vendaProdutos("7890123456789", estoque);

        caixa1.fecharCaixa(financeiro, estoque);
        financeiro.faturamento();
        System.out.println("////////////////////////////////////////////");
        
    
    }   
}   
    
