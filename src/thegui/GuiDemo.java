package thegui;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.*;
public class GuiDemo{
    public static void main(String[] args){
     Border border = BorderFactory.createLineBorder(Color.green,3);
    JFrame frame = new JFrame();
    ImageIcon img = new ImageIcon("C:\\Users\\dagim\\IdeaProjects\\finalexam\\src\\thegui\\images.png");
    JLabel la = new JLabel();
    la.setText("Bro, Whats up?");
    la.setIcon(img);
    la.setHorizontalTextPosition(JLabel.CENTER);
    la.setVerticalTextPosition(JLabel.TOP);
    la.setForeground(Color.magenta);
    la.setFont(new Font("MV Boli", Font.PLAIN, 20));
    la.setIconTextGap(-30);
    la.setBackground(Color.black);
    la.setOpaque(true);
    la.setBorder(border);
    la.setVerticalAlignment(JLabel.CENTER);
    la.setHorizontalAlignment(JLabel.CENTER);
     la.setBounds(50, 50, 250, 250);

    frame.setSize(420, 420);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setLayout(null);
    frame.add(la);

    }
}