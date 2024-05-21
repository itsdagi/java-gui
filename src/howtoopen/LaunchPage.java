package howtoopen;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LaunchPage implements ActionListener{
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");
    public LaunchPage(){
       frame.setLayout(null);
         frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            button.setBounds(200, 200, 100, 50);
            frame.add(button);
            button.setFocusable(false);
            button.addActionListener(this);
    }
    @Override

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            frame.dispose();
            NewPage newPage = new NewPage();
        }
    }
}
