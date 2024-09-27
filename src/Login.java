import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {  

    // Declare JTextField and JButton
    private JTextField tfname;
    private JButton rules;
    private JButton back; 
    // Constructor
    Login() {
        // Configure the window
        setTitle("Movie Quiz"); 
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); 

        // Load the background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, -50, 600, 600); 
        add(image);

        // Header
        JLabel heading = new JLabel("Movie Quiz");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Arial", Font.BOLD, 40));
        heading.setForeground(Color.BLACK); 
        add(heading);
        
        // Name label
        JLabel name = new JLabel("Entre com seu name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Arial", Font.BOLD, 18));
        name.setForeground(Color.BLACK);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Arial", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Regras");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(Color.RED); 
        rules.setForeground(Color.BLACK); 
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Sair");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(Color.RED); 
        back.setForeground(Color.BLACK); 
        back.addActionListener(this);
        add(back);

       
        setSize(1200, 500); 
        setLocation(200, 150);
        setVisible(true); // Make the window visible
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] Strings) {
        new Login();
    }
}
