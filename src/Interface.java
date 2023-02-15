import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Interface {
    Interface(){
        JFrame telaLogin = new JFrame("Login");
        janelaLogin(telaLogin);
        componetesLogin(telaLogin);
    }
    
    private void janelaLogin(JFrame telaLogin){
        telaLogin.setVisible(true);
        telaLogin.setSize(600,400);
        telaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaLogin.setResizable(false);
        telaLogin.setLocationRelativeTo(null);
        telaLogin.setLayout(null);
    }
    private void componetesLogin(JFrame telaLogin){
        JLabel lb1 = new JLabel("Usuário: ");
        JLabel lb2 = new JLabel("Senha: ");
        lb1.setBounds(125, 120, 90, 50);
        lb2.setBounds(125, 150, 90, 50);
        lb1.setFont(new Font("Arial", Font.PLAIN, 20));
        lb2.setFont(new Font("Arial", Font.PLAIN, 20));
        telaLogin.add(lb1);
        telaLogin.add(lb2);

        JButton botaoEntrar = new JButton("Entrar");
        botaoEntrar.setVisible(true);
        botaoEntrar.setBounds(255, 275, 85, 25);
        botaoEntrar.setFont(new Font("Arial", Font.BOLD, 15));
        telaLogin.add(botaoEntrar);

        JTextField inputUser = new JTextField();
        JPasswordField inputPassword = new JPasswordField();

        
        inputUser.setBounds(220, 137, 100, 20);
        inputPassword.setBounds(220, 167, 100, 20);
        // inputPassword.setFont(new Font("Arial", Font.PLAIN, 15));
        // inputUser.setFont(new Font("Arial", Font.PLAIN, 15));
        
        telaLogin.add(inputUser);
        telaLogin.add(inputPassword);
        
    }
}
