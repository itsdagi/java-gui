package thegui;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    JButton button = new JButton("Click me");
    MyFrame(){


        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);

    }
}
