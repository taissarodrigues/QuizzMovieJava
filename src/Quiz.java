
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Quiz(String name) {
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
        questions[0][0] = "Quem dirigiu o filme 'A Origem'?";
        questions[0][1] = "Steven Spielberg";
        questions[0][2] = "Christopher Nolan";
        questions[0][3] = "James Cameron";
        questions[0][4] = "Quentin Tarantino";
        
        questions[1][0] = "Qual filme ganhou o Oscar de Melhor Filme em 2020?";
        questions[1][1] = "1917";
        questions[1][2] = "Coringa";
        questions[1][3] = "Parasita";
        questions[1][4] = "Era uma vez em... Hollywood";
        
        questions[2][0] = "Qual ator interpretou Tony Stark no Universo Cinematográfico da Marvel?";
        questions[2][1] = "Chris Evans";
        questions[2][2] = "Robert Downey Jr.";
        questions[2][3] = "Chris Hemsworth";
        questions[2][4] = "Mark Ruffalo";
        
        questions[3][0] = "Qual filme é o mais rentável de todos os tempos (até 2021)?";
        questions[3][1] = "Titanic";
        questions[3][2] = "Avatar";
        questions[3][3] = "Vingadores: Ultimato";
        questions[3][4] = "O Rei Leao";
        
        questions[4][0] = "Em que ano foi lancado o primeiro filme de Harry Potter?";
        questions[4][1] = "2001";
        questions[4][2] = "1999";
        questions[4][3] = "2003";
        questions[4][4] = "2005";
        
        questions[5][0] = "Qual dos seguintes filmes é dirigido por Quentin Tarantino?";
        questions[5][1] = "Pulp Fiction";
        questions[5][2] = "O Cavaleiro das Trevas";
        questions[5][3] = "A Origem";
        questions[5][4] = "O Poderoso Chefão";
        
        questions[6][0] = "Qual ator interpretou Jack em 'Titanic'?";
        questions[6][1] = "Leonardo DiCaprio";
        questions[6][2] = "Brad Pitt";
        questions[6][3] = "Tom Cruise";
        questions[6][4] = "Matt Damon";
        
        questions[7][0] = "Qual é o nome do reino em 'Frozen'?";
        questions[7][1] = "Arendelle";
        questions[7][2] = "Atlantida";
        questions[7][3] = "Narnia";
        questions[7][4] = "Wakanda";
        
        questions[8][0] = "Qual filme tem a musica 'My Heart Will Go On'?";
        questions[8][1] = "O Guarda-Costas";
        questions[8][2] = "Moulin Rouge!";
        questions[8][3] = "Titanic";
        questions[8][4] = "O Fantasma da Opera";
        
        questions[9][0] = "Em 'Matrix', qual é a cor da pilula que Neo toma?";
        questions[9][1] = "Azul";
        questions[9][2] = "Vermelha";
        questions[9][3] = "Verde";
        questions[9][4] = "Amarela";
        
        // answers
        answers[0][1] = "Christopher Nolan";
        answers[1][1] = "Parasita";
        answers[2][1] = "Robert Downey Jr.";
        answers[3][1] = "Vingadores: Ultimato";
        answers[4][1] = "2001";
        answers[5][1] = "Pulp Fiction";
        answers[6][1] = "Leonardo DiCaprio";
        answers[7][1] = "Arendelle";
        answers[8][1] = "Titanic";
        answers[9][1] = "Vermelha";
        
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Enviar");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("Ajuda");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Finalizar");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " segundos"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new Quiz("User");
    }
}