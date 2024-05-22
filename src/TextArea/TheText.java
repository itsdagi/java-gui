package TextArea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TheText extends JFrame implements ActionListener {
   // JPasswordField password;
    JTextField text;
    JButton button;
    JRadioButton hotDog;
    JRadioButton humBurger;
    JRadioButton pizza;
    TheText() {

//        new JPasswordField();
//        password.setPreferredSize(new Dimension(100, 40));
//        password.setEchoChar('*');
//        password.setBackground(Color.lightGray);

        TextField text = new TextField();
        text.setPreferredSize(new Dimension(100, 40));
        text.setBackground(Color.lightGray);

        JButton button =   new JButton("Submit");
        button.setPreferredSize(new Dimension(100, 30));
        button.setFocusable(false);
        button.addActionListener(this);
        //radio
        hotDog = new JRadioButton("Hot Dog");
        humBurger = new JRadioButton("Hum Burger");
        pizza = new JRadioButton("Pizza");

        pizza.addActionListener(this);
        humBurger.addActionListener(this);
        hotDog.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(hotDog);
        group.add(humBurger);
        group.add(pizza);



        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.add(text);
        this.add(hotDog);
        this.add(humBurger);
        this.add(pizza);
       // this.add(password);
        this.add(button);
        this.pack();
    }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == hotDog) {
                System.out.println("Hot Dog is selected");
            }
            else if(e.getSource() == humBurger){
                System.out.println("Hum Burger is selected");
            }
            else if(e.getSource() == pizza) {
                System.out.println("Pizza is selected");
            }
        }
    }


