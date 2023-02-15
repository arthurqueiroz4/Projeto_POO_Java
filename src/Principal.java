public class Principal {
    public static void main(String[] args) {
        //Interface x =new Interface();
        Financeiro financeiro = new Financeiro();
        Login login = new Login();
        Funcionario operador1 = new Funcionario("Jose", "000.000.000-00", 1201, financeiro, login);
        //financeiro.preencherFuncionarios();
        Funcionario operador2 = new Funcionario("Maria", "000.000.000-01", 1220, financeiro, login);
        //financeiro.preencherFuncionarios();
        Funcionario operador3 = new Funcionario("Arthur", "000.000.000-02", 1250, financeiro, login);
        Funcionario operador4 = new Funcionario("Silva", "000.010.000-02", 1250, financeiro, login);
        //financeiro.preencherFuncionarios();
        
        //Folha de pagamento em reais
        //System.out.println(financeiro.getFolhaPagamento());
        
       //Trocar senha do usuario 
       //login.trocarSenha(operador4, "123");
        
        //Dados dos Funcionarios:
        //financeiro.dadosFolhaPagamento();
        
        if(login.validaLogin("Arthur", "defafult")){
            System.out.println("Login Aceito");
        } else {
            System.out.println("Login negado");
        }

        //Mostra todos os usuarios cadastrados e suas senhas
        //login.mostrarUser();

        Caixa caixa = new Caixa(operador1, "default", login);
        
    }
}   
    
