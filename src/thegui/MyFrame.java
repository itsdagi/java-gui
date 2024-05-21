package thegui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame implements ActionListener {
    JButton button = new JButton("Click me");
    JLabel label;
    MyFrame(){
        label = new JLabel();
        ImageIcon img = new ImageIcon("C:\\Users\\dagim\\IdeaProjects\\finalexam\\src\\thegui\\point.png");
        ImageIcon img2 = new ImageIcon("C:\\Users\\dagim\\IdeaProjects\\finalexam\\src\\thegui\\wow.png");
        label.setIcon(img2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);
        this.setLayout(null);
        button.setIcon(img);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.addActionListener(this);
        button.setFocusable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
        button.setBounds(100, 100, 250, 100);
    }

    @Override
   public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            label.setVisible(true);
        }
    }
}
