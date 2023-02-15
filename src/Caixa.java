public class Caixa {
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
}
