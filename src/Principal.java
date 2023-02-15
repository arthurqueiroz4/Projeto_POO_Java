public class Principal {
    public static void main(String[] args) {
        //Interface x =new Interface();
        Financeiro financeiro = new Financeiro();
        Funcionario operador1 = new Funcionario("Jose", "000.000.000-00", 1201, financeiro);
        //financeiro.preencherFuncionarios();
        Funcionario operador2 = new Funcionario("Maria", "000.000.000-01", 1220, financeiro);
        //financeiro.preencherFuncionarios();
        Funcionario operador3 = new Funcionario("Arthur", "000.000.000-02", 1250, financeiro);
        Funcionario operador4 = new Funcionario("Silva", "000.010.000-02", 1250, financeiro);
        //financeiro.preencherFuncionarios();
        System.out.println(financeiro.getFolhaPagamento());
        
        //Dados dos Funcionarios:
        financeiro.dadosFolhaPagamento();
    }
}   
    
