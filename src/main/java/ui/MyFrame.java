package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class MyFrame extends JFrame {
    public MyFrame() throws HeadlessException {
        JButton button = new JButton("click to change color");
        JLabel label = new JLabel("kjaflaksddjhlkasd");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.BLUE);
                System.out.println(123);
            }
        });
        this.getContentPane().add(button,BorderLayout.SOUTH);
        this.getContentPane().add(label,BorderLayout.NORTH);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
