import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        JButton button1 = new JButton();
        JButton button2 = new JButton();

        frame.setSize(220, 120);
        frame.setVisible(true);
        frame.setTitle("HAHA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        label.setBounds(20, 20, 220, 20);
        label.setVisible(true);

        button1.setBounds(220-100, 120-90, 70, 20);
        button1.setText("Yes");
        button1.setVisible(true);

        button2.setBounds(220-205, 120-90, 70, 20);
        button2.setText("No");
        button2.setVisible(true);

        frame.add(label);
        frame.add(button1);
        frame.add(button2);
    }
}