import java.awt.Color;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {  

    // Construtor
    Login() {
        // Configurações da janela
     //   setTitle("Tela de Login");//
        getContentPane().setBackground(Color.WHITE);
        setSize(1200, 500); // Define o tamanho da janela
        setLocation(200,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao fechar a janela

        setVisible(true);
    }

    // Método main
    public static void main(String[] args) {
        new Login();
    }
}
