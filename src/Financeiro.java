public class Financeiro {
    private double totalProduto;
    private double totalDiario;
    public static double folhaPagamento=0;
    private static String[][] funcionarios = new String[100][3];

    public void adicionarFuncionario(Funcionario funcionario){
        preencherFuncionarios(funcionario);
        folhaPagamento += funcionario.getSalario();
    }
    public void preencherFuncionarios(Funcionario funcionario){
        funcionarios[Funcionario.numFuncionarios][0] = funcionario.getNome();
        funcionarios[Funcionario.numFuncionarios][1] = funcionario.getCpf();
        funcionarios[Funcionario.numFuncionarios][2] = ""+funcionario.getSalario();
    }
    public void dadosFolhaPagamento(){
        for(int i=1;i<Funcionario.numFuncionarios+1;i++){
            System.out.println("Nome: "+funcionarios[i][0]+ " | CPF: "+funcionarios[i][1]+" | Salario: "+ funcionarios[i][2]);
        }
    }

    public String getFolhaPagamento(){
        return "Folha de pagamento: "+folhaPagamento;
    }
    
}