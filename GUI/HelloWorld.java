package GUI;

import java.awt.*;
import java.awt.event.*;

public class HelloWorld extends Frame implements ActionListener {
    TextField t;

    public HelloWorld() {
        setSize(400, 500);
        setTitle("This is Titile");

        t = new TextField();
        t.setBounds(100, 30, 100, 50);

        Button b = new Button("Click");
        b.setBounds(200, 400, 20, 15);

        add(t);
        add(b);

        setVisible(true);
        setLayout(null);

        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        t.setText("Hello World");
    }

    public static void main(String[] args) {
        new HelloWorld();
    }
}
