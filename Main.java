import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        JButton buttonYes = new JButton();
        JButton buttonNo = new JButton();

        buttonYes.addActionListener(e -> {
            label.setText("I knew it");
        });


        while (true) {

            int randX = rand.nextInt(1920);
            int randY = rand.nextInt(1080);

            frame.setSize(220, 120);
            frame.setVisible(true);
            frame.setTitle("HAHA");
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frame.setLayout(null);

            label.setBounds(20, 20, 220, 20);
            label.setVisible(true);

            buttonYes.setBounds(220 - 100, 120 - 90, 70, 20);
            buttonYes.setText("Yes");
            buttonYes.setVisible(true);

            buttonNo.setBounds(220 - 205, 120 - 90, 70, 20);
            buttonNo.setText("No");
            buttonNo.setVisible(true);

            buttonNo.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    Point mousePos = MouseInfo.getPointerInfo().getLocation();
                    Point buttonNoPos = buttonNo.getLocationOnScreen();
                    int buttonWidth = buttonNo.getWidth();
                    int buttonHeight = buttonNo.getHeight();

                    if (mousePos.x >= buttonNoPos.x && mousePos.x <= buttonNoPos.x + buttonWidth &&
                            mousePos.y >= buttonNoPos.y && mousePos.y <= buttonNoPos.y + buttonHeight) {
                        // Get screen bounds
                        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                        Rectangle screenBounds = ge.getMaximumWindowBounds();

                        int maxX = screenBounds.width - frame.getWidth();
                        int maxY = screenBounds.height - frame.getHeight();

                        int newX = Math.max(0, Math.min(randX, maxX));
                        int newY = Math.max(0, Math.min(randY, maxY));

                        frame.setLocation(newX, newY);
                    }
                }
            });

            frame.add(label);
            frame.add(buttonYes);
            frame.add(buttonNo);
        }
    }
}
