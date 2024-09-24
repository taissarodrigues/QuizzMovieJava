import javax.swing.*;
import java.awt.*;

public class MainQuizApp {
    public static void main(String[] args) {
        // Criar o JFrame
        JFrame frame = new JFrame("Quiz de Filmes");
        
        // Configurar tamanho da janela (largura x altura)
        frame.setSize(400, 600);  // Ajuste para o tamanho desejado
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Criar um painel para o conteúdo
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);  // Muda a cor de fundo
        frame.add(panel, BorderLayout.CENTER);

        // Criar um rótulo (label) para o título
        JLabel titleLabel = new JLabel("Bem-vindo ao Quiz de Filmes!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Muda a fonte
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel);

        // Criar um botão para começar o quiz
        JButton startButton = new JButton("Começar o Quiz");
        startButton.setFont(new Font("Arial", Font.PLAIN, 18)); // Muda a fonte
        panel.add(startButton, BorderLayout.SOUTH);

        // Exibir a janela
        frame.setVisible(true);
    }
}
