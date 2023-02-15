public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    public static int numFuncionarios=0;

    Funcionario(String nome, String cpf, double salario, Financeiro financeiro, Login login){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        controleFuncionario();
        financeiro.adicionarFuncionario(this);
        login.cadastrarUser(this.nome);
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void controleFuncionario(){
        numFuncionarios += 1;
    }
}
