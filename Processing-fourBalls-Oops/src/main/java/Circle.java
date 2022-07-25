import processing.core.PApplet;

public class Circle extends PApplet {
    private int width;
    private final int height;
    private final int diameter;
    private final int incrementValue;

    public Circle(int width, int height, int diameter, int incrementValue) {
        this.width = width;
        this.height = height;
        this.diameter = diameter;
        this.incrementValue = incrementValue;
    }

    public void incrementWidth() {
        this.width += this.incrementValue;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDiameter() {
        return diameter;
    }

}
