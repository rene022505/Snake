import java.awt.*;

class Snake {

    static int snakeHeadX = 20;
    static int snakeHeadY = 20;

    static void createSnake() {
        Gui.snakeHead.setBounds(snakeHeadX, snakeHeadY, 20, 20);
        Gui.snakeHead.setOpaque(true);
        Gui.snakeHead.setBackground(Color.WHITE);
        Gui.snakeHead.setVisible(true);
    }

}
