
// Author: @muhibarshad
// Time: 2024-03-05:22:15
// Description: This program showcases Java Swing GUI development using JFrame, listeners, and mouse events.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class onClick {
    public static void randomNo(JFrame frame) {
        JButton btn = new JButton("No");
        Random random = new Random();
        int x = random.nextInt(520 - (80 + 80)) + 80;
        int y = random.nextInt(520 - (220 + 220)) + 220;
        btn.setBounds(x, y, 100, 50);
        frame.add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.remove(btn);
                frame.repaint();
                randomNo(frame);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(520, 520);
        frame.setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(40, 60, 520, 20);
        label.setText("I will Witness, there is no God\n, except Allah");
        Font font = label.getFont();
        Font newFont = font.deriveFont(Font.PLAIN, 20);
        label.setFont(newFont);
        frame.add(label);

        JButton yes = new JButton("Yes");
        yes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hurrah! (^_^), Now you are Muslim", "Congratulations",
                        JOptionPane.INFORMATION_MESSAGE);
                frame.dispose();
            }
        });
        yes.setBounds(80, 120, 100, 50);
        JButton no = new JButton("No");
        no.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.remove(no);
                frame.repaint();
                randomNo(frame);
            }
        });
        no.setBounds(300, 120, 100, 50);
        frame.add(yes);
        frame.add(no);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
