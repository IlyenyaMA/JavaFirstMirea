package ru.mirea.task5.ex4;

import javax.swing.*;

public class ex4 extends JPanel {

    private ImageIcon imageIcon1;
    private ImageIcon imageIcon2;
    private JLabel imageLabel;
    private Timer timer;
    private boolean toggle = true;

    public ex4() {
        imageIcon1 = new ImageIcon(System.getProperty("user.dir") + "/src/ru/mirea/task5/ex4/Photo_1.png");
        imageIcon2 = new ImageIcon(System.getProperty("user.dir") + "/src/ru/mirea/task5/ex4/Photo_2.png");

        imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon1);
        add(imageLabel);

        timer = new Timer(300, e -> {
            if (toggle) {
                imageLabel.setIcon(imageIcon2);
            } else {
                imageLabel.setIcon(imageIcon1);
            }
            toggle = !toggle;
        });
        timer.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 550);
        frame.add(new ex4());
        frame.setVisible(true);
    }
}