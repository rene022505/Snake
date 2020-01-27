import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

class Gui extends JFrame {
    static JPanel snakeHead = new JPanel(null, true);

    Gui() {
        super();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 1286;
        int frameHeight = 749;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("Snake");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);

         JPanel map = new JPanel(null, true);
        map.setBounds(0, 0, 1280, 720);
        map.setOpaque(true);
        map.setBackground(Color.DARK_GRAY);

        Snake.createSnake();

        cp.add(snakeHead);
        cp.add(map);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    Bewegung.hoch();
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    Bewegung.runter();
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    Bewegung.links();
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    Bewegung.rechts();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        setVisible(true);
    }
}
