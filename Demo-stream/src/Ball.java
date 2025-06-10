package src;

public class Ball {
    private Color color;
    private static String value = "hello";

    public Ball(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }
    
    public static enum Color{
        BLUE, RED, YELLOW;
    }

    public static void printValue() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Ball ball1 = new Ball(Color.BLUE);
        System.out.println(ball1.getColor());
        Ball ball2 = new Ball(Color.RED);
        System.out.println(ball2.getColor());

        // Ball.Color.printValue();
    }

    
}
