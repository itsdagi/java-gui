package TextArea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TheText extends JFrame implements ActionListener {
   // JPasswordField password;
    JTextField text;
    JButton button;
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


        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.add(text);
       // this.add(password);
        this.add(button);
        this.pack();
    }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                System.out.println(text.getText());
            }
        }
    }


