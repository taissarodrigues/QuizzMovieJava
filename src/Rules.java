import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    // Constructor
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Bem vindo " + name + " ao QuizMovie");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Arial", Font.BOLD, 28));
        heading.setForeground(Color.BLACK); // Changed to black
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Arial", Font.PLAIN, 16));
        rules.setText(
          "<html>" + 
            "1. Responda as perguntas diretamente." + "<br><br>" +
            "2. Nao tem problema se voce errar alguma coisa." + "<br><br>" +
"            3. Boa sorte e divirta-se!" + "<br><br>" +
          "</html>"
        );
        rules.setForeground(Color.BLACK); 
        add(rules);

        back = new JButton("Sair");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(Color.RED); 
        back.setForeground(Color.BLACK); 
        back.addActionListener(this);
        add(back);

        start = new JButton("Iniciar");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(Color.RED); 
        start.setForeground(Color.BLACK); 
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true); 
        // Set visibility at the end
    }

    // ActionPerformed method for button actions
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name); 
        } else {
            setVisible(false);
            new Login();
        }
    }

    // Main method
    public static void main(String[] args) {
        new Rules("User");
    }
}
