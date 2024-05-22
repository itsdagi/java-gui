package TextArea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TheText implements ActionListener{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPasswordField password = new JPasswordField();
        password.setPreferredSize(new Dimension(100, 40));
        password.setEchoChar('*');
        password.setBackground(Color.lightGray);

        JTextField text = new JTextField();
        text.setPreferredSize(new Dimension(100, 60));
        text.setBackground(Color.lightGray);
        JButton button = new JButton("Submit");
        button.setPreferredSize(new Dimension(100, 30));
        button.setFocusable(false);
        button.addActionListener(this);


        frame.setVisible(true);
        frame.setLayout(new BoxLayout( frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(text);
        frame.add(password);
        frame.pack();

        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button){
                System.out.println("Welcome" + text.getText() + "Your password is: " + password.getText());
            }
    }


}

