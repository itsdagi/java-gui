package howtoopen;

import javax.swing.*;

public class NewPage {
    JLabel label = new JLabel();;
    JFrame frame = new JFrame();
    public NewPage(){
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setText("New Page");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label.setBounds(0, 0, 100, 50);
        frame.add(label);
    }
}
