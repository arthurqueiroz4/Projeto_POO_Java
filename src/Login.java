import java.util.HashMap;
import java.util.Map;

public class Login {
    Map<String, String> users = new HashMap<>();

    public void cadastrarUser(String... login){
        String usuario;
        String senha;
        if (login.length==1){
            usuario = login[0];
            senha = "default";
            users.put(usuario, senha);
        } else if (login.length==2) {
            usuario = login[0];
            senha = login[1];
            users.put(usuario, senha);
        }
    }
    public void mostrarUser(){
        for(String i: users.keySet()){
            System.out.println("Usuario: "+i+"; Senha: "+users.get(i));
        }
    }
    public void trocarSenha(Funcionario funcionario, String senha){
        String nomeFuncionario = funcionario.getNome();
        users.put(nomeFuncionario, senha);
    }
    public boolean validaLogin(String usuario, String senha){
        boolean valida=false;
        for(String i: users.keySet()){
            if (usuario == i || senha == users.get(i)){
                valida=true;
            } else {
                valida=false;
            }
        }
        return valida;
    }
}