package thegui;
import javax.swing.*;
import java.awt.*;
import java.io.*;
public class GuiDemo{
    public static void main(String[] args){
    JFrame frame = new JFrame();
    ImageIcon img = new ImageIcon("C:\\Users\\dagim\\IdeaProjects\\finalexam\\src\\thegui\\images.png");
    JLabel la = new JLabel();
    la.setText("Bro, Whats up?");
    la.setIcon(img);
    la.setHorizontalTextPosition(JLabel.CENTER);
    la.setVerticalTextPosition(JLabel.TOP);
    la.setForeground(Color.magenta);
    la.setFont(new Font("MV Boli", Font.PLAIN, 20));

    frame.setResizable(false);
    frame.setSize(420, 420);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    frame.add(la);

    }
}