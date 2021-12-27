package GUI;
//export XAUTHORITY=/home/<you>/.Xauthority

import javax.swing.*;
import java.awt.event.*;

public class ClickButton implements ActionListener {
    JTextField t;
    JButton b;

    public ClickButton() {
        JFrame f = new JFrame("Click to display");
        f.setSize(400, 300);
        f.setLayout(null);
        
        //f.setResizable(true);


        t = new JTextField();
        t.setBounds(50, 50, 100, 30);
        t.setEditable(false);
        b = new JButton("Click");
        b.setBounds(70, 90, 40, 20);

        f.add(t);
        f.add(b);
        f.setVisible(true);

        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        t.setText("Hello");
    }
    public static void main(String[] args) {
        new ClickButton();
    }
}
