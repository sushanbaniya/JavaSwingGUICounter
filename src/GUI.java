import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {

    int count = 0;

    JFrame frame;
    JLabel label;
    JPanel panel;

    public GUI() {

        frame = new JFrame();

        JButton button = new JButton("Smash it !!!");
        button.addActionListener(this);

        label = new JLabel("0 many times hit");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("ANOTHER APPLICATION");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText(count + " many times hit !!");
    }
}