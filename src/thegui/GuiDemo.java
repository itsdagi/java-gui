package thegui;
import javax.swing.*;
import java.awt.*;

public class GuiDemo{
    public static void main(String[] args){

    JLabel la = new JLabel();
    la.setText("Bro, Whats up?");
    MyFrame frame = new MyFrame();
    frame.add(la);
    }
}