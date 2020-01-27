class Bewegung {

    static void hoch() {
        Gui.snakeHead.setBounds(Snake.snakeHeadX, Snake.snakeHeadY -= 20, 20, 20);
        Gui.snakeHead.updateUI();
        istTot();
    }

    static void runter() {
        Gui.snakeHead.setBounds(Snake.snakeHeadX, Snake.snakeHeadY += 20, 20, 20);
        Gui.snakeHead.updateUI();
        istTot();
    }

    static void links() {
        Gui.snakeHead.setBounds(Snake.snakeHeadX -= 20, Snake.snakeHeadY, 20, 20);
        Gui.snakeHead.updateUI();
        istTot();
    }

    static void rechts() {
        Gui.snakeHead.setBounds(Snake.snakeHeadX += 20, Snake.snakeHeadY, 20, 20);
        Gui.snakeHead.updateUI();
        istTot();
    }

    private static void istTot() {
        if (Gui.snakeHead.getY() > 700 || Gui.snakeHead.getY() < 0 || Gui.snakeHead.getX() < 0 || Gui.snakeHead.getX() > 1260) {
            Gui.snakeHead.setBounds(Snake.snakeHeadX = 20, Snake.snakeHeadY = 20, 20, 20);
            Gui.snakeHead.updateUI();
        }
    }

}
