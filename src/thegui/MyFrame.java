package thegui;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    MyFrame(){

        this.setSize(420, 420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("My First Frame");
        this.setVisible(true);
        this.getContentPane().setBackground(Color.CYAN);

    }
}
